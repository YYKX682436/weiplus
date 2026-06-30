package kotlinx.coroutines;

/* loaded from: classes14.dex */
public class u2 extends kotlinx.coroutines.c3 implements kotlinx.coroutines.c0 {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f310681e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(kotlinx.coroutines.r2 r2Var) {
        super(true);
        boolean z17 = true;
        S(r2Var);
        kotlinx.coroutines.w O = O();
        kotlinx.coroutines.x xVar = O instanceof kotlinx.coroutines.x ? (kotlinx.coroutines.x) O : null;
        if (xVar != null) {
            kotlinx.coroutines.c3 w17 = xVar.w();
            while (!w17.L()) {
                kotlinx.coroutines.w O2 = w17.O();
                kotlinx.coroutines.x xVar2 = O2 instanceof kotlinx.coroutines.x ? (kotlinx.coroutines.x) O2 : null;
                if (xVar2 != null) {
                    w17 = xVar2.w();
                }
            }
            this.f310681e = z17;
        }
        z17 = false;
        this.f310681e = z17;
    }

    @Override // kotlinx.coroutines.c3
    public boolean L() {
        return this.f310681e;
    }

    @Override // kotlinx.coroutines.c3
    public boolean M() {
        return true;
    }
}
