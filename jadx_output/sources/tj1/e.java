package tj1;

/* loaded from: classes7.dex */
public final class e implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f419692d;

    public e(android.app.Activity activity) {
        this.f419692d = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        tj1.b bVar = tj1.f.f419694b;
        if (bVar != null) {
            ((tj1.g) bVar).a(this.f419692d, 2);
        }
    }
}
