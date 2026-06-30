package dk2;

/* loaded from: classes3.dex */
public final class d4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jp f233312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f233314f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233315g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(com.tencent.mm.plugin.finder.live.plugin.jp jpVar, java.lang.String str, int i17, java.lang.String str2) {
        super(1);
        this.f233312d = jpVar;
        this.f233313e = str;
        this.f233314f = i17;
        this.f233315g = str2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pr4.a it = (pr4.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[WeCoin] consumeImpl onFailed errorType:");
        pr4.j jVar = it.f357985a;
        sb6.append(jVar);
        com.tencent.mars.xlog.Log.i("FinderLiveAssistant2", sb6.toString());
        int i17 = dk2.c4.f233276a[jVar.ordinal()] == 1 ? com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL : 10008;
        com.tencent.mm.plugin.finder.live.plugin.jp jpVar = this.f233312d;
        if (jpVar != null) {
            com.tencent.mm.plugin.finder.live.plugin.jp.b(jpVar, false, i17, com.tencent.mm.plugin.finder.live.plugin.ip.f113002f, this.f233313e, null, this.f233314f, this.f233315g, null, null, 400, null);
        }
        com.tencent.mm.plugin.finder.assist.y8 y8Var = com.tencent.mm.plugin.finder.assist.y8.f102732a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(com.tencent.mm.plugin.finder.assist.y8.f102739h, 81L);
        return jz5.f0.f302826a;
    }
}
