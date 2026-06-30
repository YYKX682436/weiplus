package sj4;

/* loaded from: classes11.dex */
public final class e1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj4.h1 f408835d;

    public e1(sj4.h1 h1Var) {
        this.f408835d = h1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        sj4.h1 h1Var = this.f408835d;
        h1Var.f408853m = null;
        h1Var.cancel();
    }
}
