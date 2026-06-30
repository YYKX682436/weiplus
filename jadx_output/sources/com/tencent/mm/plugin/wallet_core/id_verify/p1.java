package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes8.dex */
public class p1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyBindcardEntranceUI f179457d;

    public p1(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyBindcardEntranceUI wcPayRealnameVerifyBindcardEntranceUI) {
        this.f179457d = wcPayRealnameVerifyBindcardEntranceUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyBindcardEntranceUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyBindcardEntranceUI wcPayRealnameVerifyBindcardEntranceUI = this.f179457d;
        boolean z17 = wcPayRealnameVerifyBindcardEntranceUI.getInput().getBoolean("realname_verify_process_need_face", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameVerifyBindcardEntranceUI", "need face : %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            int i17 = com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyBindcardEntranceUI.f179261h;
            wcPayRealnameVerifyBindcardEntranceUI.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameVerifyBindcardEntranceUI", "gotToFaceCheck");
            com.tencent.mm.autogen.events.RequestFaceVerifyForPayEvent requestFaceVerifyForPayEvent = new com.tencent.mm.autogen.events.RequestFaceVerifyForPayEvent();
            am.jr jrVar = requestFaceVerifyForPayEvent.f54694g;
            jrVar.f7076j = wcPayRealnameVerifyBindcardEntranceUI;
            jrVar.f7067a = (int) wcPayRealnameVerifyBindcardEntranceUI.getInput().getLong("realname_verify_process_face_scene");
            jrVar.f7068b = wcPayRealnameVerifyBindcardEntranceUI.getInput().getString("realname_verify_process_face_package");
            jrVar.f7069c = wcPayRealnameVerifyBindcardEntranceUI.getInput().getString("realname_verify_process_face_package_sign");
            jrVar.f7074h = 1;
            requestFaceVerifyForPayEvent.e();
        } else {
            wcPayRealnameVerifyBindcardEntranceUI.getInput().putBoolean("realname_verify_process_do_bind", false);
            com.tencent.mm.wallet_core.a.d(wcPayRealnameVerifyBindcardEntranceUI.getContext(), wcPayRealnameVerifyBindcardEntranceUI.getInput());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyBindcardEntranceUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
