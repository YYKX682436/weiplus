package h22;

/* loaded from: classes15.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h22.c f278277d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f278278e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.model.b f278279f;

    public a(h22.c cVar, int i17, com.tencent.mm.plugin.emoji.model.b bVar) {
        this.f278277d = cVar;
        this.f278278e = i17;
        this.f278279f = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v3/banner/EmojiStoreV3BannerAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        h22.c cVar = this.f278277d;
        java.lang.String str = cVar.f278283f;
        java.util.LinkedList linkedList = cVar.f278282e;
        int i17 = this.f278278e;
        com.tencent.mm.plugin.emoji.model.b bVar = (com.tencent.mm.plugin.emoji.model.b) linkedList.get(i17);
        cVar.getClass();
        if (bVar != null) {
            if (bVar.f97539c) {
                y12.m.a(cVar.f278281d, bVar.f97537a, true);
            } else {
                r45.zj0 BannerSummary = bVar.f97538b.f376210d;
                kotlin.jvm.internal.o.f(BannerSummary, "BannerSummary");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11929, 0);
                y12.m.e(cVar.f278281d, BannerSummary, false, 15, -1, -1, "", 8, false);
            }
        }
        boolean z17 = cVar.f278289o;
        com.tencent.mm.plugin.emoji.model.b bVar2 = this.f278279f;
        if (z17) {
            int i18 = cVar.f278288n;
            if (bVar2 != null) {
                java.lang.String a17 = j22.a.a(bVar2);
                r45.kj0 kj0Var = bVar2.f97537a;
                java.lang.String str2 = kj0Var != null ? kj0Var.f378727e : null;
                if (str2 == null) {
                    str2 = "null";
                }
                com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct b17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.b();
                b17.p(java.lang.String.valueOf(i17));
                b17.f56076j = i18;
                b17.f56070d = j22.a.f297249a;
                b17.f56071e = 1;
                b17.f56072f = 3;
                b17.u(a17);
                b17.q(str2);
                b17.k();
            }
        }
        j22.a.b(bVar2, i17 + 1, cVar.f278286i == 0 ? 1 : 2, "view_clk");
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v3/banner/EmojiStoreV3BannerAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
