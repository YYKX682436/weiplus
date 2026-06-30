package r53;

/* loaded from: classes8.dex */
public class g implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f392666d;

    public g(android.app.Dialog dialog) {
        this.f392666d = dialog;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f392666d.setOnCancelListener(null);
    }
}
