package ku3;

/* loaded from: classes10.dex */
public final class l5 implements yt3.r2, androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final zt3.a f312307d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f312308e;

    /* renamed from: f, reason: collision with root package name */
    public int f312309f;

    public l5(zt3.a kitContext, ju3.d0 status) {
        kotlin.jvm.internal.o.g(kitContext, "kitContext");
        kotlin.jvm.internal.o.g(status, "status");
        this.f312307d = kitContext;
        this.f312309f = 2;
    }

    public final java.lang.Object a(boolean z17, boolean z18, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new ku3.j5(z17, this, z18, null), continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        zt3.c cVar = (zt3.c) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onChanged >> ");
        sb6.append(cVar);
        sb6.append(", ");
        sb6.append(cVar != null ? java.lang.Boolean.valueOf(cVar.f475588b) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordMenuSwitchFlashPlugin", sb6.toString());
        if (cVar == null) {
            return;
        }
        boolean z17 = this.f312308e;
        boolean z18 = cVar.f475588b;
        if (z17 != z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMenuSwitchFlashPlugin", "switchFlash >> " + z18 + ' ' + this.f312309f);
            int i17 = this.f312309f;
            zt3.a aVar = this.f312307d;
            if (i17 == 2) {
                aVar.f475577e.e(z18);
            } else {
                aVar.f475577e.setLightTorch(z18);
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("setClickFlashLightCount >> ");
            com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct = nu3.f.f340211b;
            sb7.append(cameraActionsLogStruct != null ? cameraActionsLogStruct.f55519o : null);
            sb7.append(", ");
            com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct2 = nu3.f.f340211b;
            sb7.append(cameraActionsLogStruct2 != null ? java.lang.Long.valueOf(cameraActionsLogStruct2.f55517m) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordReporter", sb7.toString());
            com.tencent.mm.autogen.mmdata.rpt.CameraActionsLogStruct cameraActionsLogStruct3 = nu3.f.f340211b;
            if (cameraActionsLogStruct3 != null) {
                cameraActionsLogStruct3.f55517m++;
            }
            this.f312308e = z18;
        }
    }

    @Override // yt3.r2
    public void onDetach() {
        if (this.f312308e && this.f312309f == 1) {
            this.f312307d.f475577e.setLightTorch(false);
        }
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        this.f312309f = configProvider.M.getInt("key_camera_light_type", 2);
        this.f312307d.R6(new ku3.k5(this));
    }
}
