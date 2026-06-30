package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class al implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.bl f198639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem f198640e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f198641f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f198642g;

    public al(com.tencent.mm.ui.chatting.component.bl blVar, com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem shortcutCommandItem, int i17, int i18) {
        this.f198639d = blVar;
        this.f198640e = shortcutCommandItem;
        this.f198641f = i17;
        this.f198642g = i18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/ShortcutCommandTagComponent$createTagView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.component.bl blVar = this.f198639d;
        sb5.s0 s0Var = (sb5.s0) blVar.f198580d.f460708c.a(sb5.s0.class);
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = s0Var != null ? ((com.tencent.mm.ui.chatting.component.jb) s0Var).f199263e : null;
        if (chatFooter == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShortcutCommandTagComponent", "onTagClicked: footer is null");
        } else {
            chatFooter.setMode(1);
            java.lang.String lastText = chatFooter.getLastText();
            if (lastText == null) {
                lastText = "";
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(lastText);
            com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem shortcutCommandItem = this.f198640e;
            sb6.append(shortcutCommandItem.f188081f);
            chatFooter.setLastText(sb6.toString());
            com.tencent.mars.xlog.Log.i("MicroMsg.ShortcutCommandTagComponent", "onTagClicked: appended content, id=%s", java.lang.Integer.valueOf(shortcutCommandItem.f188079d));
        }
        int i17 = this.f198641f;
        int i18 = this.f198642g;
        blVar.getClass();
        try {
            int i19 = blVar.f198838i;
            if (i19 < 1) {
                i19 = 1;
            }
            int i27 = i17 + 1;
            java.util.Map k17 = kz5.c1.k(new jz5.l("view_id", "shortcut_name_btn"), new jz5.l("weclawbot_username", blVar.f198580d.x()), new jz5.l("clawbot_shortcut_count", java.lang.Integer.valueOf(i18)), new jz5.l("clawbot_visible_shortcut_count", java.lang.Integer.valueOf(i19)), new jz5.l("clawbot_shortcut_index_list", java.lang.String.valueOf(i27)));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", k17, 37790);
            com.tencent.mars.xlog.Log.i("MicroMsg.ShortcutCommandTagComponent", "reportTagClick: index=%d, params=%s", java.lang.Integer.valueOf(i27), k17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ShortcutCommandTagComponent", e17, "reportTagClick failed", new java.lang.Object[0]);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ShortcutCommandTagComponent$createTagView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
