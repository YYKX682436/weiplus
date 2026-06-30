package dz4;

/* loaded from: classes.dex */
public final class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f245462d;

    public y0(android.app.Activity activity) {
        this.f245462d = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Activity activity = this.f245462d;
        com.tencent.mm.ui.widget.snackbar.j.c(activity != null ? activity.getString(com.tencent.mm.R.string.l_m) : null, null, activity, null, null);
    }
}
