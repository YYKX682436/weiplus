package dz4;

/* loaded from: classes12.dex */
public final class p3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.q3 f245372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.wenote.m f245373e;

    public p3(dz4.q3 q3Var, com.tencent.wechat.aff.wenote.m mVar) {
        this.f245372d = q3Var;
        this.f245373e = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dz4.q3 q3Var = this.f245372d;
        dz4.b1 b1Var = (dz4.b1) ((jz5.n) ((ez4.u) q3Var.f245379a).f257963v).getValue();
        com.tencent.wechat.aff.wenote.m mVar = this.f245373e;
        java.lang.String str = mVar.f217710o[7] ? mVar.f217708m : "";
        kotlin.jvm.internal.o.f(str, "getNoteTitle(...)");
        b1Var.getClass();
        if (b1Var.b()) {
            iz4.r a17 = mz4.b0.c().a();
            a17.f296144i = str;
            mz4.b0.c().d(a17);
            java.util.Iterator it = ((dz4.s1) ((ih0.r) i95.n0.c(ih0.r.class))).f245398f.iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.wenote.ui.nativenote.h2) ((ih0.s) it.next())).f188212a.i();
            }
        } else {
            com.tencent.mars.xlog.Log.i(b1Var.f245170b, "checkUpdateTopItem: skip");
        }
        dz4.y1 a18 = ((ez4.u) q3Var.f245379a).a();
        java.lang.String str2 = mVar.f217710o[7] ? mVar.f217708m : "";
        kotlin.jvm.internal.o.f(str2, "getNoteTitle(...)");
        a18.getClass();
        a18.f245467e = str2;
        cz4.f fVar = a18.f245465c;
        if (fVar != null) {
            fVar.Z(str2);
        }
        com.tencent.mm.plugin.wenote.multitask.e eVar = a18.f245466d;
        if (eVar != null) {
            eVar.L(a18.f245467e);
        }
    }
}
