package o92;

/* loaded from: classes2.dex */
public final class a extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final r45.hr5 f343709e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f343710f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f343711g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f343712h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f343713i;

    public a(r45.hr5 requestContactReq) {
        kotlin.jvm.internal.o.g(requestContactReq, "requestContactReq");
        this.f343709e = requestContactReq;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.adg;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        j92.a item = (j92.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.f482388d7);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f343710f = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = holder.itemView.findViewById(com.tencent.mm.R.id.f482403dm);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f343711g = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = holder.itemView.findViewById(com.tencent.mm.R.id.f482385d4);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f343712h = findViewById3;
        android.view.View findViewById4 = holder.itemView.findViewById(com.tencent.mm.R.id.f482384d3);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f343713i = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById4;
        android.view.View findViewById5 = holder.itemView.findViewById(com.tencent.mm.R.id.f482398dh);
        m92.b bVar = item.f298352d;
        java.lang.String str = bVar.field_username;
        boolean z18 = str == null || str.length() == 0;
        android.content.Context context = holder.f293121e;
        if (!z18) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById5, arrayList.toArray(), "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvertForNewLife", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/api/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvertForNewLife", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/api/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = this.f343711g;
            if (textView == null) {
                kotlin.jvm.internal.o.o("nameTv");
                throw null;
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = bVar.field_nickname;
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str2));
            r45.ui4 ui4Var = (r45.ui4) bVar.u0().getCustom(27);
            if (ui4Var != null) {
                ui4Var.getString(0);
            }
            android.widget.ImageView imageView = this.f343710f;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("avatarIv");
                throw null;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(bVar.field_avatarUrl)) {
                mn2.g1 g1Var = mn2.g1.f329975a;
                g1Var.a().c(new mn2.n(bVar.field_avatarUrl, null, 2, null), imageView, g1Var.h(mn2.f1.f329957h));
            }
            android.widget.ImageView imageView2 = this.f343710f;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("avatarIv");
                throw null;
            }
            imageView2.setVisibility(0);
            android.view.View view = this.f343712h;
            if (view == null) {
                kotlin.jvm.internal.o.o("addLayout");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvertForNewLife", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/api/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvertForNewLife", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/api/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int color = context.getResources().getColor(com.tencent.mm.R.color.FG_0);
            android.widget.TextView textView2 = this.f343711g;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("nameTv");
                throw null;
            }
            textView2.setTextColor(color);
            android.view.View itemView = holder.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            dy1.a.c(itemView);
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById5, arrayList3.toArray(), "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvertForNewLife", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/api/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvertForNewLife", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/api/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView3 = this.f343711g;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("nameTv");
            throw null;
        }
        textView3.setText(context.getResources().getString(com.tencent.mm.R.string.f491246ci0));
        android.widget.ImageView imageView3 = this.f343710f;
        if (imageView3 == null) {
            kotlin.jvm.internal.o.o("avatarIv");
            throw null;
        }
        imageView3.setVisibility(8);
        android.view.View view2 = this.f343712h;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("addLayout");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvertForNewLife", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/api/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/account/convert/FinderAccountConvertForNewLife", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/account/api/convert/model/FinderAccountData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (item.f298355g) {
            android.widget.TextView textView4 = this.f343711g;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("nameTv");
                throw null;
            }
            textView4.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f343713i;
            if (weImageView == null) {
                kotlin.jvm.internal.o.o("addIv");
                throw null;
            }
            weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
        } else {
            android.widget.TextView textView5 = this.f343711g;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("nameTv");
                throw null;
            }
            textView5.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_2));
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f343713i;
            if (weImageView2 == null) {
                kotlin.jvm.internal.o.o("addIv");
                throw null;
            }
            weImageView2.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.FG_2));
        }
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.Tj(holder.itemView, 40, 3, false);
        aVar.pk(holder.itemView, "create_finder_account_button");
        android.view.View view3 = holder.itemView;
        r45.hr5 hr5Var = this.f343709e;
        aVar.gk(view3, kz5.c1.k(new jz5.l("enter_source", java.lang.Integer.valueOf(hr5Var.getInteger(0))), new jz5.l("source_feedid", pm0.v.u(hr5Var.getLong(1))), new jz5.l("my_finder_username", "")));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
