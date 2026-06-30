package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class qc implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderPostRouterUI f129732d;

    public qc(com.tencent.mm.plugin.finder.ui.FinderPostRouterUI finderPostRouterUI) {
        this.f129732d = finderPostRouterUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mm.plugin.finder.ui.FinderPostRouterUI finderPostRouterUI = this.f129732d;
        finderPostRouterUI.finish();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        androidx.appcompat.app.AppCompatActivity context = finderPostRouterUI.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
    }
}
