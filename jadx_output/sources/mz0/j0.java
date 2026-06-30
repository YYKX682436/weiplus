package mz0;

/* loaded from: classes5.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f332975d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(mz0.b2 b2Var) {
        super(0);
        this.f332975d = b2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mz0.b2 b2Var = this.f332975d;
        kotlinx.coroutines.y0 mainScope = b2Var.getMainScope();
        android.app.Activity context = b2Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC = (com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class));
        com.tencent.mm.mj_template.sns.compose.widget.c1 c1Var = new com.tencent.mm.mj_template.sns.compose.widget.c1(mainScope, maasSdkUIC.D, b2Var.q7(), ((java.lang.Boolean) ((jz5.n) b2Var.f332893q).getValue()).booleanValue());
        c1Var.f69876g = new mz0.h0(b2Var);
        c1Var.f69877h = b2Var.n7();
        c1Var.f69878i = new mz0.i0(b2Var);
        c1Var.f69895z = b2Var.g7();
        return c1Var;
    }
}
