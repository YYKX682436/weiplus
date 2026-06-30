package com.tencent.mm.voipmp.v2.driver;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 J\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0086 ¨\u0006\b"}, d2 = {"Lcom/tencent/mm/voipmp/v2/driver/VoIPMPSurfaceTextureDriver;", "Lcom/tencent/mm/plugin/voipmp/platform/p;", "Landroid/view/Surface;", "surface", "", "registerSurface", "Ljz5/f0;", "unregisterSurface", "plugin-voipmp_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class VoIPMPSurfaceTextureDriver implements com.tencent.mm.plugin.voipmp.platform.p {

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver f213781d;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.voipmp.platform.o f213782a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f213783b;

    /* renamed from: c, reason: collision with root package name */
    public final kz5.q f213784c;

    public VoIPMPSurfaceTextureDriver() {
        f213781d = this;
        this.f213783b = new java.util.ArrayList();
        this.f213784c = new kz5.q();
    }

    public final boolean a(long j17) {
        return j17 == 0;
    }

    public final native long registerSurface(android.view.Surface surface);

    public final native void unregisterSurface(android.view.Surface surface);
}
