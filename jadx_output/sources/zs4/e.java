package zs4;

/* loaded from: classes8.dex */
public class e implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f475284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f475285e;

    public e(boolean z17, android.app.Activity activity) {
        this.f475284d = z17;
        this.f475285e = activity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        if (this.f475284d) {
            this.f475285e.finish();
        }
    }
}
