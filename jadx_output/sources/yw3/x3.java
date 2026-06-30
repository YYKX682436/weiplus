package yw3;

/* loaded from: classes.dex */
public final class x3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI f466928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI repairerMvvmDBDemoUI) {
        super(0);
        this.f466928d = repairerMvvmDBDemoUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.repairer.ui.demo.RepairerMvvmDBDemoUI repairerMvvmDBDemoUI = this.f466928d;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) repairerMvvmDBDemoUI.findViewById(com.tencent.mm.R.id.knc);
        repairerMvvmDBDemoUI.e = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter((xm3.t0) ((jz5.n) repairerMvvmDBDemoUI.g).getValue());
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = repairerMvvmDBDemoUI.e;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(repairerMvvmDBDemoUI));
        }
        return jz5.f0.f302826a;
    }
}
