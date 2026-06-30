package dk2;

/* loaded from: classes3.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jp f233269e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233270f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f233271g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dk2.g f233272h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ek2.i2 f233273i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(dk2.r4 r4Var, com.tencent.mm.plugin.finder.live.plugin.jp jpVar, java.lang.String str, int i17, dk2.g gVar, ek2.i2 i2Var) {
        super(1);
        this.f233268d = r4Var;
        this.f233269e = jpVar;
        this.f233270f = str;
        this.f233271g = i17;
        this.f233272h = gVar;
        this.f233273i = i2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pr4.b it = (pr4.b) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i(this.f233268d.f234009d, "[WeCoin] doPostGift consumeGift onSuccess");
        com.tencent.mm.plugin.finder.live.plugin.jp jpVar = this.f233269e;
        if (jpVar != null) {
            com.tencent.mm.plugin.finder.live.plugin.ip ipVar = com.tencent.mm.plugin.finder.live.plugin.ip.f113000d;
            java.lang.String str = this.f233270f;
            java.lang.Long valueOf = java.lang.Long.valueOf(it.f357986a);
            int i17 = this.f233271g;
            dk2.g gVar = this.f233272h;
            com.tencent.mm.plugin.finder.live.plugin.jp.b(jpVar, true, 0, ipVar, str, valueOf, i17, gVar != null ? gVar.f233467b : null, null, this.f233273i, 128, null);
        }
        com.tencent.mm.plugin.finder.assist.y8 y8Var = com.tencent.mm.plugin.finder.assist.y8.f102732a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(com.tencent.mm.plugin.finder.assist.y8.f102739h, 79L);
        return jz5.f0.f302826a;
    }
}
