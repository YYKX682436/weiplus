package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class k6 extends com.tencent.mm.ui.chatting.b6 {
    @Override // com.tencent.mm.ui.chatting.b6
    public void a(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        java.lang.String str = erVar.f203920p;
        java.lang.String str2 = erVar.f203921q;
        java.lang.String str3 = erVar.f203922r;
        java.lang.String str4 = erVar.f203925u;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmotionSetClickListener", "setKey is null.");
            return;
        }
        r45.vd0 vd0Var = new r45.vd0();
        vd0Var.f388134d = str4;
        vd0Var.f388136f = str;
        vd0Var.f388137g = str2;
        vd0Var.f388135e = str3;
        qk.a0 a0Var = new qk.a0(vd0Var);
        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
        if (p6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EmotionSetClickListener", "unable to get emoticon liteapp feature service");
        } else {
            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(dVar.g(), a0Var);
        }
    }
}
