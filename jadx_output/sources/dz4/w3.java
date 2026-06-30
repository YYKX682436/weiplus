package dz4;

/* loaded from: classes12.dex */
public final class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.h4 f245448d;

    public w3(dz4.h4 h4Var) {
        this.f245448d = h4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Activity activity;
        java.lang.ref.WeakReference weakReference = ((ez4.u) this.f245448d.f245283a).f257944c;
        if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
            return;
        }
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
        e4Var.f211776c = activity.getString(com.tencent.mm.R.string.j3v);
        e4Var.c();
    }
}
