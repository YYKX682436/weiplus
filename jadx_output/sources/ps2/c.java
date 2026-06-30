package ps2;

/* loaded from: classes3.dex */
public final class c implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f358058a;

    public c(android.widget.ImageView imageView) {
        this.f358058a = imageView;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.widget.ImageView imageView = this.f358058a;
        imageView.post(new ps2.b((android.graphics.Bitmap) obj, imageView));
    }
}
