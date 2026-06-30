package is;

/* loaded from: classes11.dex */
public class w implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ js.v0 f294377d;

    public w(is.i0 i0Var, js.v0 v0Var) {
        this.f294377d = v0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f294377d.onCancel();
    }
}
