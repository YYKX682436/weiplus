package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes14.dex */
public class d6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.l6 f142786d;

    public d6(com.tencent.mm.plugin.ipcall.ui.l6 l6Var) {
        this.f142786d = l6Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.ipcall.ui.l6 l6Var = this.f142786d;
        l6Var.f142924w.finish();
        l6Var.f142924w = null;
    }
}
