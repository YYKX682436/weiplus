package dz4;

/* loaded from: classes.dex */
public final class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f245440d;

    public w0(android.app.Activity activity) {
        this.f245440d = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Activity activity = this.f245440d;
        com.tencent.mm.ui.widget.snackbar.j.c(activity.getString(com.tencent.mm.R.string.l_g), null, activity, null, null);
    }
}
