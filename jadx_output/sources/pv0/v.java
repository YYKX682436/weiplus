package pv0;

/* loaded from: classes5.dex */
public final class v implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pv0.y f358555d;

    public v(pv0.y yVar) {
        this.f358555d = yVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        dw0.d dVar = (dw0.d) obj;
        pv0.m mVar = (pv0.m) this.f358555d.f69240i;
        if (mVar != null) {
            kotlin.jvm.internal.o.d(dVar);
            mVar.M(dVar);
        }
    }
}
