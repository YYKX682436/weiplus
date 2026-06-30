package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes3.dex */
public class a2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f152581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152582e;

    public a2(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI, int i17) {
        this.f152582e = walletOfflineCoinPurseUI;
        this.f152581d = i17;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI$23", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152582e;
        if (action == 0) {
            walletOfflineCoinPurseUI.I.setBackgroundDrawable(walletOfflineCoinPurseUI.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.bac));
        } else if (motionEvent.getAction() == 1) {
            walletOfflineCoinPurseUI.I.setBackgroundDrawable(walletOfflineCoinPurseUI.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.bad));
            ((android.graphics.drawable.GradientDrawable) walletOfflineCoinPurseUI.I.getBackground()).setColor(this.f152581d);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/offline/ui/WalletOfflineCoinPurseUI$23", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
