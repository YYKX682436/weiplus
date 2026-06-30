package rb2;

/* loaded from: classes15.dex */
public final class j1 implements android.widget.AdapterView.OnItemSelectedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView f393662d;

    public j1(com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView finderCommentImageGalleryView) {
        this.f393662d = finderCommentImageGalleryView;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderCommentImageGalleryView$init$3", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView finderCommentImageGalleryView = this.f393662d;
        if (!finderCommentImageGalleryView.f103078l1) {
            gd2.n menuData = finderCommentImageGalleryView.getMenuData();
            boolean z17 = false;
            if (menuData != null && menuData.a(finderCommentImageGalleryView.getLocalImagePath())) {
                z17 = true;
            }
            finderCommentImageGalleryView.f103078l1 = z17;
        }
        android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener = finderCommentImageGalleryView.f103084z1;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onItemSelected(adapterView, view, i17, j17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentImageGalleryView$init$3", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView adapterView) {
        android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener = this.f393662d.f103084z1;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onNothingSelected(adapterView);
        }
    }
}
