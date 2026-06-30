package va5;

/* loaded from: classes3.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f434442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f434443e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f434444f;

    public r(android.widget.ImageView imageView, float f17, float f18) {
        this.f434442d = imageView;
        this.f434443e = f17;
        this.f434444f = f18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f17 = this.f434443e;
        android.widget.ImageView imageView = this.f434442d;
        imageView.setPivotX(f17);
        imageView.setPivotY(this.f434444f);
    }
}
