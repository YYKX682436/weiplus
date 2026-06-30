package e23;

/* loaded from: classes11.dex */
public class o extends e23.g0 {

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f246917v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.CharSequence f246918w;

    /* renamed from: x, reason: collision with root package name */
    public int f246919x;

    /* renamed from: y, reason: collision with root package name */
    public final e23.m f246920y;

    /* renamed from: z, reason: collision with root package name */
    public final e23.n f246921z;

    public o(int i17) {
        super(i17);
        this.f246920y = new e23.m(this);
        this.f246921z = new e23.n(this);
    }

    @Override // e23.g0, u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        this.f246853q = context.getString(com.tencent.mm.R.string.idj, java.lang.Integer.valueOf(this.f246919x));
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String d17 = o13.n.d(this.f246917v);
        float textSize = ((e23.n) eVar).f246906e.getTextSize();
        ((ke0.e) xVar).getClass();
        this.f246918w = com.tencent.mm.pluginsdk.ui.span.c0.n(context, d17, textSize);
    }

    @Override // e23.g0, u13.g
    public u13.f k() {
        return this.f246920y;
    }

    @Override // e23.g0
    public u13.e o() {
        return this.f246921z;
    }
}
