package fk2;

/* loaded from: classes3.dex */
public final class w0 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f263503a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263504b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fk2.x0 f263505c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.span.f0 f263507e;

    public w0(bm2.h1 h1Var, java.lang.String str, fk2.x0 x0Var, android.content.Context context, com.tencent.mm.pluginsdk.ui.span.f0 f0Var) {
        this.f263503a = h1Var;
        this.f263504b = str;
        this.f263505c = x0Var;
        this.f263506d = context;
        this.f263507e = f0Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        bm2.h1 h1Var = this.f263503a;
        java.lang.Object tag = h1Var.itemView.getTag();
        java.lang.String str = this.f263504b;
        boolean b17 = kotlin.jvm.internal.o.b(tag, str);
        fk2.x0 x0Var = this.f263505c;
        if (b17) {
            if (bitmap != null) {
                pm0.v.X(new fk2.v0(this.f263506d, bitmap, x0Var, this.f263507e, this.f263503a));
                return;
            } else {
                com.tencent.mars.xlog.Log.i(x0Var.f263511m, "CommentItemGiftWall resource is null!");
                return;
            }
        }
        com.tencent.mars.xlog.Log.i(x0Var.f263511m, "onBind tag:" + h1Var.itemView.getTag() + ", old tag:" + str);
    }
}
