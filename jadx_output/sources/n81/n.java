package n81;

/* loaded from: classes7.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f335626d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(long j17) {
        super(1);
        this.f335626d = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n81.e it = (n81.e) obj;
        kotlin.jvm.internal.o.g(it, "it");
        int e17 = c01.id.e();
        long j17 = this.f335626d;
        if (j17 > 0) {
            long j18 = e17;
            long j19 = it.f335615b;
            if (j18 > j19) {
                return java.lang.Boolean.valueOf(j18 - j19 > j17);
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
