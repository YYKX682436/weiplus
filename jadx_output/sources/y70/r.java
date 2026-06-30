package y70;

/* loaded from: classes11.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y70.s f459691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459692e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f459693f;

    public r(y70.s sVar, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f459691d = sVar;
        this.f459692e = str;
        this.f459693f = bitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView imageView;
        d75.c cVar = (d75.c) this.f459691d.h().d("Common_ImageViewRef");
        if (cVar == null || (imageView = (android.widget.ImageView) cVar.get()) == null) {
            return;
        }
        if (!kotlin.jvm.internal.o.b(imageView.getTag(com.tencent.mm.R.id.h9z), this.f459692e)) {
            imageView = null;
        }
        if (imageView != null) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            int i17 = layoutParams != null ? layoutParams.width : 0;
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            int i18 = layoutParams2 != null ? layoutParams2.height : 0;
            imageView.setImageBitmap(this.f459693f);
            imageView.setBackgroundDrawable(null);
            java.lang.Object tag = imageView.getTag(com.tencent.mm.R.id.uhz);
            if (tag != null) {
                android.view.View view = tag instanceof android.view.View ? (android.view.View) tag : null;
                if (view != null) {
                    view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i17, i18));
                }
            }
            java.lang.Object tag2 = imageView.getTag(com.tencent.mm.R.id.f485995ui0);
            if (tag2 != null) {
                android.view.View view2 = tag2 instanceof android.view.View ? (android.view.View) tag2 : null;
                if (view2 != null) {
                    view2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i17, i18));
                }
            }
        }
    }
}
