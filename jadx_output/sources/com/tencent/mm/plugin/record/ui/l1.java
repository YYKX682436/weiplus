package com.tencent.mm.plugin.record.ui;

/* loaded from: classes9.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f155437d;

    public l1(com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI, android.app.Dialog dialog) {
        this.f155437d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f155437d.dismiss();
    }
}
