package sp2;

/* loaded from: classes2.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411203d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(sp2.o2 o2Var) {
        super(1);
        this.f411203d = o2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f it = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(it, "it");
        sp2.o2 o2Var = this.f411203d;
        o2Var.f411137i = false;
        rq2.o.f398847a.e(2, java.lang.System.currentTimeMillis() - o2Var.K, o2Var.N);
        return jz5.f0.f302826a;
    }
}
