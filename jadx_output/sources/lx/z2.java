package lx;

/* loaded from: classes11.dex */
public final class z2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin f322025d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin) {
        super(0);
        this.f322025d = flutterBizPlugin;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi = this.f322025d.f65254e;
        if (bizBaseCallbackApi != null) {
            bizBaseCallbackApi.onDataChange(new com.tencent.pigeon.biz_base.BizNotifyInfo(java.lang.Long.valueOf(com.tencent.pigeon.biz_base.BizNotifyEventType.EVENT_TYPE_UPDATE.ordinal()), null, null, null, 14, null), lx.y2.f322016d);
        }
        return jz5.f0.f302826a;
    }
}
