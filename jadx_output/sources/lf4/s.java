package lf4;

/* loaded from: classes4.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if4.a f318479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lf4.b0 f318480e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(if4.a aVar, lf4.b0 b0Var) {
        super(0);
        this.f318479d = aVar;
        this.f318480e = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if4.a aVar = this.f318479d;
        aVar.f291238f = false;
        java.util.Iterator it = aVar.f291240h.iterator();
        while (it.hasNext()) {
            ((gf4.a) it.next()).f271335f = false;
        }
        ((sf4.a1) this.f318480e.f318355e).d();
        return jz5.f0.f302826a;
    }
}
