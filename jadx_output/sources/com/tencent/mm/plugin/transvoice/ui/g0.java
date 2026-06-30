package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes5.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.transvoice.ui.v0 f175432d;

    public g0(com.tencent.mm.plugin.transvoice.ui.v0 v0Var) {
        this.f175432d = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.transvoice.ui.TransVoicePanelLayout transVoicePanelLayout = this.f175432d.f175483m;
        if (transVoicePanelLayout != null) {
            transVoicePanelLayout.requestLayout();
        }
    }
}
