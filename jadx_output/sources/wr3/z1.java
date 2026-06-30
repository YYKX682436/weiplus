package wr3;

/* loaded from: classes11.dex */
public final class z1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f448924d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f448925e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f448926f;

    /* renamed from: g, reason: collision with root package name */
    public final int f448927g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f448928h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f448929i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f448930m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.a f448931n;

    public z1(java.util.List dataList, java.lang.String bizUsername, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        this.f448924d = dataList;
        this.f448925e = bizUsername;
        this.f448926f = z17;
        this.f448927g = i17;
        this.f448928h = jz5.h.b(wr3.w1.f448911d);
        this.f448930m = "";
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f448924d.size() + 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        if (i17 < this.f448924d.size()) {
            return 0;
        }
        return this.f448929i ? 1 : 2;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (!(holder instanceof wr3.v1)) {
            if (holder instanceof wr3.s1) {
                yz5.a aVar = this.f448931n;
                if (aVar != null) {
                    aVar.invoke();
                    return;
                }
                return;
            }
            if (holder instanceof wr3.t1) {
                if (r26.n0.N(this.f448930m)) {
                    wr3.t1 t1Var = (wr3.t1) holder;
                    t1Var.f448893d.setVisibility(8);
                    android.view.View view = t1Var.f448894e;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                wr3.t1 t1Var2 = (wr3.t1) holder;
                android.widget.TextView textView = t1Var2.f448893d;
                textView.setVisibility(0);
                android.view.View view2 = t1Var2.f448894e;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setText(this.f448930m);
                return;
            }
            return;
        }
        wr3.v1 v1Var = (wr3.v1) holder;
        r45.s5 s5Var = (r45.s5) this.f448924d.get(i17);
        r45.o5 o5Var = (r45.o5) s5Var.f385514i.f382754e.get(0);
        r45.l5 l5Var = s5Var.f385514i.f382753d;
        com.tencent.mm.ui.tools.d8.a(v1Var.itemView);
        v1Var.itemView.setOnClickListener(new wr3.x1(v1Var, this, l5Var, i17, o5Var));
        if (s5Var.f385509d.f390791e == 49) {
            ((yq1.z) ((zq1.a0) ((jz5.n) this.f448928h).getValue())).getClass();
            if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.e(16)) {
                zq1.a0 a0Var = (zq1.a0) ((jz5.n) this.f448928h).getValue();
                java.util.LinkedList<r45.o5> DetailInfo = s5Var.f385514i.f382754e;
                kotlin.jvm.internal.o.f(DetailInfo, "DetailInfo");
                java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(DetailInfo, 10));
                for (r45.o5 o5Var2 : DetailInfo) {
                    arrayList3.add(kz5.c0.i(o5Var2.f381917h, java.lang.String.valueOf(o5Var2.f381923p), this.f448925e));
                }
                ((yq1.z) a0Var).v(arrayList3, 126);
            }
        }
        java.lang.String str2 = o5Var.A;
        boolean z17 = true;
        boolean z18 = str2 == null || r26.n0.N(str2);
        android.widget.TextView textView2 = v1Var.f448904f;
        if (z18) {
            textView2.setVisibility(8);
            android.view.View view3 = v1Var.f448905g;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter", "onBindVideoItem", "(Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter$BizProfileTabVideoVH;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter", "onBindVideoItem", "(Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter$BizProfileTabVideoVH;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            textView2.setVisibility(0);
            android.view.View view4 = v1Var.f448905g;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter", "onBindVideoItem", "(Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter$BizProfileTabVideoVH;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter", "onBindVideoItem", "(Lcom/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter$BizProfileTabVideoVH;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setText(o5Var.A);
        }
        v1Var.f448903e.setText(ot0.g0.d(o5Var.f381939z));
        int intValue = ((java.lang.Number) ((jz5.n) v1Var.f448908m).getValue()).intValue();
        java.lang.String str3 = o5Var.A;
        int i18 = str3 == null || r26.n0.N(str3) ? com.tencent.mm.R.drawable.f482038av0 : com.tencent.mm.R.drawable.f482039av1;
        android.widget.ImageView imageView = v1Var.f448902d;
        imageView.setBackgroundResource(i18);
        java.lang.String str4 = o5Var.f381913d;
        wr3.g2 g2Var = str4 == null || str4.length() == 0 ? new wr3.g2((com.tencent.mm.sdk.platformtools.x2.f193075e.getDisplayMetrics().density * 8.0f) + 0.5f, true, true) : new wr3.g2((com.tencent.mm.sdk.platformtools.x2.f193075e.getDisplayMetrics().density * 8.0f) + 0.5f, true, false);
        java.lang.String[] strArr = {o5Var.L, o5Var.f381920m, o5Var.f381922o};
        int i19 = 0;
        while (true) {
            if (i19 >= 3) {
                str = null;
                break;
            }
            str = strArr[i19];
            if (!(str == null || r26.n0.N(str))) {
                break;
            } else {
                i19++;
            }
        }
        if (str == null) {
            str = "";
        }
        java.lang.String b17 = qk.c.b(str, 2, true);
        kotlin.jvm.internal.o.f(b17, "getUrl(...)");
        wr3.y1 y1Var = new wr3.y1(this);
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.u.f94451a.e(o5Var.f381917h, 5);
        imageView.setImageBitmap(null);
        imageView.setImageDrawable(null);
        imageView.setImageResource(i18);
        imageView.setTag(b17);
        int B = i65.a.B(imageView.getContext()) - ((int) (i65.a.g(imageView.getContext()) * 24));
        o11.f fVar = new o11.f();
        fVar.f342078b = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("radius:");
        float f17 = g2Var.f448810a;
        sb6.append(f17);
        sb6.append("-topRound:true-bottomRound:");
        boolean z19 = g2Var.f448811b;
        sb6.append(z19);
        fVar.D = java.lang.String.valueOf(sb6.toString());
        fVar.f342093q = i18;
        fVar.f342086j = B;
        fVar.f342087k = intValue;
        fVar.f342098v = true;
        fVar.A = new r35.n0(3);
        fVar.B = new r35.w(3);
        fVar.f342082f = tv.a.b(b17);
        o11.g a17 = fVar.a();
        r35.m0 m0Var = new r35.m0(3, -1, -1, null, y1Var);
        fq1.e.f265507a.g(imageView, f17, true, z19);
        n11.a.b().i(b17, imageView, a17, m0Var);
        java.lang.String str5 = o5Var.f381913d;
        if (str5 != null && str5.length() != 0) {
            z17 = false;
        }
        android.view.ViewGroup viewGroup = v1Var.f448906h;
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = v1Var.f448907i;
        if (z17) {
            viewGroup.setVisibility(8);
            mMNeat7extView.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        mMNeat7extView.setVisibility(0);
        java.lang.String Title = o5Var.f381913d;
        kotlin.jvm.internal.o.f(Title, "Title");
        java.lang.String str6 = o5Var.f381917h;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = mMNeat7extView.getContext();
        ((ke0.e) xVar).getClass();
        lr1.f.f320657a.f(com.tencent.mm.pluginsdk.ui.span.c0.i(context, Title), mMNeat7extView, false, str6, 4);
        mMNeat7extView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y(mMNeat7extView, new com.tencent.mm.pluginsdk.ui.span.y0(mMNeat7extView.getContext())));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 0) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a1o, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new wr3.v1(inflate);
        }
        if (i17 != 1) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f488687a25, parent, false);
            kotlin.jvm.internal.o.d(inflate2);
            return new wr3.t1(inflate2);
        }
        android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a19, parent, false);
        kotlin.jvm.internal.o.d(inflate3);
        return new wr3.s1(inflate3);
    }

    public final void x(boolean z17) {
        if (this.f448929i == z17) {
            return;
        }
        this.f448929i = z17;
        notifyItemChanged(this.f448924d.size());
    }
}
