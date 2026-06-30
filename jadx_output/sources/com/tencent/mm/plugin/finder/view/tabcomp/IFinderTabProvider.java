package com.tencent.mm.plugin.finder.view.tabcomp;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/tabcomp/IFinderTabProvider;", "", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface IFinderTabProvider {
    java.util.List fragments();

    default boolean isDynamic() {
        return false;
    }

    zx2.a0 tabContainer();

    zx2.z tabViewAction();

    java.util.List tabs();
}
