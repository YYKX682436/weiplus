package p05;

/* loaded from: classes14.dex */
public final class s4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.xlabeffect.XLabEffectSettingView f350690d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(com.tencent.mm.plugin.xlabeffect.XLabEffectSettingView xLabEffectSettingView) {
        super(1);
        this.f350690d = xLabEffectSettingView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        et0.q cameraView = this.f350690d.getCameraView();
        if (cameraView != null) {
            cameraView.l(new p05.r4(intValue));
        }
        return jz5.f0.f302826a;
    }
}
