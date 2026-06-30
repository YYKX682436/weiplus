package gi3;

/* loaded from: classes10.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f272274a;

    /* renamed from: b, reason: collision with root package name */
    public final int f272275b;

    public a(int i17) {
        this.f272275b = 2;
        if (i17 == 1) {
            this.f272274a = 1;
            return;
        }
        if (i17 == 2) {
            this.f272274a = 2;
            return;
        }
        if (i17 == 512) {
            this.f272275b = 1;
            this.f272274a = 2;
        } else if (i17 == 4) {
            this.f272274a = 4;
        }
    }

    public java.lang.String toString() {
        return "VideoEditCountData{scene=" + this.f272274a + ", source=" + this.f272275b + '}';
    }
}
