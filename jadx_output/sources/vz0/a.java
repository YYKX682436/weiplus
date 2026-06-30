package vz0;

/* loaded from: classes14.dex */
public final class a implements o1.a {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f441574d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f441575e;

    public a(boolean z17, boolean z18) {
        this.f441574d = z17;
        this.f441575e = z18;
    }

    @Override // o1.a
    public java.lang.Object a(long j17, long j18, kotlin.coroutines.Continuation continuation) {
        return new p2.w(p2.x.a(this.f441574d ? p2.w.b(j18) : 0.0f, this.f441575e ? p2.w.c(j18) : 0.0f));
    }

    @Override // o1.a
    public long b(long j17, long j18, int i17) {
        if (i17 == 2) {
            return d1.f.a(this.f441574d ? d1.e.c(j18) : 0.0f, this.f441575e ? d1.e.d(j18) : 0.0f);
        }
        int i18 = d1.e.f225626e;
        return d1.e.f225623b;
    }

    @Override // o1.a
    public java.lang.Object c(long j17, kotlin.coroutines.Continuation continuation) {
        return new p2.w(p2.w.f351404b);
    }

    @Override // o1.a
    public long d(long j17, int i17) {
        return d1.e.f225623b;
    }
}
