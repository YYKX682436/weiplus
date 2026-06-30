package t85;

/* loaded from: classes10.dex */
public abstract class b {
    public static final double[] a(org.json.JSONArray jSONArray) {
        kotlin.jvm.internal.o.g(jSONArray, "<this>");
        double[] dArr = new double[jSONArray.length()];
        java.util.Iterator it = e06.p.m(0, jSONArray.length()).iterator();
        while (it.hasNext()) {
            int b17 = ((kz5.x0) it).b();
            dArr[b17] = jSONArray.getDouble(b17);
        }
        return dArr;
    }

    public static final org.json.JSONArray b(double[] dArr) {
        kotlin.jvm.internal.o.g(dArr, "<this>");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (double d17 : dArr) {
            jSONArray.put(d17);
        }
        return jSONArray;
    }
}
