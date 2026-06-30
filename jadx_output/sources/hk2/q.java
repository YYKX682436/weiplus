package hk2;

/* loaded from: classes3.dex */
public final class q implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.model.danmakuitem.LiveFreeFloatMsgConvert f281913d;

    public q(com.tencent.mm.plugin.finder.live.model.danmakuitem.LiveFreeFloatMsgConvert liveFreeFloatMsgConvert) {
        this.f281913d = liveFreeFloatMsgConvert;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        pm0.v.X(new hk2.p(this.f281913d));
        return true;
    }
}
