package sc2;

/* loaded from: classes.dex */
public final class y5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f406390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f406391e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        super(0);
        this.f406390d = imageView;
        this.f406391e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView imageView = this.f406390d;
        float measuredHeight = imageView.getMeasuredHeight();
        android.graphics.Bitmap bitmap = this.f406391e;
        imageView.getLayoutParams().width = (int) ((measuredHeight / bitmap.getHeight()) * bitmap.getWidth());
        imageView.requestLayout();
        return jz5.f0.f302826a;
    }
}
