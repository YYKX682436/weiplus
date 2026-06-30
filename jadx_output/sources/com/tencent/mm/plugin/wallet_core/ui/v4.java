package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class v4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.ECardInfo f180668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f180669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f180670f;

    public v4(com.tencent.mm.plugin.wallet_core.model.ECardInfo eCardInfo, android.content.Context context, android.app.Dialog dialog) {
        this.f180668d = eCardInfo;
        this.f180669e = context;
        this.f180670f = dialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.model.ECardInfo eCardInfo = this.f180668d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletIdCardTip", "go to: %s", java.lang.Integer.valueOf(eCardInfo.f179636n));
        int i17 = eCardInfo.f179636n;
        android.content.Context context = this.f180669e;
        if (i17 == 1) {
            com.tencent.mm.wallet_core.ui.r1.V(context, eCardInfo.f179637o, false);
        } else {
            com.tencent.mm.autogen.events.OpenECardEvent openECardEvent = new com.tencent.mm.autogen.events.OpenECardEvent();
            openECardEvent.f54593g.f7355a = new java.lang.ref.WeakReference(context);
            openECardEvent.e();
        }
        android.app.Dialog dialog = this.f180670f;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
