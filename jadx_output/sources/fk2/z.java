package fk2;

/* loaded from: classes3.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f263520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.span.f0 f263521f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f263522g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f263523h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f263524i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f263525m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ fk2.g0 f263526n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263527o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263528p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.content.Context context, android.graphics.Bitmap bitmap, com.tencent.mm.pluginsdk.ui.span.f0 f0Var, int i17, int i18, boolean z17, bm2.h1 h1Var, fk2.g0 g0Var, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f263519d = context;
        this.f263520e = bitmap;
        this.f263521f = f0Var;
        this.f263522g = i17;
        this.f263523h = i18;
        this.f263524i = z17;
        this.f263525m = h1Var;
        this.f263526n = g0Var;
        this.f263527o = str;
        this.f263528p = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(this.f263519d.getResources(), this.f263520e);
        fk2.x xVar = fk2.g0.f263390m;
        jz5.g gVar = fk2.g0.f263391n;
        bitmapDrawable.setBounds(0, 0, ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue(), ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue());
        al5.w wVar = new al5.w(bitmapDrawable, 1);
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = this.f263521f;
        int i17 = this.f263522g;
        int i18 = this.f263523h;
        al5.w[] wVarArr = (al5.w[]) f0Var.getSpans(i17, i18, al5.w.class);
        if (wVarArr != null) {
            for (al5.w wVar2 : wVarArr) {
                f0Var.removeSpan(wVar2);
            }
        }
        f0Var.c(wVar, i17, i18, 33);
        if (this.f263524i) {
            f0Var.c(new fk2.y(this.f263526n, this.f263527o, this.f263528p), i17, i18, 33);
        }
        bm2.h1 h1Var = this.f263525m;
        h1Var.f21927e.b(f0Var);
        h1Var.f21927e.invalidate();
        return jz5.f0.f302826a;
    }
}
