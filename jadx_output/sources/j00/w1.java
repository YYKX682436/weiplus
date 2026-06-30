package j00;

/* loaded from: classes9.dex */
public final class w1 implements com.tencent.wechat.aff.ecs.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f296926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f296927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c00.j3 f296928c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f296929d;

    public w1(boolean z17, boolean z18, c00.j3 j3Var, yz5.l lVar) {
        this.f296926a = z17;
        this.f296927b = z18;
        this.f296928c = j3Var;
        this.f296929d = lVar;
    }

    @Override // com.tencent.wechat.aff.ecs.b
    public final void complete() {
        if (this.f296926a) {
            java.lang.String a17 = b00.d.f16648a.a().a(this.f296927b ? 1 : 0, this.f296928c.f36992a);
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "onExposureEnterSendGift preload after getTicket: ".concat(a17));
            this.f296929d.invoke(a17);
        }
    }
}
