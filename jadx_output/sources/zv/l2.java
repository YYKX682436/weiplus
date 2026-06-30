package zv;

/* loaded from: classes11.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin f476024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz_base.BizNotifyTipsInfo f476025e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin, com.tencent.pigeon.biz_base.BizNotifyTipsInfo bizNotifyTipsInfo) {
        super(0);
        this.f476024d = flutterBrandEcsPlugin;
        this.f476025e = bizNotifyTipsInfo;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi = this.f476024d.f65190e;
        if (bizBaseCallbackApi != null) {
            bizBaseCallbackApi.onNotifyChange(this.f476025e, zv.k2.f476011d);
        }
        return jz5.f0.f302826a;
    }
}
