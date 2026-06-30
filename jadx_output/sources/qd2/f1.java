package qd2;

/* loaded from: classes10.dex */
public final class f1 implements com.tencent.mm.ui.widget.picker.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f361725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qd2.g1 f361726b;

    public f1(com.tencent.mm.ui.widget.picker.c0 c0Var, qd2.g1 g1Var) {
        this.f361725a = c0Var;
        this.f361726b = g1Var;
    }

    @Override // com.tencent.mm.ui.widget.picker.a0
    public final void onResult(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.widget.picker.c0 c0Var = this.f361725a;
        c0Var.d();
        if (z17) {
            int b17 = c0Var.b();
            qd2.g1 g1Var = this.f361726b;
            g1Var.f361757k = b17;
            g1Var.d();
            g1Var.f361763q = g1Var.b();
            yz5.l lVar = g1Var.f361759m;
            if (lVar != null) {
                lVar.invoke(g1Var.f361763q);
            }
        }
    }
}
