package tj3;

/* loaded from: classes8.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tj3.i0 f419736d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(tj3.i0 i0Var) {
        super(0);
        this.f419736d = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView;
        com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkAvatarView", "refreshVideoState: on video view first frame");
        tj3.i0 i0Var = this.f419736d;
        pm0.v.X(new tj3.d0(i0Var));
        videoView = i0Var.getVideoView();
        videoView.setOnFrame(tj3.e0.f419734d);
        return jz5.f0.f302826a;
    }
}
