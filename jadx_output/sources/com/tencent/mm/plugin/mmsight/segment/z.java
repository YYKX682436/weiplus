package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class z extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.segment.a0 f149111d;

    /* renamed from: e, reason: collision with root package name */
    public int f149112e;

    /* renamed from: f, reason: collision with root package name */
    public int f149113f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f149114g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f149115h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar f149116i;

    public z(com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar, com.tencent.mm.plugin.mmsight.segment.q qVar) {
        this.f149116i = recyclerThumbSeekBar;
        this.f149111d = new com.tencent.mm.plugin.mmsight.segment.a0(recyclerThumbSeekBar);
        int i17 = recyclerThumbSeekBar.f148882q;
        this.f149112e = i17;
        this.f149113f = i17;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        if (this.f149116i.f148874f <= 0) {
            return 0;
        }
        return java.lang.Math.max(0, (int) java.lang.Math.floor(r1 / r0.f148873e)) + 2;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        if (i17 == 0) {
            return 1;
        }
        return i17 == getItemCount() - 1 ? 2 : 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.mmsight.segment.b0 b0Var = (com.tencent.mm.plugin.mmsight.segment.b0) k3Var;
        int itemViewType = getItemViewType(i17);
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar = this.f149116i;
        if (itemViewType == 1 || getItemViewType(i17) == 2) {
            if (i17 == 0) {
                b0Var.itemView.setMinimumWidth(this.f149112e);
            } else {
                b0Var.itemView.setMinimumWidth(this.f149113f);
            }
            b0Var.itemView.setBackgroundColor(0);
            b0Var.itemView.setMinimumHeight(recyclerThumbSeekBar.f148875g);
            return;
        }
        com.tencent.mm.plugin.mmsight.segment.a0 a0Var = this.f149111d;
        if (a0Var == null) {
            com.tencent.mars.xlog.Log.e("RecyclerThumbSeekBar", "onBindViewHolder ImageLoader invoked after released.");
            return;
        }
        int i18 = i17 * recyclerThumbSeekBar.f148873e;
        android.widget.ImageView imageView = b0Var.f148986d;
        if (imageView == null || i18 < 0) {
            return;
        }
        int i19 = a0Var.f148980e.f148874f;
        int i27 = i18 > i19 ? i19 : i18;
        com.tencent.mars.xlog.Log.i("RecyclerThumbSeekBar", "loadImageAsync() called with: time = [" + i27 + "], view = [" + imageView + "]");
        java.lang.Object tag = imageView.getTag();
        com.tencent.mm.plugin.mmsight.segment.y yVar = (tag == null || !(tag instanceof com.tencent.mm.plugin.mmsight.segment.y)) ? null : (com.tencent.mm.plugin.mmsight.segment.y) tag;
        if (yVar != null && yVar.f149104d == i27) {
            com.tencent.mars.xlog.Log.i("RecyclerThumbSeekBar", "SimpleImageLoader.loadImageAsync time equals %d return directly", java.lang.Integer.valueOf(i27));
            return;
        }
        if (yVar != null) {
            yVar.f149106f = true;
        }
        android.graphics.Bitmap bitmap = (imageView.getDrawable() == null || !(imageView.getDrawable() instanceof android.graphics.drawable.BitmapDrawable)) ? null : ((android.graphics.drawable.BitmapDrawable) imageView.getDrawable()).getBitmap();
        imageView.setImageBitmap(null);
        com.tencent.mm.plugin.mmsight.segment.y yVar2 = new com.tencent.mm.plugin.mmsight.segment.y(a0Var.f148980e, i27, imageView, bitmap, a0Var.f148976a);
        imageView.setTag(yVar2);
        int i28 = a0Var.f148979d;
        int i29 = i28 % a0Var.f148977b;
        a0Var.f148979d = i28 + 1;
        com.tencent.mm.sdk.platformtools.n3[] n3VarArr = a0Var.f148978c;
        if (n3VarArr[i29] == null) {
            return;
        }
        new com.tencent.mm.sdk.platformtools.n3(n3VarArr[i29].getSerial()).post(yVar2);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar = this.f149116i;
        if (i17 == 1 || i17 == 2) {
            android.view.View view = new android.view.View(recyclerThumbSeekBar.getContext());
            if (i17 == 1) {
                this.f149114g = view;
            } else {
                this.f149115h = view;
            }
            return new com.tencent.mm.plugin.mmsight.segment.b0(recyclerThumbSeekBar, view, 1);
        }
        android.widget.ImageView imageView = new android.widget.ImageView(recyclerThumbSeekBar.getContext());
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        imageView.setMinimumWidth(recyclerThumbSeekBar.f148876h);
        imageView.setMinimumHeight(recyclerThumbSeekBar.f148875g);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(recyclerThumbSeekBar.getContext());
        linearLayout.addView(imageView, recyclerThumbSeekBar.f148876h, recyclerThumbSeekBar.f148875g);
        return new com.tencent.mm.plugin.mmsight.segment.b0(recyclerThumbSeekBar, linearLayout, 0);
    }

    public void x(boolean z17, int i17) {
        if (!z17) {
            this.f149113f = i17;
            android.view.View view = this.f149115h;
            if (view != null) {
                view.setMinimumWidth(i17);
                return;
            }
            return;
        }
        android.view.View view2 = this.f149114g;
        if (view2 != null) {
            view2.setMinimumWidth(i17);
        }
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar = this.f149116i;
        if (((androidx.recyclerview.widget.LinearLayoutManager) recyclerThumbSeekBar.f148879n.getLayoutManager()).w() == 0) {
            recyclerThumbSeekBar.f148879n.scrollBy(i17 - this.f149112e, 0);
        }
        this.f149112e = i17;
    }
}
