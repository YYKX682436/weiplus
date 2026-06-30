package ot0;

/* loaded from: classes9.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.List f348755a = java.util.Collections.synchronizedList(new java.util.ArrayList());

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f348756b = new java.util.HashMap();

    public static ot0.h a(int i17) {
        pq5.d dVar = (pq5.d) f348756b.get(java.lang.Integer.valueOf(i17));
        if (dVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppMessage", "get for type(%s) is null", java.lang.Integer.valueOf(i17));
            return null;
        }
        ot0.h hVar = (ot0.h) dVar.get();
        hVar.getClass();
        return hVar;
    }
}
