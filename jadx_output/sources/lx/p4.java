package lx;

/* loaded from: classes11.dex */
public final class p4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin f321905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f321906e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(com.tencent.mm.feature.brandservice.flutter.model.FlutterBizPlugin flutterBizPlugin, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f321905d = flutterBizPlugin;
        this.f321906e = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi = this.f321905d.f65254e;
        if (bizBaseCallbackApi != null) {
            bizBaseCallbackApi.onDataChange(new com.tencent.pigeon.biz_base.BizNotifyInfo(java.lang.Long.valueOf(com.tencent.pigeon.biz_base.BizNotifyEventType.EVENT_TYPE_UPDATE.ordinal()), null, null, (java.lang.String) this.f321906e.f310123d, 6, null), lx.o4.f321897d);
        }
        return jz5.f0.f302826a;
    }
}
