package fo1;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo1.q f264854d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(fo1.q qVar) {
        super(1);
        this.f264854d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List it = (java.util.List) obj;
        kotlin.jvm.internal.o.g(it, "it");
        fo1.q qVar = this.f264854d;
        qVar.f264892e = it;
        qVar.f264891d.countDown();
        return jz5.f0.f302826a;
    }
}
