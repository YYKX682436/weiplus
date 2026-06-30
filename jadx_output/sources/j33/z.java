package j33;

/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.view.AlbumScrollBarContainer f297477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f297478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f297479f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.gallery.view.AlbumScrollBarContainer albumScrollBarContainer, float f17, float f18) {
        super(1);
        this.f297477d = albumScrollBarContainer;
        this.f297478e = f17;
        this.f297479f = f18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f297477d.setTranslationY(this.f297478e + (((java.lang.Number) obj).floatValue() * this.f297479f));
        return jz5.f0.f302826a;
    }
}
