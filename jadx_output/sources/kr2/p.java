package kr2;

/* loaded from: classes8.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr2.q f311316d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(kr2.q qVar) {
        super(0);
        this.f311316d = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.gx4 gx4Var = new r45.gx4();
        kr2.q qVar = this.f311316d;
        gx4Var.set(2, java.lang.Integer.valueOf(kr2.q.a(qVar, qVar.f311321c)));
        gx4Var.set(0, java.lang.Integer.valueOf(kr2.q.a(qVar, qVar.f311322d)));
        gx4Var.set(1, java.lang.Integer.valueOf(kr2.q.a(qVar, qVar.f311324f)));
        gx4Var.set(3, java.lang.Integer.valueOf(kr2.q.a(qVar, qVar.f311323e)));
        return gx4Var;
    }
}
