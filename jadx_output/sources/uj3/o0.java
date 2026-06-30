package uj3;

/* loaded from: classes14.dex */
public final class o0 extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.v0 f428334d;

    public o0(uj3.v0 v0Var) {
        this.f428334d = v0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        uj3.v0 v0Var = this.f428334d;
        uj3.k1 mScreenReportData = v0Var.getMScreenReportData();
        if (mScreenReportData == null) {
            return;
        }
        uj3.k1 mScreenReportData2 = v0Var.getMScreenReportData();
        int i17 = mScreenReportData2 != null ? mScreenReportData2.f428310f : 0;
        v0Var.getClass();
        mScreenReportData.f428310f = (i17 + 0) / 2;
    }
}
