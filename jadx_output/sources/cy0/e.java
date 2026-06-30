package cy0;

/* loaded from: classes15.dex */
public final class e implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f224681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f224682e;

    public e(java.lang.Object obj, android.widget.ImageView imageView) {
        this.f224681d = obj;
        this.f224682e = imageView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View v17, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        kotlin.jvm.internal.o.g(v17, "v");
        android.graphics.Matrix a17 = ((ip0.d) this.f224681d).a(v17.getWidth(), v17.getHeight());
        android.widget.ImageView imageView = this.f224682e;
        if (a17 != null) {
            imageView.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
            imageView.setImageMatrix(a17);
        }
        imageView.removeOnLayoutChangeListener(this);
    }
}
