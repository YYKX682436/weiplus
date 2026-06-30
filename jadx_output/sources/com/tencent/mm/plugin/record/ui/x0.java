package com.tencent.mm.plugin.record.ui;

/* loaded from: classes9.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f155598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f155599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f155600f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgFileUI f155601g;

    public x0(com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI, int i17, long j17, long j18) {
        this.f155601g = recordMsgFileUI;
        this.f155598d = i17;
        this.f155599e = j17;
        this.f155600f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI = this.f155601g;
        recordMsgFileUI.f155291m.setProgress(this.f155598d);
        recordMsgFileUI.f155292n.setText(recordMsgFileUI.getString(com.tencent.mm.R.string.f491193ca2, com.tencent.mm.sdk.platformtools.t8.T((float) this.f155599e), com.tencent.mm.sdk.platformtools.t8.T((float) this.f155600f)));
    }
}
