package com.tencent.mm.ui.chatting.adapter;

/* loaded from: classes12.dex */
public class a0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f198384d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f198385e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f198386f;

    /* renamed from: g, reason: collision with root package name */
    public o11.g f198387g;

    /* renamed from: h, reason: collision with root package name */
    public o11.g f198388h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f198389i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f198390m;

    /* renamed from: n, reason: collision with root package name */
    public final long f198391n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f198392o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.adapter.u f198393p;

    /* renamed from: q, reason: collision with root package name */
    public final java.text.SimpleDateFormat f198394q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f198395r;

    public a0(android.content.Context context, java.util.List list, int i17, java.lang.String str) {
        this.f198386f = null;
        this.f198387g = null;
        this.f198388h = null;
        this.f198389i = true;
        this.f198390m = false;
        this.f198394q = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault());
        this.f198395r = false;
        this.f198386f = list;
        this.f198389i = c01.d9.b().E();
        this.f198384d = context;
        y(context, i17);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f198386f.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return x(i17).f198448c;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onAttachedToRecyclerView(androidx.recyclerview.widget.RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f198385e = recyclerView;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List list) {
        if (list != null && list.size() > 0 && (k3Var instanceof com.tencent.mm.ui.chatting.adapter.z)) {
            if (((java.lang.Integer) list.get(0)).intValue() == 0) {
                com.tencent.mm.ui.chatting.adapter.z zVar = (com.tencent.mm.ui.chatting.adapter.z) k3Var;
                zVar.f198459h.setChecked(false);
                zVar.f198459h.setVisibility(0);
                android.view.View view = zVar.f198460i;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            com.tencent.mm.ui.chatting.adapter.z zVar2 = (com.tencent.mm.ui.chatting.adapter.z) k3Var;
            zVar2.f198459h.setChecked(false);
            zVar2.f198459h.setVisibility(8);
            android.view.View view2 = zVar2.f198460i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        super.onBindViewHolder(k3Var, i17, list);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return i17 == Integer.MAX_VALUE ? new com.tencent.mm.ui.chatting.adapter.t(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.bdj, viewGroup, false)) : new com.tencent.mm.ui.chatting.adapter.z(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.bxb, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewAttachedToWindow(androidx.recyclerview.widget.k3 k3Var) {
        com.tencent.mm.storage.f9 f9Var;
        super.onViewAttachedToWindow(k3Var);
        int adapterPosition = k3Var.getAdapterPosition();
        com.tencent.mm.ui.chatting.adapter.w x17 = x(adapterPosition);
        if (x17 == null || (f9Var = x17.f198447b) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryAdapter", "onViewAttachedToWindow item or msgInfo is null");
            return;
        }
        if (x17.f198446a == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryAdapter", "onViewAttachedToWindow imagePath is null");
        } else if (x17.f198450e || x17.f198451f || f9Var.z2()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryGalleryAdapter", "onViewAttachedToWindow no need to gen hd thumb");
        } else {
            ((ku5.t0) ku5.t0.f312615d).j(new com.tencent.mm.ui.chatting.adapter.s(this, x17, adapterPosition), "MediaHistory-viewAttach");
        }
    }

    public com.tencent.mm.ui.chatting.adapter.w x(int i17) {
        return (com.tencent.mm.ui.chatting.adapter.w) this.f198386f.get(i17);
    }

    public final void y(android.content.Context context, int i17) {
        o11.f fVar = new o11.f();
        fVar.f342085i = 1;
        fVar.f342098v = true;
        fVar.f342087k = i65.a.B(context) / i17;
        fVar.f342086j = i65.a.B(context) / i17;
        fVar.f342093q = com.tencent.mm.R.color.a0y;
        this.f198387g = fVar.a();
        int B = i65.a.B(context) / i17;
        o11.f fVar2 = new o11.f();
        fVar2.f342085i = 1;
        fVar2.f342098v = true;
        fVar2.f342087k = i65.a.B(context) / i17;
        fVar2.f342086j = i65.a.B(context) / i17;
        fVar2.f342095s = false;
        this.f198388h = fVar2.a();
    }

    public a0(android.content.Context context, java.util.List list, int i17, java.lang.String str, long j17) {
        this.f198386f = null;
        this.f198387g = null;
        this.f198388h = null;
        this.f198389i = true;
        this.f198390m = false;
        this.f198394q = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault());
        this.f198395r = false;
        this.f198386f = list;
        this.f198391n = j17;
        this.f198389i = c01.d9.b().E();
        this.f198390m = true;
        this.f198384d = context;
        y(context, i17);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.lang.String str;
        boolean z17 = this.f198389i;
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaHistoryGalleryAdapter", "[onBindViewHolder] isSDCardAvailable:%s", java.lang.Boolean.valueOf(z17));
            return;
        }
        com.tencent.mm.ui.chatting.adapter.w x17 = x(i17);
        int itemViewType = k3Var.getItemViewType();
        android.content.Context context = this.f198384d;
        if (itemViewType == Integer.MAX_VALUE) {
            if (i17 != getItemCount() - 1) {
                if (com.tencent.mm.ui.gridviewheaders.a.e().a(new java.util.Date(x(i17 + 1).f198449d)) == com.tencent.mm.ui.gridviewheaders.a.e().a(new java.util.Date(x17.f198449d))) {
                    com.tencent.mm.ui.chatting.adapter.t tVar = (com.tencent.mm.ui.chatting.adapter.t) k3Var;
                    android.widget.TextView textView = tVar.f198443d;
                    textView.setVisibility(0);
                    textView.setText(com.tencent.mm.ui.gridviewheaders.a.e().d(new java.util.Date(x17.f198449d), context));
                    boolean z18 = this.f198392o;
                    android.widget.ProgressBar progressBar = tVar.f198444e;
                    if (z18) {
                        progressBar.setVisibility(0);
                        return;
                    } else {
                        progressBar.setVisibility(8);
                        return;
                    }
                }
            }
            ((com.tencent.mm.ui.chatting.adapter.t) k3Var).f198443d.setVisibility(8);
            return;
        }
        com.tencent.mm.ui.chatting.adapter.z zVar = (com.tencent.mm.ui.chatting.adapter.z) k3Var;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        android.widget.ImageView imageView = zVar.f198455d;
        imageView.setTag(valueOf);
        zVar.f198460i.setTag(java.lang.Integer.valueOf(i17));
        if (x17.f198451f) {
            java.lang.String b17 = tv.a.b(x17.f198446a);
            n11.a b18 = n11.a.b();
            java.lang.String str2 = x17.f198446a;
            o11.f fVar = new o11.f();
            fVar.f342082f = b17;
            fVar.f342078b = true;
            b18.h(str2, imageView, fVar.a());
        } else {
            n11.a.b().h(x17.f198446a, imageView, this.f198387g);
        }
        boolean z19 = x17.f198450e;
        android.widget.TextView textView2 = zVar.f198457f;
        if (!z19 && !x17.f198451f) {
            textView2.setVisibility(8);
            android.view.View view = zVar.f198456e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = zVar.f198456e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setVisibility(0);
            java.lang.String str3 = x17.f198452g.f198445a;
            boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str3 == null) {
                str3 = "";
            }
            textView2.setText(str3);
        }
        boolean z28 = this.f198395r;
        android.widget.CheckBox checkBox = zVar.f198459h;
        if (z28) {
            android.view.View view3 = zVar.f198460i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            checkBox.setVisibility(0);
            if (com.tencent.mm.ui.chatting.gallery.p4.f201265a.d(x17.f198447b)) {
                checkBox.setChecked(true);
            } else {
                checkBox.setChecked(false);
                checkBox.setText("");
            }
        } else {
            android.view.View view4 = zVar.f198460i;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            checkBox.setVisibility(8);
        }
        java.lang.String str4 = (i17 - 1) + ", " + this.f198394q.format(new java.util.Date(x17.f198449d));
        if (x17.f198450e) {
            str = context.getResources().getString(com.tencent.mm.R.string.f490424ul) + str4;
        } else {
            str = context.getResources().getString(com.tencent.mm.R.string.f490411u8) + str4;
        }
        imageView.setContentDescription(str);
        imageView.setVisibility(0);
        android.view.View view5 = zVar.f198461m;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
