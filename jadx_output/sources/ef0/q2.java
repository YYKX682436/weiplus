package ef0;

/* loaded from: classes.dex */
public final class q2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ef0.y2 f252305d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(ef0.y2 y2Var) {
        super(0);
        this.f252305d = y2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f252305d.getClass();
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ListenWhiteList", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryConfigService", "tingConfig ListenWhiteList: " + b17);
        if (b17 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryConfigService", "tingConfig isWeChatUser isInWhiteListFromDynConfig");
            return java.lang.Boolean.FALSE;
        }
        boolean a07 = c01.e2.a0();
        boolean z17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ListenBlacklist", 0) != 0;
        boolean z18 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ting.RepairerConfigTingWeChatUser()) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryConfigService", "tingConfig isWeChatUser: " + a07 + ", ListenBlacklist: " + z17 + ", fakeWeChatUser: " + z18);
        return java.lang.Boolean.valueOf(a07 || z17 || z18);
    }
}
