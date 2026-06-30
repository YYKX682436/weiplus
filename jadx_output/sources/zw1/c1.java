package zw1;

/* loaded from: classes5.dex */
public class c1 implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476593d;

    public c1(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI) {
        this.f476593d = collectMainUI;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        boolean z18 = i17 > 0;
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI = this.f476593d;
        collectMainUI.f96389a2 = z18;
        com.tencent.mm.ui.widget.dialog.z2 z2Var = collectMainUI.P1;
        if (z2Var == null || !z2Var.h()) {
            return;
        }
        int i18 = com.tencent.mm.ui.bl.b(collectMainUI.getContext()).y;
        if (i17 > 0) {
            if (i17 * 2 < i18) {
                collectMainUI.P1.u((i18 - i65.a.b(collectMainUI.getContext(), 56)) - i17);
            }
        } else if (collectMainUI.f96390b2) {
            collectMainUI.P1.u(collectMainUI.Z1);
        } else {
            collectMainUI.P1.u(collectMainUI.Y1);
        }
    }
}
