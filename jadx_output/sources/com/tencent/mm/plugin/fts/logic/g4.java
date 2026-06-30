package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes9.dex */
public final class g4 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f137550b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f137551c;

    /* renamed from: a, reason: collision with root package name */
    public r45.ko0 f137552a = new r45.ko0();

    static {
        new com.tencent.mm.plugin.fts.logic.e4(null);
        f137550b = "MMKV_KEY_FTS_VOICE_TRANS_TASK" + gm0.j1.b().j();
        f137551c = jz5.h.b(com.tencent.mm.plugin.fts.logic.d4.f137501d);
    }

    public final synchronized void a(long j17) {
        java.util.LinkedList waitingList = this.f137552a.f378875d;
        kotlin.jvm.internal.o.f(waitingList, "waitingList");
        if (kz5.h0.B(waitingList, new com.tencent.mm.plugin.fts.logic.f4(j17))) {
            synchronized (this) {
                java.lang.Object value = ((jz5.n) f137551c).getValue();
                kotlin.jvm.internal.o.f(value, "getValue(...)");
                ((com.tencent.mm.sdk.platformtools.o4) value).H(f137550b, this.f137552a.toByteArray());
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.VoiceTransTaskMgr", "remove: msgId %d, list size: %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(this.f137552a.f378875d.size()));
            }
        }
    }
}
