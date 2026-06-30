package qj5;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qj5.n f363982d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(qj5.n nVar) {
        super(0);
        this.f363982d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qj5.o oVar = this.f363982d.f363983q2;
        if (oVar != null) {
            oVar.dismiss();
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("containerDialog");
        throw null;
    }
}
