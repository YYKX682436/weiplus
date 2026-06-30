package o85;

/* loaded from: classes14.dex */
public final class a extends x36.q {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Exception f343671e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(x36.h0 delegate) {
        super(delegate);
        kotlin.jvm.internal.o.g(delegate, "delegate");
    }

    @Override // x36.q, x36.h0
    public long B(x36.k sink, long j17) {
        kotlin.jvm.internal.o.g(sink, "sink");
        try {
            return super.B(sink, j17);
        } catch (java.lang.Exception e17) {
            this.f343671e = e17;
            throw e17;
        }
    }
}
