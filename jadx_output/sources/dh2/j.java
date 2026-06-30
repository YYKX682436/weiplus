package dh2;

/* loaded from: classes10.dex */
public final class j implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh2.x f232447d;

    public j(dh2.x xVar) {
        this.f232447d = xVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        int intValue = ((java.lang.Number) obj).intValue();
        ah2.c cVar = this.f232447d.f232473m;
        if (cVar != null) {
            float f17 = intValue;
            dh2.b0 b0Var = (dh2.b0) cVar;
            b0Var.f232431k.a(f17 / 12.0f);
            jh2.c cVar2 = b0Var.f232426f;
            if (cVar2 != null) {
                cVar2.setKeyShift((int) f17);
            }
        }
        return jz5.f0.f302826a;
    }
}
