package yw3;

/* loaded from: classes.dex */
public final class r4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmMainDBDemoUI f466867d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmMainDBDemoUI repairerMvvmMainDBDemoUI) {
        super(0);
        this.f466867d = repairerMvvmMainDBDemoUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dm.k7.createTable(gm0.j1.u().f273153f);
        com.tencent.mars.xlog.Log.i(this.f466867d.d, "create table done");
        return jz5.f0.f302826a;
    }
}
