package l83;

/* loaded from: classes12.dex */
public class j implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f317111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l83.l f317112e;

    public j(l83.l lVar, boolean z17) {
        this.f317112e = lVar;
        this.f317111d = z17;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        boolean z17 = this.f317111d;
        l83.l lVar = this.f317112e;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSensorManager", "light screen");
            l83.k kVar = lVar.f317117h;
            if (kVar != null) {
                ((l83.d) kVar).a(false);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallSensorManager", "off screen");
            l83.k kVar2 = lVar.f317117h;
            if (kVar2 != null) {
                ((l83.d) kVar2).a(true);
            }
        }
        return false;
    }
}
