package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class n0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.a1 f152677d;

    public n0(com.tencent.mm.plugin.offline.ui.a1 a1Var) {
        this.f152677d = a1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().l(this.f152677d.f152577a, new android.content.Intent());
    }
}
