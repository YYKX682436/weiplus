package x14;

/* loaded from: classes5.dex */
public final class b extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView f451432d;

    public b(com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView getHdHeadImageGalleryView) {
        this.f451432d = getHdHeadImageGalleryView;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return java.lang.Integer.valueOf(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        x14.a aVar;
        android.view.View view2;
        com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView getHdHeadImageGalleryView = this.f451432d;
        if (view == null) {
            aVar = new x14.a(this);
            view2 = android.view.View.inflate(getHdHeadImageGalleryView.getContext(), com.tencent.mm.R.layout.d3s, null);
            android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.gxh);
            kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.ProgressBar");
            aVar.f451429a = (android.widget.ProgressBar) findViewById;
            android.view.View findViewById2 = view2.findViewById(com.tencent.mm.R.id.gxg);
            kotlin.jvm.internal.o.e(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
            aVar.f451430b = (android.widget.ImageView) findViewById2;
            aVar.f451431c = view2.findViewById(com.tencent.mm.R.id.gxi);
            view2.setTag(aVar);
        } else {
            java.lang.Object tag = view.getTag();
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView.ImageAdapter.ViewHolder");
            aVar = (x14.a) tag;
            view2 = view;
        }
        view2.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
        android.graphics.Bitmap bitmap = getHdHeadImageGalleryView.f161653y1;
        if (bitmap != null) {
            android.widget.ProgressBar progressBar = aVar.f451429a;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            android.widget.ImageView imageView = aVar.f451430b;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            android.view.View view3 = aVar.f451431c;
            if (view3 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/view/GetHdHeadImageGalleryView$ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/setting/ui/setting/view/GetHdHeadImageGalleryView$ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = new com.tencent.mm.ui.base.MultiTouchImageView(getHdHeadImageGalleryView.getContext(), bitmap.getWidth(), bitmap.getHeight());
            multiTouchImageView.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
            multiTouchImageView.setImageBitmap(bitmap);
            multiTouchImageView.setMaxZoomLimit(2.0f);
            multiTouchImageView.setMaxZoomDoubleTab(true);
            return multiTouchImageView;
        }
        if (getHdHeadImageGalleryView.f161654z1) {
            android.widget.ProgressBar progressBar2 = aVar.f451429a;
            if (progressBar2 != null) {
                progressBar2.setVisibility(8);
            }
            android.view.View view4 = aVar.f451431c;
            if (view4 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/view/GetHdHeadImageGalleryView$ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/setting/ui/setting/view/GetHdHeadImageGalleryView$ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.widget.ProgressBar progressBar3 = aVar.f451429a;
            if (progressBar3 != null) {
                progressBar3.setVisibility(0);
            }
            android.view.View view5 = aVar.f451431c;
            if (view5 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/view/GetHdHeadImageGalleryView$ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/setting/ui/setting/view/GetHdHeadImageGalleryView$ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.widget.ImageView imageView2 = aVar.f451430b;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        android.widget.ImageView imageView3 = aVar.f451430b;
        if (imageView3 != null) {
            imageView3.setImageBitmap(getHdHeadImageGalleryView.f161651x1);
        }
        return view2;
    }
}
