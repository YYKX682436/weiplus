package dw3;

/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final dw3.f0 f244206a = new dw3.f0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f244207b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f244208c = "MicroMsg.MemLeakUtil";

    public final void a() {
        java.lang.String str = f244208c;
        com.tencent.mars.xlog.Log.i(str, "release panel ");
        java.util.ArrayList arrayList = f244207b;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            yv3.a aVar = (yv3.a) it.next();
            com.tencent.mars.xlog.Log.i(str, "release panel " + aVar);
            aVar.f411392c.a();
        }
        arrayList.clear();
    }
}
