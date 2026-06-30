package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public final class x8 extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f205975s;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        if (r0 == false) goto L5;
     */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View F(android.view.LayoutInflater r5, android.view.View r6) {
        /*
            r4 = this;
            if (r6 == 0) goto La
            java.lang.Object r0 = r6.getTag()
            boolean r0 = r0 instanceof com.tencent.mm.ui.chatting.viewitems.w8
            if (r0 != 0) goto L48
        La:
            com.tencent.mm.ui.chatting.viewitems.xg r6 = new com.tencent.mm.ui.chatting.viewitems.xg
            r0 = 2131493780(0x7f0c0394, float:1.861105E38)
            r6.<init>(r5, r0)
            java.lang.Class<zn5.k> r5 = zn5.k.class
            i95.m r5 = i95.n0.c(r5)
            zn5.k r5 = (zn5.k) r5
            zn5.l r5 = (zn5.l) r5
            r5.Zi()
            io.p r5 = new io.p
            r5.<init>()
            r0 = 0
            r5.f293422c = r0
            com.tencent.mm.ui.chatting.viewitems.w8 r0 = new com.tencent.mm.ui.chatting.viewitems.w8
            r0.<init>()
            r0.create(r6)
            r6.setTag(r0)
            android.widget.FrameLayout r1 = r0.f205913c
            if (r1 == 0) goto L46
            android.content.Context r2 = r6.getContext()
            java.lang.String r3 = "getContext(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            android.view.View r2 = r5.a(r2)
            r1.addView(r2)
        L46:
            r0.f205914d = r5
        L48:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.viewitems.x8.F(android.view.LayoutInflater, android.view.View):android.view.View");
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View msgView, rd5.d msgData) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(msgView, "msgView");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        java.lang.Object tag = msgView.getTag();
        com.tencent.mm.ui.chatting.viewitems.er erVar = tag instanceof com.tencent.mm.ui.chatting.viewitems.er ? (com.tencent.mm.ui.chatting.viewitems.er) tag : null;
        int d17 = erVar != null ? erVar.d() : 0;
        yb5.d dVar = this.f205975s;
        kotlin.jvm.internal.o.d(dVar);
        menu.c(d17, 100, 0, dVar.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 baseHolder, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        kotlin.jvm.internal.o.g(baseHolder, "baseHolder");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        this.f205975s = ui6;
        com.tencent.mm.ui.chatting.viewitems.w8 w8Var = baseHolder instanceof com.tencent.mm.ui.chatting.viewitems.w8 ? (com.tencent.mm.ui.chatting.viewitems.w8) baseHolder : null;
        if (w8Var == null) {
            return;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(f9Var != null ? f9Var.j() : null, "msg", null);
        java.lang.String str2 = d17 != null ? (java.lang.String) d17.get(".msg.appmsg.introductioninfo") : null;
        mf5.b bVar = new mf5.b();
        if (str2 == null) {
            str2 = "";
        }
        bVar.fromXml(str2);
        mf5.d dVar = new mf5.d();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList<mf5.a> j17 = bVar.j();
        if (j17 != null) {
            for (mf5.a aVar : j17) {
                mf5.c cVar = new mf5.c();
                cVar.f326179d = aVar.getTitle();
                cVar.f326180e = aVar.k();
                cVar.f326181f = aVar.j();
                arrayList.add(cVar);
            }
        }
        dVar.f326182d = arrayList;
        q31.n nVar = w8Var.f205914d;
        if (nVar != null) {
            nVar.b(dVar);
        }
        android.view.View view = w8Var.f205912b;
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFunctionGuideList$AppMsgFunctionGuideListHolder", "updateView$app_release", "(Lcom/tencent/mm/ui/chatting/welcome/ChattingFunctionGuideListViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFunctionGuideList$AppMsgFunctionGuideListHolder", "updateView$app_release", "(Lcom/tencent/mm/ui/chatting/welcome/ChattingFunctionGuideListViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = w8Var.userTV;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = w8Var.timeTV;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }
}
