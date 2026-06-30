package qs;

/* loaded from: classes8.dex */
public class y extends com.tencent.mm.sdk.event.n {
    public y() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.fl flVar;
        com.tencent.mm.autogen.events.NewNotificationEvent newNotificationEvent = (com.tencent.mm.autogen.events.NewNotificationEvent) iEvent;
        z71.m wi6 = z71.m.wi();
        wi6.getClass();
        if (newNotificationEvent == null || (flVar = newNotificationEvent.f54534g) == null) {
            return false;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        wi6.f470533d = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.AiWeixinData", "wechat notification event talker[%s] unreadCount[%d] silence[%b]", flVar.f6683a, java.lang.Integer.valueOf(flVar.f6684b), java.lang.Boolean.valueOf(flVar.f6685c));
        return false;
    }
}
