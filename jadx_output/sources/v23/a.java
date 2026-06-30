package v23;

/* loaded from: classes10.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v23.b f432885d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(v23.b bVar) {
        super(0);
        this.f432885d = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        v23.b bVar = this.f432885d;
        return java.lang.Long.valueOf(bVar.f432887b.isEmpty() ? 0L : ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) bVar.f432887b.get(0)).f138435m);
    }
}
