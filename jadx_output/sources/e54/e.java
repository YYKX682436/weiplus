package e54;

/* loaded from: classes4.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f249649d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f249650e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e54.f f249651f;

    /* renamed from: g, reason: collision with root package name */
    public int f249652g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(e54.f fVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f249651f = fVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlHandler$suspendGetRedPacketCoverUrl$1");
        this.f249650e = obj;
        this.f249652g |= Integer.MIN_VALUE;
        java.lang.Object b17 = this.f249651f.b(null, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlHandler$suspendGetRedPacketCoverUrl$1");
        return b17;
    }
}
