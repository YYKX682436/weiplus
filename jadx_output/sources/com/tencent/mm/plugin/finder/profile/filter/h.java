package com.tencent.mm.plugin.finder.profile.filter;

/* loaded from: classes2.dex */
public final class h implements com.tencent.mm.plugin.finder.profile.filter.q {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f123364a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f123365b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f123366c;

    /* renamed from: d, reason: collision with root package name */
    public final int f123367d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f123368e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f123369f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f123370g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView f123371h;

    public h(android.app.Activity context, java.util.ArrayList outerDataList, java.lang.String username, int i17, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 8) != 0 ? 1 : i17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(outerDataList, "outerDataList");
        kotlin.jvm.internal.o.g(username, "username");
        this.f123364a = context;
        this.f123365b = outerDataList;
        this.f123366c = username;
        this.f123367d = i17;
        this.f123368e = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.plugin.finder.profile.filter.q
    public android.view.View getView() {
        return this.f123371h;
    }

    @Override // com.tencent.mm.plugin.finder.profile.filter.q
    public boolean hasData() {
        return !this.f123365b.isEmpty();
    }

    @Override // com.tencent.mm.plugin.finder.profile.filter.q
    public void k(boolean z17) {
        androidx.recyclerview.widget.f2 adapter;
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView finderTopicFilterView = this.f123371h;
        if (finderTopicFilterView != null) {
            com.tencent.mm.plugin.finder.profile.filter.h hVar = finderTopicFilterView.presenter;
            if (hVar != null) {
                hVar.f123370g = z17;
            }
            if (hVar != null && (arrayList = hVar.f123368e) != null) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((so2.e5) it.next()).f410333g = z17;
                }
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = finderTopicFilterView.recyclerView;
            if (wxRecyclerView != null && (adapter = wxRecyclerView.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
            int color = z17 ? finderTopicFilterView.getContext().getResources().getColor(com.tencent.mm.R.color.f479122ql) : finderTopicFilterView.getContext().getResources().getColor(com.tencent.mm.R.color.FG_1);
            android.widget.TextView textView = (android.widget.TextView) finderTopicFilterView.findViewById(com.tencent.mm.R.id.e4c);
            if (textView != null) {
                textView.setTextColor(color);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.profile.filter.q
    public void l() {
        java.util.ArrayList arrayList = this.f123368e;
        boolean isEmpty = arrayList.isEmpty();
        arrayList.clear();
        java.util.ArrayList arrayList2 = this.f123365b;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            so2.e5 e5Var = new so2.e5((r45.r03) it.next(), this.f123367d);
            e5Var.f410333g = this.f123370g;
            arrayList3.add(e5Var);
        }
        arrayList.addAll(arrayList3);
        if (arrayList.isEmpty()) {
            com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView finderTopicFilterView = this.f123371h;
            if (finderTopicFilterView != null) {
                finderTopicFilterView.setVisibility(8);
            }
        } else {
            com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView finderTopicFilterView2 = this.f123371h;
            if (finderTopicFilterView2 != null) {
                finderTopicFilterView2.setVisibility(0);
            }
        }
        com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView finderTopicFilterView3 = this.f123371h;
        if (finderTopicFilterView3 != null) {
            finderTopicFilterView3.d();
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderTopicFilterContract", "refresh, dataList size:" + arrayList.size());
        if (isEmpty && (!arrayList.isEmpty())) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(21570, this.f123366c + ",1,");
        }
    }

    @Override // com.tencent.mm.plugin.finder.profile.filter.q
    public android.view.View n(int i17) {
        java.util.ArrayList arrayList = this.f123368e;
        arrayList.clear();
        java.util.ArrayList arrayList2 = this.f123365b;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            so2.e5 e5Var = new so2.e5((r45.r03) it.next(), i17);
            e5Var.f410333g = this.f123370g;
            arrayList3.add(e5Var);
        }
        arrayList.addAll(arrayList3);
        android.app.Activity context = this.f123364a;
        com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView finderTopicFilterView = new com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView(context);
        finderTopicFilterView.c(this);
        finderTopicFilterView.d();
        if (arrayList.isEmpty()) {
            com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView finderTopicFilterView2 = this.f123371h;
            if (finderTopicFilterView2 != null) {
                finderTopicFilterView2.setVisibility(8);
            }
        } else {
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = (com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC.class);
            if (finderProfileTabUIC != null) {
                finderProfileTabUIC.f123463y = true;
                finderProfileTabUIC.V6();
                com.tencent.mm.plugin.finder.profile.filter.FinderTopicFilterView finderTopicFilterView3 = this.f123371h;
                if (finderTopicFilterView3 != null) {
                    finderTopicFilterView3.setVisibility(0);
                }
            }
        }
        this.f123371h = finderTopicFilterView;
        return finderTopicFilterView;
    }
}
