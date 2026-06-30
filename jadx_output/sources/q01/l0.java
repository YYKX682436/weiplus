package q01;

/* loaded from: classes9.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f359310d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(long j17) {
        super(1);
        this.f359310d = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        q01.h0 it = (q01.h0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(it.f359290a);
        sb6.append(':');
        sb6.append(it.f359291b - this.f359310d);
        return sb6.toString();
    }
}
