package e33;

/* loaded from: classes10.dex */
public class k5 extends androidx.recyclerview.widget.f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f247310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI f247311e;

    public k5(com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI selectAlbumPreviewFolderUI, android.content.Context context) {
        this.f247311e = selectAlbumPreviewFolderUI;
        this.f247310d = context;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f247311e.f138616d.size() + 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem;
        e33.l5 l5Var = (e33.l5) k3Var;
        com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI selectAlbumPreviewFolderUI = this.f247311e;
        com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem = i17 == 0 ? selectAlbumPreviewFolderUI.f138619g : (com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem) selectAlbumPreviewFolderUI.f138616d.get(i17 - 1);
        l5Var.f247336i.setOnClickListener(this);
        l5Var.f247336i.setTag(galleryItem$AlbumItem);
        java.lang.String str = selectAlbumPreviewFolderUI.f138620h;
        android.widget.ImageView imageView = l5Var.f247335h;
        if (str == null || !(str.equals(galleryItem$AlbumItem.f138415d) || (selectAlbumPreviewFolderUI.f138620h.equals(com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI.T6(selectAlbumPreviewFolderUI)) && i17 == 0))) {
            imageView.setVisibility(4);
        } else {
            imageView.setVisibility(0);
        }
        android.widget.TextView textView = l5Var.f247334g;
        android.widget.ImageView imageView2 = l5Var.f247331d;
        android.widget.TextView textView2 = l5Var.f247333f;
        if (i17 == 0) {
            imageView2.setImageResource(com.tencent.mm.R.drawable.ccy);
            if (galleryItem$AlbumItem.f138420i != null) {
                e33.m6.a(l5Var.f247331d, galleryItem$AlbumItem.o(), galleryItem$AlbumItem.n(), galleryItem$AlbumItem.h(), galleryItem$AlbumItem.i(), i17, galleryItem$AlbumItem.m());
            }
            textView2.setText(com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI.T6(selectAlbumPreviewFolderUI));
            imageView2.setVisibility(0);
            textView2.setVisibility(0);
            textView.setVisibility(8);
            return;
        }
        imageView2.setVisibility(0);
        textView2.setVisibility(0);
        textView2.setText(galleryItem$AlbumItem.f138415d);
        textView.setVisibility(0);
        textView.setText(this.f247310d.getString(com.tencent.mm.R.string.fiv, java.lang.String.valueOf(galleryItem$AlbumItem.f138417f)));
        android.widget.ImageView imageView3 = l5Var.f247332e;
        if (imageView3 != null && (galleryItem$MediaItem = galleryItem$AlbumItem.f138420i) != null) {
            imageView3.setVisibility(galleryItem$MediaItem.getType() != 2 ? 8 : 0);
        }
        java.lang.String n17 = galleryItem$AlbumItem.n();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(n17) && galleryItem$AlbumItem.f138420i != null) {
            e33.m6.a(l5Var.f247331d, galleryItem$AlbumItem.o(), n17, galleryItem$AlbumItem.h(), galleryItem$AlbumItem.i(), i17, galleryItem$AlbumItem.m());
            return;
        }
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem2 = galleryItem$AlbumItem.f138420i;
        if (galleryItem$MediaItem2 != null && galleryItem$MediaItem2.getType() == 2) {
            e33.m6.a(l5Var.f247331d, galleryItem$AlbumItem.o(), null, galleryItem$AlbumItem.h(), galleryItem$AlbumItem.i(), i17, galleryItem$AlbumItem.m());
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SelectAlbumPreviewFolderUI", "get folder failed");
        imageView2.setVisibility(8);
        textView2.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/SelectAlbumPreviewFolderUI$SelectImageFolderAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.gallery.ui.SelectAlbumPreviewFolderUI selectAlbumPreviewFolderUI = this.f247311e;
        android.content.Intent intent = new android.content.Intent(selectAlbumPreviewFolderUI, (java.lang.Class<?>) com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.class);
        intent.putExtra("select_folder_name", (com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem) view.getTag());
        intent.setFlags(67108864);
        selectAlbumPreviewFolderUI.setResult(-1, intent);
        selectAlbumPreviewFolderUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/SelectAlbumPreviewFolderUI$SelectImageFolderAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new e33.l5(this.f247311e, android.view.LayoutInflater.from(this.f247310d).inflate(com.tencent.mm.R.layout.cif, viewGroup, false));
    }
}
