package fk2;

/* loaded from: classes3.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f263496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fk2.x0 f263497f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.span.f0 f263498g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f263499h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.content.Context context, android.graphics.Bitmap bitmap, fk2.x0 x0Var, com.tencent.mm.pluginsdk.ui.span.f0 f0Var, bm2.h1 h1Var) {
        super(0);
        this.f263495d = context;
        this.f263496e = bitmap;
        this.f263497f = x0Var;
        this.f263498g = f0Var;
        this.f263499h = h1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(this.f263495d.getResources(), this.f263496e);
        fk2.x0 x0Var = this.f263497f;
        bitmapDrawable.setBounds(0, 0, ((java.lang.Number) ((jz5.n) x0Var.f263512n).getValue()).intValue(), ((java.lang.Number) ((jz5.n) x0Var.f263512n).getValue()).intValue());
        al5.w wVar = new al5.w(bitmapDrawable, 1);
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = this.f263498g;
        al5.w[] wVarArr = (al5.w[]) f0Var.getSpans(f0Var.length() - 1, f0Var.length(), al5.w.class);
        if (wVarArr != null) {
            for (al5.w wVar2 : wVarArr) {
                f0Var.removeSpan(wVar2);
            }
        }
        f0Var.c(wVar, f0Var.length() - 1, f0Var.length(), 33);
        bm2.h1 h1Var = this.f263499h;
        h1Var.f21927e.b(f0Var);
        h1Var.f21927e.invalidate();
        return jz5.f0.f302826a;
    }
}
