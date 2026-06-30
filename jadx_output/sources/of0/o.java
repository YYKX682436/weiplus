package of0;

/* loaded from: classes8.dex */
public class o extends com.tencent.mm.sdk.event.n {
    public o() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.JSApiOpenSpecificViewEvent jSApiOpenSpecificViewEvent = (com.tencent.mm.autogen.events.JSApiOpenSpecificViewEvent) iEvent;
        if (!"TopStories/userCenter".equalsIgnoreCase(jSApiOpenSpecificViewEvent.f54443g.f7899b)) {
            return false;
        }
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        am.sh shVar = jSApiOpenSpecificViewEvent.f54443g;
        if (isTeenMode) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(shVar.f7898a);
        } else {
            r45.in6 in6Var = new r45.in6();
            java.lang.String f17 = su4.r2.f(0);
            in6Var.f377183e = f17;
            in6Var.f377184f = f17;
            in6Var.f377194s = 10802;
            wm4.u.v(shVar.f7898a, in6Var);
            jSApiOpenSpecificViewEvent.f54444h.f8012c = true;
        }
        return true;
    }
}
