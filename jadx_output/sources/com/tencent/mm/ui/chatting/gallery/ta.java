package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public class ta {
    public android.widget.TextView A;
    public android.widget.ImageView B;
    public final com.tencent.mm.ui.base.MultiTouchImageView C;
    public final com.tencent.mm.ui.base.WxImageView D;
    public final android.widget.FrameLayout E;
    public boolean F;
    public long K;
    public java.lang.String L;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f201423a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.gallery.k1 f201424b;

    /* renamed from: c, reason: collision with root package name */
    public int f201425c;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.RelativeLayout f201427e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.f4 f201428f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f201429g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f201430h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMPinProgressBtn f201431i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f201432j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f201433k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.RelativeLayout f201434l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.RelativeLayout f201435m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f201436n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f201437o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.f4 f201438p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMPinProgressBtn f201439q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f201440r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.RelativeLayout f201441s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f201442t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f201443u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f201444v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f201445w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f201446x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.ProgressBar f201447y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.LinearLayout f201448z;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f201426d = new java.util.HashMap();
    public int G = 0;
    public int H = 0;
    public int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f201422J = "";

    public ta(com.tencent.mm.ui.chatting.gallery.k1 k1Var, android.view.View view, com.tencent.mm.storage.f9 f9Var) {
        this.f201423a = view;
        this.f201424b = k1Var;
        this.C = (com.tencent.mm.ui.base.MultiTouchImageView) view.findViewById(com.tencent.mm.R.id.h88);
        com.tencent.mm.ui.base.WxImageView wxImageView = (com.tencent.mm.ui.base.WxImageView) view.findViewById(com.tencent.mm.R.id.pr8);
        this.D = wxImageView;
        this.f201447y = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.h9c);
        this.E = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.ufn);
        if (wxImageView != null) {
            wxImageView.setForceTileFlag(rj0.d.Tile);
        }
    }

    public com.tencent.mm.ui.chatting.gallery.ta a() {
        if (this.f201443u == null) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((android.view.ViewStub) this.f201423a.findViewById(com.tencent.mm.R.id.h9f)).inflate();
            this.f201443u = linearLayout;
            this.f201444v = (android.widget.TextView) this.f201443u.findViewById(com.tencent.mm.R.id.d4a);
            this.f201445w = (android.widget.TextView) this.f201443u.findViewById(com.tencent.mm.R.id.d49);
            this.f201446x = (android.widget.ImageView) this.f201443u.findViewById(com.tencent.mm.R.id.d4b);
        }
        return this;
    }

    public com.tencent.mm.ui.chatting.gallery.ta b() {
        if (this.f201448z == null) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((android.view.ViewStub) this.f201423a.findViewById(com.tencent.mm.R.id.h9d)).inflate();
            this.f201448z = linearLayout;
            this.B = (android.widget.ImageView) linearLayout.findViewById(com.tencent.mm.R.id.d3c);
            this.A = (android.widget.TextView) this.f201448z.findViewById(com.tencent.mm.R.id.d3d);
        }
        return this;
    }

    public com.tencent.mm.ui.chatting.gallery.ta c() {
        if (this.f201427e == null) {
            android.view.View view = this.f201423a;
            this.f201427e = (android.widget.RelativeLayout) ((android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.mwo)).inflate();
            this.f201428f = com.tencent.mm.pluginsdk.ui.tools.n8.a(view.getContext());
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            this.f201427e.addView((android.view.View) this.f201428f, layoutParams);
            android.view.View view2 = (android.view.View) this.f201428f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder", "getSightView", "()Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder", "getSightView", "()Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById = this.f201427e.findViewById(com.tencent.mm.R.id.f487334ob5);
            this.f201432j = findViewById;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder", "getSightView", "()Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder", "getSightView", "()Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f201433k = (android.widget.TextView) this.f201427e.findViewById(com.tencent.mm.R.id.mva);
            com.tencent.mm.ui.widget.MMPinProgressBtn mMPinProgressBtn = (com.tencent.mm.ui.widget.MMPinProgressBtn) this.f201427e.findViewById(com.tencent.mm.R.id.mwj);
            this.f201431i = mMPinProgressBtn;
            mMPinProgressBtn.setVisibility(8);
            this.f201429g = (android.widget.ImageView) this.f201427e.findViewById(com.tencent.mm.R.id.mwk);
            this.f201430h = (android.widget.ImageView) this.f201427e.findViewById(com.tencent.mm.R.id.f487565p11);
            this.f201428f.setVideoCallback(new com.tencent.mm.ui.chatting.gallery.ma(this));
            this.f201433k.setOnClickListener(new com.tencent.mm.ui.chatting.gallery.oa(this));
        }
        return this;
    }

    public com.tencent.mm.ui.chatting.gallery.ta d() {
        if (this.f201434l == null) {
            com.tencent.mm.ui.base.WxImageView wxImageView = this.D;
            if (wxImageView != null) {
                wxImageView.setVisibility(8);
            }
            com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = this.C;
            if (multiTouchImageView != null) {
                multiTouchImageView.setVisibility(8);
            }
            android.view.View view = this.f201423a;
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ((android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.f487563p06)).inflate();
            this.f201434l = relativeLayout;
            this.f201435m = (android.widget.RelativeLayout) relativeLayout.findViewById(com.tencent.mm.R.id.p0_);
            this.f201436n = (android.widget.ImageView) this.f201434l.findViewById(com.tencent.mm.R.id.oz7);
            android.widget.ImageView imageView = (android.widget.ImageView) this.f201434l.findViewById(com.tencent.mm.R.id.f487564p10);
            this.f201437o = imageView;
            imageView.setOnClickListener(new com.tencent.mm.ui.chatting.gallery.pa(this));
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            this.f201438p = new com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer(context, null, 0, 6, null);
            this.f201440r = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cra);
            this.f201438p.setPlayProgressCallback(true);
            this.f201435m.addView((android.view.View) this.f201438p, 1, new android.widget.RelativeLayout.LayoutParams(-1, -1));
            com.tencent.mm.ui.widget.MMPinProgressBtn mMPinProgressBtn = (com.tencent.mm.ui.widget.MMPinProgressBtn) this.f201434l.findViewById(com.tencent.mm.R.id.oyq);
            this.f201439q = mMPinProgressBtn;
            mMPinProgressBtn.setVisibility(8);
            android.view.View view2 = (android.view.View) this.f201438p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder", "getVideoView", "()Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder", "getVideoView", "()Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f201441s = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.oyy);
            this.f201442t = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.oyz);
            this.f201438p.setVideoCallback(new com.tencent.mm.ui.chatting.gallery.sa(this));
        }
        return this;
    }

    public void e(int i17, com.tencent.mm.ui.chatting.gallery.f2 f2Var, com.tencent.mm.storage.f9 f9Var) {
        this.f201425c = i17;
        android.view.View view = this.f201423a;
        f(view, 0);
        int ordinal = f2Var.ordinal();
        android.widget.ProgressBar progressBar = this.f201447y;
        com.tencent.mm.ui.base.WxImageView wxImageView = this.D;
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = this.C;
        if (ordinal == 0) {
            f(view, 8);
            f(this.f201434l, 8);
            f(this.f201427e, 8);
        } else if (ordinal == 1) {
            f(this.f201434l, 8);
            f(this.f201427e, 8);
        } else if (ordinal == 2) {
            d();
            float f17 = !c01.ia.M(f9Var) ? 1.0f : c01.ia.f37258e;
            this.f201436n.setScaleX(f17);
            this.f201436n.setScaleY(f17);
            ((android.view.View) this.f201438p).setScaleX(f17);
            ((android.view.View) this.f201438p).setScaleY(f17);
            f(this.f201434l, 0);
            f(this.f201427e, 8);
            if (this.f201427e != null) {
                f(this.f201429g, 8);
            }
        } else if (ordinal == 3) {
            c();
            f(this.f201434l, 8);
            f(this.f201427e, 0);
        } else if (ordinal == 5) {
            f(this.f201434l, 8);
            f(this.f201427e, 8);
            f(multiTouchImageView, 8);
            f(wxImageView, 8);
            f(this.f201443u, 8);
            f(this.f201448z, 8);
            f(progressBar, 8);
        }
        f(multiTouchImageView, 8);
        f(wxImageView, 8);
        f(this.f201443u, 8);
        f(this.f201448z, 8);
        f(progressBar, 8);
    }

    public void f(android.view.View view, int i17) {
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder", "setVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder", "setVisibility", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void g(boolean z17, float f17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryViewHolder", "%d switch video model isVideoPlay[%b] alpha[%f]", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(z17), java.lang.Float.valueOf(f17));
        if (!z17) {
            d();
            f((android.view.View) this.f201438p, 8);
            d();
            f(this.f201436n, 0);
            d();
            f(this.f201437o, 0);
            ((vf0.c) i95.n0.c(vf0.c.class)).getClass();
            d();
            f(this.f201437o, 8);
            return;
        }
        d();
        android.view.View view = (android.view.View) this.f201438p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder", "switchVideoModel", "(ZF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder", "switchVideoModel", "(ZF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        f(view, 0);
        if (f17 >= 1.0d) {
            d();
            f(this.f201436n, 8);
            d();
            f(this.f201437o, 8);
        }
    }
}
