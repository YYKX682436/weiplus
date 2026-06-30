package tj3;

/* loaded from: classes14.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tj3.p f419794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultiTalkAvatarLayout f419795e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(tj3.p pVar, com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultiTalkAvatarLayout multiTalkAvatarLayout) {
        super(0);
        this.f419794d = pVar;
        this.f419795e = multiTalkAvatarLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.storage.z3 n17;
        uj3.b0 b0Var;
        tj3.p pVar = this.f419794d;
        boolean a17 = pVar.f419788g.a();
        com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultiTalkAvatarLayout multiTalkAvatarLayout = this.f419795e;
        if (a17) {
            tj3.x layoutAdapter = multiTalkAvatarLayout.getLayoutAdapter();
            if (layoutAdapter != null) {
                java.lang.String username = pVar.f419788g.f150297b;
                kotlin.jvm.internal.o.g(username, "username");
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAvatarLayoutAdapter", "openScreenCastBig: ".concat(username));
                layoutAdapter.a(kz5.o1.c(username), username);
                sj3.g3 g3Var = layoutAdapter.f419802a;
                g3Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "openScreenCastBig: ".concat(username));
                android.view.View j17 = g3Var.j();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(j17, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "openScreenCastBigVideo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                j17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(j17, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "openScreenCastBigVideo", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                g3Var.i().c(username);
                g3Var.i().setVisibility(0);
                g3Var.i().setOnClickListener(new sj3.v2(g3Var));
                g3Var.d().setVisibility(8);
                g3Var.r(true);
                g3Var.e().h(false, true);
                g3Var.f().setOnClickListener(new sj3.w2(g3Var));
                wj3.a aVar = g3Var.f408539t;
                if (aVar != null && (b0Var = aVar.f446746e) != null) {
                    b0Var.g();
                }
                wj3.a aVar2 = g3Var.f408539t;
                jz5.g gVar = g3Var.f408534o;
                if (aVar2 != null) {
                    android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ((jz5.n) gVar).getValue();
                    kotlin.jvm.internal.o.f(relativeLayout, "<get-screenCasePluginLayout>(...)");
                    aVar2.g(relativeLayout);
                }
                com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = g3Var.f408520a;
                wj3.a aVar3 = new wj3.a(multiTalkMainUI);
                android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) ((jz5.n) gVar).getValue();
                kotlin.jvm.internal.o.f(relativeLayout2, "<get-screenCasePluginLayout>(...)");
                relativeLayout2.removeAllViews();
                uj3.b0 b0Var2 = aVar3.f446746e;
                if (b0Var2 != null) {
                    b0Var2.e(relativeLayout2);
                }
                g3Var.f408539t = aVar3;
                g3Var.l().f150265p.observe(multiTalkMainUI, (androidx.lifecycle.k0) ((jz5.n) g3Var.f408542w).getValue());
                zj3.j jVar = zj3.j.f473337a;
                com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                java.lang.String f27 = (Bi == null || (n17 = Bi.n(username, true)) == null) ? null : n17.f2();
                if (f27 != null) {
                    username = f27;
                }
                g3Var.f408537r = jVar.f(multiTalkMainUI, username);
                ((android.widget.TextView) ((jz5.n) g3Var.f408535p).getValue()).setText(g3Var.f408537r);
            }
        } else {
            int i17 = com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultiTalkAvatarLayout.f150362q;
            multiTalkAvatarLayout.b(pVar);
            if (multiTalkAvatarLayout.f150367h == -1) {
                com.tencent.mm.plugin.multitalk.model.u0.a(10);
            } else {
                com.tencent.mm.plugin.multitalk.model.u0.a(9);
            }
        }
        return jz5.f0.f302826a;
    }
}
