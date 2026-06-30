package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class z2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.d3 f179127d;

    public z2(com.tencent.mm.plugin.wallet.pwd.ui.d3 d3Var) {
        this.f179127d = d3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f179127d.f178989b.f178965n.setCheck(false);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16343, 4);
    }
}
