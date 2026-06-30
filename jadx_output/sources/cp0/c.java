package cp0;

/* loaded from: classes15.dex */
public class c implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f220739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f220740e;

    public c(cp0.d dVar, java.lang.Object obj, android.widget.ImageView imageView) {
        this.f220739d = obj;
        this.f220740e = imageView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        android.graphics.Matrix a17 = ((ip0.d) this.f220739d).a(view.getWidth(), view.getHeight());
        android.widget.ImageView imageView = this.f220740e;
        if (a17 != null) {
            imageView.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
            imageView.setImageMatrix(a17);
        }
        imageView.removeOnLayoutChangeListener(this);
    }
}
