package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes13.dex */
public class u1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallDynamicTextView f143018d;

    public u1(com.tencent.mm.plugin.ipcall.ui.IPCallDynamicTextView iPCallDynamicTextView) {
        this.f143018d = iPCallDynamicTextView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.ipcall.ui.IPCallDynamicTextView iPCallDynamicTextView = this.f143018d;
        if (iPCallDynamicTextView.f142612f != iPCallDynamicTextView.f142613g) {
            iPCallDynamicTextView.f142619p.sendEmptyMessage(1);
        }
    }
}
