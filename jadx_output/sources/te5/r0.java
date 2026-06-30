package te5;

/* loaded from: classes9.dex */
public final class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f418732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rd5.d f418733e;

    public r0(yb5.d dVar, rd5.d dVar2) {
        this.f418732d = dVar;
        this.f418733e = dVar2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        fd5.c cVar;
        java.util.List list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/utils/MediaMsgOptArea$createMediaViewCreator$2$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yb5.d dVar = this.f418732d;
        sb5.a0 a0Var = (sb5.a0) dVar.f460708c.a(sb5.a0.class);
        if (a0Var != null) {
            kotlin.jvm.internal.o.d(view);
            ((com.tencent.mm.ui.chatting.component.o4) a0Var).p0(view);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/chatting/utils/MediaMsgOptArea$createMediaViewCreator$2$1$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        boolean z17 = false;
        view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/utils/MediaMsgOptArea$createMediaViewCreator$2$1$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.tencent.mm.ui.chatting.manager.c cVar2 = dVar.f460708c;
        com.tencent.mm.ui.chatting.component.v4 v4Var = (com.tencent.mm.ui.chatting.component.v4) ((sb5.b0) cVar2.a(sb5.b0.class));
        v4Var.getClass();
        rd5.d msgData = this.f418733e;
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMediaGroupComponent", "foldMsg groupId");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - com.tencent.mm.ui.chatting.component.w4.f200150a < 500) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemMediaGroupComponent", "mediaGroup op ignored by global cooldown");
            z17 = true;
        } else {
            com.tencent.mm.ui.chatting.component.w4.f200150a = currentTimeMillis;
        }
        if (!z17) {
            ic5.f fVar = v4Var.f200113e;
            if (fVar == null) {
                kotlin.jvm.internal.o.o("mediaGroupMsgHelper");
                throw null;
            }
            java.lang.String a17 = fVar.a(msgData.f394254d.f445300b);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMediaGroupComponent", "foldMsg groupId: ".concat(a17));
            com.tencent.mm.ui.chatting.component.p4 p4Var = (com.tencent.mm.ui.chatting.component.p4) ((java.util.LinkedHashMap) v4Var.f200114f).get(a17);
            if (p4Var != null && (list = p4Var.f199673b) != null) {
                list.clear();
            }
            com.tencent.mm.ui.chatting.component.o4 o4Var = (com.tencent.mm.ui.chatting.component.o4) ((sb5.a0) v4Var.f198580d.f460708c.a(sb5.a0.class));
            o4Var.getClass();
            if (!r26.n0.N(a17)) {
                o4Var.f199622g.add(a17);
            }
            java.lang.Object p17 = v4Var.f198580d.p();
            androidx.recyclerview.widget.RecyclerView recyclerView = p17 instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) p17 : null;
            if (recyclerView != null) {
                com.tencent.mm.ui.chatting.view.i2.c(recyclerView, a17, new com.tencent.mm.ui.chatting.component.r4(v4Var, o4Var, a17));
            }
            java.lang.Object p18 = v4Var.f198580d.p();
            androidx.recyclerview.widget.RecyclerView recyclerView2 = p18 instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) p18 : null;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
            com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager chattingLinearLayoutManager = layoutManager instanceof com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager ? (com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager) layoutManager : null;
            if (chattingLinearLayoutManager != null && (cVar = (fd5.c) chattingLinearLayoutManager.W(fd5.c.class)) != null) {
                cVar.c();
            }
            ic5.f fVar2 = v4Var.f200113e;
            if (fVar2 == null) {
                kotlin.jvm.internal.o.o("mediaGroupMsgHelper");
                throw null;
            }
            com.tencent.mm.storage.f9 msg = msgData.f394254d.f445300b;
            kotlin.jvm.internal.o.g(msg, "msg");
            if (!fVar2.f290439a) {
                java.lang.String a18 = fVar2.a(msg);
                if (!r26.n0.N(a18)) {
                    fVar2.f290440b.remove(a18);
                }
            }
            sb5.z zVar = (sb5.z) v4Var.f198580d.f460708c.a(sb5.z.class);
            if (zVar != null) {
                ((com.tencent.mm.ui.chatting.adapter.k) zVar).h(new java.lang.Object());
            }
        }
        ((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Ai(msgData.f394254d.f445300b);
        sb5.a0 a0Var2 = (sb5.a0) cVar2.a(sb5.a0.class);
        if (a0Var2 != null) {
            ((com.tencent.mm.ui.chatting.component.o4) a0Var2).m0(msgData.f394254d.f445300b);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/utils/MediaMsgOptArea$createMediaViewCreator$2$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
