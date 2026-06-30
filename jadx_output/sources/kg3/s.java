package kg3;

/* loaded from: classes12.dex */
public final class s implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: o, reason: collision with root package name */
    public static final kg3.r f307723o = new kg3.r(null);

    /* renamed from: d, reason: collision with root package name */
    public final kg3.f f307724d;

    /* renamed from: e, reason: collision with root package name */
    public int f307725e;

    /* renamed from: f, reason: collision with root package name */
    public int f307726f;

    /* renamed from: g, reason: collision with root package name */
    public int f307727g;

    /* renamed from: h, reason: collision with root package name */
    public float f307728h;

    /* renamed from: i, reason: collision with root package name */
    public int f307729i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f307730m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f307731n;

    public s(kg3.f listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f307724d = listener;
        this.f307725e = -1;
        this.f307726f = -1;
        this.f307727g = -1;
        this.f307731n = true;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
        if (i17 == 2) {
            this.f307730m = true;
        }
        if (i17 == 0) {
            this.f307725e = -1;
        }
        if (i17 == 1) {
            this.f307730m = true;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
        int i19;
        this.f307729i = i18;
        if (this.f307730m) {
            float f18 = this.f307728h;
            if (f18 > 0.0f) {
                if (f17 > f18) {
                    this.f307731n = true;
                } else {
                    this.f307731n = false;
                }
                this.f307730m = false;
            }
        }
        this.f307728h = f17;
        int i27 = this.f307726f;
        if (i27 < 0) {
            return;
        }
        if (this.f307725e < 0) {
            this.f307725e = i27;
        }
        kg3.f fVar = this.f307724d;
        if (i18 != 0 || (i19 = this.f307727g) == -1) {
            fVar.D1(this.f307725e);
            fVar.D1(this.f307731n ? this.f307725e + 1 : this.f307725e - 1);
        } else {
            fVar.M1(i19);
            fVar.D1(this.f307727g);
            fVar.D1(this.f307726f);
            this.f307725e = -1;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        this.f307727g = this.f307726f;
        this.f307726f = i17;
        this.f307724d.onPageSelected(i17);
    }
}
