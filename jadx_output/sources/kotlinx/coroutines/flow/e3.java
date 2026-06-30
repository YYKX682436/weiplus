package kotlinx.coroutines.flow;

/* loaded from: classes10.dex */
public final class e3 implements kotlinx.coroutines.flow.w2 {

    /* renamed from: b, reason: collision with root package name */
    public final long f310243b;

    /* renamed from: c, reason: collision with root package name */
    public final long f310244c;

    public e3(long j17, long j18) {
        this.f310243b = j17;
        this.f310244c = j18;
        if (!(j17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("stopTimeout(" + j17 + " ms) cannot be negative").toString());
        }
        if (j18 >= 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("replayExpiration(" + j18 + " ms) cannot be negative").toString());
    }

    @Override // kotlinx.coroutines.flow.w2
    public kotlinx.coroutines.flow.j a(kotlinx.coroutines.flow.f3 f3Var) {
        kotlinx.coroutines.flow.c3 c3Var = new kotlinx.coroutines.flow.c3(this, null);
        int i17 = kotlinx.coroutines.flow.i1.f310295a;
        return kotlinx.coroutines.flow.l.i(new kotlinx.coroutines.flow.s0(new v26.t(c3Var, f3Var, oz5.m.f350329d, -2, u26.u.SUSPEND), new kotlinx.coroutines.flow.d3(null)));
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof kotlinx.coroutines.flow.e3) {
            kotlinx.coroutines.flow.e3 e3Var = (kotlinx.coroutines.flow.e3) obj;
            if (this.f310243b == e3Var.f310243b && this.f310244c == e3Var.f310244c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f310243b) * 31) + java.lang.Long.hashCode(this.f310244c);
    }

    public java.lang.String toString() {
        lz5.e eVar = new lz5.e(2);
        long j17 = this.f310243b;
        if (j17 > 0) {
            eVar.add("stopTimeout=" + j17 + "ms");
        }
        long j18 = this.f310244c;
        if (j18 < com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
            eVar.add("replayExpiration=" + j18 + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + kz5.n0.g0(kz5.b0.a(eVar), null, null, null, 0, null, null, 63, null) + ')';
    }
}
