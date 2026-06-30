package s13;

/* loaded from: classes11.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f402133d;

    public a(java.lang.String str) {
        this.f402133d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            s13.b.a();
            if (s13.b.f402136c != null) {
                s13.b.f402136c.invoke(null, this.f402133d);
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
