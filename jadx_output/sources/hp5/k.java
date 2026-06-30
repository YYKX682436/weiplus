package hp5;

/* loaded from: classes14.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final hp5.k f282959d = new hp5.k();

    public k() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new android.content.BroadcastReceiver() { // from class: com.tencent.mm.voipmp.v2.sensor.VoIPMPSystemStatusController$screenStateReceiver$2$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                kotlin.jvm.internal.o.g(intent, "intent");
                java.lang.String action = intent.getAction();
                if (action != null) {
                    int hashCode = action.hashCode();
                    if (hashCode != -2128145023) {
                        if (hashCode != -1454123155) {
                            if (hashCode == 823795052 && action.equals("android.intent.action.USER_PRESENT")) {
                                com.tencent.mm.plugin.voipmp.platform.c1.f177232b.a(com.tencent.mm.plugin.voipmp.platform.q.SCREEN_STATE_USER_PRESENT, hp5.j.f282958a);
                                return;
                            }
                        } else if (action.equals("android.intent.action.SCREEN_ON")) {
                            com.tencent.mm.plugin.voipmp.platform.v0.f177287b.x(true, hp5.f.f282954a);
                            com.tencent.mm.plugin.voipmp.platform.c1.f177232b.a(com.tencent.mm.plugin.voipmp.platform.q.SCREEN_STATE_SCREEN_ON, hp5.g.f282955a);
                            return;
                        }
                    } else if (action.equals("android.intent.action.SCREEN_OFF")) {
                        com.tencent.mm.plugin.voipmp.platform.v0.f177287b.x(false, hp5.h.f282956a);
                        com.tencent.mm.plugin.voipmp.platform.c1.f177232b.a(com.tencent.mm.plugin.voipmp.platform.q.SCREEN_STATE_SCREEN_OFF, hp5.i.f282957a);
                        return;
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPSystemStatusController", "onReceive: " + intent.getAction());
            }
        };
    }
}
