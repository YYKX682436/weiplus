package ef0;

/* loaded from: classes8.dex */
public final class x3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.a f252358d;

    public x3(com.tencent.mm.plugin.finder.extension.reddot.a aVar) {
        this.f252358d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hm4.c cVar = (hm4.c) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).f397137h.getValue();
        java.lang.String path = this.f252358d.f105331e;
        cVar.getClass();
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i("MicroMsg.TingSyncExtension", "onReddotChanged path: ".concat(path));
        w71.m1 a17 = cVar.a();
        if (a17 != null) {
            urgen.ur_C563.UR_379F.UR_0A45(((w71.n1) a17).getCppPointer(), path);
        }
    }
}
