package com.tencent.mm.plugin.magicbrush.scldemo.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/scldemo/ui/MagicBrushSclListDemoUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "mb-samples_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MagicBrushSclListDemoUI extends com.tencent.mm.ui.MMComposeActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public android.view.View getLayoutView() {
        pe3.g0 g0Var = (pe3.g0) pf5.z.f353948a.a(this).a(pe3.g0.class);
        g0Var.getClass();
        com.tencent.mm.mm_compose.MMComposeView mMComposeView = new com.tencent.mm.mm_compose.MMComposeView(g0Var.getActivity(), null, 2, null);
        mMComposeView.setContent(u0.j.c(-2104384239, true, new pe3.f0(g0Var)));
        return mMComposeView;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{pe3.f.class, pe3.g0.class});
    }
}
