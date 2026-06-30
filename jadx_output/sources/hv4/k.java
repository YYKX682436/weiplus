package hv4;

/* loaded from: classes8.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hv4.l f285306d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ck6 f285307e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(hv4.l lVar, r45.ck6 ck6Var) {
        super(0);
        this.f285306d = lVar;
        this.f285307e = ck6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hv4.l lVar = this.f285306d;
        android.view.View view = lVar.f285311i;
        if (view != null) {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.odf);
            r45.ck6 ck6Var = this.f285307e;
            textView.setText(ck6Var.f371627i);
            view.findViewById(com.tencent.mm.R.id.f483758bz2).animate().rotation(90.0f).setDuration(200L).start();
            hv4.o oVar = lVar.f285314o;
            if (oVar == null) {
                lVar.f285314o = new hv4.o(lVar, ck6Var, lVar.f285309g, view);
            } else {
                oVar.f285327e = ck6Var;
            }
            lVar.f285312m = true;
            hv4.o oVar2 = lVar.f285314o;
            if (oVar2 != null) {
                oVar2.r1(ck6Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
