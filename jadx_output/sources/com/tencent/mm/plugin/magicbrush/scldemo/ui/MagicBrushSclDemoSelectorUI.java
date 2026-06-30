package com.tencent.mm.plugin.magicbrush.scldemo.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/scldemo/ui/MagicBrushSclDemoSelectorUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "", "visible", "mb-samples_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MagicBrushSclDemoSelectorUI extends com.tencent.mm.ui.MMComposeActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public android.view.View getLayoutView() {
        com.tencent.mm.mm_compose.MMComposeView mMComposeView = new com.tencent.mm.mm_compose.MMComposeView(this, null, 2, null);
        mMComposeView.setContent(u0.j.c(2097957817, true, new re3.h(mMComposeView)));
        return mMComposeView;
    }
}
