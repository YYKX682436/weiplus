package mz0;

/* loaded from: classes5.dex */
public final /* synthetic */ class w extends kotlin.jvm.internal.m implements yz5.p {
    public w(java.lang.Object obj) {
        super(2, obj, mz0.b2.class, "switchMovieOption", "switchMovieOption(ZZ)V", 0);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        mz0.b2 b2Var = (mz0.b2) this.receiver;
        android.app.Activity context = b2Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        b2Var.B = ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class))).a7(java.lang.Boolean.valueOf(booleanValue), java.lang.Boolean.valueOf(booleanValue2));
        return jz5.f0.f302826a;
    }
}
