package vw3;

/* loaded from: classes.dex */
public final class s5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerShowMsgXmlUI f441109d;

    public s5(com.tencent.mm.plugin.repairer.ui.RepairerShowMsgXmlUI repairerShowMsgXmlUI) {
        this.f441109d = repairerShowMsgXmlUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.repairer.ui.RepairerShowMsgXmlUI repairerShowMsgXmlUI = this.f441109d;
        repairerShowMsgXmlUI.getContext();
        android.content.res.Resources resources = repairerShowMsgXmlUI.getContext().getResources();
        g4Var.j(0, resources != null ? resources.getString(com.tencent.mm.R.string.f490559yh) : null, com.tencent.mm.R.raw.icons_filled_share, i65.a.d(repairerShowMsgXmlUI.getContext(), com.tencent.mm.R.color.f478502m), false);
        android.content.res.Resources resources2 = repairerShowMsgXmlUI.getContext().getResources();
        g4Var.l(1, resources2 != null ? resources2.getString(com.tencent.mm.R.string.f490359sr) : null, com.tencent.mm.R.raw.icons_filled_copy, false);
    }
}
