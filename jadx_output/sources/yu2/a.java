package yu2;

/* loaded from: classes2.dex */
public final class a extends com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("Finder.FinderTabUIC", "FinderBizTabUIC init cons");
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider W6() {
        com.tencent.mars.xlog.Log.i("Finder.FinderTabUIC", "FinderBizTabUIC generateProvider");
        return new yu2.b();
    }
}
