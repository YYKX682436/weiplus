package m0;

/* loaded from: classes14.dex */
public abstract class i implements a0.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f322472a;

    /* renamed from: b, reason: collision with root package name */
    public final float f322473b;

    /* renamed from: c, reason: collision with root package name */
    public final n0.e5 f322474c;

    public i(boolean z17, float f17, n0.e5 e5Var, kotlin.jvm.internal.i iVar) {
        this.f322472a = z17;
        this.f322473b = f17;
        this.f322474c = e5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d1, code lost:
    
        if (r4 == r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012f, code lost:
    
        if (r4 == r7) goto L38;
     */
    @Override // a0.r1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a0.s1 a(c0.n r17, n0.o r18, int r19) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.i.a(c0.n, n0.o, int):a0.s1");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0.i)) {
            return false;
        }
        m0.i iVar = (m0.i) obj;
        return this.f322472a == iVar.f322472a && p2.h.a(this.f322473b, iVar.f322473b) && kotlin.jvm.internal.o.b(this.f322474c, iVar.f322474c);
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.f322472a) * 31) + java.lang.Float.hashCode(this.f322473b)) * 31) + this.f322474c.hashCode();
    }
}
