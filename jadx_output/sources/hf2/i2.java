package hf2;

/* loaded from: classes10.dex */
public final class i2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.l2 f281086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.a1 f281087e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(hf2.l2 l2Var, bm2.a1 a1Var) {
        super(2);
        this.f281086d = l2Var;
        this.f281087e = a1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        hf2.l2 l2Var = this.f281086d;
        hf2.x xVar = l2Var.f281104a;
        xVar.f281190v = false;
        com.tencent.mm.plugin.finder.live.util.y.o(xVar, kotlinx.coroutines.q1.f310570c, null, new hf2.h2((r45.h84) obj, this.f281087e, l2Var, null), 2, null);
        return jz5.f0.f302826a;
    }
}
