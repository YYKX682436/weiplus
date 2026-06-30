package lr;

/* loaded from: classes15.dex */
public final class d1 extends androidx.recyclerview.widget.k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f320507d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f320508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lr.f1 f320509f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(lr.f1 f1Var, android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        this.f320509f = f1Var;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.n0v);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f320507d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.n0u);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f320508e = (android.widget.ImageView) findViewById2;
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/emoji/panel/adapter/SmileyTabAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        lr.c1 c1Var = this.f320509f.f320518f;
        if (c1Var != null) {
            int adapterPosition = getAdapterPosition();
            com.tencent.mm.view.manager.d dVar = ((com.tencent.mm.view.manager.f) c1Var).f213658a;
            ir.y0 x17 = dVar.f213641q.x(adapterPosition);
            if (x17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "tab is null. ignore click action.");
            } else {
                ir.r rVar = x17.f293919a;
                int i17 = rVar.f293895a;
                if (i17 == 2) {
                    j45.l.j(v17.getContext(), "emoji", ".ui.EmojiMineUI", new android.content.Intent(), null);
                } else if (i17 != 3) {
                    ((com.tencent.mm.ui.chatting.o2) ((ty.g0) i95.n0.c(ty.g0.class))).wi();
                    int i18 = x17.f293920b;
                    java.lang.String c17 = rVar.c();
                    nr.h hVar = dVar.R;
                    hVar.getClass();
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(18231, java.lang.Long.valueOf(hVar.f339047a), java.lang.Integer.valueOf(hVar.f339048b), java.lang.Integer.valueOf(hVar.f339049c), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(i18 + 1), c17);
                    hVar.f339049c++;
                    dVar.k(i18, true);
                    androidx.recyclerview.widget.RecyclerView recyclerView = dVar.f213630f;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList2.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/view/manager/SmileyPanelManager$10", "onItemClick", "(ILandroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
                    recyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(recyclerView, "com/tencent/mm/view/manager/SmileyPanelManager$10", "onItemClick", "(ILandroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
                    mr.i iVar = dVar.f213633i;
                    if (iVar.f330825m != i18) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.CenterPagerSnapHelper", "updateSnapPosition from " + iVar.f330825m + " to " + i18);
                        iVar.f330825m = i18;
                    }
                    com.tencent.mm.pluginsdk.ui.j0 j0Var = dVar.L;
                    if (j0Var != null) {
                        java.lang.String str = dVar.f213627c;
                        java.lang.String str2 = com.tencent.mm.plugin.sns.ui.SnsCommentFooter.I1;
                        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = ((com.tencent.mm.plugin.sns.ui.SnsCommentFooter$$e) j0Var).f167119a;
                        snsCommentFooter.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$setSmileyInitTab$9", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "smiley tab change productId: %s", str);
                        snsCommentFooter.f167112y1 = str;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$setSmileyInitTab$9", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                    }
                    if (rVar.c().equals("capture") && dVar.f213642r.f293848g) {
                        if (((km0.c) gm0.j1.p().a()).a()) {
                            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_CAPTURE_TAB_RED_DOT_BOOLEAN, java.lang.Boolean.TRUE);
                        }
                        android.view.View findViewById = v17.findViewById(com.tencent.mm.R.id.n0u);
                        if (findViewById != null) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            arrayList3.add(8);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/view/manager/SmileyPanelManager$10", "onItemClick", "(ILandroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(findViewById, "com/tencent/mm/view/manager/SmileyPanelManager$10", "onItemClick", "(ILandroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                } else if (w75.a.a() && com.tencent.mm.sdk.platformtools.x2.n()) {
                    dVar.l(v17.getContext(), dVar.H, null);
                } else {
                    android.content.Context context = v17.getContext();
                    qk.z zVar = new qk.z();
                    zVar.f364113i = 17;
                    zVar.f364155a = 13;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(dVar.f213645u)) {
                        java.lang.String str3 = dVar.f213645u;
                        kotlin.jvm.internal.o.g(str3, "<set-?>");
                        zVar.f364114j = str3;
                    }
                    com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
                    if (p6Var == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "unable to get emoticon liteapp feature service");
                    } else {
                        ((com.tencent.mm.feature.emoji.f4) p6Var).wi(context, zVar);
                    }
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var.d(11594, 2);
                    g0Var.d(12065, 8);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/emoji/panel/adapter/SmileyTabAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
