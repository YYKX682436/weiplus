package pr0;

/* loaded from: classes14.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr0.g0 f357911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f357912f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f357913g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(pr0.g0 g0Var, float f17, float f18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357911e = g0Var;
        this.f357912f = f17;
        this.f357913g = f18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pr0.s(this.f357911e, this.f357912f, this.f357913g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f357910d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pr0.g0 g0Var = this.f357911e;
            sr0.i iVar = g0Var.f357834e;
            boolean z17 = false;
            if (iVar != null && ((sr0.f) iVar).f411437n.f456164f) {
                z17 = true;
            }
            if (!z17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Camera.CameraKit", "camera is not previewing,ignore focusOn");
                return f0Var;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("focusOn point[");
            float f17 = this.f357912f;
            sb6.append(f17);
            sb6.append(' ');
            float f18 = this.f357913g;
            sb6.append(f18);
            sb6.append(']');
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera.CameraKit", sb6.toString());
            sr0.i iVar2 = g0Var.f357834e;
            if (iVar2 != null) {
                iVar2.h(f17, f18);
            }
            kotlinx.coroutines.flow.j2 j2Var = g0Var.f357840u;
            jz5.l lVar = new jz5.l(bs0.g.f23790g, new android.os.Bundle());
            this.f357910d = 1;
            ((kotlinx.coroutines.flow.h3) j2Var).emit(lVar, this);
            if (f0Var == aVar) {
                return aVar;
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
