package com.tencent.mm.plugin.record.ui;

/* loaded from: classes9.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgFileUI f155607d;

    public y0(com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI) {
        this.f155607d = recordMsgFileUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI = this.f155607d;
        recordMsgFileUI.enableOptionMenu(true);
        int i17 = com.tencent.mm.plugin.record.ui.RecordMsgFileUI.H;
        recordMsgFileUI.W6();
        if (recordMsgFileUI.f155301w) {
            recordMsgFileUI.f155286e.performClick();
        }
    }
}
