package p10;

/* loaded from: classes8.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView f350998d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView magicDebugPanelView) {
        super(1);
        this.f350998d = magicDebugPanelView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String token = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(token, "token");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicDebugPanelView", "startProfile success, token: ".concat(token));
        com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView magicDebugPanelView = this.f350998d;
        magicDebugPanelView.f65816f = token;
        magicDebugPanelView.f65814d.post(new p10.s(magicDebugPanelView));
        return jz5.f0.f302826a;
    }
}
