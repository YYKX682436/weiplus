package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public final class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f154330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.s4 f154331e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154332f;

    public g4(boolean z17, com.tencent.mm.plugin.profile.ui.tab.s4 s4Var, java.lang.String str) {
        this.f154330d = z17;
        this.f154331e = s4Var;
        this.f154332f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Integer h17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFriend$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f154330d;
        com.tencent.mm.plugin.profile.ui.tab.s4 s4Var = this.f154331e;
        if (z17) {
            int i17 = s4Var.f154551d.f154452d.g() == sr3.a.f411830f ? 5 : 0;
            rv.k3 k3Var = (rv.k3) i95.n0.c(rv.k3.class);
            androidx.appcompat.app.AppCompatActivity context = s4Var.f154553e;
            java.lang.String input = this.f154332f;
            kotlin.jvm.internal.o.g(input, "input");
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("(\\d+)");
            kotlin.jvm.internal.o.f(compile, "compile(...)");
            java.util.regex.Matcher matcher = compile.matcher(input);
            kotlin.jvm.internal.o.f(matcher, "matcher(...)");
            r26.m a17 = r26.u.a(matcher, 0, input);
            int intValue = (a17 == null || (h17 = r26.h0.h((java.lang.String) ((r26.q) a17).a().get(1))) == null) ? -1 : h17.intValue();
            vw.m2 m2Var = (vw.m2) k3Var;
            m2Var.getClass();
            kotlin.jvm.internal.o.g(context, "context");
            kotlinx.coroutines.l.d(m2Var.f440685e, null, null, new vw.z1(intValue, i17, context, null), 3, null);
            gr3.b bVar = gr3.b.f274847a;
            com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = s4Var.f154551d;
            bVar.b(0L, 0L, 407L, 0L, (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : null, m0Var.f154467v, (r29 & 128) != 0 ? 0 : m0Var.L, (r29 & 256) != 0 ? 0 : 0);
        } else {
            com.tencent.mm.plugin.profile.ui.tab.m0 m0Var2 = ((com.tencent.mm.plugin.profile.ui.tab.u0) s4Var.f154549c).f154603a;
            m0Var2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizHeaderController", "click friend also read");
            tr3.b bVar2 = new tr3.b();
            bVar2.f421430a = 2102;
            bVar2.f421431b = false;
            tr3.a.f421426a.a(bVar2);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("hide_option_menu", true);
            intent.putExtra("rawUrl", m0Var2.f154462q.f389234e.f379513m);
            intent.putExtra("useJs", true);
            intent.putExtra("geta8key_scene", 3);
            j45.l.j(m0Var2.f154456h, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFriend$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
