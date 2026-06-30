package l83;

/* loaded from: classes14.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public tl.w f317104a = null;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f317105b = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public boolean f317107d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317108e = true;

    /* renamed from: f, reason: collision with root package name */
    public final tl.v f317109f = new l83.e(this);

    /* renamed from: c, reason: collision with root package name */
    public boolean f317106c = false;

    public static void a(l83.h hVar) {
        hVar.getClass();
        tl.w wVar = new tl.w(com.tencent.mm.plugin.voip.model.v2protocal.Y1, 1, 6);
        hVar.f317104a = wVar;
        wVar.g(20);
        hVar.f317104a.j(true);
        hVar.f317104a.f(true);
        tl.w wVar2 = hVar.f317104a;
        wVar2.f420160m = -19;
        wVar2.h(1, false);
        hVar.f317104a.i(true);
        tl.w wVar3 = hVar.f317104a;
        wVar3.f420172y = hVar.f317109f;
        if (wVar3.k()) {
            hVar.f317104a.n(hVar.f317107d);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.IPCallRecorder", "start record failed");
        if (hVar.f317104a.f420148a != 13) {
            m83.d Zi = com.tencent.mm.plugin.ipcall.model.r.Zi();
            if (Zi.F == 0) {
                Zi.F = 1;
            }
        }
    }

    public void b(boolean z17) {
        tl.w wVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallRecorder", "setMute: %b", java.lang.Boolean.valueOf(z17));
        if (this.f317106c && (wVar = this.f317104a) != null) {
            wVar.n(z17);
        }
        this.f317107d = z17;
    }
}
