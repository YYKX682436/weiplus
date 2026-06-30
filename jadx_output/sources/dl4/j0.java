package dl4;

/* loaded from: classes3.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f235420d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f235421e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(android.graphics.Bitmap bitmap, android.view.View view) {
        super(0);
        this.f235420d = bitmap;
        this.f235421e = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f235421e;
        android.graphics.Bitmap bitmap = this.f235420d;
        if (bitmap == null || bitmap.isRecycled()) {
            if (view != null) {
                view.setBackground(null);
            }
        } else if (view != null) {
            view.setBackground(new android.graphics.drawable.BitmapDrawable(view.getResources(), bitmap));
        }
        return jz5.f0.f302826a;
    }
}
