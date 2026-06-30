package fk2;

/* loaded from: classes3.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f263334e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fk2.f2 f263335f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.span.f0 f263336g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f263337h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f263338i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(android.content.Context context, android.graphics.Bitmap bitmap, fk2.f2 f2Var, com.tencent.mm.pluginsdk.ui.span.f0 f0Var, int i17, bm2.h1 h1Var) {
        super(0);
        this.f263333d = context;
        this.f263334e = bitmap;
        this.f263335f = f2Var;
        this.f263336g = f0Var;
        this.f263337h = i17;
        this.f263338i = h1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(this.f263333d.getResources(), this.f263334e);
        fk2.f2 f2Var = this.f263335f;
        bitmapDrawable.setBounds(0, 0, ((java.lang.Number) ((jz5.n) f2Var.f263382n).getValue()).intValue(), ((java.lang.Number) ((jz5.n) f2Var.f263382n).getValue()).intValue());
        al5.w wVar = new al5.w(bitmapDrawable, 1);
        int i17 = this.f263337h;
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = this.f263336g;
        f0Var.c(wVar, i17, i17 + 1, 33);
        bm2.h1 h1Var = this.f263338i;
        h1Var.f21927e.b(f0Var);
        h1Var.f21927e.invalidate();
        return jz5.f0.f302826a;
    }
}
