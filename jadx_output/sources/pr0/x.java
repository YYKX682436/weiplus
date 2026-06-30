package pr0;

/* loaded from: classes14.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr0.g0 f357923e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(pr0.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357923e = g0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pr0.x(this.f357923e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Float a17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f357922d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pr0.g0 g0Var = this.f357923e;
            sr0.i iVar = g0Var.f357834e;
            boolean z17 = false;
            if (iVar != null && ((sr0.f) iVar).f411437n.f456164f) {
                z17 = true;
            }
            if (!z17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Camera.CameraKit", "camera is not previewing,ignore onZoomOut");
                return f0Var;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKit", "onZoomOut");
            sr0.i iVar2 = g0Var.f357834e;
            if (iVar2 != null && (a17 = iVar2.a()) != null) {
                float floatValue = a17.floatValue();
                kotlinx.coroutines.flow.j2 j2Var = g0Var.f357840u;
                bs0.g gVar = bs0.g.f23792i;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putFloat("camera_float_1", floatValue);
                jz5.l lVar = new jz5.l(gVar, bundle);
                this.f357922d = 1;
                ((kotlinx.coroutines.flow.h3) j2Var).emit(lVar, this);
                if (f0Var == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
