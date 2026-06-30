package zi2;

/* loaded from: classes3.dex */
public final class i implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi2.w f473110d;

    public i(zi2.w wVar) {
        this.f473110d = wVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        zi2.w wVar = this.f473110d;
        mm2.c1 c1Var = (mm2.c1) wVar.P0(mm2.c1.class);
        if (!c1Var.U7() && c1Var.l7()) {
            wVar.z1(wVar.f473155r, true);
        }
        return jz5.f0.f302826a;
    }
}
