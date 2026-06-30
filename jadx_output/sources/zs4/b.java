package zs4;

/* loaded from: classes8.dex */
public class b implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f475276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f475277e;

    public b(boolean z17, android.app.Activity activity) {
        this.f475276d = z17;
        this.f475277e = activity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        if (this.f475276d) {
            this.f475277e.finish();
        }
    }
}
