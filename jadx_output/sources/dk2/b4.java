package dk2;

/* loaded from: classes3.dex */
public final class b4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jp f233233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233234e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f233235f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233236g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(com.tencent.mm.plugin.finder.live.plugin.jp jpVar, java.lang.String str, int i17, java.lang.String str2) {
        super(1);
        this.f233233d = jpVar;
        this.f233234e = str;
        this.f233235f = i17;
        this.f233236g = str2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pr4.b it = (pr4.b) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("FinderLiveAssistant2", "[WeCoin] consumeImpl onSuccess");
        com.tencent.mm.plugin.finder.live.plugin.jp jpVar = this.f233233d;
        if (jpVar != null) {
            com.tencent.mm.plugin.finder.live.plugin.jp.b(jpVar, true, 0, com.tencent.mm.plugin.finder.live.plugin.ip.f113000d, this.f233234e, java.lang.Long.valueOf(it.f357986a), this.f233235f, this.f233236g, null, null, 384, null);
        }
        com.tencent.mm.plugin.finder.assist.y8 y8Var = com.tencent.mm.plugin.finder.assist.y8.f102732a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.B(com.tencent.mm.plugin.finder.assist.y8.f102739h, 79L);
        return jz5.f0.f302826a;
    }
}
