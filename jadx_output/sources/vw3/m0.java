package vw3;

/* loaded from: classes.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFileListUI f441028d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI) {
        super(0);
        this.f441028d = repairerFileListUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.repairer.ui.RepairerFileListUI repairerFileListUI = this.f441028d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = repairerFileListUI.e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(repairerFileListUI);
        e4Var.f211776c = "压缩失败";
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
