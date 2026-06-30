package com.tencent.mm.plugin.record.ui;

/* loaded from: classes9.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.w f155488d;

    public u(com.tencent.mm.plugin.record.ui.w wVar) {
        this.f155488d = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.record.ui.RecordMsgDetailUI recordMsgDetailUI = (com.tencent.mm.plugin.record.ui.RecordMsgDetailUI) this.f155488d.f155590a.get();
        if (recordMsgDetailUI != null) {
            recordMsgDetailUI.k7();
        }
    }
}
