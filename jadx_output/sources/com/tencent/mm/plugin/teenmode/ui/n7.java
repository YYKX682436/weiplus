package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class n7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI f173084d;

    public n7(com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI teenModeVerifyPwdUI) {
        this.f173084d = teenModeVerifyPwdUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI teenModeVerifyPwdUI = this.f173084d;
        teenModeVerifyPwdUI.hideVKB();
        xh4.x.f454643a.b(teenModeVerifyPwdUI.getContext(), new yz5.a() { // from class: com.tencent.mm.plugin.teenmode.ui.n7$$a
            @Override // yz5.a
            public final java.lang.Object invoke() {
                com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI teenModeVerifyPwdUI2 = com.tencent.mm.plugin.teenmode.ui.n7.this.f173084d;
                teenModeVerifyPwdUI2.setResult(-1);
                int i17 = com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI.f172911p;
                teenModeVerifyPwdUI2.W6(1);
                if (teenModeVerifyPwdUI2.getIntent().getIntExtra("intent_extra_biz_type", 0) != 0) {
                    uh4.g0 g0Var = new uh4.g0();
                    g0Var.field_businessType = teenModeVerifyPwdUI2.getIntent().getIntExtra("intent_extra_biz_type", Integer.MAX_VALUE);
                    g0Var.field_businessKey = teenModeVerifyPwdUI2.getIntent().getStringExtra("intent_extra_biz_key");
                    com.tencent.mm.storage.z3 df6 = ((uh4.c0) i95.n0.c(uh4.c0.class)).df();
                    if (df6 != null) {
                        g0Var.field_guardianUserName = df6.d1();
                    }
                    g0Var.field_wardUserName = c01.z1.r();
                    g0Var.field_time = c01.id.c();
                    wh4.j.f446012a.a().replace(g0Var);
                    ((uh4.c0) i95.n0.c(uh4.c0.class)).b8();
                }
                return jz5.f0.f302826a;
            }
        }, null);
    }
}
