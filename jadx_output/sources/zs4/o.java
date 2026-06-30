package zs4;

/* loaded from: classes8.dex */
public class o implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f475310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f475311e;

    public o(boolean z17, android.app.Activity activity) {
        this.f475310d = z17;
        this.f475311e = activity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        if (this.f475310d) {
            this.f475311e.finish();
        }
    }
}
