package sj3;

/* loaded from: classes14.dex */
public final class p5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView f408696d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView screenCastBigView) {
        super(0);
        this.f408696d = screenCastBigView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.multitalk.ui.widget.ScreenCastBigView screenCastBigView = this.f408696d;
        com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView = (com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView) screenCastBigView.findViewById(com.tencent.mm.R.id.a_c);
        videoView.setOnOriChange(new sj3.o5(screenCastBigView));
        return videoView;
    }
}
