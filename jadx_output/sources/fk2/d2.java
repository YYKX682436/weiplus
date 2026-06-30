package fk2;

/* loaded from: classes3.dex */
public final class d2 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f263345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f263346b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263347c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.f2 f263348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.span.f0 f263349e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f263350f;

    public d2(bm2.h1 h1Var, dk2.zf zfVar, android.content.Context context, fk2.f2 f2Var, com.tencent.mm.pluginsdk.ui.span.f0 f0Var, int i17) {
        this.f263345a = h1Var;
        this.f263346b = zfVar;
        this.f263347c = context;
        this.f263348d = f2Var;
        this.f263349e = f0Var;
        this.f263350f = i17;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        bm2.h1 h1Var = this.f263345a;
        java.lang.Object tag = h1Var.itemView.getTag();
        dk2.zf zfVar = this.f263346b;
        if (!kotlin.jvm.internal.o.b(tag, java.lang.Long.valueOf(zfVar.m()))) {
            com.tencent.mars.xlog.Log.i("CommentItemNotify", "onBindNotifyMsg tag:" + h1Var.itemView.getTag() + ", seq:" + zfVar.m());
            return;
        }
        if (bitmap != null) {
            pm0.v.X(new fk2.c2(this.f263347c, bitmap, this.f263348d, this.f263349e, this.f263350f, this.f263345a));
            return;
        }
        com.tencent.mars.xlog.Log.i("CommentItemNotify", "onBindNotifyMsg " + zfVar.m() + " resource is null!");
    }
}
