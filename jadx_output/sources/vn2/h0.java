package vn2;

/* loaded from: classes2.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f438302d;

    public h0(android.app.Activity activity) {
        this.f438302d = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Activity activity = this.f438302d;
        com.tencent.mm.ui.widget.snackbar.j.c(activity.getResources().getString(com.tencent.mm.R.string.dtq), "", activity, vn2.g0.f438282a, null);
    }
}
