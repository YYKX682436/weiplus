package z6;

/* loaded from: classes13.dex */
public class a extends java.lang.Thread {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z6.b f470303d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(z6.b bVar, java.lang.Runnable runnable, java.lang.String str) {
        super(runnable, str);
        this.f470303d = bVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        android.os.Process.setThreadPriority(9);
        z6.b bVar = this.f470303d;
        if (bVar.f470306f) {
            android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
        }
        try {
            super.run();
        } catch (java.lang.Throwable th6) {
            bVar.f470305e.a(th6);
        }
    }
}
