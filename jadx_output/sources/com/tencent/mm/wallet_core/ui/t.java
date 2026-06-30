package com.tencent.mm.wallet_core.ui;

/* loaded from: classes5.dex */
public class t implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.w f214232d;

    public t(com.tencent.mm.wallet_core.ui.w wVar) {
        this.f214232d = wVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f214232d.f214245a.getWindow().clearFlags(1024);
    }
}
