package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class p2 implements com.tencent.mm.pluginsdk.ui.chat.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190553a;

    public p2(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190553a = chatFooter;
    }

    public void a() {
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var;
        int c17 = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigAttachVoiceInput());
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190553a;
        if (c17 == 1 && (y4Var = chatFooter.f189955a3) != null) {
            if (!(!((com.tencent.mm.ui.chatting.component.y8) ((sb5.i0) y4Var.a().f460708c.a(sb5.i0.class))).A0().i("show_dialog_guide", false))) {
                ((com.tencent.mm.ui.chatting.component.y8) ((sb5.i0) chatFooter.f189955a3.a().f460708c.a(sb5.i0.class))).O0(5);
                return;
            }
            ((com.tencent.mm.ui.chatting.component.y8) ((sb5.i0) chatFooter.f189955a3.a().f460708c.a(sb5.i0.class))).A0().G("show_dialog_guide", true);
            final com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(chatFooter.Z2, 2, 0);
            z2Var.y(chatFooter.getResources().getString(com.tencent.mm.R.string.f490454vi));
            z2Var.F = new com.tencent.mm.ui.widget.dialog.p3() { // from class: com.tencent.mm.pluginsdk.ui.chat.p2$$a
                @Override // com.tencent.mm.ui.widget.dialog.p3
                public final void a() {
                    com.tencent.mm.pluginsdk.ui.chat.p2 p2Var = com.tencent.mm.pluginsdk.ui.chat.p2.this;
                    p2Var.getClass();
                    z2Var.B();
                    ((com.tencent.mm.ui.chatting.component.y8) ((sb5.i0) p2Var.f190553a.f189955a3.a().f460708c.a(sb5.i0.class))).O0(5);
                }
            };
            android.view.View inflate = android.view.LayoutInflater.from(chatFooter.Z2).inflate(com.tencent.mm.R.layout.e47, (android.view.ViewGroup) null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.vgk);
            com.tencent.mm.ui.dl.i(textView.getPaint());
            textView.setTextSize(0, i65.a.f(chatFooter.Z2, com.tencent.mm.R.dimen.f479575r));
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o_w);
            com.tencent.mm.ui.dl.i(textView2.getPaint());
            textView2.setTextSize(0, i65.a.f(chatFooter.Z2, com.tencent.mm.R.dimen.f479575r));
            z2Var.j(inflate);
            z2Var.x(1);
            z2Var.C();
            return;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.app.Activity activity = chatFooter.Z2;
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(activity, "android.permission.RECORD_AUDIO", 80, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "summerper checkPermission checkmicrophone[%s], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), chatFooter.Z2);
        if (a17) {
            int n17 = c01.d9.e().n();
            if (n17 != 4 && n17 != 6) {
                com.tencent.mm.ui.widget.dialog.j0 j0Var = chatFooter.E;
                if (j0Var == null || !j0Var.isShowing()) {
                    chatFooter.E = db5.e1.i(chatFooter.getContext(), com.tencent.mm.R.string.f490500wu, com.tencent.mm.R.string.f490573yv);
                    return;
                }
                return;
            }
            if (iq.b.C(chatFooter.getContext()) || iq.b.v(chatFooter.getContext()) || iq.b.e(chatFooter.getContext()) || iq.b.z(chatFooter.getContext())) {
                return;
            }
            chatFooter.V1 = 1;
            chatFooter.f190039p.setVisibility(8);
            chatFooter.Q1(com.tencent.mm.R.drawable.f481237o3);
            nr.b.f339030a.a();
            chatFooter.E(3, false, -1);
            chatFooter.U0(false);
            int i17 = com.tencent.mm.sdk.platformtools.d2.i(chatFooter.getContext(), chatFooter.getKeyBordHeightPX(), chatFooter.f190042p2) + chatFooter.f190059s.getHeight() + chatFooter.f190083w.getHeight();
            if (chatFooter.f189987g == null) {
                com.tencent.mm.pluginsdk.ui.chat.ib ibVar = new com.tencent.mm.pluginsdk.ui.chat.ib(chatFooter.getContext(), false, null);
                chatFooter.f189987g = ibVar;
                chatFooter.addView(ibVar, new android.view.ViewGroup.LayoutParams(-1, i17));
                chatFooter.f189987g.setCallback(new com.tencent.mm.pluginsdk.ui.chat.s2(chatFooter));
            }
            android.view.ViewGroup.LayoutParams layoutParams = chatFooter.f189987g.getLayoutParams();
            if (layoutParams != null && layoutParams.height != i17) {
                layoutParams.height = i17;
                chatFooter.f189987g.setLayoutParams(layoutParams);
            }
            chatFooter.f189987g.k(true);
            chatFooter.f189987g.h();
            chatFooter.f189987g.setToUser(chatFooter.f190017l3);
            com.tencent.mm.pluginsdk.ui.chat.y4 y4Var2 = chatFooter.f189955a3;
            if (y4Var2 != null) {
                chatFooter.f189987g.setChatUsername(y4Var2.c());
            }
            chatFooter.f189987g.setVisibility(0);
            chatFooter.f189987g.setTranslationY(i17);
            chatFooter.f189987g.animate().cancel();
            chatFooter.f189987g.animate().translationY(0.0f).withEndAction(new com.tencent.mm.pluginsdk.ui.chat.u2(chatFooter)).start();
            chatFooter.Z1 = true;
            com.tencent.mm.pluginsdk.ui.chat.y4 y4Var3 = chatFooter.f189955a3;
            if (y4Var3 == null || y4Var3.a() == null || chatFooter.f189955a3.a().f460708c.a(yn.i.class) == null) {
                return;
            }
            yn.i iVar = (yn.i) chatFooter.f189955a3.a().f460708c.a(yn.i.class);
            int i18 = chatFooter.f189970d2;
            boolean z18 = chatFooter.Z1;
            java.util.Iterator it = ((com.tencent.mm.ui.chatting.component.w3) iVar).f200149d.iterator();
            while (it.hasNext()) {
                ((yn.h) it.next()).k(i18, z18);
            }
        }
    }
}
