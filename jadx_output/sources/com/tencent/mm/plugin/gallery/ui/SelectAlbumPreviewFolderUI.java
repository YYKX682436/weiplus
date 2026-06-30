package com.tencent.mm.plugin.gallery.ui;

@db5.a(19)
/* loaded from: classes10.dex */
public class SelectAlbumPreviewFolderUI extends com.tencent.mm.ui.MMActivity implements t23.k1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f138616d = new java.util.ArrayList(10);

    /* renamed from: e, reason: collision with root package name */
    public e33.k5 f138617e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f138618f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem f138619g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f138620h;

    public static java.lang.String T6(com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI selectAlbumPreviewFolderUI) {
        selectAlbumPreviewFolderUI.getClass();
        return t23.p0.k().f415298g == 1 ? selectAlbumPreviewFolderUI.getString(com.tencent.mm.R.string.fi_) : t23.p0.k().f415298g == 3 ? selectAlbumPreviewFolderUI.getString(com.tencent.mm.R.string.fia) : selectAlbumPreviewFolderUI.getString(com.tencent.mm.R.string.fib);
    }

    @Override // t23.k1
    public void F6(java.util.LinkedList linkedList) {
        t23.p0.n().c(new e33.j5(this, linkedList));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cjs;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        t23.p0.k().f415292a.remove(this);
        t23.p0.k().f415292a.add(this);
        t23.p0.k().d();
        this.f138618f = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.f485030ga5);
        this.f138617e = new e33.k5(this, this);
        this.f138618f.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
        this.f138618f.setAdapter(this.f138617e);
        this.f138620h = getIntent().getStringExtra("select_folder_name");
        com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem = new com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem("", 0);
        this.f138619g = galleryItem$AlbumItem;
        galleryItem$AlbumItem.f138420i = new com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem();
        java.lang.String string = getString(com.tencent.mm.R.string.f490410u7);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        setMMTitle(string != null ? string : "");
        setBackBtn(new e33.i5(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        t23.p0.k().f415292a.remove(this);
    }
}
