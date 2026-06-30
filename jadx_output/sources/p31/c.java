package p31;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final p31.c f351450a = new p31.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedHashMap f351451b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f351452c = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f351453d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public static int f351454e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static final android.media.AudioManager f351455f;

    static {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        f351455f = (android.media.AudioManager) systemService;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AudioPlayerEvent>(a0Var) { // from class: com.tencent.mm.msgsubscription.voice.MsgSubscriptionVoicePlayHelperMM$mAudioPlayerEventListener$1
            {
                this.__eventId = 1218151603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.AudioPlayerEvent audioPlayerEvent) {
                com.tencent.mm.autogen.events.AudioPlayerEvent event = audioPlayerEvent;
                kotlin.jvm.internal.o.g(event, "event");
                int i17 = event.f53990g.f6716a;
                if (i17 != 2 && i17 != 4 && i17 != 5) {
                    return false;
                }
                synchronized (p31.c.f351453d) {
                    java.lang.Long l17 = (java.lang.Long) ((java.util.LinkedHashMap) p31.c.f351452c).get(event.f53990g.f6718c);
                    n01.c.b(event.f53990g.f6718c);
                    if (l17 != null) {
                        p31.c.f351451b.remove(l17);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgSubscriptionVoicePlayer", "[player event] action[" + event.f53990g.f6716a + "]  id[" + l17 + ']');
                    java.util.LinkedHashMap linkedHashMap = p31.c.f351451b;
                    if (linkedHashMap.entrySet().size() > 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSubscriptionVoicePlayer", "[player event] play next audio, waiting to play size[" + linkedHashMap.size() + ']');
                        java.util.Set entrySet = linkedHashMap.entrySet();
                        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
                        java.lang.Object W = kz5.n0.W(entrySet);
                        kotlin.jvm.internal.o.f(W, "first(...)");
                        java.util.Map.Entry entry = (java.util.Map.Entry) W;
                        p31.c cVar = p31.c.f351450a;
                        java.lang.Object value = entry.getValue();
                        kotlin.jvm.internal.o.f(value, "<get-value>(...)");
                        java.lang.Object key = entry.getKey();
                        kotlin.jvm.internal.o.f(key, "<get-key>(...)");
                        cVar.a((java.lang.String) value, ((java.lang.Number) key).longValue());
                    } else {
                        int i18 = p31.c.f351454e;
                        if (i18 != -1) {
                            p31.c.f351455f.setStreamVolume(3, i18, 4);
                            p31.c.f351454e = -1;
                        }
                    }
                }
                return false;
            }
        }.alive();
    }

    public final void a(java.lang.String str, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSubscriptionVoicePlayer", "[innerPlay] id[" + j17 + "]  url[" + str + ']');
        n01.b bVar = new n01.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        sb6.append(f351450a.hashCode());
        java.lang.String a17 = n01.c.a(sb6.toString(), dl3.h.a());
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.util.Map map = f351452c;
        kotlin.jvm.internal.o.d(a17);
        map.put(a17, valueOf);
        bVar.f333836a = a17;
        bVar.f333837b = str;
        bVar.f333842g = true;
        android.media.AudioManager audioManager = f351455f;
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if ((streamVolume * 1.0f) / streamMaxVolume < 0.4d) {
            if (f351454e == -1) {
                f351454e = streamVolume;
            }
            audioManager.setStreamVolume(3, (int) (streamMaxVolume * 0.4d), 5);
        }
        n01.c.g(bVar);
    }
}
