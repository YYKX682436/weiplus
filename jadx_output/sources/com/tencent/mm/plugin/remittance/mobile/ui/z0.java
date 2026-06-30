package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes5.dex */
public class z0 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f156751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI f156752e;

    public z0(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI, android.view.View.OnClickListener onClickListener) {
        this.f156752e = mobileRemittanceUI;
        this.f156751d = onClickListener;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66 && this.f156752e.f156631w.isShown()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "click enter");
            this.f156751d.onClick(null);
        }
        return true;
    }
}
