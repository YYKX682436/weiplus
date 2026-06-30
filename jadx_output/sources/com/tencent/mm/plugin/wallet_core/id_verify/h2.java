package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes8.dex */
public class h2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI f179387d;

    public h2(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        this.f179387d = wcPayRealnameVerifyIdInputUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f179387d;
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI.U6(wcPayRealnameVerifyIdInputUI);
        wcPayRealnameVerifyIdInputUI.hideTenpayKB();
        wcPayRealnameVerifyIdInputUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameVerifyIdInputUI", "go to select profession ui");
        android.content.Intent intent = new android.content.Intent(wcPayRealnameVerifyIdInputUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.wallet_core.ui.WalletSelectProfessionUI.class);
        intent.putExtra("key_profession_list", wcPayRealnameVerifyIdInputUI.B);
        wcPayRealnameVerifyIdInputUI.startActivityForResult(intent, 2);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
