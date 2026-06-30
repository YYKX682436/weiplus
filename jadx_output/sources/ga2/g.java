package ga2;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem f269835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269836e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f269837f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem, java.lang.String str, in5.s0 s0Var) {
        super(0);
        this.f269835d = galleryItem$MediaItem;
        this.f269836e = str;
        this.f269837f = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap B0;
        int type = this.f269835d.getType();
        in5.s0 s0Var = this.f269837f;
        java.lang.String str = this.f269836e;
        if (type == 2) {
            ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
            B0 = ai3.d.p(str);
        } else {
            int dimensionPixelSize = s0Var.f293121e.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479657bu);
            B0 = com.tencent.mm.sdk.platformtools.x.B0(com.tencent.mm.sdk.platformtools.x.L(str, dimensionPixelSize, dimensionPixelSize), com.tencent.mm.compatible.util.Exif.fromFile(str));
        }
        d75.b.g(new ga2.f(s0Var, B0));
        return jz5.f0.f302826a;
    }
}
