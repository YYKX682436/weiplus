package fp;

/* loaded from: classes5.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public long f265203a;

    public j() {
        b();
    }

    public long a() {
        return android.os.SystemClock.elapsedRealtime() - this.f265203a;
    }

    public void b() {
        this.f265203a = android.os.SystemClock.elapsedRealtime();
    }
}
