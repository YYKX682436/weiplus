package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class ij extends com.tencent.mm.ui.chatting.component.a implements yn.e {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.hj f199233e;

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        if (c01.e2.L(this.f198580d.x())) {
            java.util.HashMap hashMap = (java.util.HashMap) this.f198580d.g().getIntent().getSerializableExtra("key_red_packet_preview_extraInfo");
            ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).Ai(this.f198580d.g(), hashMap, new com.tencent.mm.ui.chatting.component.fj(this));
            gb3.n.f270031a = java.util.UUID.randomUUID().toString();
            gb3.n.f270032b = android.os.SystemClock.elapsedRealtime() / 1000;
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).getClass();
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).getClass();
        com.tencent.mm.plugin.luckymoney.model.z3.f145735a = null;
        com.tencent.mm.plugin.luckymoney.model.i iVar = com.tencent.mm.plugin.luckymoney.model.z3.f145736b;
        if (iVar != null) {
            iVar.j();
            com.tencent.mm.plugin.luckymoney.model.z3.f145736b = null;
        }
        gb3.n.a(3);
        gb3.n.f270031a = null;
        gb3.n.f270033c = null;
        gb3.n.f270032b = -1L;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        ((pg0.a3) ((qg0.b0) i95.n0.c(qg0.b0.class))).getClass();
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).getClass();
        com.tencent.mm.plugin.luckymoney.model.z3.f145735a = null;
        com.tencent.mm.plugin.luckymoney.model.i iVar = com.tencent.mm.plugin.luckymoney.model.z3.f145736b;
        if (iVar != null) {
            iVar.j();
            com.tencent.mm.plugin.luckymoney.model.z3.f145736b = null;
        }
        gb3.n.a(3);
        gb3.n.f270031a = null;
        gb3.n.f270033c = null;
        gb3.n.f270032b = -1L;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        com.tencent.mars.xlog.Log.i("RedPacketPreviewComponent", "onChattingExitAnimStart");
        com.tencent.mm.ui.chatting.component.hj hjVar = this.f199233e;
        if (hjVar != null) {
            hjVar.b();
            java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
            if (k17 == null || k17.get() == null || k17.get() == null) {
                return;
            }
            try {
                if (((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).aj()) {
                    java.lang.Class<?> cls = ((android.app.Activity) k17.get()).getClass();
                    com.tencent.mm.plugin.luckymoney.ui.zd zdVar = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI.Q1;
                    if (cls == com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI.class) {
                        ((android.app.Activity) k17.get()).finish();
                    }
                } else {
                    java.lang.Class<?> cls2 = ((android.app.Activity) k17.get()).getClass();
                    int i17 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI.L1;
                    if (cls2 == com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI.class) {
                        ((android.app.Activity) k17.get()).finish();
                    }
                }
            } catch (java.lang.ClassNotFoundException unused) {
                com.tencent.mars.xlog.Log.i("RedPacketPreviewComponent", "onChattingExitAnimStart throw exception");
            }
        }
    }
}
