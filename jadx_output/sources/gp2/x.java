package gp2;

/* loaded from: classes2.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.g5 f274347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f274348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f274349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f274350g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(zy2.g5 g5Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, gp2.l0 l0Var, int i17) {
        super(0);
        this.f274347d = g5Var;
        this.f274348e = baseFinderFeed;
        this.f274349f = l0Var;
        this.f274350g = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zy2.g5 g5Var = this.f274347d;
        android.view.View videoView = g5Var.getVideoView();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f274348e;
        videoView.setTag(com.tencent.mm.R.id.ryy, java.lang.Long.valueOf(baseFinderFeed.getItemId()));
        zy2.p7 p7Var = g5Var instanceof zy2.p7 ? (zy2.p7) g5Var : null;
        int i17 = this.f274350g;
        gp2.l0 l0Var = this.f274349f;
        if (p7Var != null) {
            p7Var.setFluentSwitchCompleteCallback(new gp2.v(l0Var, i17, g5Var));
        }
        g5Var.setIMMVideoViewCallback(new gp2.w(g5Var, baseFinderFeed, l0Var, i17));
        g5Var.setMute(true);
        zy2.g5.u(g5Var, null, 1, null);
        return jz5.f0.f302826a;
    }
}
