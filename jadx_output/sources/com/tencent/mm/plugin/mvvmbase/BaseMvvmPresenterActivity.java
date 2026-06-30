package com.tencent.mm.plugin.mvvmbase;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmPresenterActivity;", "Lcom/tencent/mm/kiss/WxPresenterActivity;", "<init>", "()V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public abstract class BaseMvvmPresenterActivity extends com.tencent.mm.kiss.WxPresenterActivity {
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(um3.b.class);
        set.add(xn5.h1.class);
    }
}
