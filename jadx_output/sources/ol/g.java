package ol;

/* loaded from: classes13.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hl.c f346090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ol.h f346091e;

    public g(ol.h hVar, hl.c cVar) {
        this.f346091e = hVar;
        this.f346090d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ol.h hVar = this.f346091e;
        if (hVar.f346101j != null) {
            hl.c cVar = this.f346090d;
            cVar.f282015b = 2;
            hVar.getClass();
            cVar.f282014a = 44100;
            ol.b bVar = this.f346091e.f346101j;
            hl.c cVar2 = this.f346090d;
            dl3.i iVar = ((dl3.p) bVar).f235341a;
            dl3.b bVar2 = iVar.L;
            if (bVar2 != null) {
                bVar2.a(iVar.M, 1, cVar2.f282015b, cVar2.f282014a, cVar2.f282016c);
            }
            if (il.g.f291988d == null) {
                synchronized (il.g.class) {
                    if (il.g.f291988d == null) {
                        il.g.f291988d = new il.g();
                    }
                }
            }
            il.g gVar = il.g.f291988d;
            synchronized (gVar) {
                if (cVar2 != null) {
                    if (cVar2.f282016c != null) {
                        cVar2.f282015b = 0;
                        cVar2.f282014a = 0;
                        cVar2.f282017d.clear();
                        byte[] bArr = cVar2.f282016c;
                        java.util.Arrays.fill(bArr, 0, bArr.length, (byte) 0);
                        gVar.f291989a.add(0, cVar2);
                        gVar.f291991c--;
                    }
                }
            }
        }
    }
}
