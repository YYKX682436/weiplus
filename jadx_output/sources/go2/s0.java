package go2;

/* loaded from: classes3.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.a1 f274063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f274064e;

    public s0(go2.a1 a1Var, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f274063d = a1Var;
        this.f274064e = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC$pay$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        go2.a1 a1Var = this.f274063d;
        android.app.Activity context = a1Var.getContext();
        com.tencent.mm.ui.widget.dialog.y1 y1Var = this.f274064e;
        go2.r0 r0Var = new go2.r0(y1Var);
        a1Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.ui.widget.dialog.y1 y1Var2 = new com.tencent.mm.ui.widget.dialog.y1(context);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.b2u, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.hcj);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.hcu)).setText(context.getString(com.tencent.mm.R.string.emd));
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.f486279kr3);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC", "showMemberPayInfoDialog", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC", "showMemberPayInfoDialog", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jfg);
        java.lang.String string = context.getString(com.tencent.mm.R.string.emk, context.getString(com.tencent.mm.R.string.eml));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add("https://kf.qq.com/touch/product/WXDB_app.html");
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(context.getString(com.tencent.mm.R.string.eml));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("showShare", false);
        intent.putExtra(com.tencent.mm.ui.w2.f211205r, true);
        com.tencent.mm.plugin.finder.assist.d8 d8Var = com.tencent.mm.plugin.finder.assist.d8.f102092a;
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.plugin.finder.assist.d8.f(d8Var, context, textView, "Finder.FinderMemberPayUIC", string, arrayList3, arrayList4, null, 64, null);
        findViewById.setOnClickListener(new go2.x0(y1Var2));
        y1Var2.f212037s = new go2.y0(r0Var);
        y1Var2.n(new go2.z0(r0Var));
        y1Var2.k(inflate);
        y1Var2.s();
        y1Var.r(true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/area/uic/FinderMemberPayUIC$pay$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
