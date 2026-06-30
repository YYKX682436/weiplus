package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class n6 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.uic.f8 f151330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.t6 f151331f;

    public n6(com.tencent.mm.plugin.mv.ui.uic.t6 t6Var, com.tencent.mm.plugin.mv.ui.uic.f8 f8Var) {
        this.f151331f = t6Var;
        this.f151330e = f8Var;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489324c53;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        r45.jf2 jf2Var;
        android.view.View p17;
        com.tencent.mm.plugin.mv.ui.uic.l6 item = (com.tencent.mm.plugin.mv.ui.uic.l6) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        if (list != null) {
            if (list.contains(1)) {
                android.view.View p18 = holder.p(com.tencent.mm.R.id.f486802mi3);
                if (p18 != null) {
                    int i19 = item.f151278g ? 0 : 4;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i19));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackDataConvert;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(p18, "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackDataConvert;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p19 = holder.p(com.tencent.mm.R.id.lby);
                if (p19 != null) {
                    p19.setScaleX(item.f151278g ? 1.0f - item.f151279h : 1.0f);
                }
            }
            if (!list.contains(2) || (p17 = holder.p(com.tencent.mm.R.id.lby)) == null) {
                return;
            }
            p17.setScaleX(item.f151278g ? 1.0f - item.f151279h : 1.0f);
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.o7z);
        if (textView != null && (jf2Var = item.f151276e) != null) {
            int integer = jf2Var.getInteger(1);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(lm3.d0.c(integer));
            sb6.append('s');
            textView.setText(sb6.toString());
        }
        android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.f486802mi3);
        if (findViewById != null) {
            if (item.f151278g) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackDataConvert;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackDataConvert;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackDataConvert;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackDataConvert;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.mv.ui.uic.m6(this, i17));
        android.view.View p27 = holder.p(com.tencent.mm.R.id.lby);
        com.tencent.mm.plugin.mv.ui.uic.t6 t6Var = this.f151331f;
        p27.setPivotX(t6Var.f151464i);
        if (item.f151278g) {
            p27.setScaleX(1.0f - item.f151279h);
        } else {
            p27.setScaleX(1.0f);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.cl7);
        imageView.setImageDrawable(null);
        if (i17 >= t6Var.f151462g.size()) {
            return;
        }
        java.lang.Object obj = t6Var.f151462g.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        jk4.f fVar = (jk4.f) obj;
        boolean z18 = item.f151277f;
        ll3.i1 i1Var = ll3.i1.f319182a;
        if (z18) {
            java.lang.String path = fVar.f234483t;
            kotlin.jvm.internal.o.f(path, "path");
            if (path.length() > 0) {
                java.lang.String str = fVar.f234483t;
                java.lang.String thumbFilePath = i1Var.b("thumb_" + fVar.f234483t.hashCode());
                e60.b1 b1Var = (e60.b1) i95.n0.c(e60.b1.class);
                kotlin.jvm.internal.o.d(str);
                long hashCode = str.hashCode();
                ((o23.i) b1Var).getClass();
                kotlin.jvm.internal.o.g(thumbFilePath, "thumbFilePath");
                e33.m6.a(imageView, 2, thumbFilePath, str, hashCode, i17, 0L);
                return;
            }
        }
        java.lang.String thumbUrl = fVar.f234471h;
        kotlin.jvm.internal.o.f(thumbUrl, "thumbUrl");
        if (!(thumbUrl.length() > 0)) {
            imageView.setImageDrawable(null);
            return;
        }
        o11.f fVar2 = new o11.f();
        fVar2.f342082f = i1Var.b("thumb_" + fVar.f234482s);
        fVar2.f342078b = true;
        fVar2.f342077a = true;
        n11.a.b().h(fVar.f234471h + fVar.f234472i, imageView, fVar2.a());
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
