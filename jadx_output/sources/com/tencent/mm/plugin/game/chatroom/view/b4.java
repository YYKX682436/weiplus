package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public final class b4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.c4 f139045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f139046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.PanelGridView f139047f;

    public b4(com.tencent.mm.plugin.game.chatroom.view.c4 c4Var, android.view.View view, com.tencent.mm.plugin.game.chatroom.view.PanelGridView panelGridView) {
        this.f139045d = c4Var;
        this.f139046e = view;
        this.f139047f = panelGridView;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ac  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r18) {
        /*
            r17 = this;
            r6 = r17
            java.lang.String r0 = "com/tencent/mm/plugin/game/chatroom/view/PanelGridView$PanelViewHolder$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = r18
            r4.add(r5)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r17
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.game.chatroom.view.c4 r0 = r6.f139045d
            com.tencent.mm.plugin.game.autogen.chatroom.Panel r1 = r0.f139059d
            if (r1 == 0) goto Lbc
            int r2 = r1.type
            java.lang.String r3 = ""
            com.tencent.mm.game.report.f r4 = com.tencent.mm.game.report.g.f68195a
            r5 = 2
            r14 = 1
            android.view.View r7 = r6.f139046e
            if (r2 == r14) goto L57
            if (r2 == r5) goto L36
        L34:
            r2 = r14
            goto L9a
        L36:
            java.lang.Class<vb0.o> r2 = vb0.o.class
            i95.m r2 = i95.n0.c(r2)
            vb0.o r2 = (vb0.o) r2
            android.content.Context r5 = r7.getContext()
            java.lang.String r7 = "null cannot be cast to non-null type android.app.Activity"
            kotlin.jvm.internal.o.e(r5, r7)
            android.app.Activity r5 = (android.app.Activity) r5
            ub0.r r2 = (ub0.r) r2
            r2.getClass()
            r2 = 14
            r7 = 15
            r8 = 0
            com.tencent.mm.pluginsdk.ui.tools.l7.e(r5, r2, r14, r7, r8)
            goto L34
        L57:
            com.tencent.mm.plugin.game.autogen.chatroom.JumpInfo r2 = r1.jump_info
            if (r2 == 0) goto L34
            android.content.Context r7 = r7.getContext()
            s33.y.h(r7, r2)
            java.lang.String r7 = r1.desc
            if (r7 != 0) goto L69
            r16 = r3
            goto L6b
        L69:
            r16 = r7
        L6b:
            r0.getClass()
            int r2 = r2.jump_type
            com.tencent.mm.plugin.game.chatroom.view.PanelGridView r7 = r0.f139062g
            if (r2 == r14) goto L89
            if (r2 == r5) goto L77
            goto L34
        L77:
            int r2 = r0.getAdapterPosition()
            int r2 = r2 + r14
            long r8 = (long) r2
            r10 = 28
            long r12 = r7.f139016f2
            long r14 = r7.f139017g2
            r7 = r4
            r2 = 1
            r7.c(r8, r10, r12, r14, r16)
            goto L9a
        L89:
            r2 = r14
            int r5 = r0.getAdapterPosition()
            int r5 = r5 + r2
            long r8 = (long) r5
            r10 = 7
            long r12 = r7.f139016f2
            long r14 = r7.f139017g2
            r7 = r4
            r7.c(r8, r10, r12, r14, r16)
        L9a:
            int r0 = r0.getAdapterPosition()
            int r0 = r0 + r2
            long r8 = (long) r0
            r10 = 2
            com.tencent.mm.plugin.game.chatroom.view.PanelGridView r0 = r6.f139047f
            long r12 = r0.f139016f2
            long r14 = r0.f139017g2
            java.lang.String r1 = r1.desc
            if (r1 != 0) goto Laf
            r16 = r3
            goto Lb1
        Laf:
            r16 = r1
        Lb1:
            r7 = r4
            r7.c(r8, r10, r12, r14, r16)
            yz5.a r0 = r0.f139018h2
            if (r0 == 0) goto Lbc
            r0.invoke()
        Lbc:
            java.lang.String r0 = "onClick"
            java.lang.String r1 = "(Landroid/view/View;)V"
            java.lang.String r2 = "com/tencent/mm/plugin/game/chatroom/view/PanelGridView$PanelViewHolder$1"
            java.lang.String r3 = "android/view/View$OnClickListener"
            yj0.a.h(r6, r2, r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.chatroom.view.b4.onClick(android.view.View):void");
    }
}
