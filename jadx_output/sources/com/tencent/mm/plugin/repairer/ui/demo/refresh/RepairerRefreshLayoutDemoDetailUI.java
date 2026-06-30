package com.tencent.mm.plugin.repairer.ui.demo.refresh;

@db5.a(1)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/refresh/RepairerRefreshLayoutDemoDetailUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes15.dex */
public final class RepairerRefreshLayoutDemoDetailUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {

    /* renamed from: d, reason: collision with root package name */
    public int f158076d;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cf8;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        androidx.fragment.app.Fragment demoOneFragment;
        super.onCreate(bundle);
        this.f158076d = getIntent().getIntExtra("KEY_SHOW_TYPE", 0);
        androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
        kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
        switch (this.f158076d) {
            case 1:
                setMMTitle("RecyclerView Demo");
                demoOneFragment = new com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoOneFragment();
                break;
            case 2:
                setMMTitle("NestScrollView Demo");
                demoOneFragment = new com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoTwoFragment();
                break;
            case 3:
                setMMTitle("CoordinatorLayout Demo");
                demoOneFragment = new com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoThreeFragment();
                break;
            case 4:
                setMMTitle("ListView Demo");
                demoOneFragment = new com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoFourFragment();
                break;
            case 5:
                setMMTitle("Stagger Layout Demo");
                demoOneFragment = new com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoFiveFragment();
                break;
            case 6:
                setMMTitle("PageSnapHelper Demo");
                demoOneFragment = new com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSixFragment();
                break;
            case 7:
                setMMTitle("NoMoreData Demo");
                demoOneFragment = new com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoSevFragment();
                break;
            case 8:
                setMMTitle("属性设置 Demo");
                demoOneFragment = new com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoEightFragment();
                break;
            case 9:
                setMMTitle("横向滑动 Demo");
                demoOneFragment = new com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoNineFragment();
                break;
            default:
                new com.tencent.mm.plugin.repairer.ui.demo.refresh.fragment.DemoOneFragment();
                demoOneFragment = new androidx.fragment.app.Fragment();
                break;
        }
        beginTransaction.h(com.tencent.mm.R.id.jmc, demoOneFragment, null, 1);
        beginTransaction.d();
    }
}
