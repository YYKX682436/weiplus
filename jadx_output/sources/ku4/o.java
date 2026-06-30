package ku4;

/* loaded from: classes7.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ku4.o f312526d = new ku4.o();

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList(ku4.z.f312539a.j());
        com.tencent.mars.xlog.Log.i("MicroMsg.WebCanvasStorageLogic", "init appId size = " + linkedList.size());
        for (java.lang.String str : linkedList) {
            ku4.z zVar = ku4.z.f312539a;
            kotlin.jvm.internal.o.d(str);
            ku4.z.a(zVar, new com.tencent.mm.vfs.r6(ku4.z.f312540b + '/' + str), str, currentTimeMillis);
            ku4.z.a(zVar, new com.tencent.mm.vfs.r6(ku4.z.f312541c + '/' + str), str, currentTimeMillis);
        }
    }
}
