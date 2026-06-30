package wv1;

/* loaded from: classes12.dex */
public class h extends wv1.e {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f449942f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f449943g;

    @Override // wv1.a
    public int h() {
        return 3;
    }

    @Override // wv1.a
    public void k(android.view.View view, wv1.a aVar) {
        xv1.d.d(((com.tencent.mm.plugin.choosemsgfile.logic.ui.a) this.f449929a).f95523d.getContext(), view, aVar);
    }

    @Override // wv1.e
    public java.lang.String m() {
        if (this.f449943g == null) {
            tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
            com.tencent.mm.storage.f9 f9Var = this.f449930b;
            this.f449943g = ((k90.b) u0Var).tj(f9Var, f9Var.z0(), false);
        }
        return this.f449943g;
    }

    @Override // wv1.e, wv1.a
    /* renamed from: n */
    public void j(wv1.o oVar, int i17, wv1.a aVar) {
        super.j(oVar, i17, aVar);
        android.view.View view = oVar.f449964i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGridVideo", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/choosemsgfile/logic/model/MsgItemGridVideo", "onBindViewHolder", "(Lcom/tencent/mm/plugin/choosemsgfile/logic/model/ViewHolderGrid;ILcom/tencent/mm/plugin/choosemsgfile/logic/model/MsgItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = oVar.f449965m;
        textView.setVisibility(0);
        if (this.f449942f == null) {
            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String z07 = this.f449930b.z0();
            ((vf0.y1) x1Var).getClass();
            this.f449942f = com.tencent.mm.sdk.platformtools.t8.u(t21.d3.h(z07).f415015m);
        }
        java.lang.String str = this.f449942f;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
    }
}
