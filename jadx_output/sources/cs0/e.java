package cs0;

/* loaded from: classes14.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f222040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView f222041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f222042f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f222043g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(jz5.l lVar, com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView cameraFocusAndMeteringView, float f17, float f18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f222040d = lVar;
        this.f222041e = cameraFocusAndMeteringView;
        this.f222042f = f17;
        this.f222043g = f18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cs0.e(this.f222040d, this.f222041e, this.f222042f, this.f222043g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        cs0.e eVar = (cs0.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        eVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        jz5.l lVar = this.f222040d;
        if (lVar != null) {
            android.util.Range range = (android.util.Range) lVar.f302833d;
            com.tencent.mm.media.camera.view.control.CameraFocusAndMeteringView cameraFocusAndMeteringView = this.f222041e;
            cameraFocusAndMeteringView.f68890p = range;
            int intValue = ((java.lang.Number) lVar.f302834e).intValue();
            cameraFocusAndMeteringView.f68891q = intValue;
            cameraFocusAndMeteringView.f68892r = intValue;
            android.util.Range range2 = cameraFocusAndMeteringView.f68890p;
            if (range2 != null) {
                float f17 = cameraFocusAndMeteringView.f68886i;
                kotlin.jvm.internal.o.d(range2);
                int intValue2 = ((java.lang.Number) range2.getUpper()).intValue();
                android.util.Range range3 = cameraFocusAndMeteringView.f68890p;
                kotlin.jvm.internal.o.d(range3);
                kotlin.jvm.internal.o.f(range3.getLower(), "getLower(...)");
                cameraFocusAndMeteringView.f68887m = f17 / ((intValue2 - ((java.lang.Number) r2).intValue()) / 2.0f);
                cs0.i iVar = cameraFocusAndMeteringView.f68885h;
                float f18 = this.f222042f;
                float f19 = this.f222043g;
                if (iVar != null) {
                    iVar.a(f18, f19, cameraFocusAndMeteringView.a());
                }
                cs0.b bVar = cameraFocusAndMeteringView.f68881d;
                if (bVar != null) {
                    ((com.tencent.mm.media.camera.view.CameraKitView) bVar).m(f18, f19);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
