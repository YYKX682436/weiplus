package j00;

/* loaded from: classes9.dex */
public final class k implements com.tencent.wechat.aff.ecs.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296807b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f296808c;

    public k(int i17, java.lang.String str, yz5.l lVar) {
        this.f296806a = i17;
        this.f296807b = str;
        this.f296808c = lVar;
    }

    @Override // com.tencent.wechat.aff.ecs.b
    public final void complete() {
        java.lang.String a17 = b00.d.f16648a.a().a(this.f296806a, this.f296807b);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftEntrancePreloadLogicNew", "fetchChatTicketAsync: ticket=".concat(a17));
        this.f296808c.invoke(a17);
    }
}
