package ju3;

/* loaded from: classes10.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f302015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout f302016e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(jz5.l lVar, com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout cameraKitRecordViewLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f302015d = lVar;
        this.f302016e = cameraKitRecordViewLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ju3.t(this.f302015d, this.f302016e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ju3.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.os.Bundle bundle = (android.os.Bundle) this.f302015d.f302834e;
        if (bundle == null) {
            return null;
        }
        int i17 = bundle.getInt("camera_int_3", -1);
        float f17 = bundle.getFloat("camera_float_1", 0.0f);
        float f18 = bundle.getFloat("camera_float_2", 0.0f);
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitRecordViewLayout", "CAMERA_OPEN >>  " + i17 + " minZoom: " + f17 + ". maxZoom: " + f18);
        ju3.x xVar = this.f302016e.f155810i;
        if (xVar == null) {
            return null;
        }
        xVar.a(i17, new android.util.Range(new java.lang.Float(f17), new java.lang.Float(f18)));
        return jz5.f0.f302826a;
    }
}
