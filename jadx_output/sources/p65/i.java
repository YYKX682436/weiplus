package p65;

/* loaded from: classes12.dex */
public class i extends p65.a {
    @Override // p65.a
    public void e(android.app.Application application) {
        g(f(application));
        try {
            if (bm5.f1.a().endsWith(":fallback")) {
                com.tencent.mm.splash.a.f193640a = application.getCacheDir().getAbsolutePath() + "/splash_cache";
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
