package d33;

/* loaded from: classes.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final d33.x0 f226300d = new d33.x0();

    public x0() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String mediaPath = (java.lang.String) obj;
        android.widget.ImageView imageView = (android.widget.ImageView) obj2;
        yz5.p loadedCallback = (yz5.p) obj3;
        kotlin.jvm.internal.o.g(mediaPath, "mediaPath");
        kotlin.jvm.internal.o.g(imageView, "imageView");
        kotlin.jvm.internal.o.g(loadedCallback, "loadedCallback");
        pm0.v.K(null, new d33.w0(mediaPath, imageView, loadedCallback));
        return jz5.f0.f302826a;
    }
}
