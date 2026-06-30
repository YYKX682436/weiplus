package wu2;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fragment.FinderAllFeedGridFragment f449674d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.finder.ui.fragment.FinderAllFeedGridFragment finderAllFeedGridFragment) {
        super(0);
        this.f449674d = finderAllFeedGridFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.tencent.mm.plugin.finder.ui.fragment.FinderAllFeedGridFragment finderAllFeedGridFragment = this.f449674d;
        com.tencent.mm.plugin.finder.feed.d dVar = finderAllFeedGridFragment.f129250x;
        java.lang.String str = null;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        dVar.f106180m.setEnableLoadMore(finderAllFeedGridFragment.G0().getSize() > 10);
        com.tencent.mm.plugin.finder.feed.d dVar2 = finderAllFeedGridFragment.f129250x;
        if (dVar2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View f213435x = dVar2.f106180m.getF213435x();
        android.view.View findViewById = f213435x != null ? f213435x.findViewById(com.tencent.mm.R.id.ilg) : null;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            android.view.View view = findViewById;
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/fragment/FinderAllFeedGridFragment$initOnCreate$1$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/fragment/FinderAllFeedGridFragment$initOnCreate$1$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.feed.d dVar3 = finderAllFeedGridFragment.f129250x;
        if (dVar3 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View f213435x2 = dVar3.f106180m.getF213435x();
        android.widget.TextView textView3 = f213435x2 != null ? (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili) : null;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        int i17 = finderAllFeedGridFragment.f129265p;
        if (i17 == 102) {
            com.tencent.mm.plugin.finder.feed.d dVar4 = finderAllFeedGridFragment.f129250x;
            if (dVar4 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x3 = dVar4.f106180m.getF213435x();
            if (f213435x3 != null && (textView2 = (android.widget.TextView) f213435x3.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView2.setVisibility(0);
                com.tencent.mm.plugin.finder.feed.a aVar = finderAllFeedGridFragment.f129249w;
                if (aVar == null) {
                    kotlin.jvm.internal.o.o("presenter");
                    throw null;
                }
                java.util.ArrayList dataList = aVar.f107156e.getDataList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = dataList.iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (next instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                        arrayList2.add(next);
                    }
                }
                textView2.setText(textView2.getContext().getResources().getString(com.tencent.mm.R.string.f1d, java.lang.Integer.valueOf(arrayList2.size())));
            }
        } else {
            if (i17 == 100) {
                com.tencent.mm.plugin.finder.feed.d dVar5 = finderAllFeedGridFragment.f129250x;
                if (dVar5 == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                android.view.View f213435x4 = dVar5.f106180m.getF213435x();
                if (f213435x4 != null && (textView = (android.widget.TextView) f213435x4.findViewById(com.tencent.mm.R.id.ili)) != null) {
                    textView.setVisibility(0);
                    com.tencent.mm.plugin.finder.feed.a aVar2 = finderAllFeedGridFragment.f129249w;
                    if (aVar2 == null) {
                        kotlin.jvm.internal.o.o("presenter");
                        throw null;
                    }
                    java.util.ArrayList dataList2 = aVar2.f107156e.getDataList();
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.util.Iterator it6 = dataList2.iterator();
                    while (it6.hasNext()) {
                        java.lang.Object next2 = it6.next();
                        if (next2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                            arrayList3.add(next2);
                        }
                    }
                    int size = arrayList3.size();
                    java.lang.String d17 = cu2.f0.f222391a.d("FinderObjectDynamicItemKey_FinderFavFeedFooterHint");
                    if (d17 != null) {
                        str = java.lang.String.format(d17, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(size)}, 1));
                        kotlin.jvm.internal.o.f(str, "format(...)");
                    }
                    if (str == null) {
                        str = textView.getContext().getResources().getString(com.tencent.mm.R.string.cun, java.lang.Integer.valueOf(size));
                    }
                    textView.setText(str);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
