package d04;

/* loaded from: classes8.dex */
public final class w1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f225534d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f225535e;

    /* renamed from: f, reason: collision with root package name */
    public final int f225536f;

    /* renamed from: g, reason: collision with root package name */
    public final int f225537g;

    /* renamed from: h, reason: collision with root package name */
    public final int f225538h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f225539i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f225540m;

    /* renamed from: n, reason: collision with root package name */
    public d04.i f225541n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f225542o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f225543p;

    public w1(android.content.Context context, androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        this.f225534d = context;
        this.f225535e = recyclerView;
        this.f225536f = 1;
        this.f225537g = 2;
        this.f225538h = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479714d7);
        this.f225539i = new java.util.ArrayList();
        this.f225540m = new java.util.HashMap();
        this.f225542o = new java.util.ArrayList();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f225539i.size() + 2;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        java.util.ArrayList arrayList = this.f225539i;
        int i18 = (i17 == 0 || i17 > arrayList.size()) ? this.f225536f : this.f225537g;
        arrayList.size();
        return i18;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (i17 == 0) {
            if (holder instanceof d04.s1) {
                this.f225543p = ((d04.s1) holder).f225501d;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBindViewHolder  header EmptyViewHolder  recyclerViewHeight:");
            sb6.append(this.f225535e.getHeight());
            sb6.append("  mHeaderEmptyView:");
            android.view.View view = this.f225543p;
            sb6.append(view != null ? java.lang.Integer.valueOf(view.getHeight()) : null);
            sb6.append("  topMargin:");
            android.view.ViewGroup.LayoutParams layoutParams = this.f225535e.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            sb6.append(((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin);
            sb6.append("  pos:");
            sb6.append(i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanProductMaskDecorView", sb6.toString());
            return;
        }
        if (i17 > this.f225539i.size()) {
            if (holder instanceof d04.s1) {
                android.view.View view2 = ((d04.s1) holder).f225501d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanProductMaskDecorView", "onBindViewHolder  footer EmptyViewHolder pos:" + i17);
            return;
        }
        java.lang.Object obj2 = this.f225539i.get(i17 - 1);
        kotlin.jvm.internal.o.f(obj2, "get(...)");
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        synchronized (this.f225540m) {
            obj = this.f225540m.get(java.lang.Integer.valueOf(intValue));
            h0Var.f310123d = obj;
        }
        if (((sz3.w0) obj) != null && (holder instanceof d04.x1)) {
            if (((sz3.w0) obj).f414137h == 1 || ((sz3.w0) obj).f414137h == 2 || ((sz3.w0) obj).f414137h == 6) {
                d04.x1 x1Var = (d04.x1) holder;
                x1Var.f225551g.setVisibility(0);
                x1Var.f225550f.setVisibility(8);
                if (((sz3.w0) h0Var.f310123d).f414137h == 1) {
                    android.view.View view3 = x1Var.f225552h;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(4);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                d04.x1 x1Var2 = (d04.x1) holder;
                x1Var2.f225550f.setVisibility(0);
                x1Var2.f225551g.setVisibility(8);
                java.lang.Object obj3 = h0Var.f310123d;
                if (((sz3.w0) obj3).f414137h == 4) {
                    android.view.View view4 = x1Var2.f225552h;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    e04.f2 f2Var = e04.f2.f245925a;
                    java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                    if (((sz3.w0) h0Var.f310123d).f414141l.length() > 0) {
                        x1Var2.f225550f.setText("" + ((sz3.w0) h0Var.f310123d).f414141l);
                    } else {
                        x1Var2.f225550f.setText("" + this.f225534d.getString(com.tencent.mm.R.string.iac));
                    }
                } else if (((sz3.w0) obj3).f414137h == 3 || ((sz3.w0) obj3).f414137h == 5) {
                    x1Var2.f225550f.setText(this.f225534d.getString(com.tencent.mm.R.string.iac));
                    if (((sz3.w0) h0Var.f310123d).f414139j.length() == 0) {
                        android.view.View view5 = x1Var2.f225552h;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                        arrayList4.add(4);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view5, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        android.view.View view6 = x1Var2.f225552h;
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                        arrayList5.add(0);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(view6, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView$ProductInfoAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
            if (((sz3.w0) h0Var.f310123d).f414139j.length() > 0) {
                ((d04.x1) holder).f225548d.setOnClickListener(new d04.v1(h0Var, this, intValue));
            } else {
                ((d04.x1) holder).f225548d.setOnClickListener(null);
            }
            d04.x1 x1Var3 = (d04.x1) holder;
            x1Var3.f225549e.setImageBitmap(null);
            x1Var3.f225549e.setTag(java.lang.Integer.valueOf(((sz3.w0) h0Var.f310123d).f414138i));
            int i18 = ((sz3.w0) h0Var.f310123d).f414138i;
            android.widget.ImageView imageView = x1Var3.f225549e;
            kotlin.jvm.internal.o.f(imageView, "<get-productInfoIconIv>(...)");
            java.lang.Object obj4 = h0Var.f310123d;
            byte[] bArr = ((sz3.w0) obj4).f414135f;
            int i19 = ((sz3.w0) obj4).f414136g;
            java.util.HashMap hashMap = com.tencent.mm.plugin.scanner.ui.widget.ScanProductMaskDecorView.f159759n;
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) com.tencent.mm.plugin.scanner.ui.widget.ScanProductMaskDecorView.f159759n.get(java.lang.String.valueOf(i18));
            if (bitmap == null || bitmap.isRecycled()) {
                ((ku5.t0) ku5.t0.f312615d).g(new d04.u1(i19, bArr, this, i18, imageView));
            } else {
                imageView.setImageBitmap(bitmap);
            }
            java.util.Objects.toString(h0Var.f310123d);
            android.view.View view7 = this.f225543p;
            if (view7 != null) {
                view7.getHeight();
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = this.f225535e.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == this.f225536f) {
            android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.chx, null);
            kotlin.jvm.internal.o.d(inflate);
            return new d04.s1(inflate);
        }
        android.view.View inflate2 = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.chy, null);
        kotlin.jvm.internal.o.d(inflate2);
        return new d04.x1(inflate2);
    }
}
