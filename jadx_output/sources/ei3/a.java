package ei3;

/* loaded from: classes10.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ei3.g f252989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ei3.b f252990e;

    public a(ei3.b bVar, ei3.g gVar) {
        this.f252990e = bVar;
        this.f252989d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ei3.d dVar = this.f252990e.f252994a;
        dVar.getClass();
        ei3.g gVar = this.f252989d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardMgr", "receive buf bufIndex: %d receiveIndex: %d", java.lang.Integer.valueOf(gVar.f253046c), java.lang.Integer.valueOf(dVar.f253028c));
        int i17 = dVar.f253028c;
        if (i17 != gVar.f253046c) {
            dVar.f253029d.add(gVar);
            dVar.a();
        } else {
            dVar.f253028c = i17 + 1;
            ((ei3.a1) dVar.f253031f).a(gVar.f253045b);
            dVar.a();
        }
    }
}
