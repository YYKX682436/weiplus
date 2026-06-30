package jo5;

/* loaded from: classes14.dex */
public final class l implements com.tencent.mm.plugin.voipmp.platform.n {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.voipmp.platform.m f300959a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f300960b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f300961c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final cp5.b f300962d;

    /* renamed from: e, reason: collision with root package name */
    public final so5.m f300963e;

    /* renamed from: f, reason: collision with root package name */
    public final so5.y f300964f;

    public l() {
        cp5.b bVar = new cp5.b();
        this.f300962d = bVar;
        yo5.h hVar = new yo5.h();
        kotlinx.coroutines.y0 a17 = kotlinx.coroutines.z0.a(hVar.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        ro5.d dVar = ro5.d.f398178a;
        this.f300963e = new so5.m(dVar, null, hVar, this, new jo5.j(this, null));
        this.f300964f = new so5.y(false, true, true, dVar, new to5.c(bVar, null), new bp5.k(a17), hVar, so5.o0.f410895a.a(), jo5.k.f300958d);
    }

    public final void a(int i17, android.view.Surface surface) {
        com.tencent.mm.plugin.voipmp.platform.m mVar;
        java.util.HashMap hashMap = this.f300961c;
        if (((jz5.l) hashMap.get(java.lang.Integer.valueOf(i17))) != null && (mVar = this.f300959a) != null) {
            mVar.F1(i17, 0L);
        }
        if (surface == null) {
            return;
        }
        com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver voIPMPSurfaceTextureDriver = com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver.f213781d;
        java.lang.Long valueOf = voIPMPSurfaceTextureDriver != null ? java.lang.Long.valueOf(voIPMPSurfaceTextureDriver.registerSurface(surface)) : null;
        if (valueOf != null) {
            hashMap.put(java.lang.Integer.valueOf(i17), new jz5.l(valueOf, surface));
            com.tencent.mm.plugin.voipmp.platform.m mVar2 = this.f300959a;
            if (mVar2 != null) {
                mVar2.F1(i17, valueOf.longValue());
            }
        }
    }

    public final void b(boolean z17, int i17, boolean z18, boolean z19, int i18, int i19, int i27, int i28) {
        java.lang.Object renderTarget;
        so5.y yVar = this.f300964f;
        try {
            yVar.f(z17, i17, new uo5.u(i27, i28, (short) i19, (byte) 25, (byte) i18, z17 ? (byte) 4 : (byte) 8, true, z18, z19, Byte.MIN_VALUE, (short) 0, null));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startHardwareEncoding: Started ");
            sb6.append(z17 ? "H265" : "H264");
            sb6.append(" encoding for talkway: ");
            sb6.append(i17);
            sb6.append(", kbps: ");
            sb6.append(i19);
            sb6.append(", resolution: ");
            sb6.append(i27);
            sb6.append('x');
            sb6.append(i28);
            com.tencent.mars.xlog.Log.i("VoIPMPCodecDriver", sb6.toString());
            bp5.h hVar = yVar.f410932s[i17];
            android.view.Surface surface = null;
            if (hVar != null && (hVar instanceof bp5.f) && (renderTarget = ((bp5.f) hVar).getRenderTarget()) != null && (renderTarget instanceof android.view.Surface)) {
                surface = (android.view.Surface) renderTarget;
            }
            a(i17, surface);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("VoIPMPCodecDriver", "startHardwareEncoding: Failed to start encoding", e17);
        }
    }
}
