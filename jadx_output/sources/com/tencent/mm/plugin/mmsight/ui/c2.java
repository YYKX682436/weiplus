package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class c2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.e2 f149300d;

    public c2(com.tencent.mm.plugin.mmsight.ui.e2 e2Var) {
        this.f149300d = e2Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.mmsight.ui.e2 e2Var = this.f149300d;
        long j17 = e2Var.f149316d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        float elapsedRealtime = ((((float) (android.os.SystemClock.elapsedRealtime() - j17)) / e2Var.f149318f) * 100.0f) + e2Var.f149314b;
        e2Var.f149317e = elapsedRealtime;
        com.tencent.mm.plugin.mmsight.ui.d2 d2Var = e2Var.f149320h;
        if (d2Var != null) {
            com.tencent.mm.plugin.mmsight.ui.w wVar = (com.tencent.mm.plugin.mmsight.ui.w) d2Var;
            if (elapsedRealtime <= 100.0f) {
                com.tencent.mm.plugin.mmsight.ui.MMSightCircularProgressBar mMSightCircularProgressBar = wVar.f149438a;
                mMSightCircularProgressBar.f149183q = elapsedRealtime;
                if (mMSightCircularProgressBar.f149190x != null) {
                    java.util.ArrayList arrayList = mMSightCircularProgressBar.f149192z;
                    arrayList.clear();
                    arrayList.addAll(mMSightCircularProgressBar.f149191y);
                    arrayList.add(java.lang.Float.valueOf(mMSightCircularProgressBar.f149183q));
                    mMSightCircularProgressBar.f149190x.b(arrayList);
                }
                mMSightCircularProgressBar.invalidate();
            }
        }
        if (!e2Var.f149319g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ProgressHandlerAnimator", "isStart is false now");
            return false;
        }
        float f17 = e2Var.f149317e;
        if (f17 < e2Var.f149315c) {
            return true;
        }
        e2Var.f149319g = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.ProgressHandlerAnimator", "reach end, currentValue: %s, end: %s, callback: %s", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(e2Var.f149315c), e2Var.f149320h);
        com.tencent.mm.plugin.mmsight.ui.d2 d2Var2 = e2Var.f149320h;
        if (d2Var2 != null) {
            com.tencent.mm.plugin.mmsight.ui.w wVar2 = (com.tencent.mm.plugin.mmsight.ui.w) d2Var2;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightCircularProgressBar", "onAnimationEnd %b", java.lang.Boolean.valueOf(wVar2.f149438a.A));
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.ui.v(wVar2));
        }
        return false;
    }
}
