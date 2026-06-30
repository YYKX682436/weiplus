package com.tencent.mm.plugin.record.ui;

/* loaded from: classes12.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f155496f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f155497g;

    public v0(com.tencent.mm.plugin.record.ui.RecordMsgDetailUI recordMsgDetailUI, java.lang.String str, java.lang.String str2, com.tencent.mm.storage.f9 f9Var, android.app.Dialog dialog) {
        this.f155494d = str;
        this.f155495e = str2;
        this.f155496f = f9Var;
        this.f155497g = dialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        bt3.g2.M(this.f155494d, this.f155495e, this.f155496f, false);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.record.ui.u0(this));
    }

    public java.lang.String toString() {
        return super.toString() + "|onActivityResult";
    }
}
