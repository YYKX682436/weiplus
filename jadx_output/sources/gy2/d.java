package gy2;

/* loaded from: classes2.dex */
public final class d extends zx2.d {
    public d() {
        com.tencent.mm.plugin.finder.ui.fragment.FinderNotifyFragment finderNotifyFragment = new com.tencent.mm.plugin.finder.ui.fragment.FinderNotifyFragment();
        finderNotifyFragment.f129265p = 0;
        com.tencent.mm.plugin.finder.ui.fragment.FinderNotifyFragment finderNotifyFragment2 = new com.tencent.mm.plugin.finder.ui.fragment.FinderNotifyFragment();
        finderNotifyFragment2.f129265p = 1;
        com.tencent.mm.plugin.finder.ui.fragment.FinderNotifyFragment finderNotifyFragment3 = new com.tencent.mm.plugin.finder.ui.fragment.FinderNotifyFragment();
        finderNotifyFragment3.f129265p = 2;
        setFragments(kz5.c0.d(finderNotifyFragment, finderNotifyFragment2, finderNotifyFragment3));
        setTabContainer(new gy2.c());
        kotlin.jvm.internal.o.f(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ery), "getString(...)");
        setTabs(kz5.c0.d(new gy2.b(com.tencent.mm.R.string.erx, 0), new gy2.b(com.tencent.mm.R.string.erv, 0), new gy2.b(com.tencent.mm.R.string.erw, 0)));
        setTabViewAction(new zx2.y());
        this.f477034a = new zx2.b(1);
    }
}
