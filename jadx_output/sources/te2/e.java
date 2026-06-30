package te2;

/* loaded from: classes3.dex */
public final class e implements com.tencent.mm.plugin.finder.live.plugin.jp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ te2.l f417965a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f417966b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f417967c;

    public e(te2.l lVar, yz5.a aVar, yz5.l lVar2) {
        this.f417965a = lVar;
        this.f417966b = aVar;
        this.f417967c = lVar2;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.jp
    public void a(boolean z17, int i17, com.tencent.mm.plugin.finder.live.plugin.ip errType, java.lang.String str, java.lang.Long l17, int i18, java.lang.String str2, java.lang.String str3, ek2.i2 i2Var) {
        kotlin.jvm.internal.o.g(errType, "errType");
        java.lang.String str4 = " sendGiftCallback success:" + z17 + "  errCode:" + i17 + "  errType:" + errType + "  rewardGiftId:" + str + "  balance:" + l17 + "  cnt:" + i18 + "  comboId:" + str2 + "  errMsg:" + str3;
        com.tencent.mars.xlog.Log.i("FinderLiveAllowanceGiftBubblePresenter", "#onVisitorClick" + str4);
        if (z17) {
            qo0.c.a(this.f417965a.f418182g, qo0.b.S4, null, 2, null);
        } else {
            this.f417966b.invoke();
            this.f417967c.invoke(str4);
        }
    }
}
