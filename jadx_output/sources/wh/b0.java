package wh;

/* loaded from: classes12.dex */
public final class b0 extends wh.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f445738a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f445739b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f445740c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.lang.String methodName, java.lang.String str, java.lang.Integer num) {
        super(methodName, str);
        kotlin.jvm.internal.o.g(methodName, "methodName");
        this.f445738a = methodName;
        this.f445739b = str;
        this.f445740c = num;
    }

    @Override // wh.d0
    public java.lang.String a() {
        return this.f445739b;
    }

    @Override // wh.d0
    public java.lang.String b() {
        return this.f445738a;
    }

    @Override // wh.d0
    public boolean equals(java.lang.Object obj) {
        if (super.equals(obj)) {
            if (obj == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.matrix.batterycanary.utils.CallStackSampler.StackAnalyzer.StackElement.JavaElement");
            }
            if (kotlin.jvm.internal.o.b(this.f445740c, ((wh.b0) obj).f445740c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return java.util.Objects.hash(this.f445738a, this.f445739b, this.f445740c);
    }

    public java.lang.String toString() {
        return this.f445738a + '(' + this.f445739b + ':' + this.f445740c + ')';
    }
}
