package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class cg implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusRecentStatusView f173797d;

    public cg(com.tencent.mm.plugin.textstatus.ui.TextStatusRecentStatusView textStatusRecentStatusView) {
        this.f173797d = textStatusRecentStatusView;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f173797d.f173692m = null;
    }
}
