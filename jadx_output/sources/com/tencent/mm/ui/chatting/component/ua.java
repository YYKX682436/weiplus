package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.q0.class)
/* loaded from: classes9.dex */
public class ua extends com.tencent.mm.ui.chatting.component.a implements sb5.q0 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f200061e = false;

    /* renamed from: f, reason: collision with root package name */
    public long[] f200062f = null;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.g4 f200063g = null;

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        com.tencent.mm.ui.chatting.g4 g4Var = this.f200063g;
        if (g4Var != null) {
            yb5.d dVar = g4Var.f200522a;
            sb5.z zVar = (sb5.z) dVar.f460708c.a(sb5.z.class);
            com.tencent.mm.ui.chatting.manager.c cVar = dVar.f460708c;
            ((com.tencent.mm.ui.chatting.component.jk) ((sb5.u1) cVar.a(sb5.u1.class))).p0();
            com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) zVar;
            kVar.V = true;
            kVar.B1 = null;
            kVar.D1 = null;
            kVar.F1 = null;
            kVar.H1 = null;
            kVar.J1 = null;
            kVar.W.clear();
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) cVar.a(sb5.s0.class))).f199263e;
            if (chatFooter != null) {
                chatFooter.setVisibility(8);
            }
            com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) cVar.a(sb5.s0.class))).f199265g;
            if (chatFooterCustom != null) {
                chatFooterCustom.setVisibility(8);
            }
            ((com.tencent.mm.ui.chatting.component.r9) ((sb5.l0) cVar.a(sb5.l0.class))).n0();
            dVar.y();
            ((com.tencent.mm.ui.chatting.component.ro) ((sb5.q2) cVar.a(sb5.q2.class))).y0();
            dVar.X(2, true);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        this.f200061e = this.f198580d.f460717l.getBooleanExtra("expose_edit_mode", false).booleanValue();
        this.f200062f = this.f198580d.f460717l.getArguments().getLongArray("expose_selected_ids");
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        if (this.f200061e && this.f200063g == null) {
            this.f200063g = new com.tencent.mm.ui.chatting.g4(this.f198580d, this.f200062f);
        }
    }
}
