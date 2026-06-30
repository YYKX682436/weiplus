package gl4;

/* loaded from: classes11.dex */
public final class r implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk.y8 f272880d;

    public r(qk.y8 y8Var) {
        this.f272880d = y8Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        qk.y8 y8Var = this.f272880d;
        if (y8Var != null) {
            y8Var.a(new qk.ea(qk.ga.f364137g, null));
        }
    }
}
