package zv;

/* loaded from: classes11.dex */
public final class j2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin f476005d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin) {
        super(0);
        this.f476005d = flutterBrandEcsPlugin;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.pigeon.biz_base.BizBaseCallbackApi bizBaseCallbackApi = this.f476005d.f65190e;
        if (bizBaseCallbackApi != null) {
            bizBaseCallbackApi.onDataChange(new com.tencent.pigeon.biz_base.BizNotifyInfo(java.lang.Long.valueOf(com.tencent.pigeon.biz_base.BizNotifyEventType.EVENT_TYPE_UPDATE.ordinal()), null, null, null, 14, null), zv.i2.f475993d);
        }
        return jz5.f0.f302826a;
    }
}
