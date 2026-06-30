package zu2;

/* loaded from: classes2.dex */
public final class y implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zu2.a0 f475754d;

    public y(zu2.a0 a0Var) {
        this.f475754d = a0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        cw2.f8 f8Var;
        com.tencent.mm.plugin.finder.viewmodel.component.nb0 nb0Var;
        com.tencent.mm.plugin.finder.ui.qm qmVar = this.f475754d.f475705t;
        if (qmVar == null || (f8Var = qmVar.f106429o) == null || (nb0Var = f8Var.f223700h) == null) {
            return;
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) nb0Var).f7(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }
}
