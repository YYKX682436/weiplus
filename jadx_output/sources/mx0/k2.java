package mx0;

/* loaded from: classes5.dex */
public final class k2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.q2 f332094d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(mx0.q2 q2Var) {
        super(0);
        this.f332094d = q2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mx0.q2 q2Var = this.f332094d;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = q2Var.f332247u;
        if (recordConfigProvider == null) {
            kotlin.jvm.internal.o.o("configProvider");
            throw null;
        }
        android.content.Context context = q2Var.f332233d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        mx0.k3 k3Var = new mx0.k3(recordConfigProvider, context, new mx0.a2(q2Var));
        st3.k kVar = new st3.k();
        kVar.f412551f = st3.v.f412609h;
        kVar.f412549d = false;
        mx0.n3 o17 = k3Var.o();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingMusicPickerDrawerImpl", "setup: ");
        ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingMusicPickerComponentLayout) o17.e()).u(new yu3.b(new yu3.a(kVar.f412551f.ordinal(), true, null, null, 0L, 0L, false, 1, null, null, uc1.a2.CTRL_INDEX, null), false, kVar, false), false);
        k3Var.f222361k = new mx0.b2(q2Var);
        k3Var.f222362l = new mx0.c2(q2Var);
        kotlin.jvm.internal.o.f(i95.n0.c(m40.k0.class), "getService(...)");
        k3Var.f222363m = new mx0.d2(q2Var, !((c61.p7) ((m40.k0) r3)).hj(m40.j0.f323413i), null);
        k3Var.f222364n = new mx0.e2(q2Var);
        k3Var.b(new mx0.f2(k3Var, q2Var), new mx0.g2(k3Var, q2Var), null, 200);
        return k3Var;
    }
}
