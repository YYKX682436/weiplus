package dz4;

/* loaded from: classes12.dex */
public final class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f245227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dz4.f2 f245228e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dz4.g2 f245229f;

    public e2(android.app.Dialog dialog, dz4.f2 f2Var, dz4.g2 g2Var) {
        this.f245227d = dialog;
        this.f245228e = f2Var;
        this.f245229f = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f245227d.dismiss();
        this.f245228e.j(this.f245229f.f245254a);
    }
}
