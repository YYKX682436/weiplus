package is;

/* loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ is.f f294312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ js.p0 f294313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f294314f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mmfb.sdk.t f294315g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f294316h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(is.f fVar, js.p0 p0Var, android.content.Context context, com.tencent.mm.ui.mmfb.sdk.t tVar, java.lang.String str) {
        super(0);
        this.f294312d = fVar;
        this.f294313e = p0Var;
        this.f294314f = context;
        this.f294315g = tVar;
        this.f294316h = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AccountInfoService", "gateway login confirm dialog do next");
        is.f fVar = this.f294312d;
        js.p0 p0Var = this.f294313e;
        fVar.f294329d = p0Var;
        ((com.tencent.mm.plugin.account.ui.v6) p0Var).f74266a.g7(true);
        u61.o.c(this.f294314f, r45.gn4.kMobileType_Mask, "BeforeLogin", new is.c(fVar, this.f294315g, this.f294316h, p0Var));
        return jz5.f0.f302826a;
    }
}
