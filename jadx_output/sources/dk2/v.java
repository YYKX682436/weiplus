package dk2;

/* loaded from: classes3.dex */
public final class v implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.g0 f234221d;

    public v(dk2.g0 g0Var) {
        this.f234221d = g0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        dk2.g0 g0Var = this.f234221d;
        int i17 = g0Var.f233473f - 1;
        g0Var.f233473f = i17;
        if (i17 >= 0) {
            if (g0Var.f233470c == 5) {
                int i18 = g0Var.f233475h;
                if (i18 >= 0) {
                    pm0.v.X(new dk2.d0(g0Var, i18, g0Var.f233474g));
                    g0Var.f233475h--;
                }
                int i19 = g0Var.f233478k;
                if (i19 > 0 && g0Var.f233473f <= i19) {
                    pm0.v.X(new dk2.e0(g0Var));
                }
            } else {
                pm0.v.X(new dk2.e0(g0Var));
            }
            return true;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorVerifyManager", "backupTimer onTimerExpired: currentVerifyMode:" + g0Var.f233470c + ", currentVerifyId:" + g0Var.f233471d);
        int i27 = g0Var.f233470c;
        if (i27 == 1 || i27 == 2 || i27 == 3) {
            dk2.g0.c(g0Var, false);
        } else if (i27 == 5) {
            if (g0Var.f233479l != 1) {
                dk2.g0.c(g0Var, false);
            } else {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorVerifyManager", "backupTimer onTimerExpired: Action_Waiting, skip postVerifyRequest");
            }
        }
        return false;
    }
}
