package ju3;

/* loaded from: classes10.dex */
public final class h2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.VendorEffectSettingView f301949d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(com.tencent.mm.plugin.recordvideo.plugin.parent.VendorEffectSettingView vendorEffectSettingView) {
        super(1);
        this.f301949d = vendorEffectSettingView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        et0.q cameraView = this.f301949d.getCameraView();
        if (cameraView != null) {
            cameraView.l(new ju3.g2(intValue));
        }
        return jz5.f0.f302826a;
    }
}
