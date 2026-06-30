package pi;

/* loaded from: classes12.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f354498a;

    /* renamed from: b, reason: collision with root package name */
    public int f354499b;

    public e() {
        this.f354499b = 0;
        this.f354498a = "";
    }

    public void a() {
        int i17 = this.f354499b - 1;
        this.f354499b = i17;
        if (i17 == 0) {
            ((java.util.concurrent.ConcurrentHashMap) pi.f.f354501b).remove(this.f354498a);
        }
    }

    public e(java.lang.String str) {
        this.f354499b = 0;
        this.f354498a = str;
    }
}
