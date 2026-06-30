package dk2;

/* loaded from: classes3.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jp f233343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233344f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f233345g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dk2.g f233346h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ek2.i2 f233347i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(dk2.r4 r4Var, com.tencent.mm.plugin.finder.live.plugin.jp jpVar, java.lang.String str, int i17, dk2.g gVar, ek2.i2 i2Var) {
        super(1);
        this.f233342d = r4Var;
        this.f233343e = jpVar;
        this.f233344f = str;
        this.f233345g = i17;
        this.f233346h = gVar;
        this.f233347i = i2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pr4.a it = (pr4.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i(this.f233342d.f234009d, "[WeCoin] doPostGift consumeGift onFailed errorType:" + it.f357985a);
        int i17 = dk2.d2.f233310a[it.f357985a.ordinal()] == 1 ? com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL : 10008;
        com.tencent.mm.plugin.finder.live.plugin.jp jpVar = this.f233343e;
        if (jpVar != null) {
            com.tencent.mm.plugin.finder.live.plugin.ip ipVar = com.tencent.mm.plugin.finder.live.plugin.ip.f113002f;
            java.lang.String str = this.f233344f;
            int i18 = this.f233345g;
            dk2.g gVar = this.f233346h;
            com.tencent.mm.plugin.finder.live.plugin.jp.b(jpVar, false, i17, ipVar, str, null, i18, gVar != null ? gVar.f233467b : null, null, this.f233347i, 144, null);
        }
        com.tencent.mm.plugin.finder.assist.y8 y8Var = com.tencent.mm.plugin.finder.assist.y8.f102732a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(com.tencent.mm.plugin.finder.assist.y8.f102739h, 81L);
        return jz5.f0.f302826a;
    }
}
