package com.tencent.mm.plugin.record.ui;

/* loaded from: classes4.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgDetailUI.AnonymousClass1 f155450d;

    public m0(com.tencent.mm.plugin.record.ui.RecordMsgDetailUI.AnonymousClass1 anonymousClass1) {
        this.f155450d = anonymousClass1;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.record.ui.RecordMsgDetailUI.AnonymousClass1 anonymousClass1 = this.f155450d;
        com.tencent.mm.plugin.record.ui.RecordMsgDetailUI recordMsgDetailUI = com.tencent.mm.plugin.record.ui.RecordMsgDetailUI.this;
        db5.e1.y(recordMsgDetailUI, recordMsgDetailUI.getString(com.tencent.mm.R.string.igp), "", com.tencent.mm.plugin.record.ui.RecordMsgDetailUI.this.getString(com.tencent.mm.R.string.l_e), new com.tencent.mm.plugin.record.ui.l0(this));
    }
}
