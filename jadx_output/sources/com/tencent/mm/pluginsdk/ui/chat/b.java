package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes15.dex */
public class b implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.AppGrid f190183d;

    public b(com.tencent.mm.pluginsdk.ui.chat.AppGrid appGrid) {
        this.f190183d = appGrid;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.pluginsdk.ui.chat.AppGrid appGrid = this.f190183d;
        com.tencent.mm.pluginsdk.ui.chat.f fVar = appGrid.f189912d;
        int a17 = ((com.tencent.mm.pluginsdk.ui.chat.m) fVar).a((appGrid.f189917i * appGrid.f189915g) + i17);
        appGrid.f189919n.getItem(i17);
        final com.tencent.mm.pluginsdk.ui.chat.m mVar = (com.tencent.mm.pluginsdk.ui.chat.m) fVar;
        if (a17 == 0) {
            com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = mVar.f190476a;
            if (!appPanel.C.f190145c.f190766a) {
                android.content.Context context = appPanel.f189937p;
                dp.a.makeText(context, context.getString(com.tencent.mm.R.string.b4r), 0).show();
            } else if (com.tencent.mm.pluginsdk.ui.chat.AppPanel.c(appPanel)) {
                com.tencent.mm.pluginsdk.ui.chat.AppPanel.d(appPanel);
            } else if (com.tencent.mm.pluginsdk.ui.chat.AppPanel.e(appPanel)) {
                com.tencent.mm.pluginsdk.ui.chat.AppPanel.g(appPanel);
            } else {
                com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = appPanel.f189936o;
                if (y4Var == null || y4Var.a() == null || !((sb5.s) appPanel.f189936o.a().f460708c.a(sb5.s.class)).u()) {
                    ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                    if (j35.u.h(appPanel.f189937p, "android.permission.CAMERA")) {
                        com.tencent.mm.pluginsdk.ui.chat.AppPanel.h(appPanel, true);
                    } else {
                        com.tencent.mm.pluginsdk.ui.chat.AppPanel.h(appPanel, false);
                    }
                } else {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    com.tencent.mm.plugin.finder.viewmodel.component.dy.f134172a.c(appPanel.f189936o.a().g(), appPanel.f189936o.a().t(), 2, new yz5.a() { // from class: com.tencent.mm.pluginsdk.ui.chat.m$$a
                        @Override // yz5.a
                        public final java.lang.Object invoke() {
                            com.tencent.mm.pluginsdk.ui.chat.m mVar2 = com.tencent.mm.pluginsdk.ui.chat.m.this;
                            mVar2.getClass();
                            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                            com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel2 = mVar2.f190476a;
                            ((sb0.f) jVar).getClass();
                            if (j35.u.h(appPanel2.f189937p, "android.permission.CAMERA")) {
                                com.tencent.mm.pluginsdk.ui.chat.AppPanel.h(appPanel2, true);
                                return null;
                            }
                            com.tencent.mm.pluginsdk.ui.chat.AppPanel.h(appPanel2, false);
                            return null;
                        }
                    });
                }
            }
        } else {
            mVar.getClass();
        }
        return true;
    }
}
