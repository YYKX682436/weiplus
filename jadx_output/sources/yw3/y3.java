package yw3;

/* loaded from: classes4.dex */
public final class y3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI f466935d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI repairerMvvmDBDemoUI) {
        super(0);
        this.f466935d = repairerMvvmDBDemoUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(lp0.b.h0("dbdemo"), "demo.db");
        jm0.i iVar = jm0.k.f300269h;
        yw3.d dVar = (yw3.d) iVar.a(yw3.d.class);
        java.lang.String o17 = r6Var.o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        dVar.O6(o17);
        com.tencent.mars.xlog.Log.i("MicroMsg.RepairerMvvmDBDemoUI", "create db done");
        yw3.k kVar = (yw3.k) ((yw3.d) iVar.a(yw3.d.class)).P6(yw3.k.class);
        com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI repairerMvvmDBDemoUI = this.f466935d;
        kVar.Q6(repairerMvvmDBDemoUI, new yw3.w3(repairerMvvmDBDemoUI));
        pm0.v.X(new yw3.x3(repairerMvvmDBDemoUI));
        return jz5.f0.f302826a;
    }
}
