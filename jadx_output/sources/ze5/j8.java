package ze5;

/* loaded from: classes11.dex */
public class j8 extends ze5.w8 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f472036s;

    public static final v11.n0 k0(ze5.j8 j8Var, java.lang.String str, long j17) {
        j8Var.getClass();
        dh0.j jVar = (dh0.j) i95.n0.c(dh0.j.class);
        boolean Vi = jVar != null ? ((eh0.o) jVar).Vi(str, j17) : false;
        boolean Ui = jVar != null ? ((eh0.o) jVar).Ui(str, j17) : false;
        boolean Ri = jVar != null ? ((eh0.o) jVar).Ri(str, j17) : false;
        return (Vi && Ri) ? v11.n0.f432447f : Vi ? v11.n0.f432446e : (Ui && Ri) ? v11.n0.f432448g : Ri ? v11.n0.f432449h : v11.n0.f432445d;
    }

    public static final void l0(ze5.j8 j8Var, com.tencent.mm.storage.f9 f9Var, int i17) {
        yb5.d dVar = j8Var.f472036s;
        if (dVar == null || com.tencent.mm.ui.tk.f209956c.a() || j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigMarkdownPreview()) != 1) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.tencent.mm.ui.container.MMCommonFullScreenActivity.class);
        pf5.j0.a(intent, com.tencent.mm.ui.chatting.tb.class);
        intent.putExtra("Chat_Msg_Id", f9Var.getMsgId());
        intent.putExtra("Chat_User", f9Var.Q0());
        intent.putExtra("key_markdown_preview_enter_source", "bubble_double_tap");
        if (i17 >= 0) {
            intent.putExtra("Markdown_Source_Codepoint_Offset", i17);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMarkdownMvvm$ChattingItemMarkdownFrom", "goPreviewMarkdown", "(Lcom/tencent/mm/storage/MsgInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar.a0((android.content.Intent) arrayList.get(0));
        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMarkdownMvvm$ChattingItemMarkdownFrom", "goPreviewMarkdown", "(Lcom/tencent/mm/storage/MsgInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // ze5.w8, com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        int itemId = item.getItemId();
        if (itemId != 102) {
            if (itemId != 111) {
                return false;
            }
            ze5.e8 e8Var = new ze5.e8(ui6, f9Var);
            android.app.Activity g17 = ui6.g();
            kotlin.jvm.internal.o.f(g17, "getContext(...)");
            com.tencent.mm.ui.chatting.manager.t.a(f9Var, g17, e8Var);
            return false;
        }
        ot0.q v17 = ot0.q.v(c01.w9.l(ui6.C(), f9Var.j(), f9Var.A0()));
        java.lang.String str = v17 != null ? v17.f348654f : null;
        if (str == null) {
            str = "";
        }
        com.tencent.mm.sdk.platformtools.b0.e(str);
        w04.a.INSTANCE.A9(1, java.lang.String.valueOf(f9Var.I0()), com.tencent.mm.sdk.platformtools.t8.o0(str));
        db5.e1.T(ui6.g(), ui6.g().getString(com.tencent.mm.R.string.f490361st));
        return false;
    }

    @Override // ze5.w8, com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        kotlin.jvm.internal.o.g(menu, "menu");
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
        android.content.Context context = v17.getContext();
        java.lang.Object tag = v17.getTag();
        com.tencent.mm.ui.chatting.viewitems.er erVar = tag instanceof com.tencent.mm.ui.chatting.viewitems.er ? (com.tencent.mm.ui.chatting.viewitems.er) tag : null;
        int d17 = erVar != null ? erVar.d() : 0;
        yb5.d dVar = this.f472036s;
        if (dVar == null) {
            return true;
        }
        if (!c01.ia.x(f9Var)) {
            int i17 = d17;
            menu.c(i17, 102, 0, context.getString(com.tencent.mm.R.string.b3m), com.tencent.mm.R.raw.icons_filled_copy);
            menu.c(i17, 111, 0, context.getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
            j45.l.g("favorite");
            menu.c(d17, 116, 0, context.getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
        }
        if (c01.ia.A(f9Var)) {
            menu.clear();
        }
        if (!dVar.F()) {
            menu.c(d17, 100, 0, context.getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
    }

    @Override // ze5.w8
    public com.tencent.mm.mvvm.MvvmView d0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        int i17 = q31.r.f359919c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((q31.t) ((q31.r) c17)).Ai();
        com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView = new com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView(context, null, 0, 6, null);
        markdownNativeMvvmView.setBackgroundResource(com.tencent.mm.R.drawable.bzp);
        markdownNativeMvvmView.setLayoutParams(new android.widget.FrameLayout.LayoutParams((int) (com.tencent.mm.ui.gk.b() * e06.p.e(0.875f, 0.0f, 1.0f)), -2));
        markdownNativeMvvmView.setPadding(i65.a.b(context, 18), i65.a.b(context, 10), i65.a.b(context, 12), i65.a.b(context, 10));
        markdownNativeMvvmView.setOnInteractButtonClickListener(new ze5.v7(this, markdownNativeMvvmView));
        return markdownNativeMvvmView;
    }

    @Override // ze5.w8
    public java.util.List g0(ze5.n8 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        return kz5.b0.c(ze5.y8.a(ze5.x7.f472298d, new ze5.c8(this), ze5.d8.f471884d));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0209 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f9  */
    @Override // ze5.w8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h0(ze5.n8 r19, yb5.d r20, com.tencent.mm.storage.f9 r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.j8.h0(ze5.n8, yb5.d, com.tencent.mm.storage.f9, java.lang.String):void");
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public com.tencent.mm.storage.a9 i(com.tencent.mm.storage.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return new ze5.w7(this, f9Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007e A[Catch: Exception -> 0x009a, TRY_LEAVE, TryCatch #4 {Exception -> 0x009a, blocks: (B:11:0x0054, B:14:0x0061, B:16:0x006a, B:18:0x0072, B:23:0x007e), top: B:10:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0133  */
    @Override // ze5.w8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q31.p i0(yb5.d r30, rd5.d r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.j8.i0(yb5.d, rd5.d, java.lang.String):q31.p");
    }

    public final boolean m0(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return false;
        }
        try {
            dh0.j jVar = (dh0.j) i95.n0.c(dh0.j.class);
            if (jVar == null) {
                return false;
            }
            java.lang.String Q0 = f9Var.Q0();
            if (Q0 == null) {
                Q0 = "";
            }
            return ((eh0.o) jVar).Ui(Q0, f9Var.I0());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemMarkdownMvvm", "[STREAM_DIFF] checkIsStreaming failed: " + e17.getMessage());
            return false;
        }
    }

    public final void n0(long j17, java.lang.String callBackBuf, java.lang.String str, com.tencent.mm.ui.chatting.viewitems.mvvmview.MarkdownNativeMvvmView markdownNativeMvvmView, v11.h hVar) {
        df5.l lVar = markdownNativeMvvmView.f204652p;
        if (lVar == null) {
            kotlin.jvm.internal.o.o("interactOptionsView");
            throw null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WeClawCallbackManager", "setPendingCallback: msgSvrId=%d", java.lang.Long.valueOf(j17));
        qy4.e.f367787a = j17;
        lVar.postDelayed(lVar.f232161q, 30000L);
        try {
            kotlin.jvm.internal.o.g(callBackBuf, "callBackBuf");
            r45.us usVar = new r45.us();
            usVar.f387606d = j17;
            usVar.f387607e = callBackBuf;
            com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
            lVar2.f70667d = 7427;
            lVar2.f70666c = "/cgi-bin/micromsg-bin/callbackbuttonclick";
            lVar2.f70664a = usVar;
            lVar2.f70665b = new r45.vs();
            com.tencent.mm.modelbase.o a17 = lVar2.a();
            com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
            iVar.p(a17);
            iVar.l().K(new ze5.i8(markdownNativeMvvmView));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingItemMarkdownMvvm", e17, "sendCallbackButtonClick error", new java.lang.Object[0]);
            df5.l lVar3 = markdownNativeMvvmView.f204652p;
            if (lVar3 != null) {
                lVar3.d();
            } else {
                kotlin.jvm.internal.o.o("interactOptionsView");
                throw null;
            }
        }
    }
}
