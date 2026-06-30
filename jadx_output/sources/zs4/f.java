package zs4;

/* loaded from: classes8.dex */
public class f implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f475286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f475287e;

    public f(boolean z17, android.app.Activity activity) {
        this.f475286d = z17;
        this.f475287e = activity;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        if (this.f475286d) {
            this.f475287e.finish();
        }
    }
}
