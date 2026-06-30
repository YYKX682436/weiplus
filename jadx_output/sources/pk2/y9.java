package pk2;

/* loaded from: classes3.dex */
public final class y9 extends qk2.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356403i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356403i = "audience.more.morefunction.rewardlimitamount";
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356403i;
    }

    @Override // qk2.d, qk2.f
    public boolean o() {
        r45.f82 f82Var = ((mm2.v5) this.f364427a.c(mm2.v5.class)).f329486i;
        return f82Var != null && f82Var.getInteger(0) == 1;
    }

    @Override // qk2.d
    public void t(pk2.o9 o9Var, com.tencent.mm.plugin.finder.view.e3 bottomSheet, java.lang.Integer num) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(bottomSheet, "bottomSheet");
        ((android.view.ViewGroup) bottomSheet.f131959f.findViewById(com.tencent.mm.R.id.oax)).setVisibility(0);
    }

    @Override // qk2.d
    public java.lang.Integer u() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.id.oay);
    }
}
