package pg2;

/* loaded from: classes3.dex */
public final class c0 implements ug5.i {

    /* renamed from: a, reason: collision with root package name */
    public android.widget.ImageView f354089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f354090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f354091c;

    public c0(java.util.Map map, long j17) {
        this.f354090b = map;
        this.f354091c = j17;
    }

    @Override // ug5.i
    public void a(android.content.Context context, android.view.View view, android.widget.FrameLayout parent, ug5.v performer) {
        com.tencent.rtmp.ui.TXCloudVideoView view2 = (com.tencent.rtmp.ui.TXCloudVideoView) view;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(view2, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(performer, "performer");
        view2.removeView(this.f354089a);
        ig2.m mVar = ig2.m.f291393a;
        long j17 = this.f354091c;
        ig2.r f17 = mVar.f(j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachPerformView feedId: ");
        sb6.append(j17);
        sb6.append(" director: ");
        sb6.append(f17);
        sb6.append(" isDetach: ");
        sb6.append(f17 != null ? java.lang.Boolean.valueOf(f17.i()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveSurfaceViewService", sb6.toString());
        if ((f17 == null || f17.i()) ? false : true) {
            f17.h();
        }
        super.a(context, view2, parent, performer);
    }

    @Override // ug5.i
    public android.view.View b(android.content.Context context, android.widget.FrameLayout parent, ug5.v performer) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(performer, "performer");
        com.tencent.mm.live.core.view.LiveVideoView liveVideoView = new com.tencent.mm.live.core.view.LiveVideoView(context);
        android.view.SurfaceView a17 = liveVideoView.a(false);
        a17.getHolder().setFormat(-3);
        a17.setZOrderOnTop(true);
        java.lang.Object obj = this.f354090b.get("key_enter_bitmap");
        android.graphics.Bitmap bitmap = obj instanceof android.graphics.Bitmap ? (android.graphics.Bitmap) obj : null;
        if (bitmap != null) {
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            this.f354089a = imageView;
            liveVideoView.addView(imageView, -1, -1);
        }
        return liveVideoView;
    }
}
