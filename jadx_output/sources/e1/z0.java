package e1;

/* loaded from: classes14.dex */
public final class z0 {

    /* renamed from: d, reason: collision with root package name */
    public static final e1.z0 f246326d = new e1.z0(0, 0, 0.0f, 7, null);

    /* renamed from: a, reason: collision with root package name */
    public final long f246327a;

    /* renamed from: b, reason: collision with root package name */
    public final long f246328b;

    /* renamed from: c, reason: collision with root package name */
    public final float f246329c;

    public z0(long j17, long j18, float f17, kotlin.jvm.internal.i iVar) {
        this.f246327a = j17;
        this.f246328b = j18;
        this.f246329c = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1.z0)) {
            return false;
        }
        e1.z0 z0Var = (e1.z0) obj;
        if (e1.y.c(this.f246327a, z0Var.f246327a) && d1.e.a(this.f246328b, z0Var.f246328b)) {
            return (this.f246329c > z0Var.f246329c ? 1 : (this.f246329c == z0Var.f246329c ? 0 : -1)) == 0;
        }
        return false;
    }

    public int hashCode() {
        int i17 = e1.y.f246321l;
        int hashCode = java.lang.Long.hashCode(this.f246327a) * 31;
        int i18 = d1.e.f225626e;
        return ((hashCode + java.lang.Long.hashCode(this.f246328b)) * 31) + java.lang.Float.hashCode(this.f246329c);
    }

    public java.lang.String toString() {
        return "Shadow(color=" + ((java.lang.Object) e1.y.i(this.f246327a)) + ", offset=" + ((java.lang.Object) d1.e.h(this.f246328b)) + ", blurRadius=" + this.f246329c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z0(long r8, long r10, float r12, int r13, kotlin.jvm.internal.i r14) {
        /*
            r7 = this;
            r14 = r13 & 1
            if (r14 == 0) goto Ld
            r8 = 4278190080(0xff000000, double:2.113706745E-314)
            long r8 = e1.a0.c(r8)
        Ld:
            r1 = r8
            r8 = r13 & 2
            if (r8 == 0) goto L16
            int r8 = d1.e.f225626e
            long r10 = d1.e.f225623b
        L16:
            r3 = r10
            r8 = r13 & 4
            if (r8 == 0) goto L1c
            r12 = 0
        L1c:
            r5 = r12
            r6 = 0
            r0 = r7
            r0.<init>(r1, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.z0.<init>(long, long, float, int, kotlin.jvm.internal.i):void");
    }
}
