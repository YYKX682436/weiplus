package k50;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k50.z f304265d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(k50.z zVar) {
        super(1);
        this.f304265d = zVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        xi5.b bVar = (xi5.b) state.a(xi5.b.class);
        k50.z zVar = this.f304265d;
        if (bVar != null) {
            long c17 = c01.id.c() - zVar.T6();
            com.tencent.mars.xlog.Log.i("MicroMsg.ForwardReportUIC", "AfterForwardAction:costTime:" + c17 + ' ');
            com.tencent.mm.ui.mvvm.uic.conversation.recent.e.l(java.lang.Long.valueOf(zVar.f304278f), java.lang.Long.valueOf(c17), bVar.f454735b, bVar.f454736c, bVar.f454737d, bVar.f454738e);
        }
        if (((wi5.q0) state.a(wi5.q0.class)) != null) {
            com.tencent.mm.ui.mvvm.uic.conversation.recent.e eVar = com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a;
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("top_collapse_expand_btn", "view_clk", kz5.b1.e(new jz5.l("forward_sid", com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209295b)), 32337);
        }
        if (((xi5.b) state.a(xi5.b.class)) != null) {
            zVar.f304279g = 1;
        }
        return jz5.f0.f302826a;
    }
}
