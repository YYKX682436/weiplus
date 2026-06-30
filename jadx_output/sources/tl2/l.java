package tl2;

/* loaded from: classes8.dex */
public final class l implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl2.u f420256d;

    public l(tl2.u uVar) {
        this.f420256d = uVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        tl2.u uVar = this.f420256d;
        android.app.Activity activity = uVar.f420274d;
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) activity : null;
        if (mMFinderUI != null) {
            mMFinderUI.removeOnConfigurationChangedListener(uVar.f420284q);
        }
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).wk(2);
    }
}
