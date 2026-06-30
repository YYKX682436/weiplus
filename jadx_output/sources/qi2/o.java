package qi2;

/* loaded from: classes10.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi2.v f363595d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(qi2.v vVar) {
        super(2);
        this.f363595d = vVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String string = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(string, "string");
        qi2.v vVar = this.f363595d;
        vVar.I(vVar.f363639u, false);
        vVar.f363637s = intValue;
        fg2.e0 e0Var = vVar.f363632n;
        if (e0Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        e0Var.f262002i.setText(string);
        vVar.E();
        return jz5.f0.f302826a;
    }
}
