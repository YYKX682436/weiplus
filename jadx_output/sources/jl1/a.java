package jl1;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f300194a;

    /* renamed from: b, reason: collision with root package name */
    public final int f300195b;

    /* renamed from: c, reason: collision with root package name */
    public final int f300196c;

    /* renamed from: d, reason: collision with root package name */
    public final int f300197d;

    /* renamed from: e, reason: collision with root package name */
    public final int f300198e;

    /* renamed from: f, reason: collision with root package name */
    public final int f300199f;

    /* renamed from: g, reason: collision with root package name */
    public final int f300200g;

    /* renamed from: h, reason: collision with root package name */
    public final int f300201h;

    public a(int i17, int i18) {
        this.f300194a = android.graphics.Color.red(i17);
        this.f300195b = android.graphics.Color.green(i17);
        this.f300196c = android.graphics.Color.blue(i17);
        this.f300197d = android.graphics.Color.alpha(i17);
        this.f300198e = android.graphics.Color.red(i18);
        this.f300199f = android.graphics.Color.green(i18);
        this.f300200g = android.graphics.Color.blue(i18);
        this.f300201h = android.graphics.Color.alpha(i18);
    }

    public int a(float f17) {
        return android.graphics.Color.argb((int) (this.f300197d + ((this.f300201h - r3) * f17) + 0.5d), (int) (this.f300194a + ((this.f300198e - r0) * f17) + 0.5d), (int) (this.f300195b + ((this.f300199f - r1) * f17) + 0.5d), (int) (this.f300196c + ((this.f300200g - r2) * f17) + 0.5d));
    }
}
