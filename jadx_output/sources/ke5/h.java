package ke5;

/* loaded from: classes9.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ke5.i f307087d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ke5.i iVar) {
        super(1);
        this.f307087d = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String talker = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(talker, "talker");
        ke5.i iVar = this.f307087d;
        if (kotlin.jvm.internal.o.b(talker, iVar.f307089j) && c01.s0.c()) {
            iVar.b(hd5.n.ACTION_UPDATE, false);
        }
        return jz5.f0.f302826a;
    }
}
