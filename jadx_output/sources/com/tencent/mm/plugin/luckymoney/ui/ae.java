package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class ae implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI f146708d;

    public ae(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI) {
        this.f146708d = luckyMoneyNewReceiveUI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public final void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        int type = m1Var.getType();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((type == 697) && ((z17 = m1Var instanceof z12.b))) {
            z12.b bVar = z17 ? (z12.b) m1Var : null;
            if (i17 == 0 && i18 == 0) {
                r45.ye I = bVar != null ? ((z12.h) bVar).I() : null;
                if ((I != null ? I.f391008g : null) != null) {
                    java.util.LinkedList linkedList = I.f391008g;
                    if ((linkedList != null ? linkedList.size() : 0) <= 0) {
                        return;
                    }
                    java.lang.String str2 = ((r45.ri0) I.f391008g.get(0)).f384886d;
                    com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI = this.f146708d;
                    com.tencent.mm.api.IEmojiInfo iEmojiInfo = luckyMoneyNewReceiveUI.Z;
                    if (com.tencent.mm.sdk.platformtools.t8.D0(str2, iEmojiInfo != null ? iEmojiInfo.getMd5() : null)) {
                        luckyMoneyNewReceiveUI.g7(false);
                    }
                }
            }
        }
    }
}
