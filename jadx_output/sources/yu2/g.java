package yu2;

/* loaded from: classes2.dex */
public final class g extends com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.ui.MMActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("Finder.FinderTabUIC", "FinderBizTabUIC init cons");
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider W6() {
        com.tencent.mars.xlog.Log.i("Finder.FinderTabUIC", "FinderBizTabUIC generateProvider");
        return new com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider();
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.appcompat.app.b supportActionBar = getActivity().getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
    }
}
