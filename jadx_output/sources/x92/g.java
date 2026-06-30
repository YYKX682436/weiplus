package x92;

/* loaded from: classes3.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f452693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x92.l f452694e;

    public g(android.widget.ImageView imageView, x92.l lVar) {
        this.f452693d = imageView;
        this.f452694e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView imageView = this.f452693d;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = this.f452694e.X6(imageView.getWidth());
        imageView.setLayoutParams(layoutParams);
    }
}
