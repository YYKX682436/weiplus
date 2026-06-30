package com.tencent.mm.ui.chatting.component;

/* JADX INFO: Access modifiers changed from: package-private */
@yn.c(exportInterface = sb5.j0.class)
/* loaded from: classes11.dex */
public class b9 extends com.tencent.mm.ui.chatting.component.a implements sb5.j0 {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.o4 f198723g;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f198721e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f198722f = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f198724h = false;

    /* renamed from: i, reason: collision with root package name */
    public final l75.q0 f198725i = new com.tencent.mm.ui.chatting.component.c9(this);

    public void C() {
        kr4.e y07;
        java.lang.String stringExtra = this.f198580d.f460717l.getStringExtra("key_w1w_nickname");
        if (stringExtra == null || stringExtra.isEmpty()) {
            gr4.f fVar = (gr4.f) i95.n0.c(gr4.f.class);
            java.lang.String sessionId = this.f198580d.u().d1();
            fr4.g0 g0Var = (fr4.g0) fVar;
            g0Var.getClass();
            kotlin.jvm.internal.o.g(sessionId, "sessionId");
            kr4.n nVar = g0Var.f265824h;
            java.lang.String z07 = nVar != null ? nVar.z0(sessionId) : "";
            if (kotlin.jvm.internal.o.b(z07, "")) {
                stringExtra = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ndd);
                kotlin.jvm.internal.o.f(stringExtra, "getString(...)");
            } else {
                kr4.k kVar = g0Var.f265823g;
                stringExtra = (kVar == null || (y07 = kVar.y0(z07)) == null) ? null : y07.field_nickname;
                if (stringExtra == null) {
                    stringExtra = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ndd);
                    kotlin.jvm.internal.o.f(stringExtra, "getString(...)");
                }
            }
        }
        this.f198580d.f460717l.setMMTitle(stringExtra);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198580d.f460708c.a(sb5.s0.class))).f199263e;
        if (chatFooter == null || !s()) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = chatFooter.getChatFooterPanel();
        if (chatFooterPanel != null) {
            chatFooterPanel.setShowSearch(false);
            chatFooterPanel.j();
        }
        chatFooter.post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.b9$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.ui.chatting.component.b9.this.n0();
            }
        });
    }

    @Override // sb5.j0
    public java.lang.String H() {
        return this.f198722f;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        if (s()) {
            ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).wi(this.f198580d.u().d1());
            ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).Bi().remove(this.f198725i);
            java.lang.String stringExtra = this.f198580d.f460717l.getStringExtra("key_w1w_refer_scene");
            java.lang.String stringExtra2 = this.f198580d.f460717l.getStringExtra("key_w1w_refer_scene_note");
            java.lang.String stringExtra3 = this.f198580d.f460717l.getStringExtra("key_w1w_refer_session_id");
            java.lang.String stringExtra4 = this.f198580d.f460717l.getStringExtra("key_w1w_refer_ext_info");
            if (!s() || this.f198722f == null) {
                return;
            }
            ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).cj(vu4.d.f440296i, stringExtra, stringExtra2, stringExtra3, stringExtra4, this.f198722f, vu4.e.f440307f, "", "", this.f198580d.u().d1(), this.f198724h ? vu4.g.f440324f : vu4.g.f440323e);
        }
    }

    public void m0(int i17) {
        android.view.ViewGroup f17 = this.f198580d.p().f();
        if (!(f17.getTag(com.tencent.mm.R.id.bgd) instanceof java.lang.Integer)) {
            f17.setTag(com.tencent.mm.R.id.bgd, java.lang.Integer.valueOf(i17));
            f17.setPadding(f17.getPaddingLeft(), f17.getPaddingTop() + i17, f17.getPaddingRight(), f17.getPaddingBottom());
            return;
        }
        int intValue = ((java.lang.Integer) f17.getTag(com.tencent.mm.R.id.bgd)).intValue();
        if (i17 != intValue) {
            int i18 = i17 - intValue;
            f17.setTag(com.tencent.mm.R.id.bgd, java.lang.Integer.valueOf(i18));
            f17.setPadding(f17.getPaddingLeft(), f17.getPaddingTop() + i18, f17.getPaddingRight(), f17.getPaddingBottom());
        }
    }

    public final void n0() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198580d.f460708c.a(sb5.s0.class))).f199263e;
        boolean booleanValue = this.f198580d.f460717l.getBooleanExtra("key_w1w_need_choose_id", false).booleanValue();
        java.lang.String t17 = this.f198580d.t();
        boolean z17 = this.f198580d.f460717l.getBooleanExtra("key_w1w_avatar_style", false).booleanValue() || com.tencent.mm.storage.z3.K4(t17);
        if (chatFooter == null || !s()) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = chatFooter.getChatFooterPanel();
        if (chatFooterPanel != null) {
            chatFooterPanel.setShowSearch(false);
            chatFooterPanel.j();
        }
        java.lang.String str = ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).f265825i.field_nickname;
        if (str == null) {
            str = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ndd);
            kotlin.jvm.internal.o.f(str, "getString(...)");
        }
        if (booleanValue) {
            chatFooter.setChangeIdentityLayoutEnable(this.f198580d.u().d1());
            chatFooter.o1(t17, java.lang.Boolean.valueOf(z17), this.f198580d.g().getString(com.tencent.mm.R.string.f492017ey1, str), java.lang.Boolean.valueOf(booleanValue));
            return;
        }
        chatFooter.m1(t17, java.lang.Boolean.valueOf(z17), str);
        android.view.ViewGroup viewGroup = chatFooter.F1;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(null);
        }
    }

    @Override // sb5.j0
    public boolean s() {
        return com.tencent.mm.storage.z3.J4(this.f198580d.x());
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        if (s()) {
            java.lang.String stringExtra = this.f198580d.f460717l.getStringExtra("key_w1w_refer_scene");
            java.lang.String stringExtra2 = this.f198580d.f460717l.getStringExtra("key_w1w_refer_scene_note");
            java.lang.String stringExtra3 = this.f198580d.f460717l.getStringExtra("key_w1w_refer_session_id");
            java.lang.String stringExtra4 = this.f198580d.f460717l.getStringExtra("key_w1w_refer_ext_info");
            boolean booleanValue = this.f198580d.f460717l.getBooleanExtra("key_w1w_conv_is_hello", false).booleanValue();
            this.f198724h = booleanValue;
            vu4.g gVar = booleanValue ? vu4.g.f440324f : vu4.g.f440323e;
            gr4.f fVar = (gr4.f) i95.n0.c(gr4.f.class);
            ((fr4.g0) fVar).cj(vu4.d.f440292e, stringExtra, stringExtra2, stringExtra3, stringExtra4, this.f198722f, vu4.e.f440307f, mr4.a.a("message_input:message_input") + "$" + mr4.a.a("message_avatar:message_avatar") + "$" + mr4.a.a("more:more"), "", this.f198580d.x(), gVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z() {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.b9.z():void");
    }
}
