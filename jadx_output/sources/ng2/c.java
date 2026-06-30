package ng2;

/* loaded from: classes10.dex */
public class c extends lg2.b {

    /* renamed from: s, reason: collision with root package name */
    public android.widget.FrameLayout f336957s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f336958t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.rtmp.ui.TXCloudVideoView f336959u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // lg2.b, kg2.a
    public void d(og2.a params) {
        kotlin.jvm.internal.o.g(params, "params");
        this.f336959u = params.f345151c;
        super.d(params);
    }

    @Override // lg2.a
    public void j(jg2.b builder) {
        ig2.n nVar;
        kotlin.jvm.internal.o.g(builder, "builder");
        super.j(builder);
        android.content.Context context = this.f318556d;
        int color = context.getResources().getColor(com.tencent.mm.R.color.f478712f3);
        int color2 = context.getResources().getColor(com.tencent.mm.R.color.a9d);
        ig2.n nVar2 = this.f318565p;
        kotlin.jvm.internal.o.d(nVar2);
        float height = (nVar2.f291408g * s().height()) / s().width();
        float width = s().width();
        ig2.n nVar3 = this.f318565p;
        kotlin.jvm.internal.o.d(nVar3);
        float height2 = (width / nVar3.f291408g) / s().height();
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        c0Var.f310112d = true;
        kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
        if (!w() && (nVar = this.f318565p) != null) {
            float height3 = nVar.f291410i.height() * (nVar.f291406e / nVar.f291407f);
            com.tencent.mars.xlog.Log.i(this.f318557e, "videoWidth: " + nVar.f291406e + " videoHeight: " + nVar.f291407f + " viewWidth: " + nVar.f291410i.width() + " viewHeight: " + nVar.f291410i.height() + " calcWidth: " + height3);
            if (height3 <= nVar.f291410i.width()) {
                c0Var.f310112d = false;
                c0Var2.f310112d = true;
            }
        }
        android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), java.lang.Integer.valueOf(color), java.lang.Integer.valueOf(color2));
        ofObject.addUpdateListener(new ng2.a(this));
        builder.a(ofObject);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ng2.b(this, height, height2, c0Var, c0Var2));
        builder.a(ofFloat);
    }

    @Override // lg2.a
    public void k() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(w() ? this.f318558f : q().width(), w() ? this.f318559g : q().height());
        if (!w()) {
            layoutParams.gravity = 17;
        }
        android.view.ViewGroup viewGroup = this.f318566q;
        android.view.ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.f336957s, layoutParams);
        }
        android.view.ViewGroup viewGroup3 = this.f318566q;
        if (viewGroup3 == null) {
            return;
        }
        viewGroup3.setVisibility(8);
    }

    @Override // lg2.a
    public android.graphics.Rect m() {
        qg2.d dVar = qg2.d.f362793a;
        ig2.n nVar = this.f318565p;
        kotlin.jvm.internal.o.d(nVar);
        return qg2.d.c(dVar, nVar, null, 2, null);
    }

    @Override // lg2.a
    public android.graphics.Rect n() {
        ig2.n nVar = this.f318565p;
        kotlin.jvm.internal.o.d(nVar);
        return nVar.f291410i;
    }

    @Override // lg2.a
    public android.view.View o() {
        android.content.Context context = this.f318556d;
        this.f336957s = new android.widget.FrameLayout(context);
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = new com.tencent.mm.ui.widget.RoundedCornerFrameLayout(context);
        ig2.n nVar = this.f318565p;
        if ((nVar != null ? nVar.f291402a : null) != ez2.a.f257855d) {
            roundedCornerFrameLayout.setRadius(context.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv));
        }
        android.widget.ImageView v17 = v();
        this.f336958t = v17;
        v17.setImageBitmap(y());
        int width = w() ? q().width() : -1;
        int height = w() ? q().height() : -1;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(width, height);
        if (w()) {
            layoutParams.topMargin = q().top;
            layoutParams.leftMargin = q().left;
        }
        roundedCornerFrameLayout.addView(this.f336958t, new android.widget.FrameLayout.LayoutParams(width, height));
        android.widget.FrameLayout frameLayout = this.f336957s;
        if (frameLayout != null) {
            frameLayout.addView(roundedCornerFrameLayout, layoutParams);
        }
        return roundedCornerFrameLayout;
    }

    @Override // lg2.a
    public void p() {
        x();
    }

    @Override // lg2.a
    public java.lang.String r() {
        return "SwitchInLiveDirector";
    }

    @Override // lg2.a
    public long t() {
        ig2.n nVar = this.f318565p;
        return (nVar != null ? nVar.f291402a : null) == ez2.a.f257855d ? 0L : 240L;
    }

    public void x() {
        android.view.TextureView videoView;
        android.graphics.Bitmap bitmap;
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView = this.f336959u;
        android.view.TextureView videoView2 = tXCloudVideoView != null ? tXCloudVideoView.getVideoView() : null;
        if (videoView2 != null) {
            videoView2.setSurfaceTextureListener(new ig2.p("SwitchInLiveDirector", false));
        }
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView2 = this.f336959u;
        if (tXCloudVideoView2 == null || (videoView = tXCloudVideoView2.getVideoView()) == null || (bitmap = videoView.getBitmap()) == null) {
            return;
        }
        android.widget.ImageView v17 = v();
        if (!w()) {
            android.widget.ImageView imageView = this.f336958t;
            v17.setScaleX(imageView != null ? imageView.getScaleX() : 1.0f);
            android.widget.ImageView imageView2 = this.f336958t;
            v17.setScaleY(imageView2 != null ? imageView2.getScaleY() : 1.0f);
        }
        v17.setImageBitmap(bitmap);
        ig2.n nVar = this.f318565p;
        ig2.j jVar = nVar instanceof ig2.j ? (ig2.j) nVar : null;
        if (jVar != null) {
            android.view.View view = jVar.f291388m;
            android.widget.FrameLayout frameLayout = view instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) view : null;
            if (frameLayout != null) {
                android.view.View findViewWithTag = frameLayout.findViewWithTag("nearby-live-fluent-preview-view-tag");
                if (findViewWithTag != null) {
                    frameLayout.removeView(findViewWithTag);
                }
                v17.setTag("nearby-live-fluent-preview-view-tag");
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(s().width(), s().height());
                layoutParams.gravity = 17;
                frameLayout.addView(v17, 0, layoutParams);
            }
        }
    }

    public android.graphics.Bitmap y() {
        android.view.TextureView videoView;
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView = this.f336959u;
        if (tXCloudVideoView == null || (videoView = tXCloudVideoView.getVideoView()) == null) {
            return null;
        }
        return videoView.getBitmap();
    }
}
