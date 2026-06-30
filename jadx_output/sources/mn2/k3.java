package mn2;

/* loaded from: classes2.dex */
public class k3 extends fp0.r {

    /* renamed from: i, reason: collision with root package name */
    public kotlin.coroutines.Continuation f330035i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k3(yz5.l r1, java.lang.String r2, int r3, kotlin.jvm.internal.i r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L19
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r3 = java.lang.System.nanoTime()
            r2.append(r3)
            r3 = 125(0x7d, float:1.75E-43)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
        L19:
            java.lang.String r3 = "task"
            kotlin.jvm.internal.o.g(r1, r3)
            java.lang.String r3 = "id"
            kotlin.jvm.internal.o.g(r2, r3)
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mn2.k3.<init>(yz5.l, java.lang.String, int, kotlin.jvm.internal.i):void");
    }

    @Override // fp0.r, fp0.d
    public void a() {
        this.f265277f.invoke(this);
    }

    @Override // fp0.d
    public void b(fp0.u status) {
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.coroutines.Continuation continuation = this.f330035i;
        if (continuation != null) {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(status));
        }
        this.f330035i = null;
    }

    @Override // fp0.r, fp0.d
    public java.lang.String d() {
        return this.f265278g;
    }

    @Override // fp0.r
    public void e() {
    }

    @Override // fp0.r
    public java.lang.String toString() {
        return "{token=" + this.f265279h + " id=" + this.f265278g + '}';
    }
}
