package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class a2 {
    public static final java.lang.Object D = new java.lang.Object();
    public static int E;
    public java.lang.String A;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar f149265a;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f149270f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f149271g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView f149272h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f149273i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f149274j;

    /* renamed from: k, reason: collision with root package name */
    public qk.o9 f149275k;

    /* renamed from: l, reason: collision with root package name */
    public qk.s f149276l;

    /* renamed from: m, reason: collision with root package name */
    public bi3.b f149277m;

    /* renamed from: n, reason: collision with root package name */
    public ls0.n f149278n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f149279o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.ui.z1 f149280p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.ui.VideoSeekBarEditorView f149281q;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.modelcontrol.VideoTransPara f149283s;

    /* renamed from: y, reason: collision with root package name */
    public int f149289y;

    /* renamed from: z, reason: collision with root package name */
    public gi3.b f149290z;

    /* renamed from: b, reason: collision with root package name */
    public boolean f149266b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f149267c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f149268d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f149269e = -1;

    /* renamed from: r, reason: collision with root package name */
    public boolean f149282r = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f149284t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f149285u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f149286v = false;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f149287w = null;

    /* renamed from: x, reason: collision with root package name */
    public int f149288x = -1;
    public boolean B = false;
    public boolean C = true;

    public static void a(com.tencent.mm.plugin.mmsight.ui.a2 a2Var, boolean z17) {
        int width = a2Var.f149272h.getWidth();
        int height = a2Var.f149272h.getHeight();
        int b17 = i65.a.b(a2Var.f149274j, 20) + (a2Var.f149281q.getHeight() <= 0 ? i65.a.b(a2Var.f149274j, 95) : a2Var.f149281q.getHeight()) + i65.a.b(a2Var.f149274j, 12);
        if (com.tencent.mm.ui.bl.f(a2Var.f149274j)) {
            b17 += com.tencent.mm.ui.bl.c(a2Var.f149274j);
        }
        int i17 = height - b17;
        if (a2Var.f149272h.getBottom() + b17 < ai3.d.f(a2Var.f149274j).y) {
            i17 = (int) ((width - (i65.a.b(a2Var.f149274j, 32) * 2)) / (width / height));
        }
        float f17 = i17;
        float f18 = ((int) ((r0 / r1) * f17)) / width;
        float f19 = f17 / height;
        if (z17) {
            float f27 = -(b17 / 2.0f);
            a2Var.f149272h.animate().scaleX(f18).scaleY(f19).translationY(f27).setDuration(300L).setListener(new com.tencent.mm.plugin.mmsight.ui.b1(a2Var));
            a2Var.f149276l.animate().scaleX(f18).scaleY(f19).translationY(f27).setDuration(300L);
        } else {
            a2Var.f149272h.setScaleX(f18);
            a2Var.f149272h.setScaleY(f19);
            float f28 = -(b17 / 2.0f);
            a2Var.f149272h.setTranslationY(f28);
            a2Var.f149276l.setScaleX(f18);
            a2Var.f149276l.setScaleY(f19);
            a2Var.f149276l.setTranslationY(f28);
        }
        a2Var.f149276l.setAutoShowFooterAndBar(false);
        a2Var.f149276l.setFooterVisible(false);
        a2Var.f149276l.setActionBarVisible(false);
        if (!a2Var.f149266b) {
            a2Var.f149265a.setOnPreparedListener(new com.tencent.mm.plugin.mmsight.ui.v1(a2Var));
            a2Var.f149265a.setThumbBarSeekListener(new com.tencent.mm.plugin.mmsight.ui.w1(a2Var));
            a2Var.f149265a.f(a2Var.f149270f);
            a2Var.f149272h.setLoop(true);
            a2Var.f149272h.setVideoCallback(new com.tencent.mm.plugin.mmsight.ui.x1(a2Var));
            a2Var.f149266b = true;
        }
        a2Var.f149281q.setVisibility(0);
        a2Var.f149281q.bringToFront();
        a2Var.f149286v = true;
    }

    public static void b(com.tencent.mm.plugin.mmsight.ui.a2 a2Var, android.graphics.Bitmap bitmap) {
        if (a2Var.C) {
            s75.d.b(new com.tencent.mm.plugin.mmsight.ui.l1(a2Var, bitmap), "MMSightVideoEditor_remux");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightVideoEditor", "not need remux video!");
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.ui.m1(a2Var));
        }
    }

    public final void c() {
        this.f149272h.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(300L);
        this.f149281q.animate().alpha(0.0f).setDuration(100L).setListener(new com.tencent.mm.plugin.mmsight.ui.c1(this));
        this.f149276l.setFooterVisible(true);
        this.f149276l.setAutoShowFooterAndBar(true);
        this.f149276l.setActionBarVisible(true);
        this.f149276l.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setDuration(300L);
        this.f149286v = false;
    }

    public void d(com.tencent.mm.ui.MMActivity mMActivity, int i17, java.lang.String str, com.tencent.mm.plugin.mmsight.ui.VideoSeekBarEditorView videoSeekBarEditorView, com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView, android.view.ViewGroup viewGroup, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, boolean z17) {
        this.f149283s = videoTransPara;
        if (videoTransPara == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightVideoEditor", "video trans para is null!!!");
            com.tencent.mm.modelcontrol.VideoTransPara videoTransPara2 = new com.tencent.mm.modelcontrol.VideoTransPara();
            this.f149283s = videoTransPara2;
            videoTransPara2.f71195h = 10000;
        } else if (videoTransPara.f71195h <= 0) {
            videoTransPara.f71195h = 10000;
        }
        this.f149289y = i17;
        this.f149270f = str;
        this.f149281q = videoSeekBarEditorView;
        this.f149272h = videoPlayerTextureView;
        this.f149273i = viewGroup;
        this.f149274j = mMActivity;
        this.f149285u = z17;
        this.f149290z = new gi3.b(i17);
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar = videoSeekBarEditorView.f149259d;
        this.f149265a = recyclerThumbSeekBar;
        recyclerThumbSeekBar.setVideoTransPara(this.f149283s);
        ((wb0.e) ((xb0.e) i95.n0.c(xb0.e.class))).getClass();
        rj.l lVar = new rj.l();
        this.f149275k = lVar;
        qk.l9 l9Var = new qk.l9();
        l9Var.f364232b = false;
        l9Var.f364233c = true;
        l9Var.f364231a = qk.n9.VIDEO;
        l9Var.f364236f = new android.graphics.Rect(this.f149272h.getLeft(), this.f149272h.getTop(), this.f149272h.getRight(), this.f149272h.getBottom());
        lVar.d(l9Var);
        qk.s c17 = this.f149275k.c(this.f149273i.getContext());
        this.f149276l = c17;
        c17.setActionBarCallback(new com.tencent.mm.plugin.mmsight.ui.n1(this));
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, -1);
        if (com.tencent.mm.ui.bl.f(this.f149274j)) {
            marginLayoutParams.height = ai3.d.j().y - java.lang.Math.max(com.tencent.mm.ui.bl.c(this.f149274j), com.tencent.mm.ui.bl.g(this.f149274j));
        }
        this.f149273i.addView(this.f149276l, marginLayoutParams);
        this.f149276l.setSelectedFeatureListener(new com.tencent.mm.plugin.mmsight.ui.o1(this));
        this.f149281q.setCancelButtonClickListener(new com.tencent.mm.plugin.mmsight.ui.r1(this));
        this.f149281q.setFinishButtonClickListener(new com.tencent.mm.plugin.mmsight.ui.s1(this));
        if (this.f149285u) {
            this.f149281q.setVisibility(0);
            this.f149281q.bringToFront();
            this.f149281q.post(new com.tencent.mm.plugin.mmsight.ui.t1(this));
        }
    }

    public void e() {
        try {
            com.tencent.mm.sdk.platformtools.b4 b4Var = this.f149271g;
            if (b4Var != null) {
                b4Var.d();
                this.f149271g = null;
            }
            com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar = this.f149265a;
            if (recyclerThumbSeekBar != null) {
                recyclerThumbSeekBar.g();
            }
            qk.o9 o9Var = this.f149275k;
            if (o9Var != null) {
                o9Var.f();
            }
            android.view.ViewGroup viewGroup = this.f149273i;
            if (viewGroup != null) {
                viewGroup.removeView(this.f149276l);
            }
            com.tencent.mm.plugin.mmsight.ui.VideoSeekBarEditorView videoSeekBarEditorView = this.f149281q;
            if (videoSeekBarEditorView != null) {
                videoSeekBarEditorView.b();
            }
            this.f149266b = false;
            ei3.x.f253187d.c();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMSightVideoEditor", e17, "release error: %s", e17.getMessage());
        }
    }

    public void f(boolean z17, java.lang.String str) {
        java.util.Stack e17;
        try {
            this.f149290z.f272277b = z17;
            qk.o9 o9Var = this.f149275k;
            if (o9Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMSightVideoEditor", "[report] null == photoEditor");
                return;
            }
            f65.r rVar = (f65.r) o9Var.b();
            this.f149290z.f272280e = rVar.b();
            this.f149290z.f272281f = rVar.e();
            this.f149290z.f272284i = rVar.a();
            this.f149290z.f272283h = rVar.f();
            this.f149290z.f272285j = rVar.d();
            gi3.b bVar = this.f149290z;
            um.g gVar = (um.g) com.tencent.mm.cache.ArtistCacheManager.a().c(dl.a.EMOJI_AND_TEXT);
            int i17 = 0;
            if (gVar != null && (e17 = gVar.e(true)) != null) {
                java.util.Iterator it = e17.iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    xk0.f fVar = (xk0.f) it.next();
                    if (fVar instanceof xk0.p) {
                        xk0.p pVar = (xk0.p) fVar;
                        int[] iArr = dn5.c.D;
                        int i19 = 0;
                        while (true) {
                            if (i19 >= 8) {
                                break;
                            }
                            if (pVar.A == iArr[i19]) {
                                i18 |= 1 << i19;
                                break;
                            }
                            i19++;
                        }
                    }
                }
                i17 = i18;
            }
            bVar.f272286k = i17;
            gi3.c.b(this.f149290z, str);
        } catch (java.lang.Exception unused) {
        }
    }
}
