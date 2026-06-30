package ko5;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public er4.r f310098a = er4.r.MP_ROOM_TYPE_VOICE;

    /* renamed from: b, reason: collision with root package name */
    public er4.l f310099b;

    /* renamed from: c, reason: collision with root package name */
    public er4.l f310100c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.voipmp.v2.extension.VoIPMPQuickAcceptExtension$mShortcutVoipControllerListener$1 f310101d;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.voipmp.v2.extension.VoIPMPQuickAcceptExtension$mShortcutVoipControllerListener$1] */
    public c() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f310101d = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ShortcutVoipControllerEvent>(a0Var) { // from class: com.tencent.mm.voipmp.v2.extension.VoIPMPQuickAcceptExtension$mShortcutVoipControllerListener$1
            {
                this.__eventId = 635809864;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ShortcutVoipControllerEvent shortcutVoipControllerEvent) {
                com.tencent.mm.autogen.events.ShortcutVoipControllerEvent event = shortcutVoipControllerEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPQuickAccept", "shortcutVoipControllerListener callback " + event.f54778g.f7366a);
                int i17 = event.f54778g.f7366a;
                if (i17 == 1) {
                    if (ko5.c.this.f310098a == er4.r.MP_ROOM_TYPE_VIDEO) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPQuickAccept", "video mode not allow ti response accept");
                        return false;
                    }
                    nq4.f fVar = nq4.f.f339014a;
                    if (nq4.f.f339019f) {
                        ((jp5.o) i95.n0.c(jp5.o.class)).ti();
                        return false;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPQuickAccept", "current has not broadcast coming message,not allow to response accept");
                    return false;
                }
                er4.l lVar = er4.l.MAIN_UI_INVITED;
                if (i17 != 2) {
                    if (i17 != 3) {
                        return false;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPQuickAccept", "krxkli - Receive ShortcutVoipControllerEvent.BT_SCO_CONNECTED");
                    er4.l lVar2 = ko5.c.this.f310100c;
                    if (lVar2 == null) {
                        return false;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPQuickAccept", "launchQuickAccept After BT_SCO_CONNECTED");
                    if (lVar2 != lVar) {
                        return false;
                    }
                    ((jp5.o) i95.n0.c(jp5.o.class)).Hd();
                    ((jp5.o) i95.n0.c(jp5.o.class)).Ee();
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPQuickAccept", "shortcutVoipControllerListener callback " + event.f54778g.f7366a);
                if (ko5.c.this.f310099b != lVar) {
                    ((jp5.o) i95.n0.c(jp5.o.class)).cb();
                    return false;
                }
                nq4.f fVar2 = nq4.f.f339014a;
                if (nq4.f.f339019f) {
                    ((jp5.o) i95.n0.c(jp5.o.class)).cb();
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPQuickAccept", "current has not broadcast coming message,not allow to response reject");
                return false;
            }
        };
    }

    public final void a(er4.l state) {
        kotlin.jvm.internal.o.g(state, "state");
        this.f310099b = state;
        er4.l lVar = er4.l.MAIN_UI_INVITING;
        com.tencent.mm.voipmp.v2.extension.VoIPMPQuickAcceptExtension$mShortcutVoipControllerListener$1 voIPMPQuickAcceptExtension$mShortcutVoipControllerListener$1 = this.f310101d;
        if (state == lVar || state == er4.l.MAIN_UI_INVITED) {
            voIPMPQuickAcceptExtension$mShortcutVoipControllerListener$1.alive();
        } else if (state == er4.l.MAIN_UI_CALL_END) {
            voIPMPQuickAcceptExtension$mShortcutVoipControllerListener$1.dead();
        }
    }
}
