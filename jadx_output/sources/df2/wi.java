package df2;

/* loaded from: classes3.dex */
public final class wi extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231690m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f231691n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.assist.d9 f231692o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObjectDesc f231693p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderMedia f231694q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231690m = "LiveGamePostController";
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z6(com.tencent.mm.protocal.protobuf.FinderObjectDesc r24, com.tencent.mm.protocal.protobuf.FinderMedia r25) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.wi.Z6(com.tencent.mm.protocal.protobuf.FinderObjectDesc, com.tencent.mm.protocal.protobuf.FinderMedia):void");
    }

    public final mm2.g1 a7() {
        return (mm2.g1) business(mm2.g1.class);
    }

    public final com.tencent.mm.plugin.finder.live.view.k0 b7() {
        com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
        if (ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0) {
            return (com.tencent.mm.plugin.finder.live.view.k0) ubVar;
        }
        return null;
    }

    public final r45.n73 c7() {
        return (r45.n73) ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329071i).getValue();
    }

    public final mm2.s1 d7() {
        return (mm2.s1) business(mm2.s1.class);
    }

    public final r45.xl6 e7() {
        return ((mm2.s1) business(mm2.s1.class)).f329402y;
    }

    public final void f7(r45.m01 m01Var) {
        com.tencent.mars.xlog.Log.i(this.f231690m, "warn_page = " + pm0.b0.g(m01Var));
        android.content.Context O6 = O6();
        pf5.z zVar = pf5.z.f353948a;
        if (!(O6 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.live.viewmodel.a6) zVar.a((androidx.appcompat.app.AppCompatActivity) O6).a(com.tencent.mm.plugin.finder.live.viewmodel.a6.class)).O6(m01Var, new df2.ri(m01Var, this));
    }

    public final boolean g7() {
        r45.z53 z53Var;
        r45.n73 c76 = c7();
        return (c76 == null || (z53Var = (r45.z53) c76.getCustom(1)) == null || z53Var.getInteger(13) != 1) ? false : true;
    }

    public final void h7(boolean z17, int i17, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("SUCC", z17);
        intent.putExtra("TITLE", O6().getResources().getString(i17));
        intent.putExtra("DESC", str);
        intent.putExtra("IS_MINI_GAME", g7());
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Aj(O6(), intent);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        if (com.tencent.mm.plugin.finder.assist.x2.f102673b == 19) {
            com.tencent.mm.plugin.finder.assist.x2.f102672a.b(1);
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f231692o = null;
        this.f231693p = null;
        this.f231694q = null;
    }
}
