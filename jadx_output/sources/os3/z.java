package os3;

/* loaded from: classes8.dex */
public class z implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.b0 f348260d;

    public z(os3.b0 b0Var) {
        this.f348260d = b0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        os3.b0 b0Var = this.f348260d;
        b0Var.f348036d.f154853y.a();
        b0Var.f348036d.f154853y.f348229n = null;
    }
}
