package r01;

/* loaded from: classes9.dex */
public abstract class y1 {
    public static android.graphics.Bitmap a(java.lang.String str, float f17) {
        android.graphics.Bitmap a17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !gm0.j1.u().l() || !gm0.j1.b().m()) {
            return null;
        }
        r01.x1 pj6 = r01.q3.pj();
        pj6.getClass();
        java.lang.String format = java.lang.String.format("%s%f", str, java.lang.Float.valueOf(f17));
        java.util.HashMap hashMap = (java.util.HashMap) pj6.f368276b;
        if (hashMap.containsKey(format)) {
            a17 = (android.graphics.Bitmap) ((java.lang.ref.WeakReference) hashMap.get(format)).get();
            if (a17 == null || a17.isRecycled()) {
                a17 = com.tencent.mm.sdk.platformtools.j.a(str, f17);
                hashMap.remove(format);
                hashMap.put(format, new java.lang.ref.WeakReference(a17));
            }
        } else {
            a17 = com.tencent.mm.sdk.platformtools.j.a(str, f17);
            hashMap.put(format, new java.lang.ref.WeakReference(a17));
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        objArr[1] = java.lang.String.valueOf(a17 == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandLogic", "get verify user icon = %s, is null ? %s", objArr);
        return a17;
    }
}
