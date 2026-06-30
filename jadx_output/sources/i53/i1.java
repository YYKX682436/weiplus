package i53;

/* loaded from: classes8.dex */
public class i1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f288594d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f288595e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f288596f;

    /* renamed from: g, reason: collision with root package name */
    public int f288597g;

    /* renamed from: h, reason: collision with root package name */
    public int f288598h;

    /* renamed from: i, reason: collision with root package name */
    public i53.b1 f288599i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View.OnClickListener f288600m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.GameLocalGalleryView f288601n;

    public i1(com.tencent.mm.plugin.game.media.GameLocalGalleryView gameLocalGalleryView, android.content.Context context) {
        this.f288601n = gameLocalGalleryView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f288594d = arrayList;
        this.f288595e = new java.util.ArrayList();
        this.f288600m = new i53.h1(this);
        this.f288596f = context;
        arrayList.add(new com.tencent.mm.plugin.gallery.model.GalleryItem$ImageMediaItem());
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLocalMediaView", "RecycleViewAdapter");
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.ArrayList arrayList = this.f288594d;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLocalMediaView", "getItemCount, count : %d", java.lang.Integer.valueOf(arrayList.size()));
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        i53.j1 j1Var = (i53.j1) k3Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLocalMediaView", "onBindViewHolder");
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) this.f288594d.get(i17);
        if (galleryItem$MediaItem == null) {
            return;
        }
        j1Var.f288609d.setVisibility(0);
        int type = galleryItem$MediaItem.getType();
        android.widget.RelativeLayout relativeLayout = j1Var.f288611f;
        if (type == 2) {
            relativeLayout.setVisibility(0);
            ((d60.g0) ((e60.m1) i95.n0.c(e60.m1.class))).getClass();
            e33.a0.a(j1Var.f288612g, (com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem) galleryItem$MediaItem);
        } else {
            relativeLayout.setVisibility(8);
        }
        boolean equalsIgnoreCase = galleryItem$MediaItem.f138438p.equalsIgnoreCase("edit");
        android.widget.ImageView imageView = j1Var.f288616n;
        if (equalsIgnoreCase) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        java.lang.String o17 = galleryItem$MediaItem.o();
        java.lang.String str = galleryItem$MediaItem.f138430e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(o17) && com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameLocalMediaView", "null or nil filepath: " + i17);
            return;
        }
        int type2 = galleryItem$MediaItem.getType();
        android.widget.CheckBox checkBox = j1Var.f288613h;
        if (type2 == 1) {
            android.view.View view = j1Var.f288614i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/game/media/GameLocalGalleryView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/game/media/GameLocalGalleryView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            checkBox.setVisibility(0);
            j1Var.f288614i.setTag(com.tencent.mm.R.id.jdi, java.lang.Integer.valueOf(i17));
        } else {
            android.view.View view2 = j1Var.f288614i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/game/media/GameLocalGalleryView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/game/media/GameLocalGalleryView$RecycleViewAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/game/media/GameLocalGalleryView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            checkBox.setVisibility(8);
        }
        e60.n1 n1Var = (e60.n1) i95.n0.c(e60.n1.class);
        android.widget.ImageView imageView2 = j1Var.f288610e;
        int type3 = galleryItem$MediaItem.getType();
        long j17 = galleryItem$MediaItem.f138434i;
        i53.c1 c1Var = new i53.c1(this, j1Var.f288609d);
        long j18 = galleryItem$MediaItem.f138435m;
        ((d60.i0) n1Var).getClass();
        e33.m6.b(imageView2, type3, o17, str, j17, -1, c1Var, j18);
        boolean contains = this.f288595e.contains(galleryItem$MediaItem);
        android.widget.ImageView imageView3 = j1Var.f288615m;
        if (contains) {
            checkBox.setChecked(true);
            imageView3.setVisibility(0);
            imageView3.setBackgroundResource(com.tencent.mm.R.color.t_);
        } else {
            checkBox.setChecked(false);
            imageView3.setVisibility(0);
            imageView3.setBackgroundResource(com.tencent.mm.R.color.f479266uj);
        }
        j1Var.itemView.setOnClickListener(new i53.d1(this, galleryItem$MediaItem));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameLocalMediaView", "onCreateViewHolder");
        i53.j1 j1Var = new i53.j1(this.f288601n, android.view.LayoutInflater.from(this.f288596f).inflate(com.tencent.mm.R.layout.bgx, viewGroup, false));
        j1Var.f288614i.setOnClickListener(this.f288600m);
        return j1Var;
    }

    public java.util.ArrayList x() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f288595e.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next()).f138430e);
        }
        return arrayList;
    }
}
