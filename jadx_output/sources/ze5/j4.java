package ze5;

/* loaded from: classes9.dex */
public final class j4 {
    public j4(kotlin.jvm.internal.i iVar) {
    }

    public static final void a(ze5.j4 j4Var, com.tencent.mm.ui.chatting.viewitems.a0 a0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str, we5.y0 y0Var, boolean z17) {
        j4Var.getClass();
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        java.lang.String U1 = f9Var.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return;
        }
        l15.c cVar = new l15.c();
        cVar.set__useLruCache(true);
        cVar.fromXml(U1);
        v05.b k17 = cVar.k();
        if (k17 == null) {
            return;
        }
        z01.y yVar = new z01.y();
        s15.w wVar = new s15.w();
        wVar.set__useLruCache(true);
        wVar.fromXml(k17.getString(k17.f432315e + 44));
        yVar.f469187g = wVar;
        yVar.f469184d = f9Var.getMsgId();
        java.lang.String Q0 = f9Var.Q0();
        kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
        yVar.f469185e = Q0;
        y0Var.d(new ze5.h4(dVar2, dVar, yVar, a0Var));
    }

    public static final void b(ze5.j4 j4Var, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        j4Var.getClass();
        java.lang.String U1 = f9Var.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return;
        }
        l15.c cVar = new l15.c();
        cVar.set__useLruCache(true);
        cVar.fromXml(U1);
        v05.b k17 = cVar.k();
        if (k17 == null) {
            return;
        }
        s15.w wVar = new s15.w();
        wVar.set__useLruCache(true);
        wVar.fromXml(k17.getString(k17.f432315e + 44));
        if (((fo.e) ((le5.e) i95.n0.c(le5.e.class))).bj(dVar.g(), f9Var.G, null)) {
            return;
        }
        com.tencent.mm.autogen.events.OpenNoteFromSessionEvent openNoteFromSessionEvent = new com.tencent.mm.autogen.events.OpenNoteFromSessionEvent();
        openNoteFromSessionEvent.f54599g.f7906c = dVar.g();
        openNoteFromSessionEvent.f54599g.f7904a = f9Var.getMsgId();
        openNoteFromSessionEvent.f54599g.f7909f = f9Var.Q0();
        openNoteFromSessionEvent.f54599g.f7907d = dVar.D();
        am.sn snVar = openNoteFromSessionEvent.f54599g;
        java.lang.String xml = wVar.toXml();
        if (xml == null) {
            xml = "";
        }
        snVar.f7905b = xml;
        am.sn snVar2 = openNoteFromSessionEvent.f54599g;
        snVar2.f7910g = 6;
        snVar2.f7912i = c01.ia.q(f9Var);
        openNoteFromSessionEvent.f54599g.f7913j = f9Var.V1();
        openNoteFromSessionEvent.e();
    }

    public static final boolean c(ze5.j4 j4Var, db5.g4 g4Var, android.view.View view, com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        j4Var.getClass();
        java.lang.Object tag = view.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
        int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) tag).d();
        if (!c01.ia.x(f9Var) && !com.tencent.mm.ui.chatting.n3.j(f9Var) && !com.tencent.mm.ui.chatting.n3.D(f9Var)) {
            g4Var.c(d17, 111, 0, dVar.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
        }
        if (com.tencent.mm.ui.chatting.component.z4.b(f9Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgNoteMvvm", "canShowFav false");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgNoteMvvm", "canShowFav true");
            g4Var.c(d17, 116, 0, view.getContext().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
        }
        if (!((gb0.n) ((fb0.k) i95.n0.c(fb0.k.class))).Ai(f9Var)) {
            com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
            long msgId = f9Var.getMsgId();
            am.b6 b6Var = exDeviceHaveBindNetworkDeviceEvent.f54141g;
            b6Var.f6219a = msgId;
            b6Var.f6220b = f9Var.Q0();
            exDeviceHaveBindNetworkDeviceEvent.e();
            if (exDeviceHaveBindNetworkDeviceEvent.f54142h.f6336a) {
                g4Var.c(d17, 129, 0, view.getContext().getString(com.tencent.mm.R.string.b3x), com.tencent.mm.R.raw.icons_filled_open);
            }
        }
        if (c01.ia.A(f9Var)) {
            g4Var.clear();
        }
        if ((f9Var.K1() || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, dVar) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()) && !dVar.A()) {
            g4Var.c(d17, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
        }
        if (!dVar.F()) {
            g4Var.c(d17, 100, 0, dVar.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        }
        return true;
    }

    public static final boolean d(ze5.j4 j4Var, android.view.MenuItem menuItem, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        j4Var.getClass();
        if (menuItem.getItemId() != 111) {
            return false;
        }
        ze5.i4 i4Var = new ze5.i4(dVar, f9Var);
        android.app.Activity g17 = dVar.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        com.tencent.mm.ui.chatting.manager.t.a(f9Var, g17, i4Var);
        return true;
    }

    public static final void e(ze5.j4 j4Var, rd5.d dVar) {
        j4Var.getClass();
        if (dVar == null) {
            return;
        }
        boolean z17 = j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigFavNotePreloadSwitch()) == 1;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgNoteMvvm", "preloadNoteHtml, doPreload:" + z17);
            return;
        }
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        java.lang.String U1 = f9Var.U1();
        if (!(!(U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return;
        }
        l15.c cVar = new l15.c();
        cVar.fromXml(U1);
        v05.b k17 = cVar.k();
        if (k17 == null) {
            return;
        }
        s15.w wVar = new s15.w();
        wVar.fromXml(k17.getString(k17.f432315e + 44));
        s15.h hVar = (s15.h) kz5.n0.a0(wVar.j(), 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadNoteHtml, fmt:");
        sb6.append(hVar != null ? hVar.n() : null);
        sb6.append(", htmlI:");
        sb6.append(hVar != null ? hVar.B() : null);
        sb6.append(", ddataId:");
        sb6.append(hVar != null ? hVar.getString(hVar.f303422d + 3) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgNoteMvvm", sb6.toString());
        long c17 = c01.id.c() - f9Var.getCreateTime();
        if (c17 > 1209600000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgNoteMvvm", "preloadNoteHtml, out of time, msgDelayMs:" + c17);
            return;
        }
        if (hVar == null || !com.tencent.mm.sdk.platformtools.t8.D0(hVar.B(), "WeNoteHtmlFile") || com.tencent.mm.sdk.platformtools.t8.K0(hVar.B()) || !kotlin.jvm.internal.o.b(hVar.B(), "WeNoteHtmlFile")) {
            return;
        }
        r45.gp0 c18 = bt3.x2.c(hVar);
        com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent = new com.tencent.mm.autogen.events.RecordOperationEvent();
        am.eq eqVar = recordOperationEvent.f54663g;
        eqVar.f6583a = 1;
        eqVar.f6585c = c18;
        eqVar.f6586d = f9Var.getMsgId();
        eqVar.f6587e = f9Var.Q0();
        recordOperationEvent.e();
        if (com.tencent.mm.vfs.w6.j(recordOperationEvent.f54664h.f6693b)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgNoteMvvm", "preloadNoteHtml, fileExist, return");
            return;
        }
        com.tencent.mm.autogen.events.RecordOperationEvent recordOperationEvent2 = new com.tencent.mm.autogen.events.RecordOperationEvent();
        am.eq eqVar2 = recordOperationEvent2.f54663g;
        eqVar2.f6583a = 8;
        eqVar2.f6585c = c18;
        eqVar2.f6586d = f9Var.getMsgId();
        eqVar2.f6587e = f9Var.Q0();
        eqVar2.f6593k = "";
        recordOperationEvent2.e();
    }
}
