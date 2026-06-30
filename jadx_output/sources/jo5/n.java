package jo5;

/* loaded from: classes14.dex */
public final class n implements android.graphics.SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver f300968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f300969e;

    public n(com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver voIPMPSurfaceTextureDriver, long j17) {
        this.f300968d = voIPMPSurfaceTextureDriver;
        this.f300969e = j17;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        com.tencent.mm.plugin.voipmp.platform.o oVar = this.f300968d.f213782a;
        if (oVar != null) {
            oVar.y0(this.f300969e);
        }
    }
}
