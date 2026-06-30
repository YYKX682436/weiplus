package e23;

/* loaded from: classes12.dex */
public class h1 extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public p13.y f246862q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f246863r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.CharSequence f246864s;

    /* renamed from: t, reason: collision with root package name */
    public int f246865t;

    /* renamed from: u, reason: collision with root package name */
    public final e23.g1 f246866u;

    /* renamed from: v, reason: collision with root package name */
    public final e23.f1 f246867v;

    public h1(int i17) {
        super(15, i17);
        this.f246866u = new e23.g1(this);
        this.f246867v = new e23.f1(this);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        this.f246863r = this.f246862q.f351187e;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str = this.f246862q.f351190h;
        float textSize = ((e23.f1) eVar).f246848b.getTextSize();
        ((ke0.e) xVar).getClass();
        this.f246864s = com.tencent.mm.pluginsdk.ui.span.c0.n(context, str, textSize);
        java.lang.Object obj = this.f246862q.f351197o;
        if (obj instanceof java.lang.Integer) {
            this.f246865t = ((java.lang.Integer) obj).intValue();
        }
    }

    @Override // u13.g
    public int j() {
        return this.f246862q.f351200r;
    }

    @Override // u13.g
    public u13.f k() {
        return this.f246866u;
    }
}
