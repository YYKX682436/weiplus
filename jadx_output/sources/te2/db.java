package te2;

/* loaded from: classes.dex */
public final class db implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.hc f417963d;

    public db(te2.hc hcVar) {
        this.f417963d = hcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorNoticeQRCodeUIC$initView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.HashMap hashMap = new java.util.HashMap();
        te2.hc hcVar = this.f417963d;
        r45.h32 h32Var = hcVar.f418068J;
        if (h32Var == null || (str = h32Var.getString(4)) == null) {
            str = "";
        }
        hashMap.put("notice_id", str);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f328002x2, hashMap, null, "200", null, null, false, 116, null);
        hcVar.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) hcVar.getContext(), 0, true);
        k0Var.X1 = false;
        k0Var.U1 = true;
        k0Var.f211855d2 = false;
        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        new com.tencent.mm.pluginsdk.forward.m().Di(hcVar.getActivity(), k0Var, 2, null, new te2.ma(k0Var, hcVar));
        k0Var.f211872n = new te2.ia(k0Var, hcVar);
        k0Var.f211881s = new te2.ja(k0Var, hcVar);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorNoticeQRCodeUIC$initView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
