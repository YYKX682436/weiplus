package sj3;

/* loaded from: classes14.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f408753a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f408754b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f408755c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView f408756d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f408757e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f408758f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f408759g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f408760h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f408761i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.ImageView f408762j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.TextView f408763k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f408764l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f408765m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Paint f408766n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f408767o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f408768p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Long f408769q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Bitmap f408770r;

    /* renamed from: s, reason: collision with root package name */
    public int f408771s;

    /* renamed from: t, reason: collision with root package name */
    public int f408772t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f408773u;

    public u1(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f408753a = rootView;
        this.f408757e = jz5.h.b(new sj3.o1(this));
        this.f408765m = zj3.j.g();
        this.f408760h = rootView.findViewById(com.tencent.mm.R.id.jw7);
        this.f408754b = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.jxc);
        this.f408759g = rootView.findViewById(com.tencent.mm.R.id.a_l);
        this.f408755c = rootView.getContext();
        this.f408756d = (com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView) rootView.findViewById(com.tencent.mm.R.id.jx7);
        this.f408758f = (android.widget.ImageView) rootView.findViewById(com.tencent.mm.R.id.jx6);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f408766n = paint;
        paint.setColor(-16777216);
        paint.setFilterBitmap(false);
        paint.setTextSize(40.0f);
        this.f408761i = rootView.findViewById(com.tencent.mm.R.id.p7z);
        this.f408762j = (android.widget.ImageView) rootView.findViewById(com.tencent.mm.R.id.jwk);
        this.f408763k = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.jwl);
    }

    public final boolean a(java.lang.String str, android.graphics.Bitmap bitmap, int i17, int i18) {
        if (kotlin.jvm.internal.o.b(str, "") || kotlin.jvm.internal.o.b(this.f408768p, str) || this.f408770r == null || this.f408756d == null) {
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new sj3.q1(this, bitmap, i17, i18, str));
        return true;
    }

    public final void b(java.lang.String str) {
        ((ku5.t0) ku5.t0.f312615d).B(new sj3.r1(this, str));
    }

    public final synchronized boolean c(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        if (this.f408756d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkMiniVideoView", "drawAvatar view is null");
            return false;
        }
        if (this.f408773u) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkMiniVideoView", "renderVideoBitmap img false cause isDoingAnimationChange");
            return false;
        }
        if (this.f408765m) {
            e().setVisibility(0);
            android.widget.TextView textView = this.f408754b;
            if (textView != null) {
                textView.setVisibility(0);
            }
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Di(e(), userName);
            b(userName);
            return true;
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
        com.tencent.mm.pluginsdk.ui.j1 c17 = com.tencent.mm.pluginsdk.ui.u.c();
        com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView = this.f408756d;
        int measuredWidth = videoView != null ? videoView.getMeasuredWidth() : 0;
        com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView2 = this.f408756d;
        android.graphics.Bitmap Zg = c17.Zg(userName, measuredWidth, videoView2 != null ? videoView2.getMeasuredHeight() : 0, 1);
        if (Zg != null && Zg.getHeight() < Zg.getWidth()) {
            int height = Zg.getHeight();
            int height2 = Zg.getHeight();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(height2));
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(0);
            arrayList.add(0);
            arrayList.add(Zg);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "drawAvatar", "(Ljava/lang/String;)Z", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "drawAvatar", "(Ljava/lang/String;)Z", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            Zg = createBitmap;
        }
        if (Zg != null) {
            if (!a(userName, Zg, 0, 0)) {
                d(Zg, 0, 0);
                b(userName);
                this.f408764l = false;
            }
            return true;
        }
        android.graphics.Bitmap decodeResource = bp.b.decodeResource(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), com.tencent.mm.R.raw.default_avatar, null);
        if (!a(userName, Zg, 0, 0)) {
            d(decodeResource, 0, 0);
            b(userName);
            this.f408764l = false;
        }
        return true;
    }

    public final synchronized void d(android.graphics.Bitmap bitmap, int i17, int i18) {
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                if (this.f408765m) {
                    android.widget.ImageView e17 = e();
                    if (e17 != null) {
                        e17.setImageBitmap(bitmap);
                    }
                    return;
                }
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView = this.f408756d;
                if (videoView == null) {
                    return;
                }
                android.graphics.Canvas lockCanvas = videoView.lockCanvas(null);
                if (lockCanvas == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkMiniVideoView", "getCanvasError");
                    return;
                }
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                int i19 = com.tencent.mm.plugin.voip.video.OpenGlRender.A;
                if (i17 == 12) {
                    matrix.setRotate(270.0f, width / 2.0f, height / 2.0f);
                } else if (i17 == 4) {
                    matrix.setRotate(90.0f, width / 2.0f, height / 2.0f);
                }
                if (i18 == 16) {
                    matrix.postScale(-1.0f, 1.0f);
                    matrix.postTranslate(width, 0.0f);
                }
                matrix.postScale(lockCanvas.getWidth() / height, lockCanvas.getHeight() / width);
                lockCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
                if (!bitmap.isRecycled()) {
                    try {
                        lockCanvas.drawBitmap(bitmap, matrix, this.f408766n);
                        this.f408771s = i17;
                        this.f408772t = i18;
                        this.f408770r = bitmap;
                    } catch (java.lang.Exception unused) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkMiniVideoView", "draw bitmap error");
                    }
                }
                try {
                    com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView2 = this.f408756d;
                    if (videoView2 != null) {
                        videoView2.unlockCanvasAndPost(lockCanvas);
                    }
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MultiTalkMiniVideoView", e18, "drawBitmap unlockCanvasAndPost crash", new java.lang.Object[0]);
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MultiTalkMiniVideoView", "DrawBitmap, bitmap is null or recycled");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(220L, 27L, 1L, false);
    }

    public final android.widget.ImageView e() {
        return (android.widget.ImageView) ((jz5.n) this.f408757e).getValue();
    }

    public final void f(int i17) {
        android.view.View view = this.f408759g;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "hideView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkMiniVideoView", "hideView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void g(java.lang.String str) {
        java.lang.Long valueOf;
        if (this.f408765m && !kotlin.jvm.internal.o.b(str, this.f408767o)) {
            if (android.text.TextUtils.isEmpty(str)) {
                com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView = this.f408756d;
                if (videoView != null) {
                    com.tencent.mm.plugin.multitalk.model.a2 n17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n();
                    if (n17 != null) {
                        n17.l(videoView, str != null ? str : "");
                    }
                    e().setVisibility(8);
                    android.widget.TextView textView = this.f408754b;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    this.f408764l = false;
                }
            } else {
                com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView2 = this.f408756d;
                if (videoView2 != null) {
                    com.tencent.mm.plugin.multitalk.model.a2 n18 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n();
                    if (n18 != null) {
                        java.lang.String str2 = this.f408767o;
                        if (str2 == null) {
                            str2 = "";
                        }
                        n18.l(videoView2, str2);
                    }
                    com.tencent.mm.plugin.multitalk.model.a2 n19 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n();
                    if (n19 != null) {
                        n19.a(videoView2, str != null ? str : "");
                    }
                    videoView2.setOnFrame(new sj3.t1(this, str));
                }
            }
        }
        if (str == null) {
            valueOf = null;
            this.f408770r = null;
            this.f408772t = -1;
            this.f408771s = -1;
        } else {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            valueOf = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime());
        }
        this.f408769q = valueOf;
        this.f408767o = str;
    }
}
