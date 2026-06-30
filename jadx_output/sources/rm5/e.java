package rm5;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f397484d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j17) {
        super(1);
        this.f397484d = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        rm5.d it = (rm5.d) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(it.f397481a == this.f397484d);
    }
}
