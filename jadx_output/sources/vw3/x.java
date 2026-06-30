package vw3;

/* loaded from: classes3.dex */
public final class x implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI f441173d;

    public x(com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI repairerBlockDetectUI) {
        this.f441173d = repairerBlockDetectUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI repairerBlockDetectUI = this.f441173d;
        android.content.res.Resources resources = repairerBlockDetectUI.getContext().getResources();
        g4Var.j(1, resources != null ? resources.getString(com.tencent.mm.R.string.f490559yh) : null, com.tencent.mm.R.raw.icons_filled_share, i65.a.d(repairerBlockDetectUI, com.tencent.mm.R.color.f478502m), false);
    }
}
