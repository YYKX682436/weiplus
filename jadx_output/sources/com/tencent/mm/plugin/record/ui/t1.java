package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgImageUI f155487d;

    public t1(com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI) {
        this.f155487d = recordMsgImageUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f155487d.f155315i.notifyDataSetChanged();
    }
}
