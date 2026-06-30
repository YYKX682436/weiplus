package pg2;

/* loaded from: classes3.dex */
public final class h0 implements ug5.i {

    /* renamed from: a, reason: collision with root package name */
    public android.view.ViewGroup f354110a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f354111b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f354112c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f354113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ws5.f f354114e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f354115f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f354116g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f354117h;

    public h0(boolean z17, boolean z18, ws5.f fVar, kotlin.jvm.internal.h0 h0Var, android.view.View view, long j17) {
        this.f354112c = z17;
        this.f354113d = z18;
        this.f354114e = fVar;
        this.f354115f = h0Var;
        this.f354116g = view;
        this.f354117h = j17;
    }

    @Override // ug5.i
    public void a(android.content.Context context, android.view.View view, android.widget.FrameLayout parent, ug5.v performer) {
        com.tencent.mm.live.core.view.LiveVideoViewCompatCover view2 = (com.tencent.mm.live.core.view.LiveVideoViewCompatCover) view;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(view2, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(performer, "performer");
        android.view.ViewGroup viewGroup = this.f354110a;
        if (viewGroup != null) {
            viewGroup.removeView(this.f354111b);
        }
        ig2.m mVar = ig2.m.f291393a;
        long j17 = this.f354117h;
        ig2.r f17 = mVar.f(j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("triggerLiveEnterAnim onDetachPerformView feedId: ");
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
        com.tencent.mm.live.core.view.LiveVideoViewCompatCover liveVideoViewCompatCover = new com.tencent.mm.live.core.view.LiveVideoViewCompatCover(context);
        boolean z17 = this.f354112c;
        boolean z18 = this.f354113d;
        android.view.View view = this.f354116g;
        if (z17 && z18) {
            ws5.f fVar = this.f354114e;
            android.view.View H = fVar.H();
            android.view.ViewParent parent2 = H.getParent();
            android.view.ViewGroup viewGroup = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
            if (viewGroup != null) {
                this.f354110a = viewGroup;
                viewGroup.removeView(H);
                android.widget.ImageView imageView = new android.widget.ImageView(context);
                imageView.setImageBitmap(ug5.x.b(H));
                imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                this.f354111b = imageView;
                viewGroup.addView(imageView, -1, -1);
            }
            liveVideoViewCompatCover.removeAllViews();
            liveVideoViewCompatCover.addView(H, -1, -1);
            fVar.h((android.graphics.Rect) this.f354115f.f310123d);
            performer.f("key_enter_voice_mode", java.lang.Boolean.TRUE);
            performer.f("key_enter_bitmap", ug5.x.b(view));
        } else if (z18) {
            liveVideoViewCompatCover.a();
        } else {
            android.graphics.Bitmap b17 = ug5.x.b(view);
            liveVideoViewCompatCover.setCoverImage(b17);
            performer.f("key_enter_bitmap", b17);
        }
        return liveVideoViewCompatCover;
    }
}
