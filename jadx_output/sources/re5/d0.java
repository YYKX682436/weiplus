package re5;

/* loaded from: classes12.dex */
public final class d0 extends pf3.d implements com.tencent.mm.pluginsdk.ui.tools.w6, fg3.h {

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f394563s;

    /* renamed from: t, reason: collision with root package name */
    public em.s1 f394564t;

    /* renamed from: u, reason: collision with root package name */
    public int f394565u;

    /* renamed from: v, reason: collision with root package name */
    public int f394566v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.Runnable f394567w;

    /* renamed from: x, reason: collision with root package name */
    public final m34.e f394568x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(mf3.p apiCenter) {
        super(apiCenter, "MicroMsg.Video.LocalVideoPlayerOperationLayer");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        this.f394563s = jz5.h.b(new re5.a0(this));
        this.f394567w = new re5.c0(this);
        this.f394568x = new re5.b0(this);
    }

    @Override // mf3.e, kg3.d
    public void H2() {
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ejr, (android.view.ViewGroup) null);
        this.f394564t = new em.s1(inflate);
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.w6
    public void a(float f17) {
        f06.d apiKClass = kotlin.jvm.internal.i0.a(fg3.p.class);
        mf3.p pVar = this.f326104d;
        pVar.getClass();
        kotlin.jvm.internal.o.g(apiKClass, "apiKClass");
        fg3.p pVar2 = (fg3.p) pVar.a(xz5.a.b(apiKClass));
        if (pVar2 != null) {
            com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer = ((ig3.i) ((fg3.v) pVar2).U()).f291429b;
            kotlin.jvm.internal.o.e(thumbPlayerViewContainer, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.view.IThumbPlayerVideoView");
            thumbPlayerViewContainer.setVideoSpeedRatio(f17);
            float f18 = thumbPlayerViewContainer.getF();
            em.s1 s1Var = this.f394564t;
            if (s1Var == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            s1Var.c().setSpeedRatio(f18);
            em.s1 s1Var2 = this.f394564t;
            if (s1Var2 != null) {
                s1Var2.c().y();
            } else {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
        }
    }

    @Override // fg3.h
    public void c() {
        android.content.Context K = K();
        pf5.z zVar = pf5.z.f353948a;
        if (!(K instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        re5.s sVar = (re5.s) zVar.a((androidx.appcompat.app.AppCompatActivity) K).a(re5.s.class);
        boolean isShown = M().isShown();
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) sVar.getActivity();
        if (mMActivity != null) {
            if (isShown) {
                android.widget.RelativeLayout relativeLayout = sVar.f394591d;
                if (relativeLayout != null) {
                    sVar.V6();
                    oa5.b.b(sVar.f394591d).k(new re5.j(relativeLayout)).o(new re5.k(relativeLayout)).g(sVar.f394596i).l();
                }
            } else {
                sVar.X6(mMActivity);
            }
        }
        ((kg3.i) ((jz5.n) this.f394563s).getValue()).b();
    }

    @Override // mf3.l
    public void d(float f17) {
        if (f17 > 0.0f) {
            android.view.View M = M();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(M, arrayList.toArray(), "com/tencent/mm/ui/chatting/uic/video/LocalVideoPlayerOperationLayer", "onPageVerticalExit", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            M.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(M, "com/tencent/mm/ui/chatting/uic/video/LocalVideoPlayerOperationLayer", "onPageVerticalExit", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    @Override // fg3.h
    public void e(boolean z17) {
        em.s1 s1Var = this.f394564t;
        if (s1Var != null) {
            s1Var.c().setIsPlay(z17);
        } else {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
    }

    @Override // mf3.e, kg3.d
    public void h4() {
    }

    @Override // mf3.e, mf3.l
    public void i() {
        this.f326111n = false;
        em.s1 s1Var = this.f394564t;
        if (s1Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        s1Var.c().setSpeedRatio(1.0f);
        em.s1 s1Var2 = this.f394564t;
        if (s1Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        s1Var2.c().y();
        reset();
    }

    @Override // mf3.l
    public void q(float f17) {
        float f18 = 1.0f - f17;
        em.s1 s1Var = this.f394564t;
        if (s1Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.view.View view = s1Var.f254772a;
        float max = java.lang.Math.max(1.0f - (f18 * 2), 0.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(max));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/uic/video/LocalVideoPlayerOperationLayer", "onPageHorizontalScroll", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/uic/video/LocalVideoPlayerOperationLayer", "onPageHorizontalScroll", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // fg3.h
    public void reset() {
        em.s1 s1Var = this.f394564t;
        if (s1Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        s1Var.a().setVisibility(8);
        em.s1 s1Var2 = this.f394564t;
        if (s1Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        s1Var2.c().setIsPlay(false);
        em.s1 s1Var3 = this.f394564t;
        if (s1Var3 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        s1Var3.c().a(0);
        M().clearAnimation();
        android.view.View M = M();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(M, arrayList.toArray(), "com/tencent/mm/ui/chatting/uic/video/LocalVideoPlayerOperationLayer", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        M.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(M, "com/tencent/mm/ui/chatting/uic/video/LocalVideoPlayerOperationLayer", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // fg3.h
    public void s(boolean z17) {
        em.s1 s1Var = this.f394564t;
        if (s1Var != null) {
            s1Var.c().E(z17);
        } else {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
    }

    @Override // mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        kotlin.jvm.internal.o.g(bindContext, "bindContext");
        super.t(bindContext);
        reset();
        mf3.k kVar = bindContext.f326117a;
        gg3.c a17 = kVar.a();
        w(0, (int) (a17 != null ? a17.f271730e : 0L));
        gg3.c a18 = kVar.a();
        if (a18 != null) {
            android.content.Context K = K();
            pf5.z zVar = pf5.z.f353948a;
            if (!(K instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            re5.s sVar = (re5.s) zVar.a((androidx.appcompat.app.AppCompatActivity) K).a(re5.s.class);
            sVar.getClass();
            sVar.f394595h = a18;
            com.tencent.mm.ui.widget.textview.FadeEdgeTextView fadeEdgeTextView = sVar.f394592e;
            if (fadeEdgeTextView != null) {
                fadeEdgeTextView.post(new re5.o(fadeEdgeTextView, a18));
            }
            android.widget.TextView textView = sVar.f394593f;
            if (textView != null) {
                textView.post(new re5.p(textView, a18));
            }
        }
    }

    @Override // mf3.e, mf3.l
    public void u(android.view.View parentView) {
        kotlin.jvm.internal.o.g(parentView, "parentView");
        super.u(parentView);
        new kg3.b().a(M());
        em.s1 s1Var = this.f394564t;
        if (s1Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        s1Var.b().setVisibility(8);
        em.s1 s1Var2 = this.f394564t;
        if (s1Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        s1Var2.f254772a.setPadding(0, 0, 0, i65.a.b(K(), 15));
        em.s1 s1Var3 = this.f394564t;
        if (s1Var3 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.MediaGalleryVideoSeekBar c17 = s1Var3.c();
        kotlin.jvm.internal.o.f(c17, "getSeekBar(...)");
        X(c17);
        em.s1 s1Var4 = this.f394564t;
        if (s1Var4 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.MediaGalleryVideoSeekBar c18 = s1Var4.c();
        c18.setVisibility(0);
        c18.setOnPlayTextUpdate(new re5.y(this));
        c18.C(c18.getLightStyle());
        c18.setExtendPlayBtnClick(true);
        em.s1 s1Var5 = this.f394564t;
        if (s1Var5 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        s1Var5.c().setPlayBtnOnClickListener(new re5.z(this));
        em.s1 s1Var6 = this.f394564t;
        if (s1Var6 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        s1Var6.c().setIplaySeekCallback(this.f394568x);
        em.s1 s1Var7 = this.f394564t;
        if (s1Var7 != null) {
            s1Var7.c().setOnVideoSpeedChangeListener(this);
        } else {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
    }

    @Override // fg3.h
    public void w(int i17, int i18) {
        this.f394565u = i17 / 1000;
        this.f394566v = i18 / 1000;
        em.s1 s1Var = this.f394564t;
        if (s1Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.MediaGalleryVideoSeekBar c17 = s1Var.c();
        java.lang.Runnable runnable = this.f394567w;
        c17.removeCallbacks(runnable);
        em.s1 s1Var2 = this.f394564t;
        if (s1Var2 != null) {
            s1Var2.c().post(runnable);
        } else {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
    }
}
