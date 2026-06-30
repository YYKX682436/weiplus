package gx0;

/* loaded from: classes5.dex */
public final class o4 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.x4 f276786d;

    public o4(gx0.x4 x4Var) {
        this.f276786d = x4Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        ou0.g gVar = (ou0.g) obj;
        gx0.x4 x4Var = this.f276786d;
        com.tencent.maas.model.time.MJTimeRange mJTimeRange = x4Var.f277156y;
        boolean z17 = (mJTimeRange == null || mJTimeRange.containsTime(gVar)) ? false : true;
        kotlin.jvm.internal.o.d(gVar);
        boolean c17 = ou0.f.c(gVar, 8L);
        if (ou0.f.c(gVar, 1L) && z17 && !c17 && x4Var.q() && !ou0.f.c(gVar, 16L)) {
            x4Var.U6(false);
        }
    }
}
