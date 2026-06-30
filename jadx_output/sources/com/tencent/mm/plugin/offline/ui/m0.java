package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class m0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.a1 f152672d;

    public m0(com.tencent.mm.plugin.offline.ui.a1 a1Var) {
        this.f152672d = a1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f152672d.f152577a.finish();
    }
}
