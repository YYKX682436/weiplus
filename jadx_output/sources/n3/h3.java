package n3;

/* loaded from: classes14.dex */
public abstract class h3 extends n3.l3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.Window f334339a;

    /* renamed from: b, reason: collision with root package name */
    public final n3.s0 f334340b;

    public h3(android.view.Window window, n3.s0 s0Var) {
        this.f334339a = window;
        this.f334340b = s0Var;
    }

    @Override // n3.l3
    public void a(int i17) {
        for (int i18 = 1; i18 <= 256; i18 <<= 1) {
            if ((i17 & i18) != 0) {
                if (i18 == 1) {
                    h(4);
                } else if (i18 == 2) {
                    h(2);
                } else if (i18 == 8) {
                    this.f334340b.f334398a.a();
                }
            }
        }
    }

    @Override // n3.l3
    public void f(int i17) {
        if (i17 == 0) {
            i(6144);
            return;
        }
        if (i17 == 1) {
            i(4096);
            h(2048);
        } else {
            if (i17 != 2) {
                return;
            }
            i(2048);
            h(4096);
        }
    }

    @Override // n3.l3
    public void g(int i17) {
        for (int i18 = 1; i18 <= 256; i18 <<= 1) {
            if ((i17 & i18) != 0) {
                if (i18 == 1) {
                    i(4);
                    this.f334339a.clearFlags(1024);
                } else if (i18 == 2) {
                    i(2);
                } else if (i18 == 8) {
                    this.f334340b.f334398a.b();
                }
            }
        }
    }

    public void h(int i17) {
        android.view.View decorView = this.f334339a.getDecorView();
        decorView.setSystemUiVisibility(i17 | decorView.getSystemUiVisibility());
    }

    public void i(int i17) {
        android.view.View decorView = this.f334339a.getDecorView();
        decorView.setSystemUiVisibility((~i17) & decorView.getSystemUiVisibility());
    }
}
