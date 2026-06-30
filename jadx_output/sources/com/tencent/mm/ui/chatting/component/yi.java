package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.n1.class)
/* loaded from: classes9.dex */
public final class yi extends com.tencent.mm.ui.chatting.component.a implements sb5.n1, com.tencent.mm.sdk.platformtools.f7 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f200325e;

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        this.f200325e = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).ij();
        if (!kotlin.jvm.internal.o.b("gh_3dfda90e39d6", this.f198580d.x()) || this.f200325e) {
            return;
        }
        ct.d3 d3Var = (ct.d3) i95.n0.c(ct.d3.class);
        android.app.Activity g17 = this.f198580d.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        ((com.tencent.mm.ui.feature.api.screenshot.t) d3Var).wi(g17, this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        ct.d3 d3Var = (ct.d3) i95.n0.c(ct.d3.class);
        android.app.Activity g17 = this.f198580d.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        ((com.tencent.mm.ui.feature.api.screenshot.t) d3Var).Bi(g17, this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        ct.d3 d3Var = (ct.d3) i95.n0.c(ct.d3.class);
        android.app.Activity g17 = this.f198580d.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        ((com.tencent.mm.ui.feature.api.screenshot.t) d3Var).Bi(g17, this);
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mm.ui.chatting.viewitems.g0 g0Var;
        com.tencent.mm.ui.chatting.viewitems.a0 a0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.PayTemplateComponent", "onScreenShot");
        if (!kotlin.jvm.internal.o.b("gh_3dfda90e39d6", this.f198580d.x()) || this.f200325e) {
            return;
        }
        int j18 = this.f198580d.j();
        int o17 = this.f198580d.o();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (j18 <= o17) {
            while (true) {
                android.view.View C = this.f198580d.p().C(j18, 0);
                if (C != null && C.getTag() != null) {
                    java.lang.Object tag = C.getTag();
                    if ((tag == null ? true : tag instanceof com.tencent.mm.ui.chatting.viewitems.g0) && (g0Var = (com.tencent.mm.ui.chatting.viewitems.g0) C.getTag()) != null && (a0Var = g0Var.chattingItem) != null && (a0Var instanceof com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate)) {
                        com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate chattingItemDyeingTemplate = (com.tencent.mm.ui.chatting.viewitems.ChattingItemDyeingTemplate) a0Var;
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(chattingItemDyeingTemplate.Q)) {
                            linkedList.add(chattingItemDyeingTemplate.Q);
                        }
                    }
                }
                if (j18 == o17) {
                    break;
                } else {
                    j18++;
                }
            }
        }
        if (linkedList.size() > 0) {
            ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).wi("client_pay_template_page", linkedList, 0);
        }
    }
}
