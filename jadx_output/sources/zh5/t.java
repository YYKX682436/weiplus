package zh5;

/* loaded from: classes8.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f473070d;

    public t(android.app.Dialog dialog) {
        this.f473070d = dialog;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f473070d.dismiss();
    }
}
