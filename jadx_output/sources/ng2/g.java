package ng2;

/* loaded from: classes10.dex */
public final class g extends ng2.c {

    /* renamed from: v, reason: collision with root package name */
    public final android.app.Activity f336963v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.FrameLayout f336964w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f336965x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, android.app.Activity activity) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f336963v = activity;
        this.f336965x = jz5.h.b(new ng2.f(context));
    }

    @Override // lg2.b, kg2.a
    public void a() {
        qg2.d dVar = qg2.d.f362793a;
        try {
            new ng2.e(this).invoke();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderLiveFluentUtil", "safeInvoke exception ", th6);
        }
    }

    @Override // ng2.c, lg2.a
    public void k() {
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.WindowManager.LayoutParams a17 = qg2.d.f362793a.a();
        this.f336964w = new android.widget.FrameLayout(this.f318556d);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(w() ? this.f318558f : q().width(), w() ? this.f318559g : q().height());
        if (!w()) {
            layoutParams.gravity = 17;
        }
        android.widget.FrameLayout frameLayout = this.f336964w;
        if (frameLayout != null) {
            frameLayout.addView(this.f336957s, layoutParams);
        }
        ((android.view.WindowManager) ((jz5.n) this.f336965x).getValue()).addView(this.f336964w, a17);
        android.widget.FrameLayout frameLayout2 = this.f336957s;
        if (frameLayout2 == null || (viewTreeObserver = frameLayout2.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnPreDrawListener(new ng2.d(this));
    }

    @Override // ng2.c, lg2.a
    public android.graphics.Rect n() {
        android.graphics.Point point;
        android.graphics.Point point2;
        og2.a aVar = this.f318567r;
        java.lang.Integer valueOf = (aVar == null || (point2 = aVar.f345153e) == null) ? null : java.lang.Integer.valueOf(point2.x);
        if (!(valueOf == null || valueOf.intValue() != 0)) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f480465yp);
        og2.a aVar2 = this.f318567r;
        java.lang.Integer valueOf2 = (aVar2 == null || (point = aVar2.f345153e) == null) ? null : java.lang.Integer.valueOf(point.y);
        if (!(valueOf2 == null || valueOf2.intValue() != 0)) {
            valueOf2 = null;
        }
        int intValue2 = valueOf2 != null ? valueOf2.intValue() : com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f480464yo);
        android.graphics.Point T = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().T(this.f318558f, new android.graphics.Point(intValue, intValue2));
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(com.tencent.mm.ui.bl.c(this.f336963v) / 2);
        valueOf3.intValue();
        java.lang.Integer num = true ^ w() ? valueOf3 : null;
        int intValue3 = num != null ? num.intValue() : 0;
        com.tencent.mars.xlog.Log.i(this.f318557e, "calculateTargetRect floatBallPos: " + T + ", navigateHeight: " + intValue3 + ", windowSize: " + intValue + ", " + intValue2);
        int i17 = T.x;
        int i18 = T.y;
        return new android.graphics.Rect(i17, i18 + intValue3, intValue + i17, i18 + intValue2 + intValue3);
    }

    @Override // ng2.c, lg2.a
    public java.lang.String r() {
        return "SwitchInWindowDirector";
    }

    @Override // ng2.c, lg2.a
    public long t() {
        return 240L;
    }

    @Override // ng2.c
    public void x() {
        android.view.TextureView videoView;
        android.graphics.Bitmap bitmap;
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView = this.f336959u;
        if (tXCloudVideoView == null || (videoView = tXCloudVideoView.getVideoView()) == null || (bitmap = videoView.getBitmap()) == null) {
            return;
        }
        android.widget.ImageView v17 = v();
        v17.setImageBitmap(bitmap);
        og2.a aVar = this.f318567r;
        if (aVar != null) {
            android.view.View view = aVar.f345152d;
            mo0.a aVar2 = view instanceof mo0.a ? (mo0.a) view : null;
            if (aVar2 != null) {
                android.view.View findViewWithTag = aVar2.findViewWithTag("nearby-live-fluent-preview-view-tag");
                if (findViewWithTag != null) {
                    aVar2.removeView(findViewWithTag);
                }
                v17.setTag("nearby-live-fluent-preview-view-tag");
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(s().width(), s().height());
                layoutParams.addRule(13);
                aVar2.addView(v17, layoutParams);
            }
        }
    }

    @Override // ng2.c
    public android.graphics.Bitmap y() {
        og2.a aVar = this.f318567r;
        if ((aVar != null ? aVar.f345154f : null) == null) {
            return super.y();
        }
        if (aVar != null) {
            return aVar.f345154f;
        }
        return null;
    }
}
