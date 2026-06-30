package rb2;

/* loaded from: classes3.dex */
public final class d1 extends android.widget.BaseAdapter {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f393604i = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f393605d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f393606e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f393607f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f393608g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView f393609h;

    public d1(com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView finderCommentImageGalleryView, java.lang.String str, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        str = (i17 & 1) != 0 ? null : str;
        z17 = (i17 & 2) != 0 ? false : z17;
        this.f393609h = finderCommentImageGalleryView;
        this.f393605d = z17;
        this.f393606e = str;
    }

    public final void a(java.lang.String str) {
        this.f393608g = str;
        com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView finderCommentImageGalleryView = this.f393609h;
        if (finderCommentImageGalleryView.f103078l1) {
            return;
        }
        gd2.n menuData = finderCommentImageGalleryView.getMenuData();
        boolean z17 = false;
        if (menuData != null && menuData.a(str)) {
            z17 = true;
        }
        finderCommentImageGalleryView.f103078l1 = z17;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f393606e;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup parent) {
        android.view.View progressBar;
        kotlin.jvm.internal.o.g(parent, "parent");
        java.lang.String str = this.f393606e;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        android.graphics.Bitmap bitmap = this.f393607f;
        com.tencent.mm.plugin.finder.convert.comment.FinderCommentImageGalleryView finderCommentImageGalleryView = this.f393609h;
        if (bitmap == null || view == null || str == null) {
            progressBar = new android.widget.ProgressBar(finderCommentImageGalleryView.getContext(), null, 0, com.tencent.mm.R.style.f494787w9);
            progressBar.setLayoutParams(new android.widget.Gallery.LayoutParams(-2, -2));
        } else {
            progressBar = view;
        }
        h0Var.f310123d = progressBar;
        if (progressBar instanceof android.widget.ProgressBar) {
            android.graphics.Bitmap bitmap2 = this.f393607f;
            if (bitmap2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(progressBar, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(progressBar, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderCommentImageGalleryView$ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                progressBar.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                android.view.View view2 = progressBar;
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentImageGalleryView$ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(view2, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = new com.tencent.mm.ui.base.MultiTouchImageView(finderCommentImageGalleryView.getContext(), bitmap2.getWidth(), bitmap2.getHeight());
                multiTouchImageView.setImageBitmap(bitmap2);
                multiTouchImageView.i();
                h0Var.f310123d = multiTouchImageView;
                multiTouchImageView.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
                return (android.view.View) h0Var.f310123d;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(progressBar, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(progressBar, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderCommentImageGalleryView$ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            progressBar.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            android.view.View view3 = progressBar;
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentImageGalleryView$ImageAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(view3, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f393607f == null && str != null) {
            if (this.f393605d) {
                vo0.e eVar = vo0.e.f438467a;
                wo0.c i18 = vo0.e.f438468b.i(str);
                i18.f447873d = new rb2.a1(str, this, i17, h0Var);
                i18.d();
            } else {
                wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128355e));
                if (a17 instanceof wo0.b) {
                    a17.f447873d = new rb2.c1(str, this, i17, h0Var);
                    a17.d();
                }
            }
        }
        return (android.view.View) h0Var.f310123d;
    }
}
