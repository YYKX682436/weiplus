package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class w8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f158021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI f158022f;

    public w8(com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI selectRemittanceContactUI, java.lang.String str, java.util.ArrayList arrayList) {
        this.f158022f = selectRemittanceContactUI;
        this.f158020d = str;
        this.f158021e = arrayList;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectRemittanceContactUI", "onDialogClick() ok");
        int i18 = com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI.I;
        com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI selectRemittanceContactUI = this.f158022f;
        selectRemittanceContactUI.getClass();
        com.tencent.mm.autogen.events.LaunchAAEvent launchAAEvent = new com.tencent.mm.autogen.events.LaunchAAEvent();
        am.mi miVar = launchAAEvent.f54463g;
        miVar.f7348a = selectRemittanceContactUI;
        miVar.f7349b = this.f158021e;
        miVar.f7350c = this.f158020d;
        launchAAEvent.e();
    }
}
