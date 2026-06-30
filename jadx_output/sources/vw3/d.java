package vw3;

/* loaded from: classes.dex */
public final class d implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.BaseRepairerPrefUI f440919a;

    public d(com.tencent.mm.plugin.repairer.ui.BaseRepairerPrefUI baseRepairerPrefUI) {
        this.f440919a = baseRepairerPrefUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            bm5.o1 o1Var = bm5.o1.f22719a;
            bm5.o1.f22720b.clear();
            com.tencent.mm.sdk.platformtools.o4 o4Var = bm5.o1.f22721c;
            if (o4Var != null) {
                o4Var.e();
            }
            com.tencent.mm.sdk.platformtools.o4 o4Var2 = bm5.o1.f22721c;
            if (o4Var2 != null) {
                o4Var2.d();
            }
            com.tencent.mm.plugin.repairer.ui.RepairerMainUI repairerMainUI = this.f440919a;
            repairerMainUI.getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            repairerMainUI.finish();
        }
    }
}
