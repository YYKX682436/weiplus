package kl4;

/* loaded from: classes11.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final void a(bw5.lp0 tingItem, int i17) {
        kotlin.jvm.internal.o.g(tingItem, "tingItem");
        if (i17 == 14 || i17 == 13) {
            com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent = new com.tencent.mm.autogen.events.MusicPlayerEvent();
            am.jk jkVar = musicPlayerEvent.f54512g;
            jkVar.f7036b = i17;
            jkVar.f7037c = rk4.k5.g(tingItem);
            if (rk4.j5.h(tingItem)) {
                jkVar.f7044j = tingItem.d().l().getAppId();
                jkVar.f7037c.f17345d = 11;
            }
            jkVar.f7040f = "";
            jkVar.f7037c.U = true;
            musicPlayerEvent.b(android.os.Looper.getMainLooper());
            kl4.b.f308883b = true;
        }
    }
}
