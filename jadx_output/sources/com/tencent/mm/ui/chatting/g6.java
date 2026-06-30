package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class g6 extends com.tencent.mm.ui.chatting.b6 {
    @Override // com.tencent.mm.ui.chatting.b6
    public void a(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        int i17 = erVar.f203916l;
        if (i17 != 0) {
            qk.v vVar = new qk.v();
            java.lang.String x17 = dVar.x();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            vVar.f364039s = x17;
            java.lang.String str = erVar.f203926v;
            if (str == null) {
                str = "";
            }
            vVar.f364040t = str;
            vVar.f364027g = com.tencent.mm.sdk.platformtools.t8.q1(java.lang.Integer.valueOf(i17));
            java.lang.String str2 = erVar.f203917m;
            if (str2 == null) {
                str2 = "";
            }
            vVar.f364030j = str2;
            java.lang.String str3 = erVar.f203918n;
            vVar.f364036p = str3 != null ? str3 : "";
            vVar.f364155a = 22;
            vVar.f364035o = true;
            vVar.f364156b = true;
            vVar.f364043w = true;
            com.tencent.mm.feature.emoji.api.q6 q6Var = (com.tencent.mm.feature.emoji.api.q6) i95.n0.c(com.tencent.mm.feature.emoji.api.q6.class);
            if (q6Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.DesignerClickListener", "emoticon page service not found");
            } else {
                ((com.tencent.mm.feature.emoji.h4) q6Var).wi(dVar.g(), vVar);
            }
        }
    }
}
