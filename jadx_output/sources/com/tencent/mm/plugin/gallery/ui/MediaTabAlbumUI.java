package com.tencent.mm.plugin.gallery.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/gallery/ui/MediaTabAlbumUI;", "Lcom/tencent/mm/plugin/gallery/ui/AlbumPreviewUI;", "<init>", "()V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MediaTabAlbumUI extends com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI {

    /* renamed from: x2, reason: collision with root package name */
    public static final /* synthetic */ int f138612x2 = 0;

    /* renamed from: u2, reason: collision with root package name */
    public final java.lang.String f138613u2 = "MicroMsg.MediaTabAlbumUI";

    /* renamed from: v2, reason: collision with root package name */
    public final jz5.g f138614v2 = jz5.h.b(e33.z4.f247565d);

    /* renamed from: w2, reason: collision with root package name */
    public final jz5.g f138615w2 = jz5.h.b(new e33.a5(this));

    @Override // com.tencent.mm.ui.gallery.BaseMediaTabActivity
    public android.view.View U6() {
        return g8();
    }

    @Override // com.tencent.mm.ui.gallery.BaseMediaTabActivity
    public void V6(androidx.appcompat.app.AppCompatActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i(this.f138613u2, "onPageSelected: ");
        q7();
        i33.z1 z1Var = (i33.z1) pf5.z.f353948a.a(this).a(i33.z1.class);
        android.view.Window window = activity.getWindow();
        z1Var.f288302f = window;
        if (window != null) {
            window.clearFlags(1024);
        }
        activity.getWindow().getDecorView().setFitsSystemWindows(true);
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI
    public boolean V7() {
        boolean V7 = super.V7();
        if (!getIntent().getBooleanExtra("key_force_hide_smart_gallery_entry", false)) {
            return V7;
        }
        com.tencent.mars.xlog.Log.i(this.f138613u2, "showSmartGalleryEntry: forceHideEntry");
        return false;
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI
    public void c8(int i17) {
        super.c8(i17);
        if (i17 == 0) {
            f8(true);
        } else {
            f8(false);
        }
    }

    public final void f8(boolean z17) {
        java.lang.String str = this.f138613u2;
        if (z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("changeVisibilityAlbumFooterWithSlideOutOfPage hide, ");
            sb6.append(this.f208685e == null);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            xg5.a aVar = this.f208685e;
            if (aVar != null) {
                ((b33.f) aVar).V6();
                return;
            }
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("changeVisibilityAlbumFooterWithSlideOutOfPage show, ");
        sb7.append(this.f208685e == null);
        com.tencent.mars.xlog.Log.i(str, sb7.toString());
        xg5.a aVar2 = this.f208685e;
        if (aVar2 != null) {
            ((b33.f) aVar2).X6();
        }
    }

    public final com.tencent.mm.plugin.gallery.view.AlbumFooterBarView g8() {
        return (com.tencent.mm.plugin.gallery.view.AlbumFooterBarView) ((jz5.n) this.f138614v2).getValue();
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        android.view.View view;
        android.view.View findViewById;
        java.lang.String str = this.f138613u2;
        com.tencent.mars.xlog.Log.i(str, "initView: start");
        super.initView();
        com.tencent.mm.plugin.gallery.view.AlbumFooterBarView g86 = g8();
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(g86 != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AlbumPreviewUI", "updateViewRefAboutAlbumFooterBar: %b", objArr);
        if (g86 != null) {
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f482847pn);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI", "updateViewRefAboutAlbumFooterBar", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/gallery/ui/AlbumPreviewUI", "updateViewRefAboutAlbumFooterBar", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = (android.widget.TextView) g86.findViewById(com.tencent.mm.R.id.je8);
            this.f138518g = textView;
            textView.setTextSize(0, i65.a.f(this, com.tencent.mm.R.dimen.f479897ia));
            this.f138518g.setOnClickListener(new e33.e1(this));
        }
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(this).a(i33.k1.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        i33.k1 k1Var = (i33.k1) a17;
        xg5.a aVar = this.f208685e;
        if (aVar != null) {
            view = (android.view.View) ((jz5.n) ((b33.f) aVar).f17663f).getValue();
            kotlin.jvm.internal.o.f(view, "<get-bottomContainer>(...)");
        } else {
            view = null;
        }
        if (view != null) {
            ((java.util.List) ((jz5.n) k1Var.f288210g).getValue()).add(new i33.g1(view, 0, 2, null));
            view.getId();
            view.getVisibility();
        }
        if (com.tencent.mm.ui.b4.c(this) && (findViewById = findViewById(com.tencent.mm.R.id.hwa)) != null) {
            com.tencent.mm.ui.a4.g(findViewById, true);
        }
        com.tencent.mars.xlog.Log.i(str, "initView: end");
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI
    public boolean k7() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPermissionOnCreate:");
        jz5.g gVar = this.f138615w2;
        sb6.append(((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue());
        com.tencent.mars.xlog.Log.i(this.f138613u2, sb6.toString());
        return ((java.lang.Boolean) ((jz5.n) gVar).getValue()).booleanValue();
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView imageFolderMgrView = this.f138540r;
        if (imageFolderMgrView == null || !imageFolderMgrView.f138565m) {
            super.onBackPressed();
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f138613u2, "onBackPressed: handle folderView expand");
        this.f138540r.d();
        playActionBarOperationAreaAnim();
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i(this.f138613u2, "onDestroy");
        super.onDestroy();
        dx1.g.f244489a.j("SnsPublishProcess", "selectionPageStaytime_", java.lang.Long.valueOf(getActivityBrowseTimeMs()), bx1.u.f36310e);
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(i33.z1.class);
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI
    public android.widget.TextView u7() {
        android.view.View findViewById = g8().findViewById(com.tencent.mm.R.id.kaq);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (android.widget.TextView) findViewById;
    }
}
