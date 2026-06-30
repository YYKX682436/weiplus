package e45;

/* loaded from: classes10.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e45.h f249380d;

    public f(e45.h hVar) {
        this.f249380d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.ProgressDialog progressDialog;
        if (e45.a.f249369e == this.f249380d.f249399x || (progressDialog = this.f249380d.f249386h) == null) {
            return;
        }
        progressDialog.show();
    }
}
