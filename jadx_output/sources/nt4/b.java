package nt4;

/* loaded from: classes11.dex */
public class b implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt4.e f339818d;

    public b(nt4.e eVar) {
        this.f339818d = eVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        nt4.e eVar = this.f339818d;
        android.app.Dialog dialog = eVar.f339821f;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        eVar.f339821f.dismiss();
    }
}
