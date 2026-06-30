package u4;

/* loaded from: classes13.dex */
public class f2 implements u4.g2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.WindowId f424477a;

    public f2(android.view.View view) {
        this.f424477a = view.getWindowId();
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof u4.f2) && ((u4.f2) obj).f424477a.equals(this.f424477a);
    }

    public int hashCode() {
        return this.f424477a.hashCode();
    }
}
