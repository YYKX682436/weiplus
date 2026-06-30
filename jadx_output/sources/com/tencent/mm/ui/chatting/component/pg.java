package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.b1.class)
/* loaded from: classes5.dex */
public class pg extends com.tencent.mm.ui.chatting.component.a implements sb5.b1 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f199710e = false;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f199711f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f199712g = false;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f199713h = null;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f199714i = new com.tencent.mm.ui.chatting.component.ng(this);

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f199715m = new com.tencent.mm.ui.chatting.component.og(this);

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f199716n;

    public pg() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f199716n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LbsSayHiEvent>(a0Var) { // from class: com.tencent.mm.ui.chatting.component.LbsComponent$3
            {
                this.__eventId = -772738789;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LbsSayHiEvent lbsSayHiEvent) {
                java.lang.String str;
                com.tencent.mm.autogen.events.LbsSayHiEvent lbsSayHiEvent2 = lbsSayHiEvent;
                if (lbsSayHiEvent2 instanceof com.tencent.mm.autogen.events.LbsSayHiEvent) {
                    com.tencent.mm.ui.chatting.component.pg pgVar = com.tencent.mm.ui.chatting.component.pg.this;
                    if (pgVar.f199710e && ((str = lbsSayHiEvent2.f54464g.f7426a) == null || str.equals(pgVar.f199713h))) {
                        int i17 = lbsSayHiEvent2.f54464g.f7427b;
                        if (i17 == 1) {
                            com.tencent.mm.sdk.platformtools.u3.h(pgVar.f199714i);
                        } else if (i17 == 2) {
                            pgVar.f199710e = false;
                            com.tencent.mm.sdk.platformtools.u3.h(pgVar.f199715m);
                        }
                    }
                }
                return false;
            }
        };
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        this.f199716n.alive();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        this.f199716n.dead();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        this.f199716n.dead();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        this.f199710e = this.f198580d.f460717l.getBooleanExtra("lbs_mode", false).booleanValue();
        this.f199713h = com.tencent.mm.sdk.platformtools.t8.K0(this.f198580d.u().J0()) ? this.f198580d.x() : this.f198580d.u().J0();
        this.f199711f = this.f198580d.f460717l.getStringExtra("lbs_ticket");
    }

    public java.lang.String m0(java.lang.String str) {
        if (!this.f199710e) {
            return str;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.LbsComponent", "[oneliang]encrypt:" + this.f199713h + ",raw:" + this.f198580d.x());
        return com.tencent.mm.sdk.platformtools.t8.K0(this.f199713h) ? this.f198580d.x() : this.f199713h;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        com.tencent.mm.sdk.platformtools.u3.l(this.f199714i);
        com.tencent.mm.sdk.platformtools.u3.l(this.f199715m);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        if (this.f199710e) {
            com.tencent.mm.ui.chatting.component.jb jbVar = (com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198580d.f460708c.a(sb5.s0.class));
            jbVar.f199263e.setLbsMode(true);
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = jbVar.f199263e;
            android.widget.ImageButton imageButton = chatFooter.f190103z;
            if (imageButton != null) {
                imageButton.setVisibility(8);
            }
            chatFooter.r1(false);
            com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = jbVar.f199263e.f190047q;
            if (weImageButton != null) {
                weImageButton.setVisibility(8);
            }
        }
    }
}
