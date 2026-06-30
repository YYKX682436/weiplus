package uo;

/* loaded from: classes12.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f429506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f429507e;

    public c(android.content.Context context, yz5.l lVar) {
        this.f429506d = context;
        this.f429507e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f429506d;
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            return;
        }
        uo.n nVar = uo.n.f429522a;
        yz5.l lVar = this.f429507e;
        if (lVar == null) {
            lVar = uo.n.f429526e;
        }
        android.app.Dialog dialog = lVar != null ? (android.app.Dialog) lVar.invoke(context) : null;
        uo.n.f429527f = dialog;
        if (dialog != null) {
            dialog.show();
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.CameraCompat", "show: mErrAlertHold=" + uo.n.f429527f);
        ap.a.a(1, "openCameraErrAlert", new java.lang.Throwable(), null, new java.lang.String[0]);
    }
}
