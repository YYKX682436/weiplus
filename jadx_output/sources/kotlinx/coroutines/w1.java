package kotlinx.coroutines;

/* loaded from: classes14.dex */
public abstract class w1 extends kotlinx.coroutines.p0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f310686h = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f310687e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f310688f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.internal.a f310689g;

    @Override // kotlinx.coroutines.p0
    public final kotlinx.coroutines.p0 J(int i17) {
        kotlinx.coroutines.internal.l.a(i17);
        return this;
    }

    public final void K(boolean z17) {
        long j17 = this.f310687e - (z17 ? 4294967296L : 1L);
        this.f310687e = j17;
        if (j17 <= 0 && this.f310688f) {
            shutdown();
        }
    }

    public final void M(kotlinx.coroutines.n1 n1Var) {
        kotlinx.coroutines.internal.a aVar = this.f310689g;
        if (aVar == null) {
            aVar = new kotlinx.coroutines.internal.a();
            this.f310689g = aVar;
        }
        java.lang.Object[] objArr = aVar.f310480a;
        int i17 = aVar.f310482c;
        objArr[i17] = n1Var;
        int length = (objArr.length - 1) & (i17 + 1);
        aVar.f310482c = length;
        int i18 = aVar.f310481b;
        if (length == i18) {
            int length2 = objArr.length;
            java.lang.Object[] objArr2 = new java.lang.Object[length2 << 1];
            kz5.v.p(objArr, objArr2, 0, i18, 0, 10, null);
            java.lang.Object[] objArr3 = aVar.f310480a;
            int length3 = objArr3.length;
            int i19 = aVar.f310481b;
            kz5.v.p(objArr3, objArr2, length3 - i19, 0, i19, 4, null);
            aVar.f310480a = objArr2;
            aVar.f310481b = 0;
            aVar.f310482c = length2;
        }
    }

    public final void N(boolean z17) {
        this.f310687e += z17 ? 4294967296L : 1L;
        if (z17) {
            return;
        }
        this.f310688f = true;
    }

    public final boolean O() {
        return this.f310687e >= 4294967296L;
    }

    public abstract long P();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v0 */
    public final boolean Q() {
        kotlinx.coroutines.internal.a aVar = this.f310689g;
        if (aVar == null) {
            return false;
        }
        int i17 = aVar.f310481b;
        kotlinx.coroutines.n1 n1Var = null;
        if (i17 != aVar.f310482c) {
            ?? r37 = aVar.f310480a;
            ?? r66 = r37[i17];
            r37[i17] = 0;
            aVar.f310481b = (i17 + 1) & (r37.length - 1);
            if (r66 == 0) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            }
            n1Var = r66;
        }
        kotlinx.coroutines.n1 n1Var2 = n1Var;
        if (n1Var2 == null) {
            return false;
        }
        n1Var2.run();
        return true;
    }

    public abstract void shutdown();
}
