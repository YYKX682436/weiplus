package v2;

/* loaded from: classes15.dex */
public class p extends v2.q {

    /* renamed from: c, reason: collision with root package name */
    public float f432727c = 0.0f;

    public void f() {
        this.f432729b = 0;
        this.f432728a.clear();
        this.f432727c = 0.0f;
    }

    public void g(int i17) {
        int i18 = this.f432729b;
        if (i18 == 0 || this.f432727c != i17) {
            this.f432727c = i17;
            if (i18 == 1) {
                c();
            }
            b();
        }
    }
}
