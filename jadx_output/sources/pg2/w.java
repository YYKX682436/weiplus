package pg2;

/* loaded from: classes3.dex */
public final class w implements ug5.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f354194a;

    public w(android.graphics.Bitmap bitmap) {
        this.f354194a = bitmap;
    }

    @Override // ug5.i
    public android.view.View b(android.content.Context context, android.widget.FrameLayout parent, ug5.v performer) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(performer, "performer");
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        imageView.setImageBitmap(this.f354194a);
        return imageView;
    }
}
