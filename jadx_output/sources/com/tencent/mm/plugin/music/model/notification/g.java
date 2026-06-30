package com.tencent.mm.plugin.music.model.notification;

/* loaded from: classes11.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.music.model.notification.MMMusicPlayerService f150648a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f150649b = false;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f150650c;

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MMMusicNotificationHelper", "initMusicPlayerService");
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(a0Var) { // from class: com.tencent.mm.plugin.music.model.notification.MMMusicNotificationHelper$1
            {
                this.__eventId = -1155728636;
            }

            /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
            
                if (r0 != 11) goto L72;
             */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent r6) {
                /*
                    Method dump skipped, instructions count: 342
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.music.model.notification.MMMusicNotificationHelper$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f150650c = iListener;
        iListener.alive();
    }
}
