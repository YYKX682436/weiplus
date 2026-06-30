package f33;

/* loaded from: classes10.dex */
public class d implements ck5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f259313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f259314b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f259315c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f33.e f259316d;

    public d(f33.e eVar, int i17, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, android.view.View view) {
        this.f259316d = eVar;
        this.f259313a = i17;
        this.f259314b = galleryItem$MediaItem;
        this.f259315c = view;
    }

    @Override // ck5.b
    public void a() {
        f33.e eVar = this.f259316d;
        x.d dVar = eVar.Q;
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = this.f259314b;
        dVar.add(galleryItem$MediaItem.f138430e);
        if (!eVar.B) {
            android.content.Context context = eVar.N;
            db5.e1.s(context, "", context.getString(com.tencent.mm.R.string.oeh));
        }
        boolean contains = eVar.f247131g.contains(galleryItem$MediaItem);
        android.view.View view = this.f259315c;
        if (view instanceof com.tencent.mm.ui.widget.MMNumberCheckbox) {
            ((com.tencent.mm.ui.widget.MMNumberCheckbox) view).setChecked(contains);
        }
        eVar.notifyItemChanged(this.f259313a, "update_disable_state");
    }

    @Override // ck5.b
    public void b(ck5.c cVar) {
        this.f259316d.R(this.f259313a, this.f259314b, this.f259315c);
    }
}
