package p9;

/* loaded from: classes15.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public long f352826a;

    /* renamed from: b, reason: collision with root package name */
    public long f352827b;

    /* renamed from: c, reason: collision with root package name */
    public android.text.SpannableStringBuilder f352828c;

    /* renamed from: d, reason: collision with root package name */
    public android.text.Layout.Alignment f352829d;

    /* renamed from: e, reason: collision with root package name */
    public float f352830e;

    /* renamed from: f, reason: collision with root package name */
    public int f352831f;

    /* renamed from: g, reason: collision with root package name */
    public int f352832g;

    /* renamed from: h, reason: collision with root package name */
    public float f352833h;

    /* renamed from: i, reason: collision with root package name */
    public int f352834i;

    /* renamed from: j, reason: collision with root package name */
    public float f352835j;

    public f() {
        b();
    }

    public p9.g a() {
        if (this.f352833h != Float.MIN_VALUE && this.f352834i == Integer.MIN_VALUE) {
            android.text.Layout.Alignment alignment = this.f352829d;
            if (alignment == null) {
                this.f352834i = Integer.MIN_VALUE;
            } else {
                int i17 = p9.e.f352825a[alignment.ordinal()];
                if (i17 == 1) {
                    this.f352834i = 0;
                } else if (i17 == 2) {
                    this.f352834i = 1;
                } else if (i17 != 3) {
                    java.util.Objects.toString(this.f352829d);
                    this.f352834i = 0;
                } else {
                    this.f352834i = 2;
                }
            }
        }
        return new p9.g(this.f352826a, this.f352827b, this.f352828c, this.f352829d, this.f352830e, this.f352831f, this.f352832g, this.f352833h, this.f352834i, this.f352835j);
    }

    public void b() {
        this.f352826a = 0L;
        this.f352827b = 0L;
        this.f352828c = null;
        this.f352829d = null;
        this.f352830e = Float.MIN_VALUE;
        this.f352831f = Integer.MIN_VALUE;
        this.f352832g = Integer.MIN_VALUE;
        this.f352833h = Float.MIN_VALUE;
        this.f352834i = Integer.MIN_VALUE;
        this.f352835j = Float.MIN_VALUE;
    }
}
