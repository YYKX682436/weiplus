package g6;

/* loaded from: classes14.dex */
public final class c implements g6.e {

    /* renamed from: b, reason: collision with root package name */
    public final int f269029b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f269030c;

    public c(int i17, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 1) != 0 ? 100 : i17;
        z17 = (i18 & 2) != 0 ? false : z17;
        this.f269029b = i17;
        this.f269030c = z17;
        if (!(i17 > 0)) {
            throw new java.lang.IllegalArgumentException("durationMillis must be > 0.".toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // g6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(g6.f r13, c6.l r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.c.a(g6.f, c6.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof g6.c) {
                if (this.f269029b == ((g6.c) obj).f269029b) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f269029b);
    }

    public java.lang.String toString() {
        return "CrossfadeTransition(durationMillis=" + this.f269029b + ')';
    }
}
