package com.tencent.mm.plugin.finder.ui.fragment;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/FinderAllFeedGridFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderBaseGridFeedFragment;", "Lcom/tencent/mm/plugin/finder/feed/d;", "Lcom/tencent/mm/plugin/finder/feed/a;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderAllFeedGridFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment<com.tencent.mm.plugin.finder.feed.d, com.tencent.mm.plugin.finder.feed.a> {
    public static final /* synthetic */ int D = 0;
    public com.tencent.mm.sdk.event.IListener A;
    public java.util.HashSet B;
    public java.util.HashSet C;

    /* renamed from: u, reason: collision with root package name */
    public final int f129247u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f129248v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.a f129249w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.d f129250x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.FinderMixAllFeedLoader f129251y;

    /* renamed from: z, reason: collision with root package name */
    public final int f129252z;

    /* JADX WARN: Multi-variable type inference failed */
    public FinderAllFeedGridFragment() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    public com.tencent.mm.plugin.finder.feed.a1 A0() {
        com.tencent.mm.plugin.finder.feed.d dVar = this.f129250x;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C0(android.view.View r20) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.fragment.FinderAllFeedGridFragment.C0(android.view.View):void");
    }

    public final com.tencent.mm.plugin.finder.feed.model.FinderMixAllFeedLoader G0() {
        com.tencent.mm.plugin.finder.feed.model.FinderMixAllFeedLoader finderMixAllFeedLoader = this.f129251y;
        if (finderMixAllFeedLoader != null) {
            return finderMixAllFeedLoader;
        }
        kotlin.jvm.internal.o.o("feedLoader");
        throw null;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cx9;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment, com.tencent.mm.ui.component.UIComponentFragment
    public java.util.Set l0() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.ny.class, com.tencent.mm.plugin.finder.viewmodel.component.ut.class});
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.sdk.event.IListener iListener = this.A;
        if (iListener != null) {
            iListener.dead();
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment, com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        java.util.HashSet hashSet = this.B;
        if (hashSet != null) {
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                long longValue = ((java.lang.Number) it.next()).longValue();
                G0().remove(longValue, true);
                bu2.e0.f24498a.e(longValue, 2);
                if (G0().getSize() == 0) {
                    com.tencent.mm.plugin.finder.feed.d dVar = this.f129250x;
                    if (dVar == null) {
                        kotlin.jvm.internal.o.o("viewCallback");
                        throw null;
                    }
                    dVar.U();
                }
            }
        }
        java.util.HashSet hashSet2 = this.C;
        if (hashSet2 != null) {
            java.util.Iterator it6 = hashSet2.iterator();
            while (it6.hasNext()) {
                long longValue2 = ((java.lang.Number) it6.next()).longValue();
                G0().remove(longValue2, true);
                bu2.e0.f24498a.e(longValue2, 10);
                if (G0().getSize() == 0) {
                    com.tencent.mm.plugin.finder.feed.d dVar2 = this.f129250x;
                    if (dVar2 == null) {
                        kotlin.jvm.internal.o.o("viewCallback");
                        throw null;
                    }
                    dVar2.U();
                }
            }
        }
        java.util.HashSet hashSet3 = this.B;
        if (hashSet3 != null) {
            hashSet3.clear();
        }
        java.util.HashSet hashSet4 = this.C;
        if (hashSet4 != null) {
            hashSet4.clear();
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getF() {
        int i17 = this.f129247u;
        return i17 != 100 ? i17 != 102 ? 279 : 351 : com.tencent.mm.plugin.appbrand.jsapi.nfc.r.CTRL_INDEX;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment
    public void w0() {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.finder.feed.a aVar = this.f129249w;
        if (aVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = aVar.f107156e;
        com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader finderFavFeedLoader = baseFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader ? (com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader) baseFeedLoader : null;
        if (finderFavFeedLoader == null || (arrayList = finderFavFeedLoader.f107415n) == null) {
            arrayList = new java.util.ArrayList();
        }
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, y0(), intent, 0L, null, 0, 0, false, 0, null, 508, null);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Wj(y0(), intent, 7, arrayList);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment
    public int x0() {
        return 3;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderBaseGridFeedFragment
    public com.tencent.mm.plugin.finder.feed.k0 z0() {
        com.tencent.mm.plugin.finder.feed.a aVar = this.f129249w;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    public FinderAllFeedGridFragment(int i17, boolean z17) {
        this.f129247u = i17;
        this.f129248v = z17;
        this.f129252z = 2;
        this.f129265p = i17;
    }

    public /* synthetic */ FinderAllFeedGridFragment(int i17, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? 10001 : i17, (i18 & 2) != 0 ? false : z17);
    }
}
