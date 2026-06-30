package so5;

/* loaded from: classes14.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f410851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so5.k0 f410852e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(int i17, so5.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f410851d = i17;
        this.f410852e = k0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new so5.i0(this.f410851d, this.f410852e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        so5.i0 i0Var = (so5.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Boolean bool = null;
        int i17 = this.f410851d;
        so5.k0 k0Var = this.f410852e;
        if (i17 == 480) {
            zq4.b bVar = k0Var.f410859f;
            if (bVar != null) {
                bool = java.lang.Boolean.valueOf(bVar.g(640, 480));
            }
        } else if (i17 == 720) {
            zq4.b bVar2 = k0Var.f410859f;
            if (bVar2 != null) {
                bool = java.lang.Boolean.valueOf(bVar2.g(1280, com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH));
            }
        } else {
            bool = java.lang.Boolean.FALSE;
        }
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
            k0Var.f410860g = i17;
            k0Var.f410866p = true;
        }
        return jz5.f0.f302826a;
    }
}
