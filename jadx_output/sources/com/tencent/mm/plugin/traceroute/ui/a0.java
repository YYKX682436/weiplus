package com.tencent.mm.plugin.traceroute.ui;

/* loaded from: classes11.dex */
public class a0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI f175319d;

    public a0(com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI networkDiagnoseUI) {
        this.f175319d = networkDiagnoseUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI networkDiagnoseUI = this.f175319d;
        networkDiagnoseUI.f175316i.d();
        jn4.m mVar = networkDiagnoseUI.f175313f;
        if (mVar != null) {
            mVar.d();
        }
        networkDiagnoseUI.finish();
    }
}
