package te2;

/* loaded from: classes.dex */
public final class bb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.hc f417906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417907e;

    public bb(te2.hc hcVar, java.lang.String str) {
        this.f417906d = hcVar;
        this.f417907e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorNoticeQRCodeUIC$initView$6$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        te2.hc hcVar = this.f417906d;
        r45.h32 h32Var = hcVar.f418068J;
        if (h32Var == null || (str = h32Var.getString(4)) == null) {
            str = "";
        }
        linkedHashMap.put("notice_id", str);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.f328009z;
        java.lang.String str2 = hcVar.M;
        if (str2 == null) {
            kotlin.jvm.internal.o.o(dm.i4.COL_USERNAME);
            throw null;
        }
        zy2.zb.T8(zbVar, t1Var, linkedHashMap, null, "200", null, str2, false, 84, null);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f417907e);
        j45.l.j(hcVar.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveVisitorNoticeQRCodeUIC$initView$6$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
