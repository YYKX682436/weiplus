package fg3;

/* loaded from: classes12.dex */
public class o extends pf3.d implements com.tencent.mm.pluginsdk.ui.tools.w6, fg3.h {

    /* renamed from: s, reason: collision with root package name */
    public final mf3.p f262440s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f262441t;

    /* renamed from: u, reason: collision with root package name */
    public em.s1 f262442u;

    /* renamed from: v, reason: collision with root package name */
    public int f262443v;

    /* renamed from: w, reason: collision with root package name */
    public int f262444w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.Runnable f262445x;

    /* renamed from: y, reason: collision with root package name */
    public final m34.e f262446y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(mf3.p apiCenter) {
        super(apiCenter, "MediaGallery.VideoOperationLayer");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        this.f262440s = apiCenter;
        this.f262441t = jz5.h.b(new fg3.l(this));
        this.f262445x = new fg3.n(this);
        this.f262446y = new fg3.m(this);
    }

    @Override // mf3.e, mf3.n
    public mf3.p G() {
        return this.f262440s;
    }

    @Override // mf3.e, kg3.d
    public void H2() {
        new kg3.b().a(M());
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f262442u = new em.s1(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ejr, (android.view.ViewGroup) null));
        android.view.View view = a0().f254772a;
        kotlin.jvm.internal.o.f(view, "getInflateRootView(...)");
        return view;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.w6
    public void a(float f17) {
        f06.d apiKClass = kotlin.jvm.internal.i0.a(fg3.p.class);
        mf3.p pVar = this.f262440s;
        pVar.getClass();
        kotlin.jvm.internal.o.g(apiKClass, "apiKClass");
        fg3.p pVar2 = (fg3.p) pVar.a(xz5.a.b(apiKClass));
        if (pVar2 != null) {
            com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer = ((ig3.i) ((fg3.v) pVar2).U()).f291429b;
            kotlin.jvm.internal.o.e(thumbPlayerViewContainer, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.view.IThumbPlayerVideoView");
            thumbPlayerViewContainer.setVideoSpeedRatio(f17);
            float f18 = thumbPlayerViewContainer.getF();
            a0().c().setSpeedRatio(f18);
            a0().c().y();
            Q("onVideoSpeedChanged " + f18, new java.lang.Object[0]);
        }
    }

    public final em.s1 a0() {
        em.s1 s1Var = this.f262442u;
        if (s1Var != null) {
            return s1Var;
        }
        kotlin.jvm.internal.o.o("rootVB");
        throw null;
    }

    @Override // fg3.h
    public void c() {
        ((kg3.i) ((jz5.n) this.f262441t).getValue()).b();
    }

    @Override // mf3.l
    public void d(float f17) {
        if (f17 > 0.0f) {
            android.view.View M = M();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(M, arrayList.toArray(), "com/tencent/mm/plugin/media/video/VideoOperationLayer", "onPageVerticalExit", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            M.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(M, "com/tencent/mm/plugin/media/video/VideoOperationLayer", "onPageVerticalExit", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    @Override // fg3.h
    public void e(boolean z17) {
        a0().c().setIsPlay(z17);
    }

    @Override // mf3.e, kg3.d
    public void h4() {
        new kg3.b().b(M());
    }

    @Override // mf3.e, mf3.l
    public void i() {
        this.f326111n = false;
        a0().c().setSpeedRatio(1.0f);
        a0().c().y();
        reset();
    }

    @Override // mf3.l
    public void q(float f17) {
        android.view.View view = a0().f254772a;
        float max = java.lang.Math.max(1.0f - ((1.0f - f17) * 2), 0.0f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(max));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/media/video/VideoOperationLayer", "onPageHorizontalScroll", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/media/video/VideoOperationLayer", "onPageHorizontalScroll", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // fg3.h
    public void reset() {
        a0().a().setVisibility(8);
        a0().c().setIsPlay(false);
        a0().c().a(0);
        M().clearAnimation();
        android.view.View M = M();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(M, arrayList.toArray(), "com/tencent/mm/plugin/media/video/VideoOperationLayer", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        M.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(M, "com/tencent/mm/plugin/media/video/VideoOperationLayer", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // fg3.h
    public void s(boolean z17) {
        a0().c().E(z17);
    }

    @Override // mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        kotlin.jvm.internal.o.g(bindContext, "bindContext");
        super.t(bindContext);
        reset();
        gg3.c a17 = bindContext.f326117a.a();
        w(0, (int) (a17 != null ? a17.f271730e : 0L));
    }

    @Override // mf3.e, mf3.l
    public void u(android.view.View parentView) {
        kotlin.jvm.internal.o.g(parentView, "parentView");
        super.u(parentView);
        new kg3.b().a(M());
        android.widget.FrameLayout b17 = a0().b();
        kotlin.jvm.internal.o.f(b17, "getCloseBtn(...)");
        pf3.d.U(this, b17, null, new fg3.i(this), 1, null);
        com.tencent.mm.plugin.media.view.MediaGalleryVideoSeekBar c17 = a0().c();
        kotlin.jvm.internal.o.f(c17, "getSeekBar(...)");
        X(c17);
        com.tencent.mm.plugin.media.view.MediaGalleryVideoSeekBar c18 = a0().c();
        c18.setVisibility(0);
        c18.setOnPlayTextUpdate(new fg3.j(this));
        c18.C(c18.getLightStyle());
        c18.setExtendPlayBtnClick(true);
        a0().c().setPlayBtnOnClickListener(new fg3.k(this));
        a0().c().setIplaySeekCallback(this.f262446y);
        a0().c().setOnVideoSpeedChangeListener(this);
    }

    @Override // fg3.h
    public void w(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MediaGallery.VideoOperationLayer", "progress: " + i17 + ' ' + i18);
        this.f262443v = i17 / 1000;
        this.f262444w = a06.d.a(((double) i18) / 1000.0d);
        com.tencent.mm.plugin.media.view.MediaGalleryVideoSeekBar c17 = a0().c();
        java.lang.Runnable runnable = this.f262445x;
        c17.removeCallbacks(runnable);
        a0().c().post(runnable);
    }
}
