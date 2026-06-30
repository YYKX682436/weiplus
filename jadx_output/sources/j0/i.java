package j0;

/* loaded from: classes14.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f296325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f296326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f296327f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(yz5.l lVar, n0.v2 v2Var, n0.v2 v2Var2) {
        super(1);
        this.f296325d = lVar;
        this.f296326e = v2Var;
        this.f296327f = v2Var2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g2.e0 newTextFieldValueState = (g2.e0) obj;
        kotlin.jvm.internal.o.g(newTextFieldValueState, "newTextFieldValueState");
        this.f296326e.setValue(newTextFieldValueState);
        n0.v2 v2Var = this.f296327f;
        java.lang.String str = (java.lang.String) v2Var.getValue();
        a2.d dVar = newTextFieldValueState.f267693a;
        boolean z17 = !kotlin.jvm.internal.o.b(str, dVar.f681d);
        java.lang.String str2 = dVar.f681d;
        v2Var.setValue(str2);
        if (z17) {
            this.f296325d.invoke(str2);
        }
        return jz5.f0.f302826a;
    }
}
