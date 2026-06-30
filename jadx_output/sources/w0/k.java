package w0;

/* loaded from: classes14.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0.p f441841d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(w0.p pVar) {
        super(1);
        this.f441841d = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object it) {
        kotlin.jvm.internal.o.g(it, "it");
        w0.s sVar = this.f441841d.f441858c;
        return java.lang.Boolean.valueOf(sVar == null ? true : sVar.b(it));
    }
}
