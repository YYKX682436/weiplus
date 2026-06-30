package rw2;

/* loaded from: classes10.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f400599d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j17) {
        super(1);
        this.f400599d = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        rw2.g it = (rw2.g) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(it.f400596a == this.f400599d);
    }
}
