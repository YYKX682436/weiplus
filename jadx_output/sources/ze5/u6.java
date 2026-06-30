package ze5;

/* loaded from: classes9.dex */
public class u6 extends com.tencent.mm.ui.chatting.b6 {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.a0 f472225g;

    /* renamed from: h, reason: collision with root package name */
    public int f472226h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.m5 f472227i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f472228m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f472229n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f472230o;

    public u6(yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.a0 a0Var, boolean z17) {
        super(dVar);
        this.f472226h = 0;
        this.f472227i = null;
        this.f472228m = false;
        this.f472230o = false;
        this.f472225g = a0Var;
        this.f472229n = z17;
    }

    @Override // com.tencent.mm.ui.chatting.b6
    public void a(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        if (((fo.e) ((le5.e) i95.n0.c(le5.e.class))).bj(dVar.g(), erVar.c().G, null)) {
            return;
        }
        ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).wi(erVar.c());
        b(erVar.c(), erVar.f203906b, erVar.f203909e, view);
        ot0.q w17 = ot0.q.w(2, f9Var.j());
        if (w17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(w17.f348646d) && this.f472225g != null) {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str = w17.f348646d;
            ((kt.c) i0Var).getClass();
            com.tencent.mm.pluginsdk.model.app.m j17 = com.tencent.mm.pluginsdk.model.app.w.j(str, false, false);
            if (j17 != null) {
                com.tencent.mm.ui.chatting.w5.e(dVar, w17, com.tencent.mm.ui.chatting.viewitems.a0.t(dVar, f9Var), j17, f9Var.I0(), dVar.x());
            }
        }
        te5.t.i(dVar, f9Var, 0);
        if (com.tencent.mm.storage.z3.N4(f9Var.Q0())) {
            return;
        }
        boolean z17 = this.f472229n;
        long I0 = f9Var.I0();
        java.lang.String Q0 = f9Var.Q0();
        el0.a aVar = el0.i.f253725f;
        if (aVar != null) {
            wl0.h hVar = (wl0.h) aVar;
            ((ku5.t0) ku5.t0.f312615d).r(new wl0.g(hVar, I0, z17, Q0), "KaraEvent");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.tencent.mm.storage.f9 r23, java.lang.String r24, java.lang.String r25, android.view.View r26) {
        /*
            Method dump skipped, instructions count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.u6.b(com.tencent.mm.storage.f9, java.lang.String, java.lang.String, android.view.View):void");
    }

    public final void c(long j17, long j18, java.lang.String str, int i17, java.lang.String str2, int[] iArr, int i18, int i19, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DesignerClickListener", "[ImageGalleryUI] doGetMsgImg");
        yb5.d dVar = this.f198492d;
        android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.class);
        intent.putExtra("img_gallery_msg_id", j17);
        com.tencent.mm.ui.chatting.manager.c cVar = dVar.f460708c;
        intent.putExtra("show_search_chat_content_result", ((com.tencent.mm.ui.chatting.component.jk) ((sb5.u1) cVar.a(sb5.u1.class))).f199295f);
        intent.putExtra("img_gallery_msg_svr_id", j18);
        intent.putExtra("key_is_biz_chat", ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) cVar.a(sb5.f.class))).f198753r);
        intent.putExtra("key_biz_chat_id", ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) cVar.a(sb5.f.class))).w0());
        intent.putExtra("img_gallery_talker", str);
        intent.putExtra("img_gallery_chatroom_name", str2);
        intent.putExtra("img_gallery_left", iArr[0]);
        intent.putExtra("img_gallery_top", iArr[1]);
        intent.putExtra("img_gallery_width", i18);
        intent.putExtra("img_gallery_height", i19);
        intent.putExtra("img_gallery_enter_from_chatting_ui", true);
        intent.putExtra("msg_type", this.f472226h);
        if (this.f472226h == 1) {
            intent.putExtra("show_enter_grid", false);
        }
        if (z17) {
            intent.putExtra("img_preview_only", true);
        }
        intent.putExtra("img_gallery_enter_from_appbrand_service_chatting_ui", com.tencent.mm.storage.z3.z3(str));
        java.lang.String x17 = dVar.x();
        android.os.Bundle bundle = new android.os.Bundle();
        if (dVar.D()) {
            bundle.putInt("stat_scene", 2);
        } else {
            bundle.putInt("stat_scene", c01.e2.G(x17) ? 7 : 1);
        }
        bundle.putString("stat_msg_id", "msg_" + java.lang.Long.toString(j18));
        bundle.putString("stat_chat_talker_username", x17);
        bundle.putString("stat_send_msg_user", str);
        intent.putExtra("_stat_obj", bundle);
        intent.putExtra("img_gallery_session_id", com.tencent.mm.ui.chatting.w5.k(j18, str, x17));
        com.tencent.mm.ui.chatting.viewitems.bm.a(intent, dVar.g());
        com.tencent.mm.ui.report.KV17560Reporter c17 = com.tencent.mm.ui.report.KV17560Reporter.c(dVar.g());
        c17.f209616h = com.tencent.mm.sdk.platformtools.t8.r0(j18);
        c17.f209617i = com.tencent.mm.ui.report.h0.Image;
        int i27 = bundle.getInt("stat_scene", 0);
        if (i27 == 1) {
            c17.f209613e = com.tencent.mm.ui.report.j0.SingleChat;
            c17.b(com.tencent.mm.ui.report.i0.EnterSingleChat);
        } else if (i27 == 2) {
            c17.f209613e = com.tencent.mm.ui.report.j0.GroupChat;
            c17.b(com.tencent.mm.ui.report.i0.EnterGroupChat);
        }
        c17.a(intent);
        yb5.d dVar2 = this.f198492d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar2, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemImgMvvm$ImageClickListener", "doGetMsgImg", "(JJLjava/lang/String;ILjava/lang/String;[IIIZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar2.a0((android.content.Intent) arrayList.get(0));
        yj0.a.f(dVar2, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemImgMvvm$ImageClickListener", "doGetMsgImg", "(JJLjava/lang/String;ILjava/lang/String;[IIIZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar.f460717l.overridePendingTransition(0, 0);
    }

    public void d(com.tencent.mm.storage.f9 f9Var, android.view.View view) {
        int i17 = this.f472226h;
        if (i17 != 1) {
            if (i17 != 4) {
                return;
            }
            b(f9Var, f9Var.Q0(), "", view);
        } else {
            if (((fo.e) ((le5.e) i95.n0.c(le5.e.class))).bj(view.getContext(), f9Var.G, null)) {
                return;
            }
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).wi(f9Var);
            b(f9Var, f9Var.Q0(), "", view);
        }
    }

    public u6(yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.a0 a0Var, int i17, com.tencent.mm.storage.f9 f9Var, android.view.View view, boolean z17, com.tencent.mm.ui.chatting.m5 m5Var) {
        super(dVar);
        this.f472227i = null;
        this.f472228m = false;
        this.f472230o = false;
        this.f472225g = a0Var;
        this.f472226h = i17;
        this.f472228m = z17;
        this.f472227i = m5Var;
        d(f9Var, view);
    }

    public u6(yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.a0 a0Var, int i17, com.tencent.mm.storage.f9 f9Var, android.view.View view, boolean z17, boolean z18, com.tencent.mm.ui.chatting.m5 m5Var) {
        super(dVar);
        this.f472227i = null;
        this.f472228m = false;
        this.f472230o = false;
        this.f472225g = a0Var;
        this.f472226h = i17;
        this.f472228m = z17;
        this.f472230o = z18;
        d(f9Var, view);
    }
}
