package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes3.dex */
public class n2 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI f161344d;

    public n2(com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI) {
        this.f161344d = selfQRCodeUI;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI = this.f161344d;
        selfQRCodeUI.f160184p.getViewTreeObserver().removeOnPreDrawListener(this);
        int a17 = com.tencent.mm.ui.zk.a(selfQRCodeUI.getContext(), 500);
        if (selfQRCodeUI.f160184p.getWidth() > a17) {
            android.view.ViewGroup.LayoutParams layoutParams = selfQRCodeUI.f160184p.getLayoutParams();
            layoutParams.width = a17;
            selfQRCodeUI.f160184p.setLayoutParams(layoutParams);
        }
        android.widget.LinearLayout linearLayout = selfQRCodeUI.f160185q;
        if (linearLayout == null || linearLayout.getWidth() <= a17) {
            return true;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = selfQRCodeUI.f160185q.getLayoutParams();
        layoutParams2.width = a17;
        selfQRCodeUI.f160185q.setLayoutParams(layoutParams2);
        return true;
    }
}
