package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class pc extends com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider W6() {
        return new com.tencent.mm.plugin.finder.viewmodel.component.oc();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        return getActiveFragment().onBackPressed();
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        V6();
    }
}
