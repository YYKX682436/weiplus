package tj3;

/* loaded from: classes8.dex */
public final class i0 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f419746d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f419747e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f419748f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f419749g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f419750h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f419751i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f419752m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f419753n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f419746d = jz5.h.b(new tj3.z(this));
        this.f419747e = jz5.h.b(new tj3.h0(this));
        this.f419748f = jz5.h.b(new tj3.c0(this));
        this.f419749g = jz5.h.b(new tj3.b0(this));
        this.f419750h = jz5.h.b(new tj3.y(this));
        this.f419751i = jz5.h.b(tj3.a0.f419725d);
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489309c31, (android.view.ViewGroup) this, true);
        this.f419752m = "";
    }

    private final android.widget.TextView getAvatarLayoutInfo() {
        return (android.widget.TextView) ((jz5.n) this.f419750h).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.ImageView getAvatarView() {
        return (android.widget.ImageView) ((jz5.n) this.f419746d).getValue();
    }

    private final android.widget.ImageView getLoadingView() {
        return (android.widget.ImageView) ((jz5.n) this.f419749g).getValue();
    }

    private final android.widget.ImageView getMaskView() {
        return (android.widget.ImageView) ((jz5.n) this.f419748f).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView getVideoView() {
        return (com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView) ((jz5.n) this.f419747e).getValue();
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAvatarView", "close " + this.f419752m);
        com.tencent.mm.plugin.multitalk.model.a2 n17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n();
        if (n17 != null) {
            com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView = getVideoView();
            kotlin.jvm.internal.o.f(videoView, "<get-videoView>(...)");
            n17.l(videoView, this.f419752m);
        }
    }

    public final void d(com.tencent.mm.plugin.multitalk.ui.t memberInfo) {
        java.lang.String format;
        kotlin.jvm.internal.o.g(memberInfo, "memberInfo");
        java.lang.Boolean bool = this.f419753n;
        boolean z17 = memberInfo.f150299d;
        boolean b17 = kotlin.jvm.internal.o.b(bool, java.lang.Boolean.valueOf(z17));
        java.lang.String str = memberInfo.f150297b;
        if (!b17) {
            this.f419753n = java.lang.Boolean.valueOf(z17);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str);
            if (z17) {
                java.lang.String string = getContext().getString(com.tencent.mm.R.string.f492582h13);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{e17}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
            } else {
                java.lang.String string2 = getContext().getString(com.tencent.mm.R.string.f492581h12);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                format = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{e17}, 1));
                kotlin.jvm.internal.o.f(format, "format(...)");
            }
            getVideoView().setContentDescription(format);
            getAvatarView().setContentDescription(format);
        }
        if (z17 || memberInfo.a()) {
            this.f419752m = str;
            com.tencent.mm.plugin.multitalk.model.a2 n17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n();
            if (n17 != null) {
                com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView = getVideoView();
                kotlin.jvm.internal.o.f(videoView, "<get-videoView>(...)");
                n17.a(videoView, str);
            }
            if (indexOfChild(getVideoView()) == -1) {
                addView(getVideoView(), 0);
            }
            if (getAvatarView().getVisibility() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAvatarView", "refreshVideoState: show video view");
                getVideoView().setOnFrame(new tj3.f0(this));
            }
        } else {
            com.tencent.mm.plugin.multitalk.model.a2 n18 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n();
            if (n18 != null) {
                com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView2 = getVideoView();
                kotlin.jvm.internal.o.f(videoView2, "<get-videoView>(...)");
                n18.l(videoView2, str);
            }
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Di(getAvatarView(), str);
            getAvatarView().setBackgroundColor(-16776961);
            getVideoView().setOnFrame(tj3.g0.f419738d);
            getAvatarView().setVisibility(0);
            removeView(getVideoView());
        }
        if (getAvatarLayoutInfo().getVisibility() == 0) {
            getAvatarLayoutInfo().setText("isILink: " + ((java.lang.Boolean) ((jz5.n) this.f419751i).getValue()).booleanValue() + "\nmid:" + memberInfo.f150296a);
        }
    }

    public final void e(com.tencent.mm.plugin.multitalk.ui.t memberInfo) {
        android.graphics.drawable.AnimationDrawable animationDrawable;
        kotlin.jvm.internal.o.g(memberInfo, "memberInfo");
        if (memberInfo.f150298c || memberInfo.f150303h == 102) {
            getMaskView().setVisibility(0);
            getLoadingView().setVisibility(0);
            android.graphics.drawable.Drawable background = getLoadingView().getBackground();
            animationDrawable = background instanceof android.graphics.drawable.AnimationDrawable ? (android.graphics.drawable.AnimationDrawable) background : null;
            if (animationDrawable != null) {
                animationDrawable.start();
                return;
            }
            return;
        }
        getMaskView().setVisibility(8);
        getLoadingView().setVisibility(8);
        android.graphics.drawable.Drawable background2 = getLoadingView().getBackground();
        animationDrawable = background2 instanceof android.graphics.drawable.AnimationDrawable ? (android.graphics.drawable.AnimationDrawable) background2 : null;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
    }
}
