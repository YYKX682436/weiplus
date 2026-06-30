package pg2;

/* loaded from: classes3.dex */
public final class r implements ug5.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f354180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f354181b;

    public r(android.view.View view, android.graphics.Rect rect) {
        this.f354180a = view;
        this.f354181b = rect;
    }

    @Override // ug5.i
    public android.view.View b(android.content.Context context, android.widget.FrameLayout parent, ug5.v performer) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(performer, "performer");
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        android.graphics.Bitmap b17 = ug5.x.b(this.f354180a);
        imageView.setImageBitmap(b17);
        performer.f("key_enter_bitmap", b17);
        imageView.setOnClickListener(pg2.p.f354178d);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        frameLayout.setAlpha(0.0f);
        android.widget.ImageView imageView2 = new android.widget.ImageView(context);
        imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        imageView2.setImageBitmap(b17);
        imageView2.setOnClickListener(pg2.q.f354179d);
        android.graphics.Rect rect = this.f354181b;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(rect.width(), rect.height());
        layoutParams.gravity = 17;
        frameLayout.addView(imageView2, layoutParams);
        qg2.d dVar = qg2.d.f362793a;
        parent.addView(frameLayout, new android.view.ViewGroup.LayoutParams(dVar.g(), dVar.f()));
        return imageView;
    }
}
