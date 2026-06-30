package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f310152a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.n f310153b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f310154c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f310155d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Throwable f310156e;

    public d0(java.lang.Object obj, kotlinx.coroutines.n nVar, yz5.l lVar, java.lang.Object obj2, java.lang.Throwable th6) {
        this.f310152a = obj;
        this.f310153b = nVar;
        this.f310154c = lVar;
        this.f310155d = obj2;
        this.f310156e = th6;
    }

    public static kotlinx.coroutines.d0 a(kotlinx.coroutines.d0 d0Var, java.lang.Object obj, kotlinx.coroutines.n nVar, yz5.l lVar, java.lang.Object obj2, java.lang.Throwable th6, int i17, java.lang.Object obj3) {
        if ((i17 & 1) != 0) {
            obj = d0Var.f310152a;
        }
        if ((i17 & 2) != 0) {
            nVar = d0Var.f310153b;
        }
        kotlinx.coroutines.n nVar2 = nVar;
        if ((i17 & 4) != 0) {
            lVar = d0Var.f310154c;
        }
        yz5.l lVar2 = lVar;
        if ((i17 & 8) != 0) {
            obj2 = d0Var.f310155d;
        }
        java.lang.Object obj4 = obj2;
        if ((i17 & 16) != 0) {
            th6 = d0Var.f310156e;
        }
        d0Var.getClass();
        return new kotlinx.coroutines.d0(obj, nVar2, lVar2, obj4, th6);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlinx.coroutines.d0)) {
            return false;
        }
        kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) obj;
        return kotlin.jvm.internal.o.b(this.f310152a, d0Var.f310152a) && kotlin.jvm.internal.o.b(this.f310153b, d0Var.f310153b) && kotlin.jvm.internal.o.b(this.f310154c, d0Var.f310154c) && kotlin.jvm.internal.o.b(this.f310155d, d0Var.f310155d) && kotlin.jvm.internal.o.b(this.f310156e, d0Var.f310156e);
    }

    public int hashCode() {
        java.lang.Object obj = this.f310152a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        kotlinx.coroutines.n nVar = this.f310153b;
        int hashCode2 = (hashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
        yz5.l lVar = this.f310154c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        java.lang.Object obj2 = this.f310155d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        java.lang.Throwable th6 = this.f310156e;
        return hashCode4 + (th6 != null ? th6.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "CompletedContinuation(result=" + this.f310152a + ", cancelHandler=" + this.f310153b + ", onCancellation=" + this.f310154c + ", idempotentResume=" + this.f310155d + ", cancelCause=" + this.f310156e + ')';
    }

    public /* synthetic */ d0(java.lang.Object obj, kotlinx.coroutines.n nVar, yz5.l lVar, java.lang.Object obj2, java.lang.Throwable th6, int i17, kotlin.jvm.internal.i iVar) {
        this(obj, (i17 & 2) != 0 ? null : nVar, (i17 & 4) != 0 ? null : lVar, (i17 & 8) != 0 ? null : obj2, (i17 & 16) != 0 ? null : th6);
    }
}
