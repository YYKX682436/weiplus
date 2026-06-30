package r01;

/* loaded from: classes7.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.biz_base.PersonalCenterJumpInfo f368122d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(com.tencent.pigeon.biz_base.PersonalCenterJumpInfo personalCenterJumpInfo) {
        super(1);
        this.f368122d = personalCenterJumpInfo;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        l81.b1 b1Var = new l81.b1();
        com.tencent.pigeon.biz_base.PersonalCenterJumpInfo personalCenterJumpInfo = this.f368122d;
        java.lang.Long scene = personalCenterJumpInfo.getScene();
        b1Var.f317032k = scene != null ? (int) scene.longValue() : 0;
        b1Var.f317016c = intValue;
        b1Var.f317034l = personalCenterJumpInfo.getSceneNote();
        b1Var.f317014b = personalCenterJumpInfo.getAppId();
        b1Var.f317022f = personalCenterJumpInfo.getEnterPath();
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).ij(b1Var, new r01.i1());
        return jz5.f0.f302826a;
    }
}
