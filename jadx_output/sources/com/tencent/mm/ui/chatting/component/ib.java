package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.r0.class)
/* loaded from: classes8.dex */
public final class ib extends com.tencent.mm.ui.chatting.component.a implements sb5.r0, com.tencent.mm.pluginsdk.ui.chat.d5 {

    /* renamed from: e, reason: collision with root package name */
    public yb5.d f199217e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.chat.ChatFooter f199218f;

    /* renamed from: g, reason: collision with root package name */
    public int f199219g = -1;

    /* renamed from: h, reason: collision with root package name */
    public gp1.v f199220h;

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f199218f;
        if (chatFooter != null) {
            chatFooter.setOnFooterPanelSwitchListener(null);
        }
        this.f199218f = null;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
        this.f199217e = dVar;
        this.f199220h = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment;
        android.os.Bundle arguments;
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment2;
        android.os.Bundle arguments2;
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment3;
        android.os.Bundle arguments3;
        gp1.v vVar = this.f199220h;
        if (vVar != null) {
            vVar.Q(true);
        }
        gp1.v vVar2 = this.f199220h;
        if (vVar2 != null) {
            vVar2.s(131072);
        }
        yb5.d dVar = this.f199217e;
        int i17 = (dVar == null || (baseChattingUIFragment3 = dVar.f460717l) == null || (arguments3 = baseChattingUIFragment3.getArguments()) == null) ? 0 : arguments3.getInt("chat_from_scene", 0);
        yb5.d dVar2 = this.f199217e;
        boolean z17 = (dVar2 == null || (baseChattingUIFragment2 = dVar2.f460717l) == null || (arguments2 = baseChattingUIFragment2.getArguments()) == null) ? false : arguments2.getBoolean("key_can_show_message_float_ball", false);
        gp1.v vVar3 = this.f199220h;
        if (vVar3 != null && vVar3.j()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FloatBallComponent", "onChattingResume current is in QBFileViewPage");
        }
        if (i17 == 1 && z17) {
            gp1.v vVar4 = this.f199220h;
            if ((vVar4 == null || vVar4.j()) ? false : true) {
                gp1.v vVar5 = this.f199220h;
                if (vVar5 != null) {
                    vVar5.o(true);
                }
                gp1.v vVar6 = this.f199220h;
                if (vVar6 != null) {
                    vVar6.E(java.lang.System.currentTimeMillis());
                }
                yb5.d dVar3 = this.f199217e;
                if (dVar3 != null && (baseChattingUIFragment = dVar3.f460717l) != null && (arguments = baseChattingUIFragment.getArguments()) != null) {
                    arguments.putBoolean("key_can_show_message_float_ball", false);
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                gp1.v vVar7 = this.f199220h;
                if (vVar7 != null) {
                    vVar7.z(currentTimeMillis, new com.tencent.mm.ui.chatting.component.hb(i17, z17, currentTimeMillis));
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        gp1.v vVar = this.f199220h;
        if (vVar != null) {
            vVar.Q(false);
        }
        gp1.v vVar2 = this.f199220h;
        if (vVar2 != null) {
            vVar2.i0(131072);
        }
    }
}
