package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class y6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f212577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.o7 f212578e;

    public y6(com.tencent.mm.ui.o7 o7Var, long j17) {
        this.f212578e = o7Var;
        this.f212577d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f212578e.f209450a;
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(mMFragmentActivity);
        e4Var.f211776c = mMFragmentActivity.getString(com.tencent.mm.R.string.nds, java.lang.Long.valueOf(this.f212577d));
        e4Var.c();
    }
}
