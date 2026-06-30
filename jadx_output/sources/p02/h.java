package p02;

/* loaded from: classes8.dex */
public class h extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f350396d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.downloader_app.search.DownloadSearchListView f350397e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f350398f = new java.util.ArrayList();

    public h(android.content.Context context, com.tencent.mm.plugin.downloader_app.search.DownloadSearchListView downloadSearchListView) {
        this.f350396d = context;
        this.f350397e = downloadSearchListView;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f350398f.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((p02.l) this.f350398f.get(i17)).f350403a;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        p02.g gVar = (p02.g) k3Var;
        p02.l lVar = (p02.l) this.f350398f.get(i17);
        gVar.getClass();
        int i18 = lVar.f350403a;
        if (i18 == 1) {
            android.view.View view = gVar.f350379e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = gVar.f350380f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = gVar.f350383i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i18 == 2) {
            android.view.View view4 = gVar.f350379e;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = gVar.f350380f;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = gVar.f350383i;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            gVar.f350381g.setText(lVar.f350404b);
            gVar.f350382h.setTag(lVar);
            return;
        }
        if (i18 != 3) {
            return;
        }
        android.view.View view7 = gVar.f350379e;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view8 = gVar.f350380f;
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(8);
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
        yj0.a.f(view8, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view9 = gVar.f350383i;
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        arrayList9.add(0);
        java.util.Collections.reverse(arrayList9);
        yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
        yj0.a.f(view9, "com/tencent/mm/plugin/downloader_app/search/DownloadSearchAdapter$SearchViewHolder", "onBindData", "(Lcom/tencent/mm/plugin/downloader_app/search/SearchData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        n11.a.b().g(lVar.f350408f, gVar.f350384m);
        gVar.f350386o.setText(android.text.Html.fromHtml(lVar.f350407e));
        android.widget.LinearLayout linearLayout = gVar.f350387p;
        linearLayout.removeAllViews();
        boolean L0 = com.tencent.mm.sdk.platformtools.t8.L0(lVar.f350409g);
        p02.h hVar = gVar.f350395x;
        if (!L0) {
            for (int i19 = 0; i19 < ((java.util.LinkedList) lVar.f350409g).size() && i19 <= 2; i19++) {
                android.view.View inflate = android.view.LayoutInflater.from(hVar.f350396d).inflate(com.tencent.mm.R.layout.cxm, (android.view.ViewGroup) null);
                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.nwz)).setText((java.lang.CharSequence) ((java.util.LinkedList) lVar.f350409g).get(i19));
                linearLayout.addView(inflate);
            }
        }
        long j17 = lVar.f350410h;
        gVar.f350388q.setText(j17 >= 1073741824 ? java.lang.String.format("%.1fGB", java.lang.Float.valueOf(((((float) j17) / 1024.0f) / 1024.0f) / 1024.0f)) : j17 >= 1048576 ? java.lang.String.format("%.1fMB", java.lang.Float.valueOf((((float) j17) / 1024.0f) / 1024.0f)) : java.lang.String.format("%.2fMB", java.lang.Float.valueOf((((float) j17) / 1024.0f) / 1024.0f)));
        gVar.f350385n.setTag(lVar);
        int i27 = lVar.f350405c;
        if (i27 == 1) {
            gVar.i(com.tencent.mm.R.string.bqh);
        } else if (i27 == 2) {
            gVar.i(com.tencent.mm.R.string.gax);
        } else if (i27 == 3) {
            gVar.i(com.tencent.mm.R.string.k3g);
        } else if (i27 == 4) {
            gVar.i(com.tencent.mm.R.string.g1c);
        }
        gVar.f350389r.setText(hVar.f350396d.getResources().getString(com.tencent.mm.R.string.f490372t5) + lVar.f350413k);
        gVar.f350390s.setText(hVar.f350396d.getResources().getString(com.tencent.mm.R.string.f490509x3) + lVar.f350414l);
        gVar.f350391t.setText(android.text.Html.fromHtml(lVar.f350407e + " " + lVar.f350415m));
        gVar.f350392u.setOnClickListener(new p02.d(gVar, lVar));
        gVar.f350393v.setOnClickListener(new p02.e(gVar, lVar));
        gVar.f350394w.setOnClickListener(new p02.f(gVar, lVar));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new p02.g(this, android.view.LayoutInflater.from(this.f350396d).inflate(com.tencent.mm.R.layout.ciw, viewGroup, false));
    }
}
