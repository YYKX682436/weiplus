package lf4;

/* loaded from: classes4.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if4.a f318442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf4.q0 f318443e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(if4.a aVar, lf4.q0 q0Var) {
        super(0);
        this.f318442d = aVar;
        this.f318443e = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if4.a aVar = this.f318442d;
        aVar.f291237e = false;
        java.util.Iterator it = aVar.f291242j.iterator();
        while (it.hasNext()) {
            ((gf4.a) it.next()).f271335f = false;
        }
        ((sf4.a1) this.f318443e.f318462f).d();
        return jz5.f0.f302826a;
    }
}
