package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes11.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f176961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f176962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f176963f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.ui.MMSuperAlert f176964g;

    public j(com.tencent.mm.plugin.voip.ui.MMSuperAlert mMSuperAlert, int i17, int i18, boolean z17) {
        this.f176964g = mMSuperAlert;
        this.f176961d = i17;
        this.f176962e = i18;
        this.f176963f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voip.ui.MMSuperAlert mMSuperAlert = this.f176964g;
        int i17 = this.f176961d;
        java.lang.String string = i17 == 0 ? "" : mMSuperAlert.getString(i17);
        int i18 = this.f176962e;
        db5.e1.H(this.f176964g, string, i18 != 0 ? mMSuperAlert.getString(i18) : "", this.f176963f, new com.tencent.mm.plugin.voip.ui.h(this), new com.tencent.mm.plugin.voip.ui.i(this));
    }
}
