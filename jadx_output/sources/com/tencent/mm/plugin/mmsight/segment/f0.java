package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public final class f0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f149012d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.segment.g0 f149013e;

    /* renamed from: f, reason: collision with root package name */
    public int f149014f;

    /* renamed from: g, reason: collision with root package name */
    public int f149015g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f149016h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f149017i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend f149018m;

    public f0(com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend recyclerThumbSeekBarExtend, java.util.ArrayList dataList) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        this.f149018m = recyclerThumbSeekBarExtend;
        this.f149012d = dataList;
        this.f149013e = new com.tencent.mm.plugin.mmsight.segment.g0(recyclerThumbSeekBarExtend);
        int i17 = recyclerThumbSeekBarExtend.f148895n;
        this.f149014f = i17;
        this.f149015g = i17;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f149012d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((com.tencent.mm.plugin.mmsight.segment.e0) this.f149012d.get(i17)).f149010c;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.plugin.mmsight.segment.h0 vh6 = (com.tencent.mm.plugin.mmsight.segment.h0) k3Var;
        kotlin.jvm.internal.o.g(vh6, "vh");
        int itemViewType = getItemViewType(i17);
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend recyclerThumbSeekBarExtend = this.f149018m;
        if (itemViewType == recyclerThumbSeekBarExtend.f148906y || getItemViewType(i17) == recyclerThumbSeekBarExtend.f148907z) {
            if (i17 == 0) {
                vh6.itemView.setMinimumWidth(this.f149014f);
            } else {
                vh6.itemView.setMinimumWidth(this.f149015g);
            }
            vh6.itemView.setBackgroundColor(0);
            vh6.itemView.setMinimumHeight(recyclerThumbSeekBarExtend.f148890f);
            return;
        }
        java.util.ArrayList arrayList = this.f149012d;
        int b17 = a06.d.b((((float) ((com.tencent.mm.plugin.mmsight.segment.e0) arrayList.get(i17)).f149009b) / ((float) recyclerThumbSeekBarExtend.f148901t)) * recyclerThumbSeekBarExtend.f148891g);
        android.widget.ImageView imageView = vh6.f149029d;
        android.view.ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = b17;
        }
        if (imageView != null) {
            imageView.setLayoutParams(layoutParams);
        }
        com.tencent.mars.xlog.Log.i("RecyclerThumbSeekBar", "onBindViewHolder pos:" + i17 + " time:" + ((com.tencent.mm.plugin.mmsight.segment.e0) arrayList.get(i17)).f149008a + " width:" + b17 + " thumbWidth:" + recyclerThumbSeekBarExtend.f148891g);
        com.tencent.mm.plugin.mmsight.segment.g0 g0Var = this.f149013e;
        if (g0Var == null) {
            com.tencent.mars.xlog.Log.e("RecyclerThumbSeekBar", "onBindViewHolder ImageLoader invoked after released.");
            return;
        }
        int i18 = ((com.tencent.mm.plugin.mmsight.segment.e0) arrayList.get(i17)).f149008a;
        if (imageView == null || i18 < 0) {
            return;
        }
        int i19 = g0Var.f149025e.f148889e;
        int i27 = i18 > i19 ? i19 : i18;
        com.tencent.mars.xlog.Log.i("RecyclerThumbSeekBar", "loadImageAsync() called with: time = [" + i27 + "], view = [" + imageView + ']');
        java.lang.Object tag = imageView.getTag();
        com.tencent.mm.plugin.mmsight.segment.d0 d0Var = (tag == null || !(tag instanceof com.tencent.mm.plugin.mmsight.segment.d0)) ? null : (com.tencent.mm.plugin.mmsight.segment.d0) tag;
        if (d0Var != null && d0Var.f149001d == i27) {
            com.tencent.mars.xlog.Log.i("RecyclerThumbSeekBar", "SimpleImageLoader.loadImageAsync time equals %d return directly", java.lang.Integer.valueOf(i27));
            return;
        }
        if (d0Var != null) {
            d0Var.f149005h = true;
        }
        if (imageView.getDrawable() == null || !(imageView.getDrawable() instanceof android.graphics.drawable.BitmapDrawable)) {
            bitmap = null;
        } else {
            android.graphics.drawable.Drawable drawable = imageView.getDrawable();
            kotlin.jvm.internal.o.e(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
            bitmap = ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap();
        }
        imageView.setImageBitmap(null);
        com.tencent.mm.plugin.mmsight.segment.d0 d0Var2 = new com.tencent.mm.plugin.mmsight.segment.d0(g0Var.f149025e, i27, imageView, bitmap, g0Var.f149021a);
        imageView.setTag(d0Var2);
        int i28 = g0Var.f149024d;
        int i29 = i28 % g0Var.f149022b;
        g0Var.f149024d = i28 + 1;
        com.tencent.mm.sdk.platformtools.n3[] n3VarArr = g0Var.f149023c;
        if (n3VarArr[i29] == null) {
            return;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = n3VarArr[i29];
        kotlin.jvm.internal.o.d(n3Var);
        new com.tencent.mm.sdk.platformtools.n3(n3Var.getSerial()).post(d0Var2);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend recyclerThumbSeekBarExtend = this.f149018m;
        if (i17 == recyclerThumbSeekBarExtend.f148906y || i17 == recyclerThumbSeekBarExtend.f148907z) {
            android.view.View view = new android.view.View(recyclerThumbSeekBarExtend.getContext());
            if (i17 == recyclerThumbSeekBarExtend.f148906y) {
                this.f149016h = view;
            } else {
                this.f149017i = view;
            }
            return new com.tencent.mm.plugin.mmsight.segment.h0(recyclerThumbSeekBarExtend, view, i17);
        }
        android.widget.ImageView imageView = new android.widget.ImageView(recyclerThumbSeekBarExtend.getContext());
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        imageView.setMinimumWidth(recyclerThumbSeekBarExtend.f148891g);
        imageView.setMinimumHeight(recyclerThumbSeekBarExtend.f148890f);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(recyclerThumbSeekBarExtend.getContext());
        linearLayout.addView(imageView, recyclerThumbSeekBarExtend.f148891g, recyclerThumbSeekBarExtend.f148890f);
        return new com.tencent.mm.plugin.mmsight.segment.h0(recyclerThumbSeekBarExtend, linearLayout, recyclerThumbSeekBarExtend.A);
    }

    public final void x(boolean z17, int i17) {
        if (z17) {
            android.view.View view = this.f149016h;
            if (view != null) {
                kotlin.jvm.internal.o.d(view);
                view.setMinimumWidth(i17);
            }
            com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend recyclerThumbSeekBarExtend = this.f149018m;
            androidx.recyclerview.widget.RecyclerView recyclerView = recyclerThumbSeekBarExtend.f148897p;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.d(linearLayoutManager);
            if (linearLayoutManager.w() == 0) {
                androidx.recyclerview.widget.RecyclerView recyclerView2 = recyclerThumbSeekBarExtend.f148897p;
                if (recyclerView2 == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                recyclerView2.scrollBy(i17 - this.f149014f, 0);
            }
            this.f149014f = i17;
        } else {
            this.f149015g = i17;
            android.view.View view2 = this.f149017i;
            if (view2 != null) {
                kotlin.jvm.internal.o.d(view2);
                view2.setMinimumWidth(this.f149015g);
            }
        }
        com.tencent.mars.xlog.Log.i("RecyclerThumbSeekBar", "setCanScrollOverLength left:%B length:%d headLength:%d tailLength:%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f149014f), java.lang.Integer.valueOf(this.f149015g));
    }
}
