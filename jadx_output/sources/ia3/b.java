package ia3;

/* loaded from: classes15.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ia3.c f289993d;

    public b(ia3.c cVar) {
        this.f289993d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ia3.c cVar = this.f289993d;
        int i17 = cVar.f289994a;
        ia3.e eVar = cVar.f289997d;
        if (i17 == eVar.f290018e && eVar.f290015b == cVar.f289995b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVoiceHelper", "continuous mode: restart recognition");
            ia3.e eVar2 = cVar.f289997d;
            ia3.d dVar = cVar.f289995b;
            eVar2.d(dVar, dVar.f290002e, true);
        }
    }
}
