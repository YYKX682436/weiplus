package mk4;

/* loaded from: classes14.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mk4.h f327150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f327151e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f327152f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f327153g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(mk4.h hVar, java.lang.String str, android.graphics.Bitmap bitmap, android.view.View view) {
        super(0);
        this.f327150d = hVar;
        this.f327151e = str;
        this.f327152f = bitmap;
        this.f327153g = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mk4.h hVar = this.f327150d;
        java.lang.String d17 = hVar.d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showCoverBitmapInternal ");
        sb6.append(this.f327151e);
        sb6.append(" bitmap:");
        android.graphics.Bitmap bitmap = this.f327152f;
        sb6.append(bitmap);
        com.tencent.mars.xlog.Log.i(d17, sb6.toString());
        android.view.View view = this.f327153g;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(view.getWidth(), view.getHeight());
        layoutParams.gravity = 17;
        android.widget.ImageView imageView = hVar.f327156c;
        imageView.setImageBitmap(bitmap);
        if (view instanceof com.tencent.mm.plugin.thumbplayer.render.MMTextureViewRender) {
            android.graphics.Matrix transform = ((com.tencent.mm.plugin.thumbplayer.render.MMTextureViewRender) view).getTransform(null);
            kotlin.jvm.internal.o.f(transform, "getTransform(...)");
            float[] fArr = new float[9];
            transform.getValues(fArr);
            float f17 = fArr[0];
            float f18 = fArr[4];
            if (f17 > 0.0f && f18 > 0.0f) {
                imageView.setPivotX(r2.getWidth() / 2.0f);
                imageView.setPivotY(r2.getHeight() / 2.0f);
                imageView.setScaleX(f17);
                imageView.setScaleY(f18);
            }
        }
        hVar.f327154a.addView(imageView, layoutParams);
        return jz5.f0.f302826a;
    }
}
