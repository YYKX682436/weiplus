package p21;

/* loaded from: classes4.dex */
public class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f351424d;

    public g(java.lang.Runnable runnable) {
        this.f351424d = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.Runnable runnable = this.f351424d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
