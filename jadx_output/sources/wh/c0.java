package wh;

/* loaded from: classes12.dex */
public final class c0 extends wh.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f445746a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f445747b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f445748c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(java.lang.String methodName, java.lang.String str, java.lang.String str2) {
        super(methodName, str);
        kotlin.jvm.internal.o.g(methodName, "methodName");
        this.f445746a = methodName;
        this.f445747b = str;
        this.f445748c = str2;
    }

    @Override // wh.d0
    public java.lang.String a() {
        return this.f445747b;
    }

    @Override // wh.d0
    public java.lang.String b() {
        return this.f445746a;
    }

    @Override // wh.d0
    public boolean equals(java.lang.Object obj) {
        if (super.equals(obj)) {
            if (obj == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.matrix.batterycanary.utils.CallStackSampler.StackAnalyzer.StackElement.NativeElement");
            }
            if (kotlin.jvm.internal.o.b(this.f445748c, ((wh.c0) obj).f445748c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return java.util.Objects.hash(this.f445746a, this.f445747b, this.f445748c);
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pc ");
        sb6.append(this.f445746a);
        sb6.append(' ');
        sb6.append(this.f445747b);
        java.lang.String str2 = this.f445748c;
        if (str2 != null) {
            if (str2.length() > 0) {
                str = " (" + str2 + ')';
                sb6.append(str);
                return sb6.toString();
            }
        }
        str = "";
        sb6.append(str);
        return sb6.toString();
    }
}
