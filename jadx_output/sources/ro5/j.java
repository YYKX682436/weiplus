package ro5;

/* loaded from: classes14.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final io.flutter.view.TextureRegistry f398214a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f398215b;

    /* renamed from: c, reason: collision with root package name */
    public final android.util.SparseArray f398216c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f398217d;

    /* renamed from: e, reason: collision with root package name */
    public int f398218e;

    /* renamed from: f, reason: collision with root package name */
    public ro5.f f398219f;

    /* renamed from: g, reason: collision with root package name */
    public int f398220g;

    public j(io.flutter.view.TextureRegistry textureRegistry) {
        kotlin.jvm.internal.o.g(textureRegistry, "textureRegistry");
        this.f398214a = textureRegistry;
        this.f398215b = new android.util.SparseArray();
        this.f398216c = new android.util.SparseArray();
        this.f398217d = new java.util.concurrent.ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ro5.c a(int r36) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ro5.j.a(int):ro5.c");
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.FlutterTextureManager", "release All");
        android.util.SparseArray sparseArray = this.f398215b;
        int size = sparseArray.size();
        for (int i17 = 0; i17 < size; i17++) {
            int keyAt = sparseArray.keyAt(i17);
            ro5.a target = (ro5.a) sparseArray.valueAt(i17);
            ro5.f fVar = this.f398219f;
            if (fVar != null) {
                kotlin.jvm.internal.o.g(target, "target");
                ro5.m1 m1Var = ((ro5.r) fVar).f398287a.f398145b;
                if (m1Var != null) {
                    m1Var.f(keyAt, target);
                }
            }
            com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver voIPMPSurfaceTextureDriver = com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver.f213781d;
            if (voIPMPSurfaceTextureDriver != null) {
                android.view.Surface surface = target.f398128d.getSurface();
                kotlin.jvm.internal.o.f(surface, "getSurface(...)");
                voIPMPSurfaceTextureDriver.unregisterSurface(surface);
            }
            target.f398128d.release();
        }
        sparseArray.clear();
        android.util.SparseArray sparseArray2 = this.f398216c;
        int size2 = sparseArray2.size();
        int i18 = 0;
        for (int i19 = 0; i19 < size2; i19++) {
            int keyAt2 = sparseArray2.keyAt(i19);
            if (this.f398217d.get(java.lang.Integer.valueOf(keyAt2)) == null) {
                if (keyAt2 == this.f398218e) {
                    ((jp5.o) i95.n0.c(jp5.o.class)).reportIDKey(2093L, 27L, 1L);
                    this.f398220g |= 1;
                } else {
                    i18++;
                }
            }
        }
        if (i18 > 0) {
            ((jp5.o) i95.n0.c(jp5.o.class)).reportIDKey(2093L, 28L, i18);
            this.f398220g |= 2;
        }
        sparseArray.clear();
        this.f398218e = 0;
    }

    public final long c(int i17, int i18, int i19) {
        ro5.a aVar = (ro5.a) this.f398215b.get(i17);
        if (aVar == null) {
            return 0L;
        }
        com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver voIPMPSurfaceTextureDriver = com.tencent.mm.voipmp.v2.driver.VoIPMPSurfaceTextureDriver.f213781d;
        android.view.Surface surface = aVar.f398129e;
        if (voIPMPSurfaceTextureDriver != null) {
            voIPMPSurfaceTextureDriver.unregisterSurface(surface);
        }
        aVar.a(i18, i19);
        android.view.Surface surface2 = aVar.f398128d.getSurface();
        kotlin.jvm.internal.o.f(surface2, "getSurface(...)");
        aVar.f398129e = surface2;
        aVar.f398130f = voIPMPSurfaceTextureDriver != null ? voIPMPSurfaceTextureDriver.registerSurface(surface2) : 0L;
        com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.FlutterTextureManager", "setTextureSize memberId: " + i17 + ", width: " + i18 + ", height: " + i19 + ", new surfacePtr: " + aVar.f398130f);
        android.util.SparseArray sparseArray = this.f398216c;
        ro5.e eVar = (ro5.e) sparseArray.get(i17);
        if (eVar != null) {
            int i27 = eVar.f398181a;
            int i28 = eVar.f398184d;
            boolean z17 = eVar.f398185e;
            sparseArray.put(i17, new ro5.e(i27, i18, i19, i28, z17));
            d(i17, i18, i19, i28, z17, true);
        }
        return aVar.f398130f;
    }

    public final void d(int i17, int i18, int i19, int i27, boolean z17, boolean z18) {
        int i28;
        android.util.SparseArray sparseArray = this.f398216c;
        ro5.e eVar = (ro5.e) sparseArray.get(i17);
        if (eVar == null) {
            sparseArray.put(i17, new ro5.e(i17, i18, i19, i27, z17));
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.FlutterTextureManager", "onUpdate() initial called with: memberId = " + i17 + ", width = " + i18 + ", height = " + i19 + ", rotate = " + i27);
        } else {
            if (i18 == eVar.f398182b && i19 == eVar.f398183c && i27 == eVar.f398184d) {
                if (z17 == eVar.f398185e && !z18) {
                    return;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ILinkVoIP.FlutterTextureManager", "onUpdate() update called with: memberId = " + i17 + ", width = " + i18 + ", height = " + i19 + ", rotate = " + i27);
            sparseArray.put(i17, new ro5.e(i17, i18, i19, i27, z17));
        }
        android.util.SparseArray sparseArray2 = this.f398215b;
        if (sparseArray2.indexOfKey(i17) >= 0) {
            ro5.a aVar = (ro5.a) sparseArray2.get(i17);
            if (aVar != null) {
                if (!((aVar.f398132h.getWidth() == i18 && aVar.f398132h.getHeight() == i19) ? false : true)) {
                    aVar = null;
                }
                if (aVar != null) {
                    java.lang.Object obj = sparseArray.get(i17);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    ro5.e eVar2 = (ro5.e) obj;
                    aVar.a(eVar2.f398182b, eVar2.f398183c);
                }
            }
            er4.w wVar = new er4.w();
            wVar.f(((ro5.a) sparseArray2.get(i17)).f398128d.id());
            wVar.e(((ro5.e) sparseArray.get(i17)) != null ? r5.f398184d : 0L);
            ro5.e eVar3 = (ro5.e) sparseArray.get(i17);
            wVar.d((eVar3 == null || (i28 = eVar3.f398183c) == 0) ? 1.0d : eVar3.f398182b / i28);
            wVar.g(((ro5.e) sparseArray.get(i17)) != null ? r5.f398182b : 0.0d);
            wVar.b(((ro5.e) sparseArray.get(i17)) != null ? r5.f398183c : 0.0d);
            ro5.e eVar4 = (ro5.e) sparseArray.get(i17);
            wVar.c(eVar4 != null ? eVar4.f398185e : false);
            wVar.f256193m = ((ro5.a) sparseArray2.get(i17)).f398130f;
            wVar.f256194n[7] = true;
            this.f398217d.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.TRUE);
            com.tencent.mm.plugin.voipmp.platform.v0.f177287b.G(i17, wVar, true, ro5.i.f398207a);
        }
    }
}
