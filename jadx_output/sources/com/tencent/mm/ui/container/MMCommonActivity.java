package com.tencent.mm.ui.container;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/container/MMCommonActivity;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "common-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class MMCommonActivity extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity {
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
}
