package z71;

/* loaded from: classes8.dex */
public class d extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.WeChatTabRedDotEvent f470515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z71.f f470516e;

    public d(z71.f fVar, com.tencent.mm.autogen.events.WeChatTabRedDotEvent weChatTabRedDotEvent) {
        this.f470516e = fVar;
        this.f470515d = weChatTabRedDotEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.WeChatTabRedDotEvent weChatTabRedDotEvent = this.f470515d;
        int i17 = weChatTabRedDotEvent.f54979g.f6731a;
        boolean z17 = weChatTabRedDotEvent.f54979g.f6732b;
        int i18 = weChatTabRedDotEvent.f54979g.f6733c;
        z71.f fVar = this.f470516e;
        if (fVar.f470521f.containsKey(java.lang.Integer.valueOf(weChatTabRedDotEvent.f54979g.f6731a))) {
            am.g20 g20Var = (am.g20) fVar.f470521f.get(java.lang.Integer.valueOf(weChatTabRedDotEvent.f54979g.f6731a));
            am.g20 g20Var2 = weChatTabRedDotEvent.f54979g;
            fVar.getClass();
            if (g20Var.f6731a == g20Var2.f6731a && (g20Var.f6732b != g20Var2.f6732b || g20Var.f6733c != g20Var2.f6733c)) {
                com.tencent.mm.autogen.events.TabRedDotChangeEvent tabRedDotChangeEvent = new com.tencent.mm.autogen.events.TabRedDotChangeEvent();
                tabRedDotChangeEvent.f54880g.getClass();
                tabRedDotChangeEvent.e();
            }
        }
        fVar.f470521f.put(java.lang.Integer.valueOf(weChatTabRedDotEvent.f54979g.f6731a), weChatTabRedDotEvent.f54979g);
    }
}
