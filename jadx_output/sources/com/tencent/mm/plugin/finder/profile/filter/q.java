package com.tencent.mm.plugin.finder.profile.filter;

/* loaded from: classes2.dex */
public interface q {
    static /* synthetic */ android.view.View m(com.tencent.mm.plugin.finder.profile.filter.q qVar, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: genViewFilterView");
        }
        if ((i18 & 1) != 0) {
            i17 = 1;
        }
        return qVar.n(i17);
    }

    android.view.View getView();

    boolean hasData();

    void k(boolean z17);

    void l();

    android.view.View n(int i17);
}
