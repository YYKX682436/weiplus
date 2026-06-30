package cr3;

/* loaded from: classes11.dex */
public class i implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr3.d0 f221951d;

    public i(cr3.d0 d0Var) {
        this.f221951d = d0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f221951d.f221936i = true;
    }
}
