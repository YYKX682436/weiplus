package lc2;

/* loaded from: classes8.dex */
public final class k extends com.tencent.mm.sdk.event.n {
    public k() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.WeChatTabRedDotEvent event = (com.tencent.mm.autogen.events.WeChatTabRedDotEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onWeChatTabRedDotEvent: ");
        am.g20 g20Var = event.f54979g;
        sb6.append(g20Var != null ? java.lang.Integer.valueOf(g20Var.f6731a) : null);
        com.tencent.mars.xlog.Log.i("FinderWechatTabRedDotEventListener", sb6.toString());
        return false;
    }
}
