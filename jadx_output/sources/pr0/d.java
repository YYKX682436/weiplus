package pr0;

/* loaded from: classes14.dex */
public final class d extends pr0.g0 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f357818w = 0;

    public static final sr0.i s(pr0.d dVar, xr0.c cVar, xr0.b bVar, boolean z17) {
        dVar.getClass();
        int b17 = qr0.a.f366055a.b();
        int i17 = cVar != null ? cVar.f456155a : -1;
        if (!(1 <= i17 && i17 < 4)) {
            i17 = b17;
        }
        if (z17) {
            i17 = 1;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createCameraInstance biz set:");
        sb6.append(cVar != null ? java.lang.Integer.valueOf(cVar.f456155a) : null);
        sb6.append(" config:");
        sb6.append(b17);
        sb6.append(", forceUseCamera1: ");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKit", sb6.toString());
        kotlinx.coroutines.flow.j2 j2Var = dVar.f357840u;
        int i18 = dVar.f357833d;
        sr0.f zVar = i17 != 1 ? i17 != 2 ? i17 != 3 ? new vr0.z(j2Var, i18) : new vr0.z(j2Var, i18) : new ur0.s(j2Var, i18) : new tr0.t(j2Var, i18);
        if (cVar != null) {
            if (zVar.f411435i == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Camera.BaseCameraInstance", "CameraKitCommonSetting >>  " + java.lang.Boolean.valueOf(cVar.f456158d));
                zVar.f411435i = cVar;
            }
            dVar.k().getClass();
        }
        if (bVar != null && zVar.f411436m == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.BaseCameraInstance", "setCameraAbilitySetting >> " + java.lang.Boolean.valueOf(bVar.f456151b) + ", " + java.lang.Boolean.valueOf(bVar.f456152c) + ", " + java.lang.Boolean.valueOf(bVar.f456150a));
            zVar.f411436m = bVar;
        }
        return zVar;
    }
}
