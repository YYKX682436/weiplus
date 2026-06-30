package com.tencent.mm.plugin.finder.live.ktv.view.render;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0012J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/ktv/view/render/KtvRenderLayoutView;", "Landroid/widget/FrameLayout;", "Lnh2/b;", "Lnh2/a;", "Loh2/i;", "Lph2/d;", "", "it", "Ljz5/f0;", "setHighLightColor", "getCurrentTime", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class KtvRenderLayoutView extends android.widget.FrameLayout implements nh2.b, nh2.a, oh2.i, ph2.d {
    public com.tencent.mm.rfx.RfxPagFile A;
    public com.tencent.mm.rfx.RfxPagFile B;
    public int C;
    public final float D;
    public final float E;
    public ah2.f F;
    public boolean G;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f111672d;

    /* renamed from: e, reason: collision with root package name */
    public nh2.c f111673e;

    /* renamed from: f, reason: collision with root package name */
    public ph2.e f111674f;

    /* renamed from: g, reason: collision with root package name */
    public final oh2.o f111675g;

    /* renamed from: h, reason: collision with root package name */
    public final oh2.r f111676h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f111677i;

    /* renamed from: m, reason: collision with root package name */
    public long f111678m;

    /* renamed from: n, reason: collision with root package name */
    public int f111679n;

    /* renamed from: o, reason: collision with root package name */
    public int f111680o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f111681p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f111682q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.ImageView f111683r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f111684s;

    /* renamed from: t, reason: collision with root package name */
    public final android.animation.ValueAnimator f111685t;

    /* renamed from: u, reason: collision with root package name */
    public kotlinx.coroutines.r2 f111686u;

    /* renamed from: v, reason: collision with root package name */
    public kotlinx.coroutines.r2 f111687v;

    /* renamed from: w, reason: collision with root package name */
    public kotlinx.coroutines.r2 f111688w;

    /* renamed from: x, reason: collision with root package name */
    public int f111689x;

    /* renamed from: y, reason: collision with root package name */
    public org.libpag.PAGFile f111690y;

    /* renamed from: z, reason: collision with root package name */
    public org.libpag.PAGFile f111691z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KtvRenderLayoutView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f111672d = "KtvRender_" + hashCode();
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        this.f111675g = new oh2.o(context2);
        android.content.Context context3 = getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        this.f111676h = new oh2.r(context3);
        this.f111678m = -1L;
        this.f111679n = -1;
        boolean a17 = ae2.in.f3688a.a(ym5.f6.f463324u);
        this.f111681p = a17;
        android.content.Context context4 = getContext();
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(context4);
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        mMPAGView.o(a17);
        this.f111682q = mMPAGView;
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        imageView.setImageResource(com.tencent.mm.R.drawable.bt8);
        this.f111683r = imageView;
        android.content.Context context5 = getContext();
        kotlin.jvm.internal.o.f(context5, "getContext(...)");
        com.tencent.mm.view.MMPAGView mMPAGView2 = new com.tencent.mm.view.MMPAGView(context5);
        mMPAGView2.o(a17);
        this.f111684s = mMPAGView2;
        this.f111685t = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f111689x = -1;
        this.C = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        this.D = e(48.0f);
        this.E = e(4.0f);
    }

    @Override // nh2.b
    public void a() {
        com.tencent.mars.xlog.Log.i(this.f111672d, "onViewChanged");
    }

    @Override // ph2.d
    public void b() {
        try {
            nh2.c cVar = this.f111673e;
            if (cVar == null) {
                kotlin.jvm.internal.o.o("ktvRender");
                throw null;
            }
            android.graphics.Canvas lockCanvas = cVar.lockCanvas();
            if (lockCanvas != null) {
                f(lockCanvas);
                nh2.c cVar2 = this.f111673e;
                if (cVar2 != null) {
                    cVar2.unlockCanvasAndPost(lockCanvas);
                } else {
                    kotlin.jvm.internal.o.o("ktvRender");
                    throw null;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f111672d, th6, "draw error", new java.lang.Object[0]);
        }
    }

    @Override // nh2.b
    public void c() {
        com.tencent.mars.xlog.Log.i(this.f111672d, "onViewCreated");
        ph2.e eVar = this.f111674f;
        if (eVar != null) {
            eVar.c();
        } else {
            kotlin.jvm.internal.o.o("drawerLooper");
            throw null;
        }
    }

    @Override // nh2.b
    public void d() {
        ph2.e eVar = this.f111674f;
        if (eVar == null) {
            kotlin.jvm.internal.o.o("drawerLooper");
            throw null;
        }
        eVar.a();
        com.tencent.mars.xlog.Log.i(this.f111672d, "onViewDestroyed");
    }

    public final float e(float f17) {
        return i65.a.a(getContext(), f17);
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x047e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.graphics.Canvas r25) {
        /*
            Method dump skipped, instructions count: 1402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView.f(android.graphics.Canvas):void");
    }

    @Override // nh2.a
    /* renamed from: getCurrentTime, reason: from getter */
    public int getF111680o() {
        return this.f111680o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        kotlinx.coroutines.r2 r2Var = this.f111686u;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f111686u = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new nh2.e(this, null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        kotlinx.coroutines.r2 r2Var = this.f111686u;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f111686u = null;
        kotlinx.coroutines.r2 r2Var2 = this.f111687v;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        this.f111687v = null;
        kotlinx.coroutines.r2 r2Var3 = this.f111688w;
        if (r2Var3 != null) {
            kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
        }
        this.f111688w = null;
        super.onDetachedFromWindow();
        this.f111682q.n();
    }

    @Override // nh2.a
    public void setHighLightColor(int i17) {
        oh2.r rVar = this.f111676h;
        if (i17 != -1) {
            rVar.f345419j.setColor(i17);
        } else {
            rVar.getClass();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KtvRenderLayoutView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f111672d = "KtvRender_" + hashCode();
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        this.f111675g = new oh2.o(context2);
        android.content.Context context3 = getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        this.f111676h = new oh2.r(context3);
        this.f111678m = -1L;
        this.f111679n = -1;
        boolean a17 = ae2.in.f3688a.a(ym5.f6.f463324u);
        this.f111681p = a17;
        android.content.Context context4 = getContext();
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(context4);
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        mMPAGView.o(a17);
        this.f111682q = mMPAGView;
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        imageView.setImageResource(com.tencent.mm.R.drawable.bt8);
        this.f111683r = imageView;
        android.content.Context context5 = getContext();
        kotlin.jvm.internal.o.f(context5, "getContext(...)");
        com.tencent.mm.view.MMPAGView mMPAGView2 = new com.tencent.mm.view.MMPAGView(context5);
        mMPAGView2.o(a17);
        this.f111684s = mMPAGView2;
        this.f111685t = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f111689x = -1;
        this.C = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        this.D = e(48.0f);
        this.E = e(4.0f);
    }
}
