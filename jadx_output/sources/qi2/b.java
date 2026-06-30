package qi2;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f363494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f363495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f363496f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qi2.n f363497g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, int i17, qf2.y1 y1Var, qi2.n nVar) {
        super(1);
        this.f363494d = context;
        this.f363495e = i17;
        this.f363496f = y1Var;
        this.f363497g = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            android.content.Context context = this.f363494d;
            db5.t7.makeText(context, context.getResources().getString(this.f363495e == 1 ? com.tencent.mm.R.string.dkh : com.tencent.mm.R.string.f491475dk3), 0).show();
            qi2.n nVar = this.f363497g;
            this.f363496f.k7(((mm2.o4) nVar.f363577h.g().a(mm2.o4.class)).Z, "micLayoutSelectChange");
            nVar.a();
        }
        return jz5.f0.f302826a;
    }
}
