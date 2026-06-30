package com.tencent.mm.wallet_core.ui;

/* loaded from: classes4.dex */
public abstract class z1 implements android.view.View.OnClickListener {
    private static final long DEFAULT_CLICK_LIMIT_TIME = 3000;
    private static final java.lang.String TAG = "MicroMsg.WalletClickListener";
    private byte _hellAccFlag_;
    private boolean avoidDoubleClick;
    private long clickLimitTime;
    private long lastClickTime;

    public z1(boolean z17) {
        this(z17, DEFAULT_CLICK_LIMIT_TIME);
    }

    public boolean isFastClick() {
        long j17 = this.clickLimitTime;
        if (j17 == 0) {
            j17 = DEFAULT_CLICK_LIMIT_TIME;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.lastClickTime < j17) {
            return true;
        }
        this.lastClickTime = currentTimeMillis;
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/ui/WalletOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.avoidDoubleClick && isFastClick()) {
            yj0.a.h(this, "com/tencent/mm/wallet_core/ui/WalletOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        onRealClick(view);
        com.tencent.mm.wallet_core.ui.b0.e(view);
        yj0.a.h(this, "com/tencent/mm/wallet_core/ui/WalletOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public abstract void onRealClick(android.view.View view);

    public z1(boolean z17, long j17) {
        this.avoidDoubleClick = z17;
        this.clickLimitTime = j17;
    }
}
