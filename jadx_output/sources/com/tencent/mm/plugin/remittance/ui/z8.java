package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class z8 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158067a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f158068b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI f158069c;

    public z8(com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI selectRemittanceContactUI, java.lang.String str, java.util.ArrayList arrayList) {
        this.f158069c = selectRemittanceContactUI;
        this.f158067a = str;
        this.f158068b = arrayList;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        if (!z17) {
            com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI.w7(13);
            return;
        }
        int i18 = com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI.I;
        com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI selectRemittanceContactUI = this.f158069c;
        selectRemittanceContactUI.getClass();
        com.tencent.mm.autogen.events.LaunchAAEvent launchAAEvent = new com.tencent.mm.autogen.events.LaunchAAEvent();
        am.mi miVar = launchAAEvent.f54463g;
        miVar.f7348a = selectRemittanceContactUI;
        miVar.f7349b = this.f158068b;
        miVar.f7350c = this.f158067a;
        launchAAEvent.e();
        com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI.w7(12);
    }
}
