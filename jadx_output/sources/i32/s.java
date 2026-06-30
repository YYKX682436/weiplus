package i32;

/* loaded from: classes13.dex */
public class s implements com.tencent.mm.modelbase.u0 {

    /* renamed from: g, reason: collision with root package name */
    public static i32.s f288139g;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f288141e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f288140d = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f288142f = new java.util.HashMap();

    public s() {
        this.f288141e = null;
        this.f288141e = new i32.m(this, gm0.j1.e().a());
    }

    public static i32.s a() {
        i32.s sVar = f288139g;
        if (sVar != null) {
            return sVar;
        }
        i32.s sVar2 = new i32.s();
        f288139g = sVar2;
        return sVar2;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "******onSceneEnd******\r\n errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        i32.n nVar = new i32.n(null);
        nVar.f288127a = i18;
        nVar.f288128b = i17;
        nVar.f288129c = str;
        nVar.f288130d = m1Var;
        this.f288141e.obtainMessage(2, nVar).sendToTarget();
    }
}
