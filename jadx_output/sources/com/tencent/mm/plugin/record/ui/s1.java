package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f155480d;

    public s1(com.tencent.mm.plugin.record.ui.RecordMsgImageUI recordMsgImageUI, android.app.Dialog dialog) {
        this.f155480d = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f155480d.dismiss();
    }
}
