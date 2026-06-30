package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes3.dex */
public class y0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI f152227d;

    public y0(com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI nearbySayHiListUI) {
        this.f152227d = nearbySayHiListUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        gm0.j1.u().c().w(4104, java.lang.Boolean.TRUE);
        com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI nearbySayHiListUI = this.f152227d;
        nearbySayHiListUI.setResult(-1);
        nearbySayHiListUI.finish();
    }
}
