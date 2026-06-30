package xy0;

/* loaded from: classes5.dex */
public final class j extends g4.b4 {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f458152c;

    /* renamed from: d, reason: collision with root package name */
    public final long f458153d;

    /* renamed from: e, reason: collision with root package name */
    public long f458154e;

    public j(java.lang.String keyword, long j17) {
        kotlin.jvm.internal.o.g(keyword, "keyword");
        this.f458152c = keyword;
        this.f458153d = j17;
    }

    @Override // g4.b4
    public java.lang.Object a(g4.c4 state) {
        java.lang.Integer num;
        int intValue;
        java.lang.Integer num2;
        kotlin.jvm.internal.o.g(state, "state");
        java.lang.Integer num3 = state.f268242b;
        if (num3 != null) {
            g4.z3 a17 = state.a(num3.intValue());
            if (a17 != null && (num2 = (java.lang.Integer) a17.f268654b) != null) {
                intValue = num2.intValue() + 1;
            } else if (a17 != null && (num = (java.lang.Integer) a17.f268655c) != null) {
                intValue = num.intValue() - 1;
            }
            return java.lang.Integer.valueOf(intValue);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // g4.b4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(g4.x3 r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xy0.j.b(g4.x3, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
