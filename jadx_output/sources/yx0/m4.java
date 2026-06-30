package yx0;

/* loaded from: classes5.dex */
public final class m4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467454d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(yx0.b8 b8Var) {
        super(1);
        this.f467454d = b8Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String templateId = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(templateId, "templateId");
        yx0.b8 b8Var = this.f467454d;
        b8Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "reportSwitchTemplateFinish: templateId=".concat(templateId));
        if (b8Var.I1) {
            ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).rj("SCLoadFirstTemplate", "MJShootComposing", "", 0);
            b8Var.I1 = false;
        }
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).rj("SCSwitchTemplate", "MJShootComposing", templateId, 0);
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).rj("MCToSC", "MJShootComposing", "", 0);
        pp0.m0 m0Var = (pp0.m0) i95.n0.c(pp0.m0.class);
        kotlin.jvm.internal.o.d(m0Var);
        pp0.m0.ee(m0Var, "mjpublisher_sc_switch_template", null, "Completed", null, 8, null);
        pp0.m0.ee(m0Var, "mjpublisher_sc_apply_template", null, "Completed", null, 8, null);
        pp0.m0.ee(m0Var, "mjpublisher_first_load_template", null, "Completed", null, 8, null);
        return jz5.f0.f302826a;
    }
}
