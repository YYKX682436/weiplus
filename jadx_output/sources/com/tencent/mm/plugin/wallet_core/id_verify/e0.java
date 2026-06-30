package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public final class e0 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI f179366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f179367b;

    public e0(com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI realnameVerifySelectGuardianUI, java.lang.String str) {
        this.f179366a = realnameVerifySelectGuardianUI;
        this.f179367b = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        java.lang.String username = this.f179367b;
        kotlin.jvm.internal.o.f(username, "$username");
        com.tencent.mm.plugin.wallet_core.id_verify.x xVar = com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI.E;
        com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI realnameVerifySelectGuardianUI = this.f179366a;
        realnameVerifySelectGuardianUI.getClass();
        if (z17) {
            if (!(username.length() == 0)) {
                if (realnameVerifySelectGuardianUI.getIntent().getBooleanExtra("under_age_verify_from_liteapp", false)) {
                    java.lang.String stringExtra = realnameVerifySelectGuardianUI.getIntent().getStringExtra("under_age_session_id");
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    if (str == null) {
                        str = "";
                    }
                    ys4.i iVar = new ys4.i(username, stringExtra, str);
                    androidx.appcompat.app.AppCompatActivity context = realnameVerifySelectGuardianUI.getContext();
                    iVar.f213904m = true;
                    iVar.f213906o = context;
                    iVar.l().K(new com.tencent.mm.plugin.wallet_core.id_verify.f0(realnameVerifySelectGuardianUI, username));
                } else {
                    java.lang.String stringExtra2 = realnameVerifySelectGuardianUI.getIntent().getStringExtra("under_age_session_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = "";
                    }
                    if (str == null) {
                        str = "";
                    }
                    ys4.h hVar = new ys4.h(username, stringExtra2, str);
                    androidx.appcompat.app.AppCompatActivity context2 = realnameVerifySelectGuardianUI.getContext();
                    hVar.f213904m = true;
                    hVar.f213906o = context2;
                    hVar.l().K(new com.tencent.mm.plugin.wallet_core.id_verify.d0(realnameVerifySelectGuardianUI, username));
                }
            }
        }
        realnameVerifySelectGuardianUI.hideVKB();
    }
}
