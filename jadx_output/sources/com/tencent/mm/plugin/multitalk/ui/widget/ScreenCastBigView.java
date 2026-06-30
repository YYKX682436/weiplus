package com.tencent.mm.plugin.multitalk.ui.widget;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0007\u001a\u00020\u0006R#\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u0013\u001a\n \t*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\""}, d2 = {"Lcom/tencent/mm/plugin/multitalk/ui/widget/ScreenCastBigView;", "Landroid/widget/FrameLayout;", "", "visibility", "Ljz5/f0;", "setVisibility", "Landroid/view/LayoutInflater;", "getLayoutInflater", "Lcom/tencent/mm/plugin/multitalk/mt_render/mt_render_impl/render/VideoView;", "kotlin.jvm.PlatformType", "d", "Ljz5/g;", "getVideoView", "()Lcom/tencent/mm/plugin/multitalk/mt_render/mt_render_impl/render/VideoView;", "videoView", "Landroid/widget/ImageView;", "f", "getMaskView", "()Landroid/widget/ImageView;", "maskView", "", "g", "Ljava/lang/String;", "getCurrentUsername", "()Ljava/lang/String;", "setCurrentUsername", "(Ljava/lang/String;)V", "currentUsername", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-multitalk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class ScreenCastBigView extends android.widget.FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f150355m = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g videoView;

    /* renamed from: e, reason: collision with root package name */
    public int f150357e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g maskView;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public java.lang.String currentUsername;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f150360h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f150361i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenCastBigView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.videoView = jz5.h.b(new sj3.p5(this));
        this.maskView = jz5.h.b(new sj3.h5(this));
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489432ci5, (android.view.ViewGroup) this, true);
        this.currentUsername = "";
        this.f150361i = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.widget.ImageView getMaskView() {
        return (android.widget.ImageView) ((jz5.n) this.maskView).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView getVideoView() {
        return (com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView) ((jz5.n) this.videoView).getValue();
    }

    public final void c(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.ScreenCastBigView", "bindUser: " + this.currentUsername + " to " + username);
        com.tencent.mm.plugin.multitalk.model.a2 n17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n();
        if (n17 != null) {
            com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView = getVideoView();
            kotlin.jvm.internal.o.f(videoView, "<get-videoView>(...)");
            n17.a(videoView, username);
        }
        this.currentUsername = username;
        getMaskView().setVisibility(8);
    }

    public final void d() {
        if (this.f150360h == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.ScreenCastBigView", "dismissCenterInfo: " + this.f150357e);
        pm0.v.X(new sj3.g5(this));
    }

    public final void e(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.ScreenCastBigView", "showCenterLoading: " + z17);
        android.view.View view = this.f150360h;
        if (view != null) {
            removeView(view);
            this.f150360h = null;
        }
        android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.f489311c33, (android.view.ViewGroup) this, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f486023jw5);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        if (!z17) {
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jw6)).setVisibility(8);
            getVideoView().setOnFrame(new sj3.j5(this));
        }
        pm0.v.X(new sj3.k5(this, inflate, z17, imageView));
    }

    public final void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.ScreenCastBigView", "unbindUser: " + this.currentUsername);
        com.tencent.mm.plugin.multitalk.model.a2 n17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n();
        if (n17 != null) {
            com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView = getVideoView();
            kotlin.jvm.internal.o.f(videoView, "<get-videoView>(...)");
            n17.l(videoView, this.currentUsername);
        }
    }

    public final java.lang.String getCurrentUsername() {
        return this.currentUsername;
    }

    public final android.view.LayoutInflater getLayoutInflater() {
        java.lang.Object systemService = getContext().getSystemService("layout_inflater");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        return (android.view.LayoutInflater) systemService;
    }

    public final void setCurrentUsername(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.currentUsername = str;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        if (i17 == 0) {
            e(false);
        } else {
            d();
        }
    }
}
