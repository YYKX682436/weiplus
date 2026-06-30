package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class dg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f208336d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f208337e;

    /* renamed from: f, reason: collision with root package name */
    public int f208338f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Intent f208339g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.NewChattingTabUI f208340h;

    public dg(com.tencent.mm.ui.NewChattingTabUI newChattingTabUI, com.tencent.mm.ui.pf pfVar) {
        this.f208340h = newChattingTabUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean a17 = gm0.j1.a();
        com.tencent.mm.ui.NewChattingTabUI newChattingTabUI = this.f208340h;
        if (a17 && newChattingTabUI.f197014a != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "on post select image job, acc has ready, retry count %d", java.lang.Integer.valueOf(this.f208336d));
            newChattingTabUI.r(newChattingTabUI.f197020g, null, false);
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.cg(this));
        } else {
            if (this.f208336d >= 3) {
                com.tencent.mars.xlog.Log.w("MicroMsg.LauncherUI.NewChattingTabUI", "on post select image job, match max retry count");
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(newChattingTabUI.f197014a != null);
            objArr[1] = java.lang.Integer.valueOf(this.f208336d);
            com.tencent.mars.xlog.Log.w("MicroMsg.LauncherUI.NewChattingTabUI", "on post select image job, acc not ready or view init(%B), cur retry count %d", objArr);
            this.f208336d++;
            com.tencent.mm.sdk.platformtools.u3.i(this, 300L);
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|PostSelectImageJob";
    }
}
