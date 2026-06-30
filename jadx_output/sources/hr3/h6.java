package hr3;

/* loaded from: classes9.dex */
public class h6 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.t6 f283607d;

    public h6(hr3.t6 t6Var) {
        this.f283607d = t6Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f283607d.I = true;
    }
}
