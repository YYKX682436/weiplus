package gq2;

/* loaded from: classes2.dex */
public final class g extends fq2.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gq2.d f274557g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gq2.j f274558h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ hq2.c f274559i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(gq2.d dVar, gq2.j jVar, hq2.c cVar, com.tencent.mm.ui.MMActivity mMActivity, java.util.LinkedList linkedList) {
        super(mMActivity, linkedList);
        this.f274557g = dVar;
        this.f274558h = jVar;
        this.f274559i = cVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
        lq2.a aVar;
        gq2.j jVar = this.f274558h;
        boolean z17 = jVar.f274566i != i17;
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.view.FinderFragmentChangeObserver.TAG, "onPageScrollStateChanged: state=" + i17 + ", isStateChange=" + z17);
        jVar.f274566i = i17;
        if (z17 && i17 == 0) {
            com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragment o17 = jVar.o();
            if (o17 != null) {
                lq2.a aVar2 = (lq2.a) pf5.z.f353948a.b(o17).e(lq2.a.class);
                if (aVar2 != null) {
                    boolean z18 = aVar2.f320455e != null;
                    com.tencent.mars.xlog.Log.i(aVar2.f320454d, "checkTabAutoPlay: source=onScrollStateChange, isInit=" + z18);
                    if (z18) {
                        iq2.d0 d0Var = aVar2.f320455e;
                        if (d0Var == null) {
                            kotlin.jvm.internal.o.o("liveThemeCallback");
                            throw null;
                        }
                        d0Var.d("onScrollStateChange");
                    }
                }
            } else {
                o17 = null;
            }
            for (com.tencent.mm.plugin.finder.nearby.newlivesquare.vertical.fragment.LiveStreamTabFragment liveStreamTabFragment : jVar.f274568n) {
                if (!kotlin.jvm.internal.o.b(liveStreamTabFragment, o17) && liveStreamTabFragment.f122087q && (aVar = (lq2.a) pf5.z.f353948a.b(liveStreamTabFragment).e(lq2.a.class)) != null) {
                    boolean z19 = aVar.f320455e != null;
                    com.tencent.mars.xlog.Log.i(aVar.f320454d, "stopTabCurrentView: source=onScrollStateChange, isInit=" + z19);
                    if (z19) {
                        iq2.d0 d0Var2 = aVar.f320455e;
                        if (d0Var2 == null) {
                            kotlin.jvm.internal.o.o("liveThemeCallback");
                            throw null;
                        }
                        d0Var2.k("onScrollStateChange", true);
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }
}
