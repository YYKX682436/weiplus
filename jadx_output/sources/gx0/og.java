package gx0;

/* loaded from: classes5.dex */
public final class og implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bh f276807d;

    public og(gx0.bh bhVar) {
        this.f276807d = bhVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ou0.g gVar = (ou0.g) obj;
        gx0.bh bhVar = this.f276807d;
        if (!bhVar.M) {
            kotlin.jvm.internal.o.d(gVar);
            if (ou0.f.c(gVar, -1000000002L)) {
                bhVar.M = true;
                return;
            }
        }
        gx0.bh.Z6(bhVar, gVar, (com.tencent.maas.model.time.MJTime) bhVar.V6().f276258y.getValue());
    }
}
