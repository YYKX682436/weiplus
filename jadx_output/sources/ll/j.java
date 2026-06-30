package ll;

/* loaded from: classes13.dex */
public abstract class j {
    public static ll.p a(ol.h hVar, ql.c cVar, int i17, boolean z17) {
        ll.d hVar2 = i17 != 2 ? i17 != 3 ? (cVar == null || !cVar.b().f333861z) ? new ll.h(hVar, cVar) : new ll.g(hVar, cVar) : new ll.i(hVar, cVar) : new ll.f(hVar, cVar);
        hVar2.f319096q = hVar2.f319081b.b().f333840e;
        hVar2.f319089j.set(false);
        hVar2.f319090k.set(false);
        if (hVar2.f319081b != null) {
            hVar2.f319081b.a();
        }
        hVar2.p(1);
        if (z17) {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDecoderBase", "preload", null);
            hVar2.f319087h.set(true);
            hVar2.p(10);
        }
        return hVar2;
    }
}
