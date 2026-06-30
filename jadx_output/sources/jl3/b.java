package jl3;

/* loaded from: classes15.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f300209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jl3.d f300210e;

    public b(jl3.d dVar, int i17) {
        this.f300210e = dVar;
        this.f300209d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        jl3.c cVar = this.f300210e.f300221q;
        if (cVar != null) {
            rl3.o oVar = (rl3.o) cVar;
            rl3.p pVar = oVar.f397264a;
            int i17 = this.f300209d;
            if (i17 != 1) {
                if (i17 == -2 || i17 == 5 || i17 == 19) {
                    com.tencent.mm.sdk.platformtools.u3.h(new rl3.m(oVar, i17));
                    return;
                } else {
                    if (i17 == -1 || i17 == 6 || i17 == 4) {
                        com.tencent.mm.sdk.platformtools.u3.h(new rl3.n(oVar));
                        rl3.p.w(pVar, pVar.f397265k, i17);
                        return;
                    }
                    return;
                }
            }
            jl3.d dVar = pVar.f397267m;
            if (dVar == null || pVar.f397270p || pVar.f397266l == null) {
                return;
            }
            pVar.f397266l.j(xl3.c.c(dVar.f300212e.f17346e, dVar.f300216i));
            if (pVar.t(pVar.f397265k) && !pVar.s()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicPlayer", "request focus error");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicPlayer", "startPlay");
            try {
                com.tencent.mm.plugin.music.player.base.i iVar = pVar.f397266l;
                if (iVar != null) {
                    iVar.h();
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Music.MusicPlayer", e17, "startPlay", new java.lang.Object[0]);
            }
            pVar.f397270p = true;
            pVar.f397268n = false;
        }
    }
}
