package ju3;

/* loaded from: classes10.dex */
public final class u implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout f302020d;

    public u(com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout cameraKitRecordViewLayout) {
        this.f302020d = cameraKitRecordViewLayout;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        android.os.Bundle bundle;
        jz5.l lVar = (jz5.l) obj;
        int ordinal = ((bs0.g) lVar.f302833d).ordinal();
        com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout cameraKitRecordViewLayout = this.f302020d;
        if (ordinal == 4) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            return kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new ju3.t(lVar, cameraKitRecordViewLayout, null), continuation);
        }
        if (ordinal == 6 && (bundle = (android.os.Bundle) lVar.f302834e) != null) {
            int i17 = bundle.getInt("camera_int_1", 0);
            int i18 = bundle.getInt("camera_int_2", 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitRecordViewLayout", "First_FRAME >> previewWidth: " + i17 + ", previewHeight: " + i18);
            cameraKitRecordViewLayout.f155814p = true;
            ju3.y yVar = cameraKitRecordViewLayout.f155809h;
            if (yVar != null) {
                yVar.b(new android.util.Size(i17, i18));
            }
        }
        return jz5.f0.f302826a;
    }
}
