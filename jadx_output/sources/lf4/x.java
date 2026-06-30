package lf4;

/* loaded from: classes4.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if4.a f318498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf4.b0 f318499e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(if4.a aVar, lf4.b0 b0Var) {
        super(0);
        this.f318498d = aVar;
        this.f318499e = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if4.a aVar = this.f318498d;
        aVar.f291237e = false;
        java.util.Iterator it = aVar.f291242j.iterator();
        while (it.hasNext()) {
            ((gf4.a) it.next()).f271335f = false;
        }
        ((sf4.a1) this.f318499e.f318355e).d();
        return jz5.f0.f302826a;
    }
}
