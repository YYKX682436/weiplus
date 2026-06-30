package e23;

/* loaded from: classes11.dex */
public class l0 extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.m0 f246889b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(e23.m0 m0Var) {
        super(m0Var);
        this.f246889b = m0Var;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        e23.m0 m0Var = (e23.m0) gVar;
        e23.k0 k0Var = (e23.k0) eVar;
        android.view.View view = k0Var.f246881a;
        e23.m0 m0Var2 = this.f246889b;
        com.tencent.mm.plugin.fts.ui.n3.j(view, m0Var2.f423761d);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(k0Var.f246882b, m0Var2.f246894q.f351187e, null);
        com.tencent.mm.plugin.fts.ui.n3.a(m0Var.f246898u, k0Var.f246884d);
        com.tencent.mm.plugin.fts.ui.n3.a(m0Var.f246899v, k0Var.f246885e);
        com.tencent.mm.plugin.fts.ui.n3.a(m0Var2.f246897t, k0Var.f246883c);
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bcg, viewGroup, false);
        e23.k0 k0Var = this.f246889b.f246901x;
        k0Var.f246882b = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
        k0Var.f246883c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kbq);
        k0Var.f246884d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jue);
        k0Var.f246885e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o7z);
        k0Var.f246881a = inflate.findViewById(com.tencent.mm.R.id.d0v);
        inflate.setTag(k0Var);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        e23.m0 m0Var = this.f246889b;
        int i17 = m0Var.f246895r;
        if (i17 > 1 || i17 == 0) {
            android.content.Intent putExtra = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.fts.ui.FTSConvMessageUI.class).putExtra("Search_Scene", m0Var.f423765h).putExtra("key_conv", m0Var.f246894q.f351187e).putExtra("key_query", m0Var.i()).putExtra("key_count", 1);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(putExtra);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSKefuMessageDataItem$FTSKefuMessageViewItem", "onItemClick", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/fts/ui/item/FTSKefuMessageDataItem$FTSKefuMessageViewItem", "onItemClick", "(Landroid/content/Context;Landroid/view/View;Lcom/tencent/mm/plugin/fts/api/ui/item/FTSDataItem;[Ljava/lang/Object;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (com.tencent.mm.storage.z3.o4(m0Var.f246894q.f351187e)) {
            android.content.Intent putExtra2 = new android.content.Intent().putExtra("Chat_User", m0Var.f246896s).putExtra("finish_direct", true).putExtra("from_global_search", true).putExtra("msg_local_id", m0Var.f246894q.f351186d).putExtra("highlight_keyword_list", com.tencent.mm.sdk.platformtools.t8.P1(m0Var.f423762e.f351131c));
            putExtra2.putExtra("chat_from_scene", 5);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(putExtra2, context);
        } else if (com.tencent.mm.storage.z3.C3(m0Var.f246894q.f351187e)) {
            java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(m0Var.f423762e.f351131c);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", m0Var.f246896s);
            intent.putExtra("finish_direct", true);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            boolean a17 = z65.c.a();
            e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
            if (e0Var != null) {
                a17 = ((h62.d) e0Var).fj(e42.d0.clicfg_android_appbrand_contact_support_send_video, a17);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandContactABTests", "isSupportSendVideo#get, " + a17);
            if (!a17) {
                intent.putExtra("key_need_send_video", false);
            }
            intent.putExtra("from_global_search", true);
            intent.putExtra("msg_local_id", m0Var.f246894q.f351186d);
            intent.putExtra("highlight_keyword_list", P1);
            intent.putExtra("app_brand_chatting_from_scene_new", 5);
            j45.l.u(context, ".ui.chatting.AppBrandServiceChattingUI", intent, null);
        }
        return false;
    }
}
