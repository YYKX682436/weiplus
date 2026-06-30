package mz0;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f332989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.y f332990e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(mz0.b2 b2Var, com.tencent.mm.mj_template.sns.compose.widget.y yVar) {
        super(0);
        this.f332989d = b2Var;
        this.f332990e = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mz0.b2 b2Var = this.f332989d;
        b2Var.f7().dismiss();
        dz0.d l76 = b2Var.l7();
        mz0.j jVar = new mz0.j(b2Var, this.f332990e);
        dz0.v vVar = (dz0.v) l76;
        kotlinx.coroutines.l.d(vVar.f245035g.getMainScope(), null, null, new dz0.n(vVar.f245035g, b2Var.n7(), vVar, jVar, null), 3, null);
        com.tencent.mm.mj_template.sns.compose.widget.c7 g76 = b2Var.g7();
        if (g76 != null) {
            g76.c(dw3.o0.f244245i);
        }
        return jz5.f0.f302826a;
    }
}
