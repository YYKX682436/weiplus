package mi1;

/* loaded from: classes7.dex */
public final class n2 implements mi1.w0 {

    /* renamed from: f, reason: collision with root package name */
    public final mi1.e f326636f;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Map f326638h;

    /* renamed from: m, reason: collision with root package name */
    public final int f326640m;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ mi1.t2 f326642o;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.Drawable f326634d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.CharSequence f326635e = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f326637g = "";

    /* renamed from: i, reason: collision with root package name */
    public int f326639i = Integer.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Runnable f326641n = null;

    public n2(mi1.t2 t2Var, mi1.e eVar, int i17) {
        this.f326642o = t2Var;
        this.f326640m = 0;
        this.f326636f = eVar;
        this.f326640m = i17;
    }

    public final boolean a() {
        return this.f326642o.f326693d.peekFirst() == this;
    }

    @Override // mi1.w0
    public void b(java.lang.CharSequence charSequence) {
        this.f326642o.m(new mi1.p2(this, charSequence));
    }

    @Override // mi1.w0
    public void c(android.graphics.drawable.Drawable drawable) {
        this.f326642o.m(new mi1.o2(this, drawable));
    }

    @Override // mi1.w0
    public void dismiss() {
        this.f326642o.m(new mi1.s2(this));
    }

    @Override // mi1.w0
    public void e(final java.util.Map map) {
        this.f326642o.m(new java.lang.Runnable() { // from class: mi1.n2$$d
            @Override // java.lang.Runnable
            public final void run() {
                mi1.n2 n2Var = mi1.n2.this;
                java.util.Map map2 = map;
                n2Var.f326638h = map2;
                if (n2Var.a()) {
                    mi1.g gVar = (mi1.g) n2Var.f326642o;
                    gVar.getClass();
                    gVar.f326559i = ((mi1.a) map2.get("key_type")).ordinal();
                    if (!gVar.p()) {
                        gVar.f326556f.e(map2);
                    }
                    long longValue = ((java.lang.Long) map2.get("key_show_duration")).longValue();
                    mi1.n2$$c n2__c = new mi1.n2$$c(n2Var);
                    n2Var.f326641n = n2__c;
                    com.tencent.mm.sdk.platformtools.u3.i(n2__c, longValue);
                }
            }
        });
    }

    @Override // mi1.w0
    public void f(int i17, boolean z17) {
        this.f326642o.m(new mi1.r2(this, i17, z17));
    }

    @Override // mi1.w0
    public void i(final boolean z17) {
        this.f326642o.m(new java.lang.Runnable() { // from class: mi1.n2$$b
            @Override // java.lang.Runnable
            public final void run() {
                mi1.g gVar = (mi1.g) mi1.n2.this.f326642o;
                if (gVar.p()) {
                    return;
                }
                gVar.f326556f.i(z17);
            }
        });
    }
}
