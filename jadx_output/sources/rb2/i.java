package rb2;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView f393645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f393646e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393647f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f393648g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView finderCommentAdVideoView, android.widget.ImageView imageView, in5.s0 s0Var, so2.y0 y0Var) {
        super(0);
        this.f393645d = finderCommentAdVideoView;
        this.f393646e = imageView;
        this.f393647f = s0Var;
        this.f393648g = y0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.FinderCommentAdVideoView finderCommentAdVideoView = this.f393645d;
        finderCommentAdVideoView.setMute(true);
        finderCommentAdVideoView.setOnFirstFrameRendered(new rb2.f(this.f393646e));
        in5.s0 s0Var = this.f393647f;
        so2.y0 y0Var = this.f393648g;
        finderCommentAdVideoView.setOnVideoReplay(new rb2.g(s0Var, y0Var));
        finderCommentAdVideoView.setOnProgressChange(new rb2.h(new kotlin.jvm.internal.c0(), s0Var, y0Var));
        return jz5.f0.f302826a;
    }
}
