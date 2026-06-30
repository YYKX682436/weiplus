package dk2;

/* loaded from: classes3.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jp f233423e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233424f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f233425g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dk2.g f233426h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ek2.i2 f233427i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(dk2.r4 r4Var, com.tencent.mm.plugin.finder.live.plugin.jp jpVar, java.lang.String str, int i17, dk2.g gVar, ek2.i2 i2Var) {
        super(0);
        this.f233422d = r4Var;
        this.f233423e = jpVar;
        this.f233424f = str;
        this.f233425g = i17;
        this.f233426h = gVar;
        this.f233427i = i2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i(this.f233422d.f234009d, "[WeCoin] doPostGift consumeGift onCancel errorType");
        com.tencent.mm.plugin.finder.live.plugin.jp jpVar = this.f233423e;
        if (jpVar != null) {
            com.tencent.mm.plugin.finder.live.plugin.ip ipVar = com.tencent.mm.plugin.finder.live.plugin.ip.f113002f;
            java.lang.String str = this.f233424f;
            int i17 = this.f233425g;
            dk2.g gVar = this.f233426h;
            com.tencent.mm.plugin.finder.live.plugin.jp.b(jpVar, false, -3, ipVar, str, null, i17, gVar != null ? gVar.f233467b : null, null, this.f233427i, 144, null);
        }
        return jz5.f0.f302826a;
    }
}
