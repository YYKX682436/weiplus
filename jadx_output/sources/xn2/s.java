package xn2;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f455573d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(xn2.p0 p0Var) {
        super(0);
        this.f455573d = p0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xn2.p0 p0Var = this.f455573d;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader megaVideoFlowLoader = new com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoFlowLoader(p0Var.l());
        megaVideoFlowLoader.f120886f = new xn2.r(p0Var);
        return megaVideoFlowLoader;
    }
}
