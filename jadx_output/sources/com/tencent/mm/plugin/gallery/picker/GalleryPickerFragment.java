package com.tencent.mm.plugin.gallery.picker;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0002¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/gallery/picker/GalleryPickerFragment;", "Landroidx/fragment/app/Fragment;", "", "Ld33/s0;", "Lcom/tencent/mm/plugin/gallery/model/GalleryItem$MediaItem;", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class GalleryPickerFragment extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment implements d33.s0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f138452h = 0;

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f138453d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.gallery.picker.view.MMMediaCropLayout f138454e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f138455f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f138456g;

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        t23.x1 x1Var = a33.c.f1056a;
        t23.x1 x1Var2 = new t23.x1();
        a33.c.f1056a = x1Var2;
        x1Var2.g(3);
        t23.x1 x1Var3 = a33.c.f1056a;
        kotlin.jvm.internal.o.d(x1Var3);
        a33.b bVar = a33.c.f1057b;
        x1Var3.b(bVar);
        t23.x1 x1Var4 = a33.c.f1056a;
        kotlin.jvm.internal.o.d(x1Var4);
        a33.a aVar = a33.c.f1058c;
        x1Var4.f415292a.add(aVar);
        w23.f fVar = new w23.f(this);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = a33.c.f1060e;
        com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem = new com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem(str, 0);
        bVar.f1055e = fVar;
        bVar.f1054d = currentTimeMillis;
        com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem2 = a33.c.f1059d;
        java.lang.String str2 = galleryItem$AlbumItem.f138415d;
        boolean z17 = galleryItem$AlbumItem2 == null || !kotlin.jvm.internal.o.b(galleryItem$AlbumItem2.f138415d, str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.PickerDataLoader", "[onLoad] ticket=" + currentTimeMillis + " isNeed=" + z17);
        if (!z17) {
            fVar.invoke(java.lang.Boolean.FALSE, new java.util.LinkedList(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } else if (kotlin.jvm.internal.o.b(str2, str)) {
            t23.x1 x1Var5 = a33.c.f1056a;
            if (x1Var5 != null) {
                x1Var5.e("", 3, currentTimeMillis);
            }
        } else if (kotlin.jvm.internal.o.b(str2, a33.c.f1061f)) {
            t23.x1 x1Var6 = a33.c.f1056a;
            if (x1Var6 != null) {
                x1Var6.e("", 2, currentTimeMillis);
            }
        } else {
            t23.x1 x1Var7 = a33.c.f1056a;
            if (x1Var7 != null) {
                x1Var7.e(str2, galleryItem$AlbumItem.f138420i.getType(), currentTimeMillis);
            }
        }
        a33.c.f1059d = galleryItem$AlbumItem;
        w23.h hVar = new w23.h(this);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.PickerDataLoader", "[onLoadFolder] ticket=" + currentTimeMillis2);
        aVar.f1053e = hVar;
        aVar.f1052d = currentTimeMillis2;
        t23.x1 x1Var8 = a33.c.f1056a;
        if (x1Var8 != null) {
            x1Var8.d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.tencent.mm.R.layout.bdn, viewGroup, false);
        kotlin.jvm.internal.o.d(inflate);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.gig);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f138453d = (androidx.recyclerview.widget.RecyclerView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.l3x);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.plugin.gallery.picker.view.MMMediaCropLayout mMMediaCropLayout = (com.tencent.mm.plugin.gallery.picker.view.MMMediaCropLayout) findViewById2;
        this.f138454e = mMMediaCropLayout;
        mMMediaCropLayout.getLayoutParams().height = (int) ((getResources().getDisplayMetrics().widthPixels * 3.5f) / 3.0f);
        mMMediaCropLayout.requestLayout();
        mMMediaCropLayout.setOnClickListener(new w23.d(this));
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.f486014jv2);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById3;
        this.f138455f = imageView;
        imageView.setBackground(null);
        android.widget.ImageView imageView2 = this.f138455f;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("multiSelectedIcon");
            throw null;
        }
        imageView2.setOnClickListener(new w23.b(this));
        android.widget.ImageView imageView3 = this.f138455f;
        if (imageView3 == null) {
            kotlin.jvm.internal.o.o("multiSelectedIcon");
            throw null;
        }
        imageView3.setVisibility(8);
        com.tencent.mm.plugin.gallery.picker.manager.SpeedGirdLayoutManager speedGirdLayoutManager = new com.tencent.mm.plugin.gallery.picker.manager.SpeedGirdLayoutManager(getContext(), 4);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f138453d;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("galleryView");
            throw null;
        }
        recyclerView.setLayoutManager(speedGirdLayoutManager);
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f138453d;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("galleryView");
            throw null;
        }
        recyclerView2.setAdapter(null);
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f138453d;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("galleryView");
            throw null;
        }
        recyclerView3.N(new w23.a(this));
        w23.c cVar = new w23.c();
        androidx.recyclerview.widget.RecyclerView recyclerView4 = this.f138453d;
        if (recyclerView4 == null) {
            kotlin.jvm.internal.o.o("galleryView");
            throw null;
        }
        recyclerView4.setItemAnimator(cVar);
        androidx.recyclerview.widget.RecyclerView recyclerView5 = this.f138453d;
        if (recyclerView5 == null) {
            kotlin.jvm.internal.o.o("galleryView");
            throw null;
        }
        recyclerView5.setHasFixedSize(true);
        androidx.recyclerview.widget.y2 y2Var = new androidx.recyclerview.widget.y2();
        y2Var.e(1, 80);
        y2Var.e(2, 60);
        androidx.recyclerview.widget.RecyclerView recyclerView6 = this.f138453d;
        if (recyclerView6 == null) {
            kotlin.jvm.internal.o.o("galleryView");
            throw null;
        }
        recyclerView6.setRecycledViewPool(y2Var);
        speedGirdLayoutManager.setItemPrefetchEnabled(true);
        speedGirdLayoutManager.f11881u = 30;
        throw null;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        t23.x1 x1Var = a33.c.f1056a;
        a33.c.f1059d = null;
        t23.x1 x1Var2 = a33.c.f1056a;
        if (x1Var2 != null) {
            java.util.HashSet hashSet = x1Var2.f415292a;
            if (hashSet != null) {
                hashSet.clear();
            }
            java.util.HashSet hashSet2 = x1Var2.f415294c;
            if (hashSet2 != null) {
                hashSet2.clear();
            }
            java.util.HashSet hashSet3 = x1Var2.f415295d;
            if (hashSet3 != null) {
                hashSet3.clear();
            }
        }
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.gallery.picker.view.MMMediaCropLayout mMMediaCropLayout = this.f138454e;
        if (mMMediaCropLayout != null) {
            mMMediaCropLayout.getVideoView().e();
        } else {
            kotlin.jvm.internal.o.o("previewContainer");
            throw null;
        }
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.gallery.picker.view.MMMediaCropLayout mMMediaCropLayout = this.f138454e;
        if (mMMediaCropLayout != null) {
            mMMediaCropLayout.getVideoView().g();
        } else {
            kotlin.jvm.internal.o.o("previewContainer");
            throw null;
        }
    }
}
