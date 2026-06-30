package dh2;

/* loaded from: classes10.dex */
public final class n implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh2.x f232453d;

    public n(dh2.x xVar) {
        this.f232453d = xVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ah2.c cVar = this.f232453d.f232473m;
        if (cVar != null) {
            ((dh2.b0) cVar).d(booleanValue ? bh2.w.f20906e : bh2.w.f20905d);
        }
        return jz5.f0.f302826a;
    }
}
