package ro5;

/* loaded from: classes14.dex */
public final class z implements com.tencent.mm.plugin.voipmp.platform.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jz5.l f398321a;

    public z(jz5.l lVar) {
        this.f398321a = lVar;
    }

    @Override // com.tencent.mm.plugin.voipmp.platform.a0
    public final void complete() {
        com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver voIPMPSurfaceTextureDriver = com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver.f213781d;
        if (voIPMPSurfaceTextureDriver != null) {
            voIPMPSurfaceTextureDriver.unregisterSurface((android.view.Surface) this.f398321a.f302834e);
        }
    }
}
