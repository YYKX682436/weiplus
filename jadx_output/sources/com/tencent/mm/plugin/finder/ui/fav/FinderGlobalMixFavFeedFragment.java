package com.tencent.mm.plugin.finder.ui.fav;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fav/FinderGlobalMixFavFeedFragment;", "Lcom/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavFeedFragment;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderGlobalMixFavFeedFragment extends com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment {

    /* renamed from: x, reason: collision with root package name */
    public final int f129141x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f129142y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderGlobalMixFavFeedFragment(java.lang.String source, int i17) {
        super(source);
        kotlin.jvm.internal.o.g(source, "source");
        this.f129141x = i17;
        this.f129142y = "Finder.GlobalMixFavFeedFragment";
    }

    @Override // com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment
    public com.tencent.mm.plugin.finder.ui.fav.a B0() {
        return new com.tencent.mm.plugin.finder.ui.fav.g0(this.f129141x);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment
    public com.tencent.mm.plugin.finder.ui.fav.x C0(android.view.View view, com.tencent.mm.plugin.finder.ui.fav.a presenter) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        if (this.f129141x != 2) {
            return super.C0(view, presenter);
        }
        androidx.fragment.app.FragmentActivity requireActivity = requireActivity();
        kotlin.jvm.internal.o.f(requireActivity, "requireActivity(...)");
        return new com.tencent.mm.plugin.finder.ui.fav.h0(requireActivity, this, presenter, view);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i(this.f129142y, "onCreate");
    }

    @Override // com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i(this.f129142y, "onDestroy");
    }
}
