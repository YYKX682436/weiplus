package fb3;

/* loaded from: classes9.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fb3.e f260855d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(fb3.e eVar) {
        super(1);
        this.f260855d = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null && (str = (java.lang.String) kz5.n0.a0(c0Var.f446282b, 0)) != null) {
            fb3.e eVar = this.f260855d;
            if (eVar.f260858f) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.String str2 = eVar.f260856d;
                g0Var.d(27809, 2, str2, str2, str, eVar.f260857e, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 12);
            } else {
                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.String str3 = eVar.f260856d;
                g0Var2.d(27809, 2, str3, str3, str, eVar.f260857e, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), 10);
            }
            o25.q1 q1Var = (o25.q1) i95.n0.c(o25.q1.class);
            android.app.Activity context = eVar.getContext();
            java.lang.String string = eVar.getActivity().getString(com.tencent.mm.R.string.hqg);
            fb3.c cVar = new fb3.c(eVar, str);
            r35.k1 k1Var = (r35.k1) q1Var;
            k1Var.getClass();
            r35.i1 i1Var = new r35.i1(context);
            i1Var.l(str);
            com.tencent.mm.ui.widget.dialog.a aVar = i1Var.f369135b.f211821b;
            aVar.f211712b0 = true;
            aVar.X = 20;
            aVar.Y = 20;
            i1Var.f369137d = string;
            i1Var.a(new r35.m1(k1Var, cVar));
            i1Var.k();
        }
        return jz5.f0.f302826a;
    }
}
