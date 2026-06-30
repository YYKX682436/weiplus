package com.tencent.mm.plugin.gallery.ui;

/* loaded from: classes10.dex */
public class ImageFolderMgrView extends android.widget.LinearLayout implements t23.k1, android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public e33.e3 f138559d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f138560e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f138561f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.RoundedCornerFrameLayout f138562g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f138563h;

    /* renamed from: i, reason: collision with root package name */
    public e33.c2 f138564i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f138565m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f138566n;

    /* renamed from: o, reason: collision with root package name */
    public t23.k1 f138567o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f138568p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.gallery.model.PrivateAlbumItem f138569q;

    /* renamed from: r, reason: collision with root package name */
    public e33.g3 f138570r;

    /* renamed from: s, reason: collision with root package name */
    public e33.f3 f138571s;

    public ImageFolderMgrView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f138559d = null;
        this.f138565m = false;
        this.f138566n = false;
        this.f138568p = new java.util.LinkedList();
        this.f138569q = null;
        setOrientation(1);
        this.f138560e = new android.widget.FrameLayout(getContext());
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        this.f138560e.setVisibility(8);
        addView(this.f138560e, layoutParams);
        android.view.View view = new android.view.View(getContext());
        this.f138561f = view;
        view.setBackgroundColor(-872415232);
        this.f138561f.setOnClickListener(new e33.y2(this));
        this.f138560e.addView(this.f138561f, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = new com.tencent.mm.ui.widget.RoundedCornerFrameLayout(getContext());
        this.f138562g = roundedCornerFrameLayout;
        roundedCornerFrameLayout.b(0.0f, 0.0f, com.tencent.mm.ui.zk.a(getContext(), 8), com.tencent.mm.ui.zk.a(getContext(), 8));
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a1w);
        layoutParams2.gravity = 48;
        this.f138560e.addView(this.f138562g, layoutParams2);
        android.widget.ListView listView = new android.widget.ListView(getContext());
        this.f138563h = listView;
        listView.setCacheColorHint(0);
        this.f138563h.setOnItemClickListener(this);
        this.f138562g.addView(this.f138563h, new android.widget.RelativeLayout.LayoutParams(-1, -2));
        e33.c2 c2Var = new e33.c2(getContext());
        this.f138564i = c2Var;
        this.f138563h.setAdapter((android.widget.ListAdapter) c2Var);
        this.f138567o = new e33.z2(this);
        getViewTreeObserver().addOnPreDrawListener(new e33.b3(this));
    }

    @Override // t23.k1
    public void F6(java.util.LinkedList linkedList) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageFolderMgrView", "onQueryAlbumFinished, %s, size: %s.", this, java.lang.Integer.valueOf(linkedList.size()));
        t23.p0.k().f415292a.remove(this);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem) it.next();
            if (com.tencent.mm.vfs.w6.j(galleryItem$AlbumItem.n())) {
                linkedList2.add(galleryItem$AlbumItem);
            }
        }
        t23.p0.n().c(new e33.d3(this, linkedList2));
    }

    public final void a(boolean z17) {
        if (this.f138565m == z17 || this.f138566n) {
            return;
        }
        if (this.f138565m) {
            this.f138566n = true;
            android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
            translateAnimation.setDuration(300L);
            translateAnimation.setAnimationListener(new e33.x2(this));
            this.f138563h.startAnimation(translateAnimation);
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setDuration(300L);
            this.f138561f.startAnimation(alphaAnimation);
            return;
        }
        this.f138566n = true;
        this.f138560e.setVisibility(0);
        android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(300L);
        this.f138561f.startAnimation(alphaAnimation2);
        android.view.animation.TranslateAnimation translateAnimation2 = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
        translateAnimation2.setDuration(300L);
        translateAnimation2.setAnimationListener(new e33.w2(this));
        this.f138563h.startAnimation(translateAnimation2);
    }

    public void b(java.util.List list, v23.b bVar) {
        com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem2 = null;
        while (it.hasNext()) {
            v23.b bVar2 = (v23.b) it.next();
            kotlin.jvm.internal.o.g(bVar2, "<this>");
            if (bVar2 instanceof v23.c) {
                galleryItem$AlbumItem = ((v23.c) bVar2).f432892g;
            } else {
                java.util.List list2 = bVar2.f432887b;
                galleryItem$AlbumItem = new com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem(bVar2.f432886a, list2.size());
                galleryItem$AlbumItem.r(bVar2.f432888c);
                galleryItem$AlbumItem.f138420i = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) kz5.n0.a0(list2, 0);
                galleryItem$AlbumItem.f138421m = bVar2.f432889d;
                galleryItem$AlbumItem.f138422n = bVar2.f432890e == 2;
            }
            linkedList.add(galleryItem$AlbumItem);
            if (bVar != null && bVar2 == bVar) {
                galleryItem$AlbumItem2 = galleryItem$AlbumItem;
            }
        }
        this.f138564i.d(linkedList);
        if (galleryItem$AlbumItem2 != null) {
            e33.c2 c2Var = this.f138564i;
            java.lang.String str = galleryItem$AlbumItem2.f138418g;
            c2Var.getClass();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str2 = galleryItem$AlbumItem2.f138415d;
            if (str2 == null) {
                str2 = "";
            }
            c2Var.f247185f = str2;
            c2Var.f247186g = str;
        }
        this.f138564i.notifyDataSetChanged();
    }

    public com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem c(int i17) {
        com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem item = this.f138564i.getItem(i17);
        if (item == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageFolderMgrView", "toSelectItemByPos, get folder failed:" + i17);
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageFolderMgrView", "toSelectItemByPos: %d", java.lang.Integer.valueOf(i17));
        a(false);
        e33.e3 e3Var = this.f138559d;
        if (e3Var != null) {
            com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = ((e33.e0) e3Var).f247209a;
            albumPreviewUI.f138514d2 = item;
            e33.d2 d2Var = albumPreviewUI.f138519g2;
            if (d2Var != null) {
                com.tencent.mm.plugin.emoji.ui.picker.EmojiMediaPickerUI emojiMediaPickerUI = ((e22.f) d2Var).f246648a;
                emojiMediaPickerUI.W6().a();
                com.tencent.mm.plugin.emoji.ui.picker.GalleryTabTittleView W6 = emojiMediaPickerUI.W6();
                java.lang.String nickName = item.f138416e;
                kotlin.jvm.internal.o.f(nickName, "nickName");
                W6.f98152d.setText(nickName);
            }
        }
        e33.c2 c2Var = this.f138564i;
        java.lang.String str = item.f138418g;
        c2Var.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str2 = item.f138415d;
        if (str2 == null) {
            str2 = "";
        }
        c2Var.f247185f = str2;
        c2Var.f247186g = str;
        this.f138564i.notifyDataSetChanged();
        return item;
    }

    public void d() {
        a(!this.f138565m);
        e33.c2 c2Var = this.f138564i;
        java.util.LinkedList linkedList = c2Var.f247184e;
        if (linkedList == null || linkedList.size() == 0 || !c2Var.f247187h) {
            return;
        }
        for (int i17 = 0; i17 < c2Var.f247184e.size(); i17++) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem) c2Var.f247184e.get(i17);
            if (galleryItem$AlbumItem != null && galleryItem$AlbumItem.f138423o) {
                t23.p0.n().d(new e33.a2(c2Var, new java.util.concurrent.atomic.AtomicReference(galleryItem$AlbumItem)));
            }
        }
    }

    public java.lang.String getSelectedAlbumName() {
        return this.f138564i.f247185f;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/ImageFolderMgrView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        c(i17);
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/ImageFolderMgrView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public void setFavItemCount(int i17) {
        this.f138564i.getClass();
        e33.h3 h3Var = new e33.h3(null);
        h3Var.f247252d = new java.lang.ref.WeakReference(this.f138564i);
        t23.p0.n().c(h3Var);
    }

    public void setFolderAlbumDialogDismiss(e33.f3 f3Var) {
        this.f138571s = f3Var;
    }

    public void setListener(e33.e3 e3Var) {
        this.f138559d = e3Var;
    }

    public void setOnFolderStateChanged(e33.g3 g3Var) {
        this.f138570r = g3Var;
    }

    public void setupEnableCheckMediaCount(java.lang.Boolean bool) {
        this.f138564i.f247187h = bool.booleanValue();
    }
}
