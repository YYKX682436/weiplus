package com.tencent.mm.ui.container;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/container/MMCommonFullScreenActivity;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "common-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class MMCommonFullScreenActivity extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return 0;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity
    public boolean isContentAtTop() {
        for (pf5.g gVar : com.tencent.mm.ui.component.UIComponentActivity.activeUIComponents$default(this, false, 1, null)) {
            if ((gVar instanceof wm3.m) && ((wm3.m) gVar).i()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f482435ei);
        int i17 = com.tencent.mm.ui.bl.i(getContext(), -1);
        if (findViewById != null) {
            findViewById.setPadding(0, i17, 0, 0);
        }
        if (vj5.n.f437718k) {
            vj5.n.b(this).d(new wf5.a(findViewById));
            getWindow().getDecorView().requestApplyInsets();
            vj5.o.e(getWindow());
        }
        hideActionbarLine();
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
        setNavigationbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
    }
}
