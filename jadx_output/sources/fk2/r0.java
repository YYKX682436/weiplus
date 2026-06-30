package fk2;

/* loaded from: classes3.dex */
public final class r0 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.di1 f263460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f263461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fk2.s0 f263462c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz5.l f263464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.span.f0 f263465f;

    public r0(r45.di1 di1Var, bm2.h1 h1Var, fk2.s0 s0Var, android.content.Context context, jz5.l lVar, com.tencent.mm.pluginsdk.ui.span.f0 f0Var) {
        this.f263460a = di1Var;
        this.f263461b = h1Var;
        this.f263462c = s0Var;
        this.f263463d = context;
        this.f263464e = lVar;
        this.f263465f = f0Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.di1 di1Var = this.f263460a;
        sb6.append(di1Var.getString(0));
        sb6.append('_');
        sb6.append(di1Var.getString(1));
        sb6.append('_');
        sb6.append(di1Var.getInteger(2));
        java.lang.String sb7 = sb6.toString();
        bm2.h1 h1Var = this.f263461b;
        boolean b17 = kotlin.jvm.internal.o.b(h1Var.itemView.getTag(), sb7);
        fk2.s0 s0Var = this.f263462c;
        if (b17) {
            if (bitmap != null) {
                pm0.v.X(new fk2.q0(this.f263463d, bitmap, s0Var, this.f263464e, this.f263465f, this.f263461b));
                return;
            } else {
                com.tencent.mars.xlog.Log.i(s0Var.f263469m, "CommentItemGiftFund resource is null!");
                return;
            }
        }
        com.tencent.mars.xlog.Log.i(s0Var.f263469m, "onBind tag:" + h1Var.itemView.getTag() + ", old tag:" + sb7);
    }
}
