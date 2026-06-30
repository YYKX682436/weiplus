package x92;

/* loaded from: classes3.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x92.l f452696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f452697e;

    public i(x92.l lVar, boolean z17) {
        this.f452696d = lVar;
        this.f452697e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x92.l lVar = this.f452696d;
        android.widget.FrameLayout frameLayout = lVar.f452720e;
        if (frameLayout != null) {
            int width = frameLayout.getWidth();
            android.view.View findViewById = lVar.getActivity().findViewById(com.tencent.mm.R.id.f482591io);
            int height = findViewById != null ? findViewById.getHeight() : 0;
            if (height == 0) {
                height = lVar.X6(width);
            }
            android.widget.ImageView imageView = lVar.f452704h;
            android.view.ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams.height = height;
            android.widget.ImageView imageView2 = lVar.f452704h;
            if (imageView2 != null) {
                imageView2.setLayoutParams(layoutParams);
            }
        }
        lVar.W6(this.f452697e);
    }
}
