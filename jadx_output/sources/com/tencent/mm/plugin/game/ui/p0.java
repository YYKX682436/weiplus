package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class p0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.r0 f141702d;

    public p0(com.tencent.mm.plugin.game.ui.r0 r0Var) {
        this.f141702d = r0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f141702d.d();
        dialogInterface.dismiss();
    }
}
