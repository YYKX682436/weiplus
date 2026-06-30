package mz0;

/* loaded from: classes5.dex */
public final /* synthetic */ class m0 extends kotlin.jvm.internal.m implements yz5.l {
    public m0(java.lang.Object obj) {
        super(1, obj, mz0.b2.class, "launchSwitchMovieOptionJob", "launchSwitchMovieOptionJob(Lcom/tencent/mm/mj_template/maas/uic/IMaasSdkUIC$MusicPickerSwitchOption;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dz0.i p07 = (dz0.i) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        mz0.b2 b2Var = (mz0.b2) this.receiver;
        b2Var.getClass();
        android.app.Activity context = b2Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        b2Var.B = ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class))).a7(p07.f244873a, p07.f244874b);
        return jz5.f0.f302826a;
    }
}
