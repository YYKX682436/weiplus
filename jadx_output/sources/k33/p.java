package k33;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gallery.view.TouchableGalleryScrollBar f303875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.gallery.view.TouchableGalleryScrollBar touchableGalleryScrollBar) {
        super(0);
        this.f303875d = touchableGalleryScrollBar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Paint paint = new android.graphics.Paint(6);
        paint.setColor(this.f303875d.f138682r);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        return paint;
    }
}
