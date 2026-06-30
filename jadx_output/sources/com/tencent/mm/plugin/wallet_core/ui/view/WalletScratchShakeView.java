package com.tencent.mm.plugin.wallet_core.ui.view;

/* loaded from: classes9.dex */
public class WalletScratchShakeView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public gt4.r1 f180727d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f180728e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f180729f;

    /* renamed from: g, reason: collision with root package name */
    public gt4.l1 f180730g;

    public WalletScratchShakeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void a() {
        gt4.r1 r1Var = this.f180727d;
        if (r1Var != null) {
            r1Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletScratchShakeView", "onDestroy");
            q35.d dVar = r1Var.f275527u;
            if (dVar != null) {
                dVar.b();
            }
        }
    }

    public void setScratchShakeCallback(gt4.l1 l1Var) {
        this.f180730g = l1Var;
    }

    public WalletScratchShakeView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
