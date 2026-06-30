package com.tencent.mm.plugin.record.ui;

/* loaded from: classes9.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgFileUI f155345d;

    public a1(com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI) {
        this.f155345d = recordMsgFileUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.tencent.mm.plugin.record.ui.RecordMsgFileUI.H;
        com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI = this.f155345d;
        recordMsgFileUI.Y6();
        db5.e1.T(recordMsgFileUI.getContext(), recordMsgFileUI.getString(com.tencent.mm.R.string.brf));
    }
}
