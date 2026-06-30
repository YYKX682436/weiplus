package com.tencent.mm.plugin.sns.ui.improve.view.flexible;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB\u001d\b\u0016\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B%\b\u0016\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/flexible/FlexibleLivePhotoView;", "Landroid/widget/RelativeLayout;", "", "visibility", "Ljz5/f0;", "setDefaultLivePhotoPlayTagVisibility", "Lcom/tencent/mm/ui/base/MultiTouchImageView;", "getThumbImageView", "Landroid/view/View;", "getScaleMediaParent", "Ly51/e;", "F", "Ly51/e;", "getPlayCallback", "()Ly51/e;", "setPlayCallback", "(Ly51/e;)V", "playCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dd4/f", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FlexibleLivePhotoView extends android.widget.RelativeLayout {
    public static final /* synthetic */ int G = 0;
    public int A;
    public boolean B;
    public long C;
    public final boolean D;
    public final dd4.w0 E;

    /* renamed from: F, reason: from kotlin metadata */
    public y51.e playCallback;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f169189d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.base.MultiTouchImageView f169190e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f169191f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView f169192g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f169193h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f169194i;

    /* renamed from: m, reason: collision with root package name */
    public final dd4.v0 f169195m;

    /* renamed from: n, reason: collision with root package name */
    public final r45.jj4 f169196n;

    /* renamed from: o, reason: collision with root package name */
    public final int f169197o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f169198p;

    /* renamed from: q, reason: collision with root package name */
    public final int f169199q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.storage.s7 f169200r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f169201s;

    /* renamed from: t, reason: collision with root package name */
    public final xc4.p f169202t;

    /* renamed from: u, reason: collision with root package name */
    public final int f169203u;

    /* renamed from: v, reason: collision with root package name */
    public final ke4.c f169204v;

    /* renamed from: w, reason: collision with root package name */
    public dd4.f f169205w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f169206x;

    /* renamed from: y, reason: collision with root package name */
    public int f169207y;

    /* renamed from: z, reason: collision with root package name */
    public int f169208z;

    public FlexibleLivePhotoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f169197o = -1;
        this.f169199q = -1;
        this.f169203u = -1;
        this.f169205w = dd4.f.f228995d;
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.dug, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.rpg);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = (com.tencent.mm.ui.base.MultiTouchImageView) findViewById;
        this.f169190e = multiTouchImageView;
        multiTouchImageView.setCustomScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.rph);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f169191f = findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.rpf);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById3;
        this.f169193h = viewGroup;
        viewGroup.setOnClickListener(new dd4.e(this));
        ((hs.z) ((qk.t7) i95.n0.c(qk.t7.class))).wi(viewGroup);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.rpi);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f169189d = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.rpj);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = (com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView) findViewById5;
        this.f169192g = flexibleVideoView;
        flexibleVideoView.getVideoContainer().setAlpha(0.0f);
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.twx);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f169194i = findViewById6;
    }

    public static final /* synthetic */ android.view.View a(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getImageLoadProgressBar$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        android.view.View view = flexibleLivePhotoView.f169191f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getImageLoadProgressBar$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        return view;
    }

    public static final /* synthetic */ r45.jj4 b(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMediaObj$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        r45.jj4 jj4Var = flexibleLivePhotoView.f169196n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMediaObj$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        return jj4Var;
    }

    public static final /* synthetic */ int c(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPosition$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        int i17 = flexibleLivePhotoView.f169197o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPosition$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        return i17;
    }

    public static final /* synthetic */ dd4.v0 d(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSnsInfoFlipCallback$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        dd4.v0 v0Var = flexibleLivePhotoView.f169195m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSnsInfoFlipCallback$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        return v0Var;
    }

    public static final /* synthetic */ com.tencent.mm.ui.base.MultiTouchImageView e(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getThumbImageView$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = flexibleLivePhotoView.f169190e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getThumbImageView$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        return multiTouchImageView;
    }

    public static final /* synthetic */ android.widget.ImageView f(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getThumbLoadingView$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        android.widget.ImageView imageView = flexibleLivePhotoView.f169189d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getThumbLoadingView$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        return imageView;
    }

    public static final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView g(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getVideoView$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = flexibleLivePhotoView.f169192g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getVideoView$p", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        return flexibleVideoView;
    }

    public static final void h(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$prepareLivePhotoVideoView", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        flexibleLivePhotoView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepareLivePhotoVideoView", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prepareLivePhotoVideoView curPosition: ");
        dd4.v0 v0Var = flexibleLivePhotoView.f169195m;
        if (v0Var == null) {
            kotlin.jvm.internal.o.o("snsInfoFlipCallback");
            throw null;
        }
        sb6.append(((com.tencent.mm.plugin.sns.ui.fk) v0Var).a());
        flexibleLivePhotoView.m(sb6.toString());
        fc4.k kVar = new fc4.k(0, "", 0L);
        boolean y17 = iq.b.y();
        dd4.o oVar = new dd4.o(flexibleLivePhotoView);
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = flexibleLivePhotoView.f169192g;
        flexibleVideoView.setOnPlayComplete(oVar);
        flexibleVideoView.setOnFirstFrameAvailable(new dd4.p(flexibleLivePhotoView));
        flexibleLivePhotoView.m("prepareLivePhotoVideoView isNeedPreDownload: " + flexibleLivePhotoView.k());
        xc4.p pVar = flexibleLivePhotoView.f169202t;
        r45.jj4 jj4Var = flexibleLivePhotoView.f169196n;
        if (pVar == null || jj4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("logE", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("hashCode: ");
            sb7.append(flexibleLivePhotoView.hashCode());
            sb7.append(",mediaId: ");
            sb7.append(jj4Var != null ? jj4Var.f377855d : null);
            sb7.append(",snsId: ");
            sb7.append(ca4.z0.t0(pVar != null ? pVar.y0() : 0L));
            sb7.append(",position: ");
            sb7.append(flexibleLivePhotoView.f169197o);
            sb7.append(",bigImgState: ");
            sb7.append(flexibleLivePhotoView.f169205w);
            sb7.append(",useFixAni: ");
            sb7.append(flexibleLivePhotoView.f169198p);
            sb7.append(",isFromTimeLine: ");
            sb7.append(flexibleLivePhotoView.f169201s);
            sb7.append(",mediaIndex: ");
            sb7.append(jj4Var != null ? java.lang.Integer.valueOf(jj4Var.Y) : null);
            com.tencent.mars.xlog.Log.e("MicroMsg.FlexibleLivePhotoView", "FlexibleLivePhotoView " + sb7.toString() + " >> data is error");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("logE", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareLivePhotoVideoView", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        } else {
            flexibleLivePhotoView.f169192g.n(pVar, jj4Var.X, false, com.tencent.mm.pluginsdk.ui.e1.CONTAIN, y17, false, java.lang.Boolean.FALSE, false, com.tencent.mm.R.color.a9e, kVar, flexibleLivePhotoView.k());
            ke4.c cVar = flexibleLivePhotoView.f169204v;
            if (cVar == null) {
                kotlin.jvm.internal.o.o("shareHelper");
                throw null;
            }
            android.content.Context context = flexibleLivePhotoView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            kotlin.jvm.internal.o.d(pVar);
            int i17 = jj4Var.Y;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prepare", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper");
            cVar.f307034e = (r45.jj4) kz5.n0.a0(qa4.f.a(pVar.h1()), i17);
            cVar.f307036g = pVar;
            cVar.f307037h = i17;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("prepare >> id: ");
            sb8.append(pVar.a1());
            sb8.append(" localId: ");
            sb8.append(pVar.W0());
            sb8.append("mediaIndex: ");
            sb8.append(i17);
            sb8.append(" mediaId: ");
            r45.jj4 jj4Var2 = cVar.f307034e;
            sb8.append(jj4Var2 != null ? jj4Var2.f377855d : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoShareHelper", sb8.toString());
            cVar.f307032c = context;
            cVar.f307031b.d(context, flexibleVideoView, pVar);
            cVar.f307038i.alive();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepare", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoShareHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prepareLivePhotoVideoView", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$prepareLivePhotoVideoView", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
    }

    public static final /* synthetic */ void i(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setDefaultLivePhotoPlayTagVisibility", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        flexibleLivePhotoView.setDefaultLivePhotoPlayTagVisibility(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setDefaultLivePhotoPlayTagVisibility", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
    }

    public static void o(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView, boolean z17, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("playLivePhotoVideoView$default", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        flexibleLivePhotoView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("playLivePhotoVideoView", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        dd4.v0 v0Var = flexibleLivePhotoView.f169195m;
        if (v0Var == null) {
            kotlin.jvm.internal.o.o("snsInfoFlipCallback");
            throw null;
        }
        int a17 = ((com.tencent.mm.plugin.sns.ui.fk) v0Var).a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playLivePhotoVideoView curPosition: ");
        sb6.append(a17);
        sb6.append(" position: ");
        int i18 = flexibleLivePhotoView.f169197o;
        sb6.append(i18);
        sb6.append(" isReadyCanPlay: ");
        sb6.append(flexibleLivePhotoView.B);
        sb6.append(" isPlaying: ");
        sb6.append(flexibleLivePhotoView.l());
        sb6.append(" isAutoPlay: ");
        sb6.append(z17);
        flexibleLivePhotoView.m(sb6.toString());
        if (i18 == a17 && flexibleLivePhotoView.B && !flexibleLivePhotoView.l()) {
            flexibleLivePhotoView.B = false;
            com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = flexibleLivePhotoView.f169192g;
            flexibleVideoView.setVisibility(0);
            flexibleVideoView.u(0, false);
            flexibleVideoView.l(false, false, false);
            xc4.p pVar = flexibleLivePhotoView.f169202t;
            if (pVar != null && flexibleLivePhotoView.f169196n != null) {
                java.lang.String a18 = pVar.a1();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportClickToPlayLivePhoto", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoReportHelper");
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("reportClickToPlayLivePhoto >> ");
                sb7.append(a18);
                sb7.append(' ');
                sb7.append(i18);
                sb7.append(' ');
                int i19 = flexibleLivePhotoView.f169203u;
                sb7.append(i19);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsLivePhotoReportHelper", sb7.toString());
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("livephoto_bnt", "view_clk", kz5.c1.k(new jz5.l("sns_feed_id", a18), new jz5.l("photoindex", java.lang.Integer.valueOf(i18)), new jz5.l("livephoto_scene", java.lang.Integer.valueOf(i19))), 33050);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportClickToPlayLivePhoto", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoReportHelper");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playLivePhotoVideoView", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playLivePhotoVideoView$default", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
    }

    public static void q(com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView, int i17, int i18, boolean z17, android.graphics.Bitmap bitmap, int i19, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLiveTagLayoutMargin$default", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        if ((i19 & 4) != 0) {
            z17 = true;
        }
        boolean z18 = z17;
        android.graphics.Bitmap bitmap2 = (i19 & 8) != 0 ? null : bitmap;
        flexibleLivePhotoView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLiveTagLayoutMargin", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        dd4.v0 v0Var = flexibleLivePhotoView.f169195m;
        if (v0Var == null) {
            kotlin.jvm.internal.o.o("snsInfoFlipCallback");
            throw null;
        }
        dd4.q qVar = new dd4.q(flexibleLivePhotoView, i17, i18, z18, bitmap2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOutSideBottomMargin", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$4");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = ((com.tencent.mm.plugin.sns.ui.fk) v0Var).f168348b.f167925r;
        snsInfoFlip.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOutSideBottomMargin", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (snsInfoFlip.D1) {
            qVar.a(com.tencent.mm.ui.bl.c(snsInfoFlip.getContext()));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOutSideBottomMargin", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        } else {
            if (snsInfoFlip.A1) {
                qVar.a(snsInfoFlip.M1.getVisibility() == 0 ? snsInfoFlip.f167187a2 : com.tencent.mm.ui.bl.c(snsInfoFlip.getContext()));
            } else {
                com.tencent.mm.plugin.sns.ui.s4 s4Var = snsInfoFlip.f166279g;
                if (s4Var != null) {
                    s4Var.b(qVar);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SnsInfoFlip", "footer callback is null");
                    qVar.a(0);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOutSideBottomMargin", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOutSideBottomMargin", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLiveTagLayoutMargin", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLiveTagLayoutMargin$default", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
    }

    private final void setDefaultLivePhotoPlayTagVisibility(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDefaultLivePhotoPlayTagVisibility", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        if (this.D) {
            this.f169193h.setVisibility(i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDefaultLivePhotoPlayTagVisibility", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
    }

    public final y51.e getPlayCallback() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPlayCallback", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        y51.e eVar = this.playCallback;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayCallback", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        return eVar;
    }

    public final android.view.View getScaleMediaParent() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScaleMediaParent", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScaleMediaParent", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        return this.f169194i;
    }

    public final com.tencent.mm.ui.base.MultiTouchImageView getThumbImageView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getThumbImageView", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThumbImageView", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        return this.f169190e;
    }

    public final boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkShowTranslateResImg", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        if (this.f169196n == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowTranslateResImg", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            return false;
        }
        dd4.v0 v0Var = this.f169195m;
        if (v0Var == null) {
            kotlin.jvm.internal.o.o("snsInfoFlipCallback");
            throw null;
        }
        com.tencent.mm.plugin.sns.ui.fk fkVar = (com.tencent.mm.plugin.sns.ui.fk) v0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$4");
        r45.m33 m17 = fkVar.f168348b.m(fkVar.f168347a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$4");
        if (m17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FlexibleLivePhotoView", "checkShowTranslateResImg >> item is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowTranslateResImg", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
            return false;
        }
        if (m17.f380113h) {
            java.lang.String str = m17.f380114i;
            if (com.tencent.mm.vfs.w6.j(str)) {
                m("go to show trans img");
                ((ku5.t0) ku5.t0.f312615d).q(new dd4.l(str, this));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowTranslateResImg", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
                return true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowTranslateResImg", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
    
        if (r8 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k() {
        /*
            r10 = this;
            java.lang.String r0 = "isNeedPreDownLoad"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            dd4.v0 r2 = r10.f169195m
            if (r2 == 0) goto L8a
            com.tencent.mm.plugin.sns.ui.fk r2 = (com.tencent.mm.plugin.sns.ui.fk) r2
            int r2 = r2.a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "isNeedPreDownLoad >> position: "
            r3.<init>(r4)
            int r4 = r10.f169197o
            r3.append(r4)
            java.lang.String r5 = " selectPos: "
            r3.append(r5)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "MicroMsg.FlexibleLivePhotoView"
            com.tencent.mars.xlog.Log.i(r5, r3)
            r3 = 1
            if (r4 != r2) goto L37
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L37:
            pc4.e r2 = pc4.e.f353426a
            java.lang.String r2 = "preDownloadLivePhotoVideo"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.improve.config.SnsLivePhotoConfig"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r4)
            java.lang.Class<jv.e> r6 = jv.e.class
            i95.m r6 = i95.n0.c(r6)
            jv.e r6 = (jv.e) r6
            iv.a r6 = (iv.a) r6
            boolean r6 = r6.Ai()
            r7 = 0
            if (r6 == 0) goto L70
            java.lang.String r6 = "preDownloadLivePhotoVideoExpt"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r4)
            j62.e r8 = j62.e.g()
            com.tencent.mm.repairer.config.livephoto.RCSnsLivePhotoPreDownload r9 = new com.tencent.mm.repairer.config.livephoto.RCSnsLivePhotoPreDownload
            r9.<init>()
            int r8 = r8.c(r9)
            if (r8 != r3) goto L69
            r8 = r3
            goto L6a
        L69:
            r8 = r7
        L6a:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)
            if (r8 == 0) goto L70
            goto L71
        L70:
            r3 = r7
        L71:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "isNeedPreDownLoad >> isAutoDownloadAdjacent "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.mars.xlog.Log.i(r5, r2)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L8a:
            java.lang.String r0 = "snsInfoFlipCallback"
            kotlin.jvm.internal.o.o(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.k():boolean");
    }

    public final boolean l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        boolean z17 = this.f169192g.getVisibility() == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPlaying", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        return z17;
    }

    public final void m(java.lang.String msg) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("logI", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hashCode: ");
        sb6.append(hashCode());
        sb6.append(",mediaId: ");
        r45.jj4 jj4Var = this.f169196n;
        sb6.append(jj4Var != null ? jj4Var.f377855d : null);
        sb6.append(",snsId: ");
        xc4.p pVar = this.f169202t;
        sb6.append(ca4.z0.t0(pVar != null ? pVar.y0() : 0L));
        sb6.append(",position: ");
        sb6.append(this.f169197o);
        sb6.append(",bigImgState: ");
        sb6.append(this.f169205w);
        sb6.append(",useFixAni: ");
        sb6.append(this.f169198p);
        sb6.append(",isFromTimeLine: ");
        sb6.append(this.f169201s);
        sb6.append(",mediaIndex: ");
        sb6.append(jj4Var != null ? java.lang.Integer.valueOf(jj4Var.Y) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlexibleLivePhotoView", "FlexibleLivePhotoView " + sb6.toString() + " >> " + msg);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("logI", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
    }

    public final void n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClickToPlay", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.FlexibleLivePhotoView", "onClickToPlay >> " + currentTimeMillis + ' ' + this.C);
        if (currentTimeMillis - this.C > 500) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FlexibleLivePhotoView", "click to play");
            this.C = currentTimeMillis;
            if (j()) {
                if (this.f169205w != dd4.f.f228997f) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlexibleLivePhotoView", "click is translate img");
                    this.B = true;
                    o(this, false, 1, null);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClickToPlay", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
                return;
            }
            dd4.f fVar = this.f169205w;
            if (fVar == dd4.f.f228995d || fVar == dd4.f.f228997f) {
                p();
                this.B = true;
            } else if (fVar == dd4.f.f228998g) {
                this.B = true;
                o(this, false, 1, null);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClickToPlay", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (kotlin.jvm.internal.o.b((java.lang.String) r6, r3.f377855d) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            r18 = this;
            r0 = r18
            java.lang.String r1 = "prepareLivePhoto"
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
            r0.m(r1)
            r45.jj4 r3 = r0.f169196n
            if (r3 != 0) goto L15
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        L15:
            com.tencent.mm.ui.base.MultiTouchImageView r4 = r0.f169190e
            r5 = 2131321070(0x7f0960ee, float:1.8260752E38)
            java.lang.Object r6 = r4.getTag(r5)
            if (r6 == 0) goto L2d
            java.lang.String r6 = (java.lang.String) r6
            kotlin.jvm.internal.o.d(r3)
            java.lang.String r7 = r3.f377855d
            boolean r6 = kotlin.jvm.internal.o.b(r6, r7)
            if (r6 != 0) goto L32
        L2d:
            r6 = 8
            r4.setVisibility(r6)
        L32:
            kotlin.jvm.internal.o.d(r3)
            java.lang.String r3 = r3.f377855d
            r4.setTag(r5, r3)
            r3 = 0
            java.lang.String r5 = "snsInfoFlipCallback"
            dd4.v0 r6 = r0.f169195m
            if (r6 == 0) goto Lc5
            r7 = r6
            com.tencent.mm.plugin.sns.ui.fk r7 = (com.tencent.mm.plugin.sns.ui.fk) r7
            int r7 = r7.a()
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter$4"
            int r9 = r0.f169197o
            if (r9 != r7) goto L7f
            if (r6 == 0) goto L7b
            r7 = r6
            com.tencent.mm.plugin.sns.ui.fk r7 = (com.tencent.mm.plugin.sns.ui.fk) r7
            java.lang.String r10 = "setCurrentImageView"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r8)
            com.tencent.mm.plugin.sns.ui.bk r7 = r7.f168348b
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip r7 = r7.f167925r
            r7.setCurrentImageView(r4)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r8)
            r4.getClass()
            if (r6 == 0) goto L77
            r7 = r6
            com.tencent.mm.plugin.sns.ui.fk r7 = (com.tencent.mm.plugin.sns.ui.fk) r7
            boolean r7 = r7.b(r4, r9)
            if (r7 == 0) goto L7f
            r7 = 0
            r4.setVisibility(r7)
            goto L7f
        L77:
            kotlin.jvm.internal.o.o(r5)
            throw r3
        L7b:
            kotlin.jvm.internal.o.o(r5)
            throw r3
        L7f:
            boolean r4 = r18.j()
            if (r4 == 0) goto L89
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        L89:
            dd4.f r4 = dd4.f.f228996e
            r0.f169205w = r4
            com.tencent.mm.plugin.sns.model.i1 r9 = com.tencent.mm.plugin.sns.model.l4.hj()
            r45.jj4 r10 = r0.f169196n
            com.tencent.mm.ui.base.MultiTouchImageView r11 = r0.f169190e
            int r12 = r0.f169199q
            r13 = 1
            com.tencent.mm.storage.s7 r14 = r0.f169200r
            r15 = 0
            if (r6 == 0) goto Lc1
            com.tencent.mm.plugin.sns.ui.fk r6 = (com.tencent.mm.plugin.sns.ui.fk) r6
            java.lang.String r3 = "getSnsId"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r8)
            com.tencent.mm.plugin.sns.ui.bk r4 = r6.f168348b
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip r4 = r4.f167925r
            long r4 = r4.getSnsId()
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r8)
            java.lang.String r16 = ca4.z0.t0(r4)
            dd4.n r3 = new dd4.n
            r3.<init>(r0)
            r17 = r3
            r9.o(r10, r11, r12, r13, r14, r15, r16, r17)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
            return
        Lc1:
            kotlin.jvm.internal.o.o(r5)
            throw r3
        Lc5:
            kotlin.jvm.internal.o.o(r5)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView.p():void");
    }

    public final void setPlayCallback(y51.e eVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPlayCallback", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
        this.playCallback = eVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPlayCallback", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
    }

    public FlexibleLivePhotoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f169197o = -1;
        this.f169199q = -1;
        this.f169203u = -1;
        this.f169205w = dd4.f.f228995d;
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.dug, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.rpg);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = (com.tencent.mm.ui.base.MultiTouchImageView) findViewById;
        this.f169190e = multiTouchImageView;
        multiTouchImageView.setCustomScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.rph);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f169191f = findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.rpf);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById3;
        this.f169193h = viewGroup;
        viewGroup.setOnClickListener(new dd4.e(this));
        ((hs.z) ((qk.t7) i95.n0.c(qk.t7.class))).wi(viewGroup);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.rpi);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f169189d = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.rpj);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = (com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView) findViewById5;
        this.f169192g = flexibleVideoView;
        flexibleVideoView.getVideoContainer().setAlpha(0.0f);
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.twx);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f169194i = findViewById6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleLivePhotoView(android.content.Context context, r45.jj4 mediaObj, int i17, boolean z17, int i18, com.tencent.mm.storage.s7 fromScene, boolean z18, xc4.p pVar, boolean z19, int i19, dd4.w0 recordLoadImgCallback, dd4.v0 snsFlipOperationCallback) {
        super(context);
        kotlin.jvm.internal.o.g(mediaObj, "mediaObj");
        kotlin.jvm.internal.o.g(fromScene, "fromScene");
        kotlin.jvm.internal.o.g(recordLoadImgCallback, "recordLoadImgCallback");
        kotlin.jvm.internal.o.g(snsFlipOperationCallback, "snsFlipOperationCallback");
        this.f169197o = -1;
        this.f169199q = -1;
        this.f169203u = -1;
        this.f169205w = dd4.f.f228995d;
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.dug, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.rpg);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = (com.tencent.mm.ui.base.MultiTouchImageView) findViewById;
        this.f169190e = multiTouchImageView;
        multiTouchImageView.setCustomScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.rph);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f169191f = findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.rpf);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById3;
        this.f169193h = viewGroup;
        viewGroup.setOnClickListener(new dd4.e(this));
        ((hs.z) ((qk.t7) i95.n0.c(qk.t7.class))).wi(viewGroup);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.rpi);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f169189d = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.rpj);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = (com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView) findViewById5;
        this.f169192g = flexibleVideoView;
        flexibleVideoView.getVideoContainer().setAlpha(0.0f);
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.twx);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f169194i = findViewById6;
        this.f169196n = mediaObj;
        this.f169197o = i17;
        this.f169198p = z17;
        this.f169199q = i18;
        this.f169200r = fromScene;
        this.f169201s = z18;
        this.f169202t = pVar;
        this.D = z19;
        this.E = recordLoadImgCallback;
        this.f169195m = snsFlipOperationCallback;
        this.f169203u = i19;
        this.f169204v = new ke4.c(i19);
        m("construct");
    }
}
