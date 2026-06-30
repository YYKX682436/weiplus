package va2;

/* loaded from: classes2.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ va2.h f434241d;

    public g(va2.h hVar) {
        this.f434241d = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/topic/uic/FinderTopicPostUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        va2.h hVar = this.f434241d;
        boolean booleanExtra = hVar.getIntent().getBooleanExtra("KEY_FINDER_NEED_POST_TO_COMMENT", false);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        qs2.e eVar = new qs2.e(((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.E8).getValue()).r()).intValue() == 1 ? 2 : 1, 49, 25);
        r45.r03 r03Var = (r45.r03) hVar.f452719d;
        java.lang.String string = r03Var != null ? r03Var.getString(0) : null;
        if (string == null) {
            string = "";
        }
        eVar.f366265g = string;
        eVar.f366262d = hVar.f434242g;
        eVar.f366263e = hVar.f434243h;
        eVar.f366275q = booleanExtra;
        i95.m c17 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        w40.e.Df((w40.e) c17, hVar.getActivity(), eVar, null, 4, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/topic/uic/FinderTopicPostUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
