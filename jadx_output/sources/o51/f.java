package o51;

/* loaded from: classes15.dex */
public class f extends o51.d {

    /* renamed from: d, reason: collision with root package name */
    public int f343090d;

    /* renamed from: e, reason: collision with root package name */
    public int f343091e;

    /* renamed from: f, reason: collision with root package name */
    public p51.a f343092f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f343093g;

    /* renamed from: h, reason: collision with root package name */
    public int f343094h;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f343095i;

    public f(int i17, int i18, android.content.Context context) {
        super(i17, i18);
        this.f343095i = context;
        p51.a aVar = this.f343092f;
        this.f343092f = aVar;
        if (aVar == null) {
            this.f343092f = new o51.e(this);
        }
        this.f343090d = i17;
        this.f343091e = i18;
    }

    @Override // o51.d, p51.b
    public java.lang.String a(int i17) {
        return (i17 == 0 && this.f343093g) ? this.f343095i.getString(this.f343094h) : super.a(i17);
    }

    @Override // o51.d, p51.b
    /* renamed from: b */
    public java.lang.Integer getItem(int i17) {
        if (i17 < 0 || i17 >= getItemsCount()) {
            return null;
        }
        return this.f343093g ? java.lang.Integer.valueOf((this.f343090d + i17) - 1) : java.lang.Integer.valueOf(this.f343090d + i17);
    }

    @Override // o51.d
    public int c() {
        return this.f343091e;
    }

    @Override // o51.d
    public int d() {
        return this.f343090d;
    }

    @Override // o51.d, p51.b
    public int getItemsCount() {
        return (this.f343093g ? (this.f343091e - this.f343090d) + 1 : this.f343091e - this.f343090d) + 1;
    }
}
