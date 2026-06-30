package dk2;

/* loaded from: classes3.dex */
public final class e4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jp f233350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f233352f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233353g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(com.tencent.mm.plugin.finder.live.plugin.jp jpVar, java.lang.String str, int i17, java.lang.String str2) {
        super(0);
        this.f233350d = jpVar;
        this.f233351e = str;
        this.f233352f = i17;
        this.f233353g = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("FinderLiveAssistant2", "[WeCoin] doPostGift consumeGift onCancel errorType");
        com.tencent.mm.plugin.finder.live.plugin.jp jpVar = this.f233350d;
        if (jpVar != null) {
            com.tencent.mm.plugin.finder.live.plugin.jp.b(jpVar, false, -3, com.tencent.mm.plugin.finder.live.plugin.ip.f113002f, this.f233351e, null, this.f233352f, this.f233353g, null, null, 400, null);
        }
        return jz5.f0.f302826a;
    }
}
