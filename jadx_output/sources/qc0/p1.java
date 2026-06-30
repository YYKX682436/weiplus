package qc0;

/* loaded from: classes10.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f361430a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f361431b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.q f361432c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f361433d;

    public p1(yz5.l lVar, yz5.p pVar, yz5.q qVar, yz5.l handleBehaviorStatusCallback) {
        kotlin.jvm.internal.o.g(handleBehaviorStatusCallback, "handleBehaviorStatusCallback");
        this.f361430a = lVar;
        this.f361431b = pVar;
        this.f361432c = qVar;
        this.f361433d = handleBehaviorStatusCallback;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc0.p1)) {
            return false;
        }
        qc0.p1 p1Var = (qc0.p1) obj;
        return kotlin.jvm.internal.o.b(this.f361430a, p1Var.f361430a) && kotlin.jvm.internal.o.b(this.f361431b, p1Var.f361431b) && kotlin.jvm.internal.o.b(this.f361432c, p1Var.f361432c) && kotlin.jvm.internal.o.b(this.f361433d, p1Var.f361433d);
    }

    public int hashCode() {
        yz5.l lVar = this.f361430a;
        int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        yz5.p pVar = this.f361431b;
        int hashCode2 = (hashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
        yz5.q qVar = this.f361432c;
        return ((hashCode2 + (qVar != null ? qVar.hashCode() : 0)) * 31) + this.f361433d.hashCode();
    }

    public java.lang.String toString() {
        return "StickerEditorBehaviorCallback(cancelCallback=" + this.f361430a + ", finishErrorCallback=" + this.f361431b + ", finishSuccessCallback=" + this.f361432c + ", handleBehaviorStatusCallback=" + this.f361433d + ')';
    }
}
