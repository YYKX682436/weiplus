package mz0;

/* loaded from: classes5.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f333079d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(mz0.b2 b2Var) {
        super(0);
        this.f333079d = b2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mz0.w1 w1Var = new mz0.w1();
        android.app.Activity context = this.f333079d.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return new dz0.k0((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class)), w1Var);
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }
}
