package r35;

/* loaded from: classes11.dex */
public class j implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r35.o f369141d;

    public j(r35.o oVar) {
        this.f369141d = oVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        r35.o oVar = this.f369141d;
        android.app.ProgressDialog progressDialog = oVar.f369224p;
        if (progressDialog != null) {
            progressDialog.dismiss();
            oVar.f369224p = null;
        }
    }
}
