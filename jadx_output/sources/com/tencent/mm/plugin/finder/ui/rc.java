package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class rc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderPostRouterUI f129775d;

    public rc(com.tencent.mm.plugin.finder.ui.FinderPostRouterUI finderPostRouterUI) {
        this.f129775d = finderPostRouterUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f129775d.finish();
    }
}
