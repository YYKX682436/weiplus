package ly0;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ly0.v f322241d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ly0.v vVar) {
        super(1);
        this.f322241d = vVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0011. Please report as an issue. */
    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ly0.n nVar = this.f322241d.f322247b;
        if (nVar != null) {
            synchronized (nVar.f322225j) {
                switch (nVar.f322219d.ordinal()) {
                    case 1:
                    case 2:
                    case 3:
                        nVar.f322219d = ly0.e.f322195h;
                        nVar.c();
                        nVar.d();
                        nVar.b();
                        yz5.l lVar = nVar.f322226k;
                        if (lVar != null) {
                            kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
                            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                            kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new ly0.g(lVar, null), 2, null);
                            nVar.f322226k = null;
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
