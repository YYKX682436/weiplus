package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class dk implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI f146847d;

    public dk(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI) {
        this.f146847d = luckyMoneyNotHookReceiveUI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ye I;
        java.util.LinkedList linkedList;
        int type = m1Var.getType();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((type == 697) && (m1Var instanceof z12.b)) {
            z12.b bVar = (z12.b) m1Var;
            if (i17 != 0 || i18 != 0 || (I = ((z12.h) bVar).I()) == null || (linkedList = I.f391008g) == null || linkedList.size() <= 0) {
                return;
            }
            java.lang.String str2 = ((r45.ri0) linkedList.get(0)).f384886d;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI = this.f146847d;
            if (com.tencent.mm.sdk.platformtools.t8.D0(str2, luckyMoneyNotHookReceiveUI.X.getMd5())) {
                luckyMoneyNotHookReceiveUI.e7(false);
            }
        }
    }
}
