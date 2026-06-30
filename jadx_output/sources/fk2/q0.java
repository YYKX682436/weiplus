package fk2;

/* loaded from: classes3.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f263454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fk2.s0 f263455f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jz5.l f263456g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.span.f0 f263457h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f263458i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(android.content.Context context, android.graphics.Bitmap bitmap, fk2.s0 s0Var, jz5.l lVar, com.tencent.mm.pluginsdk.ui.span.f0 f0Var, bm2.h1 h1Var) {
        super(0);
        this.f263453d = context;
        this.f263454e = bitmap;
        this.f263455f = s0Var;
        this.f263456g = lVar;
        this.f263457h = f0Var;
        this.f263458i = h1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(this.f263453d.getResources(), this.f263454e);
        fk2.s0 s0Var = this.f263455f;
        bitmapDrawable.setBounds(0, 0, ((java.lang.Number) ((jz5.n) s0Var.f263470n).getValue()).intValue(), ((java.lang.Number) ((jz5.n) s0Var.f263470n).getValue()).intValue());
        al5.w wVar = new al5.w(bitmapDrawable, 1);
        jz5.l lVar = this.f263456g;
        int intValue = ((java.lang.Number) lVar.f302833d).intValue();
        int intValue2 = ((java.lang.Number) lVar.f302834e).intValue();
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = this.f263457h;
        al5.w[] wVarArr = (al5.w[]) f0Var.getSpans(intValue, intValue2, al5.w.class);
        if (wVarArr != null) {
            for (al5.w wVar2 : wVarArr) {
                f0Var.removeSpan(wVar2);
            }
        }
        f0Var.c(wVar, intValue, intValue2, 33);
        bm2.h1 h1Var = this.f263458i;
        h1Var.f21927e.b(f0Var);
        h1Var.f21927e.invalidate();
        return jz5.f0.f302826a;
    }
}
