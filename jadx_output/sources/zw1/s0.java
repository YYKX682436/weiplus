package zw1;

/* loaded from: classes5.dex */
public class s0 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476785a;

    public s0(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI) {
        this.f476785a = collectMainUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI = this.f476785a;
        com.tencent.mm.plugin.collect.ui.CollectMainUI.X6(collectMainUI, collectMainUI.S1.f382536g);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = collectMainUI.P1;
        if (z2Var != null && z2Var.h()) {
            collectMainUI.P1.B();
            collectMainUI.P1 = null;
        }
        new android.os.Handler().postDelayed(new zw1.r0(this), 200L);
    }
}
