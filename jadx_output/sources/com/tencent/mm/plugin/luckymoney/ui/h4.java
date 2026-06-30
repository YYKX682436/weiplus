package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class h4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.item.d f146977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyExclusiveSelectContactUI f146978e;

    public h4(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyExclusiveSelectContactUI luckyMoneyExclusiveSelectContactUI, com.tencent.mm.ui.contact.item.d dVar) {
        this.f146978e = luckyMoneyExclusiveSelectContactUI;
        this.f146977d = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str = this.f146977d.f206850s;
        int i18 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyExclusiveSelectContactUI.f146116J;
        this.f146978e.w7(str);
    }
}
