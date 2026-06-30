package pa3;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f352991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f352992e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.widget.ImageView imageView, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f352991d = imageView;
        this.f352992e = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView imageView = this.f352991d;
        imageView.setVisibility(8);
        android.view.ViewParent parent = imageView.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(imageView);
        }
        imageView.setImageDrawable(null);
        kotlin.jvm.internal.h0 h0Var = this.f352992e;
        java.lang.Object obj = h0Var.f310123d;
        kotlin.jvm.internal.o.d(obj);
        if (!((android.graphics.Bitmap) obj).isRecycled()) {
            java.lang.Object obj2 = h0Var.f310123d;
            kotlin.jvm.internal.o.d(obj2);
            ((android.graphics.Bitmap) obj2).recycle();
        }
        h0Var.f310123d = null;
        com.tencent.mars.xlog.Log.i("LiteAppMultiTaskHelper", "coverBitmapToAvoidWhiteScreen remove coverBitmap");
        return jz5.f0.f302826a;
    }
}
