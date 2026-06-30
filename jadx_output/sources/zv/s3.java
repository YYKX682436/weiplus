package zv;

/* loaded from: classes11.dex */
public final class s3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin f476103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f476104e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f476103d = flutterBrandEcsPlugin;
        this.f476104e = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi = this.f476103d.f65190e;
        if (bizBaseCallbackApi != null) {
            bizBaseCallbackApi.onDataChange(new com.tencent.pigeon.biz_base.BizNotifyInfo(java.lang.Long.valueOf(com.tencent.pigeon.biz_base.BizNotifyEventType.EVENT_TYPE_UPDATE.ordinal()), null, null, (java.lang.String) this.f476104e.f310123d, 6, null), zv.r3.f476098d);
        }
        return jz5.f0.f302826a;
    }
}
