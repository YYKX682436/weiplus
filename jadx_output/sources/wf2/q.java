package wf2;

/* loaded from: classes10.dex */
public final class q implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wf2.a0 f445613d;

    public q(wf2.a0 a0Var) {
        this.f445613d = a0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.e("FinderLiveScreenShotShareEntranceController", "#onEntranceClick cancel dialog by user");
        kotlinx.coroutines.r2 r2Var = this.f445613d.f445562s;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }
}
