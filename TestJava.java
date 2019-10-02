import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class TestJava {
    public static void staticTest_paramX() {
        System.out.println("staticTest_paramX in");
    }
    public static void staticTest_paramS(String id, String name, String memo) {
        System.out.printf("staticTest_paramS in %s: %s: %s\n", id, name, memo);
    }
    public static void staticTest_paramN(int iv, long lv, float fv, double dv) {
        System.out.printf("staticTest_paramN in %d: %d: %f %f\n", iv, lv, fv, dv);
    }
    public static void staticTest_paramN2(Integer iv, Long lv, Float fv, Double dv) {
        System.out.printf("staticTest_paramN2 in %d: %d: %f %f\n", iv, lv, fv, dv);
    }
    public static void staticTest_paramAV(int[] iv, long[] lv, float[] fv, double[] dv) {
        System.out.println("staticTest_paramAV 1 in");
        dspArrayAIV(iv);
        dspArrayALV(lv);
        dspArrayAFV(fv);
        dspArrayADV(dv);
    }
    public static void staticTest_paramAV2(Integer[] iv, Long[] lv, Float[] fv, Double[] dv) {
        System.out.println("staticTest_paramAV2 2 in");
        dspArrayAIV(iv);
        dspArrayALV(lv);
        dspArrayAFV(fv);
        dspArrayADV(dv);
    }
    private static void dspArrayAIV(Integer[] av)
	{
        System.out.printf("iv");
        for (int i = 0; i < av.length; i++) {
            System.out.printf(": %d", av[i].intValue());
        }
        System.out.println();
	}
    private static void dspArrayAIV(int[] av)
    {
        System.out.printf("iv");
        for (int i = 0; i < av.length; i++) {
            System.out.printf(": %d", av[i]);
        }
        System.out.println();
    }
    private static void dspArrayALV(long[] av) {
        System.out.printf("lv");
        for (int i = 0; i < av.length; i++) {
            System.out.printf(": %d", av[i]);
        }
        System.out.println();
    }
    private static void dspArrayALV(Long[] av) {
        System.out.printf("lv");
        for (int i = 0; i < av.length; i++) {
            System.out.printf(": %d", av[i]);
        }
        System.out.println();
    }
    private static void dspArrayAFV(float[] av) {
        System.out.printf("fv");
        for (int i = 0; i < av.length; i++) {
            System.out.printf(": %f", av[i]);
        }
        System.out.println();
    }
    private static void dspArrayAFV(Float[] av) {
        System.out.printf("fv");
        for (int i = 0; i < av.length; i++) {
            System.out.printf(": %f", av[i]);
        }
        System.out.println();
    }
    private static void dspArrayADV(double[] av) {
        System.out.printf("dv");
        for (int i = 0; i < av.length; i++) {
            System.out.printf(": %f", av[i]);
        }
        System.out.println();
    }
    private static void dspArrayADV(Double[] av) {
        System.out.printf("dv");
        for (int i = 0; i < av.length; i++) {
            System.out.printf(": %f", av[i]);
        }
        System.out.println();
    }
	private static void dspHash(Map hv)
	{
        for (Object key : hv.keySet()) {
            Object data = hv.get((String)key);
            if (data instanceof Integer) {
                System.out.printf("I:key:%s value:%d\n", key, (int)data);
            }
            if (data instanceof Long) {
                System.out.printf("L:key:%s value:%d\n", key, (long)data);
            }
            if (data instanceof Float) {
                System.out.printf("F:key:%s value:%f\n", key, (float)data);
            }
            if (data instanceof Double) {
                System.out.printf("D:key:%s value:%f\n", key, (double)data);
            }
            if (data instanceof String) {
                System.out.printf("S:key:%s value:%s\n", key, (String)data);
            }
            if (data instanceof Map) {
                System.out.printf("HV:key:%s\n", key);
            	dspHash((Map)data);
            }
            try {
                if (data.getClass() == Class.forName("[I")) {
                    System.out.printf("AI:key:%s ", key);
                    dspArrayAIV((int[])data);
                }
                if (data.getClass() == Class.forName("[Ljava.lang.Integer;")) {
                    System.out.printf("AI:key:%s ", key);
                    dspArrayAIV((Integer[])data);
                }
                if (data.getClass() == Class.forName("[J")) {
                    System.out.printf("AL:key:%s ", key);
                    dspArrayALV((long[])data);
                }
                if (data.getClass() == Class.forName("[Ljava.lang.Long;")) {
                    System.out.printf("AL:key:%s ", key);
                    dspArrayALV((Long[])data);
                }
                if (data.getClass() == Class.forName("[F")) {
                    System.out.printf("AF:key:%s ", key);
                    dspArrayAFV((float[])data);
                }
                if (data.getClass() == Class.forName("[Ljava.lang.Float;")) {
                    System.out.printf("AF:key:%s ", key);
                    dspArrayAFV((Float[])data);
                }
                if (data.getClass() == Class.forName("[D")) {
                    System.out.printf("AD:key:%s ", key);
                    dspArrayADV((double[])data);
                }
                if (data.getClass() == Class.forName("[Ljava.lang.Double;")) {
                    System.out.printf("AD:key:%s ", key);
                    dspArrayADV((Double[])data);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            
        }
	}
    public static void staticTest_paramAOV(String name, Object... args) {
        System.out.println("staticTest_paramAOV in");
        System.out.println(name);
        System.out.printf("sz:%d\n", args.length);
    	for(int i= 0; i < args.length; i++) {
            System.out.println(args[i]);
    	}
    }
    public static void staticTest_paramHV(Map<String, Object> hv)
    {
        System.out.println("staticTest_paramHV in");
    	dspHash(hv);
    }
    public static void staticTest_paramHV_I(Map<String, Integer> hv)
    {
        System.out.println("staticTest_paramHV_I in");
    	dspHash(hv);
    }
    public static void staticTest_paramHV_L(Map<String, Long> hv)
    {
        System.out.println("staticTest_paramHV_L in");
    	dspHash(hv);
    }
    public static void staticTest_paramHV_F(Map<String, Float> hv)
    {
        System.out.println("staticTest_paramHV_F in");
    	dspHash(hv);
    }
    public static void staticTest_paramHV_D(Map<String, Double> hv)
    {
        System.out.println("staticTest_paramHV_D in");
    	dspHash(hv);
    }
    public static void staticTest_paramHV_S(Map<String, String> hv)
    {
        System.out.println("staticTest_paramHV_S in");
    	dspHash(hv);
    }
    public static void staticTest_paramHV_AI(Map<String, Integer[]> hv)
    {
        System.out.println("staticTest_paramHV_AI in");
    	dspHash(hv);
    }
    public static void staticTest_paramHV_AL(Map<String, Long[]> hv)
    {
        System.out.println("staticTest_paramHV_AL in");
    	dspHash(hv);
    }
    public static void staticTest_paramHV_AF(Map<String, Float[]> hv)
    {
        System.out.println("staticTest_paramHV_AF in");
    	dspHash(hv);
    }
    public static void staticTest_paramHV_AD(Map<String, Double[]> hv)
    {
        System.out.println("staticTest_paramHV_AD in");
    	dspHash(hv);
    }
    public static void staticTest_paramHV_H(Map<String, Map> hv)
    {
        System.out.println("staticTest_paramHV_H in");
    	dspHash(hv);
    }
    public static void staticTest_paramHV_O(Map<String, Object> hv)
    {
        System.out.println("staticTest_paramHV_O in");
    	dspHash(hv);
    }
	
	public static boolean  staticTest_returnBV() {
        System.out.println("staticTest_returnBV in");
		return true;
	}
	public static Boolean  staticTest_returnBV2() {
        System.out.println("staticTest_returnBV2 in");
		return Boolean.valueOf(true);
	}
	
    public static int    staticTest_returnIV(int   iv) {
        System.out.println("staticTest_returnIV 1 in");
        System.out.printf("iv:%d\n", iv);
        return iv * 2;
    }
    public static Integer    staticTest_returnIV2(int  iv) {
        System.out.println("staticTest_returnIV2 2 in");
        System.out.printf("iv:%d\n", iv);
    	return Integer.valueOf(iv * 2);
    }
    public static long   staticTest_returnLV(long   lv) {
        System.out.println("staticTest_returnLV 1 in");
        System.out.printf("lv:%d\n", lv);
        return lv * 2;
    }
    public static Long   staticTest_returnLV2(long   lv) {
        System.out.println("staticTest_returnLV2 2 in");
        System.out.printf("lv:%d\n", lv);
    	return Long.valueOf(lv * 2);
    }
    public static float  staticTest_returnFV(float  fv) {
        System.out.println("staticTest_returnFV 1 in");
        System.out.printf("fv:%f\n", fv);
        return fv * 2;
    }
    public static Float  staticTest_returnFV2(float  fv) {
        System.out.println("staticTest_returnFV2 2 in");
        System.out.printf("fv:%f\n", fv);
    	return Float.valueOf(fv * 2);
    }
    public static double staticTest_returnDV(double dv) {
        System.out.println("staticTest_returnDV 1 in");
        System.out.printf("dv:%f\n", dv);
        return dv * 2;
    }
    public static Double staticTest_returnDV2(double dv) {
        System.out.println("staticTest_returnDV2 2 in");
        System.out.printf("dv:%f\n", (double)dv);
    	return Double.valueOf(dv * 2);
    }
    public static String staticTest_returnPV() {
        System.out.println("staticTest_returnPV in");
        return "Hello java world!!";
    }
    public static int[] staticTest_returnAIV() {
        int[]    aiv = {100,    110,    120,    130,    140};
        
        System.out.println("staticTest_returnAIV 1 in");
        return aiv;
    }
    public static Integer[] staticTest_returnAIV2() {
        Integer[]    aiv = {100,    110,    120,    130,    140};
        
        System.out.println("staticTest_returnAIV2 2 in");
        return aiv;
    }
    public static long[] staticTest_returnALV() {
        long[]   alv = {200L,   210L,   220L,   230L,   240L};
        
        System.out.println("staticTest_returnALV 1 in");
        return alv;
    }
    public static Long[] staticTest_returnALV2() {
        Long[]   alv = {200L,   210L,   220L,   230L,   240L};
        
        System.out.println("staticTest_returnALV2 2 in");
        return alv;
    }
    public static float[] staticTest_returnAFV() {
        float[]  afv = {300.5f, 310.5f, 320.5f, 330.5f, 340.5f};
        
        System.out.println("staticTest_returnAFV 1 in");
        return afv;
    }
    public static Float[] staticTest_returnAFV2() {
        Float[]  afv = {300.5f, 310.5f, 320.5f, 330.5f, 340.5f};
        
        System.out.println("staticTest_returnAFV2 2 in");
        return afv;
    }
    public static double[] staticTest_returnADV() {
        double[] adv = {400.8,  410.8,  420.8,  430.8,  440.8};
        
        System.out.println("staticTest_returnADV 1 in");
        return adv;
    }
    public static Double[] staticTest_returnADV2() {
        Double[] adv = {400.8,  410.8,  420.8,  430.8,  440.8};
        
        System.out.println("staticTest_returnADV2 2 in");
        return adv;
    }
    public static Map<String, Object> staticTest_returnHV()
    {
        Map<String, Object> hv  = new HashMap<String, Object>();
        Map<String, Object> map = new HashMap<String, Object>();
        System.out.println("staticTest_returnHV in");
        map.put("keyX1", 1000);
        map.put("keyX2", 2000L);
        map.put("keyX3", 3000.6f);
        map.put("keyX4", 4000.6);
        map.put("keyX5", "value05");
        map.put("keyX6", new int[]    {100,    110,    120});
        map.put("keyX7", new long[]   {200L,   210L,   220L});
        map.put("keyX8", new float[]  {300.6f, 310.6f, 320.6f});
        map.put("keyX9", new double[] {400.6,  410.6,  420.6});
        hv.put("key01", 1000);
        hv.put("key02", 2000L);
        hv.put("key03", 3000.6f);
        hv.put("key04", 4000.6);
        hv.put("key05", "value05");
        hv.put("key06", new int[]    {100,    110,    120});
        hv.put("key07", new long[]   {200L,   210L,   220L});
        hv.put("key08", new float[]  {300.6f, 310.6f, 320.6f});
        hv.put("key09", new double[] {400.6,  410.6,  410.6});
        hv.put("key10", new Integer[]{100,    110,    120,    130});
        hv.put("key11", new Long[]   {200L,   210L,   220L,   230L});
        hv.put("key12", new Float[]  {300.6f, 310.6f, 320.6f, 330.6f});
        hv.put("key13", new Double[] {400.6,  410.6,  420.6,  430.6});
        hv.put("key14", map);
    	hv.put("key15", TestJava.returnLambda());
        return hv;
    }
    public static Map<String, Integer> staticTest_returnHV_I()
    {
        System.out.println("staticTest_returnHV_I in");
        Map<String, Integer> hv  = new HashMap<String, Integer>();
    	
    	for (int i = 0; i < 3; i++) {
	    	hv.put(String.format("key%02d", i+1), 1000 + i);
    	}
        return hv;
    }
    public static Map<String, Long> staticTest_returnHV_L()
    {
        System.out.println("staticTest_returnHV_L in");
        Map<String, Long> hv  = new HashMap<String, Long>();

    	for (int i = 0; i < 3; i++) {
	    	hv.put(String.format("key%02d", i+1), 2000L + i);
    	}
    	return hv;
    }
    public static Map<String, Float> staticTest_returnHV_F()
    {
        System.out.println("staticTest_returnHV_F in");
        Map<String, Float> hv  = new HashMap<String, Float>();

    	for (int i = 0; i < 3; i++) {
	    	hv.put(String.format("key%02d", i+1), 3000.6f + i);
    	}
        return hv;
    }
    public static Map<String, Double> staticTest_returnHV_D()
    {
        System.out.println("staticTest_returnHV_D in");
        Map<String, Double> hv  = new HashMap<String, Double>();

    	for (int i = 0; i < 3; i++) {
	    	hv.put(String.format("key%02d", i+1), 4000.6 + i);
    	}
        return hv;
    }
    public static Map<String, String> staticTest_returnHV_S()
    {
        System.out.println("staticTest_returnHV_S in");
        Map<String, String> hv  = new HashMap<String, String>();

    	for (int i = 0; i < 3; i++) {
	    	hv.put(String.format("key%02d", i+1), "value05");
    	}
        return hv;
    }
    public static Map<String, Integer[]> staticTest_returnHV_AI()
    {
        System.out.println("staticTest_returnHV_AI in");
        Map<String, Integer[]> hv  = new HashMap<String, Integer[]>();
        Integer[] aiv = new Integer[]    {100,    110,    120};
    	
    	for (int i = 0; i < 3; i++) {
	    	hv.put(String.format("key%02d", i+1), aiv);
    	}
        return hv;
    }
    public static Map<String, Long[]> staticTest_returnHV_AL()
    {
        System.out.println("staticTest_returnHV_AL in");
        Map<String, Long[]> hv  = new HashMap<String, Long[]>();
    	Long[] alv = new Long[]   {200L,   210L,   220L};
    	
    	for (int i = 0; i < 3; i++) {
	    	hv.put(String.format("key%02d", i+1), alv);
    	}
        return hv;
    }
    public static Map<String, Float[]> staticTest_returnHV_AF()
    {
        System.out.println("staticTest_returnHV_AF in");
        Map<String, Float[]> hv  = new HashMap<String, Float[]>();
    	Float[] afv = new Float[]  {300.6f, 310.6f, 320.6f};

    	for (int i = 0; i < 3; i++) {
	    	hv.put(String.format("key%02d", i+1), afv);
    	}
        return hv;
    }
    public static Map<String, Double[]> staticTest_returnHV_AD()
    {
        System.out.println("staticTest_returnHV_AD in");
        Map<String, Double[]> hv  = new HashMap<String, Double[]>();
        Double[] adv = new Double[] {400.6,  410.6,  410.6};
    	
    	for (int i = 0; i < 3; i++) {
	    	hv.put(String.format("key%02d", i+1), adv);
    	}
        return hv;
    }
    public static Map<String, Map> staticTest_returnHV_H()
    {
        System.out.println("staticTest_returnHV_H in");
        Map<String, Map> hv  = new HashMap<String, Map>();
        Map<String, Object> map = new HashMap<String, Object>();

    	for(int i = 0; i < 2; i++) {
	        map.put(String.format("keyX%01d", i+1), 1000 + i * 10);
    	}
    	for (int i = 0; i < 3; i++) {
	    	hv.put(String.format("key%02d", i+1), map);
    	}
    	return hv;
    }
    public static Map<String, Object> staticTest_returnHV_O()
    {
        System.out.println("staticTest_returnHV_O in");
        Map<String, Object> hv  = new HashMap<String, Object>();
        Runnable r = TestJava.returnLambda();
    	
    	for (int i = 0; i < 3; i++) {
	    	hv.put(String.format("key%02d", i+1), r);
    	}
        return hv;
    }
	
	
	public static List<Map<String, Object>> staticTest_returnAHV()
	{
		List<Map<String, Object>> ahv = new ArrayList<Map<String, Object>>();

		System.out.println("staticTest_returnAHV in");
		for (int i = 0; i < 10; i++) {
	        Map<String, Object> hv = new HashMap<String, Object>();
			
			hv.put("key01", 1100 + i);
			hv.put("key02", 2100L + i);
	        hv.put("key03", 3000.6f);
	        hv.put("key04", 4000.6);
	        hv.put("key05", "value05");
	        hv.put("key06", new int[]    {100,    110,    120});
	        hv.put("key07", new long[]   {200L,   210L,   220L});
	        hv.put("key08", new float[]  {300.6f, 310.6f, 320.6f});
	        hv.put("key09", new double[] {400.6,  410.6,  410.6});
			
	        ahv.add(hv);
		}
		return ahv;
	}
   	private static Runnable returnLambda() {
        return () -> {
            System.out.println("Hello Lambda!");
        };
   	}
	public static Runnable staticTest_returnO()
	{
		System.out.println("staticTest_returnO in");
		return TestJava.returnLambda();
	}
    public void objectTest_paramX()
    {
        System.out.println("objectTest_paramX in");
    }
    public void objectTest_paramS(String id, String name, String memo) {
        System.out.printf("objectTest_paramS in %s: %s: %s\n", id, name, memo);
    }
    public void objectTest_paramN(int iv, long lv, float fv, double dv) {
        System.out.printf("objectTest_paramN 1 in %d: %d: %f %f\n", iv, lv, fv, dv);
    }
    public void objectTest_paramN2(Integer iv, Long lv, Float fv, Double dv) {
        System.out.printf("objectTest_paramN2 2 in %d: %d: %f %f\n", iv, lv, fv, dv);
    }
    public void objectTest_paramAV(int[] iv, long[] lv, float[] fv, double[] dv) {
        System.out.println("objectTest_paramAV 1 in");
        TestJava.dspArrayAIV(iv);;
        TestJava.dspArrayALV(lv);
        TestJava.dspArrayAFV(fv);
        TestJava.dspArrayADV(dv);
    }
    public void objectTest_paramAV2(Integer[] iv, Long[] lv, Float[] fv, Double[] dv) {
        System.out.println("objectTest_paramAV2 2 in");
        TestJava.dspArrayAIV(iv);;
        TestJava.dspArrayALV(lv);
        TestJava.dspArrayAFV(fv);
        TestJava.dspArrayADV(dv);
    }
    public void objectTest_paramAOV(String name, Object... args) {
        System.out.println("objectTest_paramAOV in");
        System.out.println(name);
        System.out.printf("sz:%d\n", args.length);
    	for(int i= 0; i < args.length; i++) {
            System.out.println(args[i]);
    	}
    }
    public void objectTest_paramHV(Map<String, Object> hv)
    {
        System.out.println("objectTest_paramHV in");
    	TestJava.dspHash(hv);
    }
    public void objectTest_paramHV_I(Map<String, Integer> hv)
    {
        System.out.println("objectTest_paramHV_I in");
    	dspHash(hv);
    }
    public void objectTest_paramHV_L(Map<String, Long> hv)
    {
        System.out.println("objectTest_paramHV_L in");
    	dspHash(hv);
    }
    public void objectTest_paramHV_F(Map<String, Float> hv)
    {
        System.out.println("objectTest_paramHV_F in");
    	dspHash(hv);
    }
    public void objectTest_paramHV_D(Map<String, Double> hv)
    {
        System.out.println("objectTest_paramHV_D in");
    	dspHash(hv);
    }
    public void objectTest_paramHV_P(Map<String, String> hv)
    {
        System.out.println("objectTest_paramHV_P in");
    	dspHash(hv);
    }
    public void objectTest_paramHV_AI(Map<String, Integer[]> hv)
    {
        System.out.println("objectTest_paramHV_AI in");
    	dspHash(hv);
    }
    public void objectTest_paramHV_AL(Map<String, Long[]> hv)
    {
        System.out.println("objectTest_paramHV_AL in");
    	dspHash(hv);
    }
    public void objectTest_paramHV_AF(Map<String, Float[]> hv)
    {
        System.out.println("objectTest_paramHV_AF in");
    	dspHash(hv);
    }
    public void objectTest_paramHV_AD(Map<String, Double[]> hv)
    {
        System.out.println("objectTest_paramHV_AD in");
    	dspHash(hv);
    }
    public void objectTest_paramHV_H(Map<String, Map> hv)
    {
        System.out.println("objectTest_paramHV_H in");
    	dspHash(hv);
    }
    public void objectTest_paramHV_O(Map<String, Object> hv)
    {
        System.out.println("objectTest_paramHV_O in");
    	dspHash(hv);
    }
	public boolean  objectTest_returnBV() {
        System.out.println("objectTest_returnBV 1 in");
		return true;
	}
	public Boolean  objectTest_returnBV2() {
        System.out.println("objectTest_returnBV2 2 in");
		return Boolean.valueOf(true);
	}
    public int    objectTest_returnIV(int   iv) {
        System.out.println("objectTest_returnIV 1 in");
        System.out.printf("iv:%d\n", (int)iv);
        return iv * 3;
    }
    public Integer    objectTest_returnIV2(int   iv) {
        System.out.println("objectTest_returnIV2 2 in");
        System.out.printf("iv:%d\n", (int)iv);
    	return Integer.valueOf(iv * 3);
    }
    public long   objectTest_returnLV(long   lv) {
        System.out.println("objectTest_returnLV 1 in");
        System.out.printf("lv:%d\n", (long)lv);
        return lv * 3;
    }
    public Long   objectTest_returnLV2(long   lv) {
        System.out.println("objectTest_returnLV2 2 in");
        System.out.printf("lv:%d\n", (long)lv);
    	return Long.valueOf(lv * 3);
    }
    public float  objectTest_returnFV(float  fv) {
        System.out.println("objectTest_returnFV 1 in");
        System.out.printf("fv:%f\n", (float)fv);
        return fv * 3;
    }
    public Float  objectTest_returnFV2(float  fv) {
        System.out.println("objectTest_returnFV2 2 in");
        System.out.printf("fv:%f\n", (float)fv);
    	return Float.valueOf(fv * 3);
    }
    public double objectTest_returnDV(double dv) {
        System.out.println("objectTest_returnDV 1 in");
        System.out.printf("dv:%f\n", (double)dv);
        return dv * 3;
    }
    public Double objectTest_returnDV2(double dv) {
        System.out.println("objectTest_returnDV2 2 in");
        System.out.printf("dv:%f\n", (double)dv);
    	return Double.valueOf(dv * 3);
    }
    public String objectTest_returnPV() {
        System.out.println("objectTest_returnPV in");
        return "Hello java world!!";
    }
    public int[] objectTest_returnAIV() {
        int[]    aiv = {100,    110,    120,    130,    140};
        
        System.out.println("objectTest_returnAIV 1 in");
        return aiv;
    }
    public Integer[] objectTest_returnAIV2() {
        Integer[]    aiv = {100,    110,    120,    130,    140};
        
        System.out.println("objectTest_returnAIV2 2 in");
        return aiv;
    }
    public long[] objectTest_returnALV() {
        long[]   alv = {200L,   210L,   220L,   230L,   240L};
        
        System.out.println("objectTest_returnALV 1 in");
        return alv;
    }
    public Long[] objectTest_returnALV2() {
        Long[]   alv = {200L,   210L,   220L,   230L,   240L};
        
        System.out.println("objectTest_returnALV2 2 in");
        return alv;
    }
    public float[] objectTest_returnAFV() {
        float[]  afv = {300.5f, 310.5f, 320.5f, 330.5f, 340.5f};
        
        System.out.println("objectTest_returnAFV 1 in");
        return afv;
    }
    public Float[] objectTest_returnAFV2() {
        Float[]  afv = {300.5f, 310.5f, 320.5f, 330.5f, 340.5f};
        
        System.out.println("objectTest_returnAFV2 2 in");
        return afv;
    }
    public double[] objectTest_returnADV() {
        double[] adv = {400.8,  410.8,  420.8,  430.8,  440.8};
        
        System.out.println("objectTest_returnADV 1 in");
        return adv;
    }
    public Double[] objectTest_returnADV2() {
        Double[] adv = {400.8,  410.8,  420.8,  430.8,  440.8};
        
        System.out.println("objectTest_returnADV2 2 in");
        return adv;
    }
    public Map objectTest_returnHV()
    {
        Map<String, Object> map = new HashMap<String, Object>();
        Map<String, Object> hv  = new HashMap<String, Object>();
        System.out.println("objectTest_returnHV in");
        map.put("keyX1", 1000);
        map.put("keyX2", 2000L);
        map.put("keyX3", 3000.6f);
        map.put("keyX4", 4000.6);
        map.put("keyX5", "value05");
        map.put("keyX6", new int[]    {100,    110,    120});
        map.put("keyX7", new long[]   {200L,   210L,   220L});
        map.put("keyX8", new float[]  {300.6f, 310.6f, 320.6f});
        map.put("keyX9", new double[] {400.6,  410.6,  420.6});
        hv.put("key01", 1000);
        hv.put("key02", 2000L);
        hv.put("key03", 3000.6f);
        hv.put("key04", 4000.6);
        hv.put("key05", "value05");
        hv.put("key06", new int[]    {100,    110,    120});
        hv.put("key07", new long[]   {200L,   210L,   220L});
        hv.put("key08", new float[]  {300.6f, 310.6f, 320.6f});
        hv.put("key09", new double[] {400.6,  410.6,  410.6});
        hv.put("key10", new Integer[]{100,    110,    120,    130});
        hv.put("key11", new Long[]   {200L,   210L,   220L,   230L});
        hv.put("key12", new Float[]  {300.6f, 310.6f, 320.6f, 330.6f});
        hv.put("key13", new Double[] {400.6,  410.6,  420.6,  430.6});
        hv.put("key14", map);
    	hv.put("key15", TestJava.returnLambda());
        return hv;
    }
    public Map<String, Integer> objectTest_returnHV_I()
    {
        System.out.println("objectTest_returnHV_I in");
        Map<String, Integer> hv  = new HashMap<String, Integer>();
    	
    	for (int i = 0; i < 3; i++) {
	    	hv.put(String.format("key%02d", i+1), 1000 + i);
    	}
        return hv;
    }
    public Map<String, Long> objectTest_returnHV_L()
    {
        System.out.println("objectTest_returnHV_L in");
        Map<String, Long> hv  = new HashMap<String, Long>();

    	for (int i = 0; i < 3; i++) {
	    	hv.put(String.format("key%02d", i+1), 2000L + i);
    	}
        return hv;
    }
    public Map<String, Float> objectTest_returnHV_F()
    {
        System.out.println("objectTest_returnHV_F in");
        Map<String, Float> hv  = new HashMap<String, Float>();

    	for (int i = 0; i < 3; i++) {
	    	hv.put(String.format("key%02d", i+1), 3000.6f + i);
    	}
        return hv;
    }
    public Map<String, Double> objectTest_returnHV_D()
    {
        System.out.println("objectTest_returnHV_D in");
        Map<String, Double> hv  = new HashMap<String, Double>();

    	for (int i = 0; i < 3; i++) {
	    	hv.put(String.format("key%02d", i+1), 4000.6 + i);
    	}
        return hv;
    }
    public Map<String, String> objectTest_returnHV_S()
    {
        System.out.println("objectTest_returnHV_S in");
        Map<String, String> hv  = new HashMap<String, String>();

    	for (int i = 0; i < 3; i++) {
	    	hv.put(String.format("key%02d", i+1), "value05");
    	}
        return hv;
    }
    public Map<String, Integer[]> objectTest_returnHV_AI()
    {
        System.out.println("objectTest_returnHV_AI in");
        Map<String, Integer[]> hv  = new HashMap<String, Integer[]>();
        Integer[] aiv = new Integer[]    {100,    110,    120};
    	
    	for (int i = 0; i < 3; i++) {
	    	hv.put(String.format("key%02d", i+1), aiv);
    	}
        return hv;
    }
    public Map<String, Long[]> objectTest_returnHV_AL()
    {
        System.out.println("objectTest_returnHV_AL in");
        Map<String, Long[]> hv  = new HashMap<String, Long[]>();
    	Long[] alv = new Long[]   {200L,   210L,   220L};
    	
    	for (int i = 0; i < 3; i++) {
	    	hv.put(String.format("key%02d", i+1), alv);
    	}
        return hv;
    }
    public Map<String, Float[]> objectTest_returnHV_AF()
    {
        System.out.println("objectTest_returnHV_AF in");
        Map<String, Float[]> hv  = new HashMap<String, Float[]>();
    	Float[] afv = new Float[]  {300.6f, 310.6f, 320.6f};

    	for (int i = 0; i < 3; i++) {
	    	hv.put(String.format("key%02d", i+1), afv);
    	}
        return hv;
    }
    public Map<String, Double[]> objectTest_returnHV_AD()
    {
        System.out.println("objectTest_returnHV_AD in");
        Map<String, Double[]> hv  = new HashMap<String, Double[]>();
        Double[] adv = new Double[] {400.6,  410.6,  410.6};
    	
    	for (int i = 0; i < 3; i++) {
	    	hv.put(String.format("key%02d", i+1), adv);
    	}
        return hv;
    }
    public Map<String, Map> objectTest_returnHV_H()
    {
        System.out.println("objectTest_returnHV_H in");
        Map<String, Map> hv  = new HashMap<String, Map>();
        Map<String, Object> map = new HashMap<String, Object>();

    	for(int i = 0; i < 2; i++) {
	        map.put(String.format("keyX%01d", i+1), 1000 + i * 10);
    	}
    	for (int i = 0; i < 3; i++) {
	    	hv.put(String.format("key%02d", i+1), map);
    	}
        return hv;
    }
    public Map<String, Object> objectTest_returnHV_O()
    {
        System.out.println("objectTest_returnHV_O in");
        Map<String, Object> hv  = new HashMap<String, Object>();
        Runnable r = TestJava.returnLambda();
    	
    	for (int i = 0; i < 3; i++) {
	    	hv.put(String.format("key%02d", i+1), r);
    	}
        return hv;
    }

	public List<Map> objectTest_returnAHV()
	{
		List<Map> ahv = new ArrayList<Map>();

		System.out.println("objectTest_returnAHV in");
		for (int i = 0; i < 10; i++) {
	        Map<String, Object> hv = new HashMap<String, Object>();
			
			hv.put("key01", 1200 + i);
			hv.put("key02", 2200L + i);
	        hv.put("key03", 3000.6f);
	        hv.put("key04", 4000.6);
	        hv.put("key05", "value05");
	        hv.put("key06", new int[]    {100,    110,    120});
	        hv.put("key07", new long[]   {200L,   210L,   220L});
	        hv.put("key08", new float[]  {300.6f, 310.6f, 320.6f});
	        hv.put("key09", new double[] {400.6,  410.6,  410.6});
			
	        ahv.add(hv);
		}
		return ahv;
	}
	public Runnable objectTest_returnO()
	{
		System.out.println("objectTest_returnO in");
        return TestJava.returnLambda();
	}
}
