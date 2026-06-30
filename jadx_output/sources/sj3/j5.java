package sj3;

/* loaded from: classes14.dex */
public final class j5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView f408604d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView screenCastBigView) {
        super(0);
        this.f408604d = screenCastBigView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView;
        com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView screenCastBigView = this.f408604d;
        if (screenCastBigView.f150357e == 1) {
            screenCastBigView.d();
        }
        videoView = screenCastBigView.getVideoView();
        videoView.setOnFrame(sj3.i5.f408576d);
        return jz5.f0.f302826a;
    }
}
