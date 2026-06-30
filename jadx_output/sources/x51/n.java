package x51;

/* loaded from: classes11.dex */
public class n implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f452037d;

    public n(x51.o oVar, android.app.Activity activity) {
        this.f452037d = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f452037d.finish();
    }
}
