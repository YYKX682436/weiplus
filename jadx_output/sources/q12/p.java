package q12;

/* loaded from: classes12.dex */
public class p extends com.tencent.mm.sdk.event.n {
    public p() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        int i17 = ((com.tencent.mm.autogen.events.EmojiFileCleanTaskEvent) iEvent).f54102g.f7511a;
        if (i17 == 0) {
            y12.e b17 = y12.e.b();
            java.lang.String g17 = n22.m.g();
            b17.f458857a = true;
            if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiFileCleanTaskManager", "filepath is empty.");
            } else {
                boolean z17 = java.lang.System.currentTimeMillis() - ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_EMOJI_CLEAN_TEMP_FILE_TASK_LONG, 0L)).longValue() >= 86400000;
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiFileCleanTaskManager", "need clean emoji file:%B", java.lang.Boolean.valueOf(z17));
                if (z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiFileCleanTaskManager", "startClean");
                    cp.e.b("EmojiFileCleanMgr", new y12.d(b17, g17));
                }
            }
        } else if (i17 == 1) {
            y12.e.b().f458857a = false;
        }
        return false;
    }
}
