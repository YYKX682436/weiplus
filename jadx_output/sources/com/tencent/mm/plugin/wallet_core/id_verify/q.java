package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class q implements h45.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.a f179478a;

    public q(com.tencent.mm.plugin.wallet_core.id_verify.a aVar) {
        this.f179478a = aVar;
    }

    @Override // h45.i
    public void onKindaBusinessCallback(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "startBindCardUseCase callback");
        com.tencent.mm.wallet_core.model.i1.a();
        com.tencent.mm.plugin.wallet_core.id_verify.a aVar = this.f179478a;
        aVar.f179325o.dead();
        aVar.f179326p.dead();
        aVar.f179321k = intent;
        aVar.f179320j = true;
        if (intent.getIntExtra("retcode", -1) != 1) {
            if (intent.getIntExtra("retcode", -1) == -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "KindaBindCardEvent bindCard Cancel");
                android.app.Activity crossActivity = ((h45.q) i95.n0.c(h45.q.class)).getCrossActivity();
                if (crossActivity != null) {
                    aVar.f(crossActivity, aVar.f213801c);
                    return;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "activity is null");
                    return;
                }
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RealNameVerifyProcess", "KindaBindCardEvent bindCard Succ");
        android.app.Activity crossActivity2 = ((h45.q) i95.n0.c(h45.q.class)).getCrossActivity();
        if (crossActivity2 != null) {
            android.os.Bundle bundle = aVar.f213801c;
            bundle.putInt("realname_verify_process_ret", -1);
            bundle.putString("realname_verify_process_finish_title", intent.getStringExtra("realname_title"));
            bundle.putString("realname_verify_process_finish_desc", intent.getStringExtra("realname_desc"));
            bundle.putString("realname_verify_process_finish_page", intent.getStringExtra("realname_btn_title"));
            bundle.putInt("realname_verify_process_finish_err_jump", com.tencent.mm.sdk.platformtools.t8.D1(intent.getStringExtra("realname_err_jump_page"), 0));
            bundle.putInt("realname_verify_process_finish_passport_page_style", intent.getIntExtra("passport_page_style", 0));
            bundle.putString("realname_verify_process_finish_confirm_btn_title", intent.getStringExtra("confirm_btn_title"));
            bundle.putString("realname_verify_process_finish_confirm_btn_url", intent.getStringExtra("confirm_btn_url"));
            bundle.putString("realname_verify_process_finish_cancel_btn_title", intent.getStringExtra(".cancel_btn_title"));
            bundle.putString("realname_verify_process_finish_bottom_wording", intent.getStringExtra("bottom_wording"));
            bundle.putString("realname_verify_process_finish_bottom_url", intent.getStringExtra("bottom_url"));
            bundle.putString("realname_verify_process_finish_bottom_username", intent.getStringExtra("bottom_username"));
            aVar.B(crossActivity2, com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifySuccessUI.class, aVar.f213801c);
        }
    }
}
