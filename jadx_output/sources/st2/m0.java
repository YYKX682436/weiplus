package st2;

/* loaded from: classes3.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f412395d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(r45.y23 y23Var) {
        super(1);
        this.f412395d = y23Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        so2.j5 it = (so2.j5) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean z17 = false;
        if ((it instanceof cm2.m0) && ((cm2.m0) it).f43369w == this.f412395d.getLong(0)) {
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
