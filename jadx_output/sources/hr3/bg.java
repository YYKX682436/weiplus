package hr3;

/* loaded from: classes11.dex */
public final class bg implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.gg f283431d;

    public bg(hr3.gg ggVar) {
        this.f283431d = ggVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        hr3.gg ggVar = this.f283431d;
        kotlinx.coroutines.r2 r2Var = ggVar.f283596f;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        ggVar.f283596f = null;
    }
}
