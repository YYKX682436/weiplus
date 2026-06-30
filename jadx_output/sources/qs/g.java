package qs;

/* loaded from: classes8.dex */
public class g extends com.tencent.mm.sdk.event.n {
    public g() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.WeChatTabRedDotEvent weChatTabRedDotEvent = (com.tencent.mm.autogen.events.WeChatTabRedDotEvent) iEvent;
        z71.f Bi = z71.f.Bi();
        Bi.getClass();
        if (weChatTabRedDotEvent == null || weChatTabRedDotEvent.f54979g == null) {
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).A("aireddot_" + weChatTabRedDotEvent.f54979g.f6731a);
        ku5.u0 u0Var = ku5.t0.f312615d;
        ((ku5.t0) u0Var).l(new z71.d(Bi, weChatTabRedDotEvent), 500L, "aireddot_" + weChatTabRedDotEvent.f54979g.f6731a);
        return false;
    }
}
