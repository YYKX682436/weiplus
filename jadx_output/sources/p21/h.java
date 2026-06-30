package p21;

/* loaded from: classes5.dex */
public class h implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f351425d;

    public h(java.lang.Runnable runnable) {
        this.f351425d = runnable;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        java.lang.Runnable runnable = this.f351425d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
