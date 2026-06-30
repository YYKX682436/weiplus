package ss2;

/* loaded from: classes10.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss2.a0 f411975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f411976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f411977f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f411978g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f411979h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f411980i;

    public q(ss2.a0 a0Var, java.lang.String str, kotlin.jvm.internal.h0 h0Var, android.graphics.Bitmap bitmap, int i17, android.graphics.Bitmap bitmap2) {
        this.f411975d = a0Var;
        this.f411976e = str;
        this.f411977f = h0Var;
        this.f411978g = bitmap;
        this.f411979h = i17;
        this.f411980i = bitmap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ss2.a0 a0Var = this.f411975d;
        a0Var.f411917s.add(this.f411976e);
        java.lang.Object obj = this.f411977f.f310123d;
        if (obj != null && this.f411978g != null) {
            java.util.ArrayList arrayList = a0Var.f411919u;
            kotlin.jvm.internal.o.d(obj);
            arrayList.add(obj);
        }
        com.tencent.mm.plugin.finder.view.FinderMultiPhotoLayout finderMultiPhotoLayout = a0Var.f411908g;
        if (finderMultiPhotoLayout == null) {
            kotlin.jvm.internal.o.o("photoGridView");
            throw null;
        }
        java.util.List<android.view.View> childList = finderMultiPhotoLayout.getChildList();
        int i17 = this.f411979h;
        android.view.View view = childList.get(i17);
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.MMImageView");
        com.tencent.mm.ui.MMImageView mMImageView = (com.tencent.mm.ui.MMImageView) view;
        mMImageView.setColorFilter(0);
        mMImageView.setAlpha(1.0f);
        android.graphics.drawable.Drawable drawable = mMImageView.getDrawable();
        android.graphics.drawable.Drawable mutate = drawable != null ? drawable.mutate() : null;
        if (mutate != null) {
            mutate.setAlpha(255);
        }
        mMImageView.setPadding(0, 0, 0, 0);
        mMImageView.setImageBitmap(this.f411980i);
        com.tencent.mars.xlog.Log.i("PostMediaWidget", "add thumb file, index:" + i17);
    }
}
