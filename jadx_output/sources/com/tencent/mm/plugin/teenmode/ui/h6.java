package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class h6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o01.a f173024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI f173025e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(o01.a aVar, com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI) {
        super(0);
        this.f173024d = aVar;
        this.f173025e = teenModePrivatePwdUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        vh4.t1 t1Var = (vh4.t1) i95.n0.c(vh4.t1.class);
        r45.fy6 fy6Var = (r45.fy6) this.f173024d.f359289f;
        if (fy6Var == null || (str = fy6Var.f374739d) == null) {
            str = ((vh4.t1) i95.n0.c(vh4.t1.class)).f437138h;
        }
        t1Var.f437138h = str;
        ((vh4.t1) i95.n0.c(vh4.t1.class)).f437139i = 2;
        com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI = this.f173025e;
        teenModePrivatePwdUI.setResult(-1);
        teenModePrivatePwdUI.W6(-1);
        if (teenModePrivatePwdUI.getIntent().getIntExtra("intent_extra_biz_type", 0) != 0) {
            uh4.g0 g0Var = new uh4.g0();
            g0Var.field_businessType = teenModePrivatePwdUI.getIntent().getIntExtra("intent_extra_biz_type", Integer.MAX_VALUE);
            g0Var.field_businessKey = teenModePrivatePwdUI.getIntent().getStringExtra("intent_extra_biz_key");
            com.tencent.mm.storage.z3 df6 = ((uh4.c0) i95.n0.c(uh4.c0.class)).df();
            g0Var.field_guardianUserName = df6 != null ? df6.d1() : null;
            g0Var.field_wardUserName = c01.z1.r();
            g0Var.field_time = c01.id.c();
            wh4.j.f446012a.a().replace(g0Var);
            ((uh4.c0) i95.n0.c(uh4.c0.class)).b8();
        }
        return jz5.f0.f302826a;
    }
}
