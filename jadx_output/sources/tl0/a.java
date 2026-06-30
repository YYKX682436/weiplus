package tl0;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        ul0.a aVar = tl0.b.f420194a;
        aVar.getClass();
        aVar.f428555d.A("ChattingEvent", "DELETE FROM ChattingEvent where timestamp<=" + (java.lang.System.currentTimeMillis() - (nl0.e.c() * 86400000)));
        ul0.d dVar = tl0.b.f420195b;
        dVar.getClass();
        dVar.f428561d.A("SnsFeature", "DELETE FROM SnsFeature where timestamp<=" + (java.lang.System.currentTimeMillis() - (nl0.e.c() * 86400000)));
        ul0.c cVar = tl0.b.f420196c;
        cVar.getClass();
        cVar.f428559d.A("LiveHomeRedDotEvent", "DELETE FROM LiveHomeRedDotEvent where timestamp<=" + (java.lang.System.currentTimeMillis() - (nl0.e.c() * 86400000)));
        ul0.b bVar = tl0.b.f420197d;
        bVar.getClass();
        bVar.f428557d.A("LiveHomeNoRedDotEvent", "DELETE FROM LiveHomeNoRedDotEvent where timestamp<=" + (java.lang.System.currentTimeMillis() - 604800000));
    }
}
