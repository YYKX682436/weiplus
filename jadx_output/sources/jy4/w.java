package jy4;

/* loaded from: classes11.dex */
public class w implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.p0 f302547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w60.k f302548e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f302549f;

    public w(jy4.x xVar, com.tencent.mm.modelbase.p0 p0Var, w60.k kVar, java.lang.String str) {
        this.f302547d = p0Var;
        this.f302548e = kVar;
        this.f302549f = str;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.modelbase.p0 p0Var = this.f302547d;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SubCoreWebWX.PushLoginMainDeviceMsgListener", "errType:%d errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            p0Var.f70726a.f377567q = null;
            return 0;
        }
        w60.k kVar = this.f302548e;
        int K = ((com.tencent.mm.modelsimple.k0) kVar).K();
        if (com.tencent.mm.sdk.platformtools.t8.K0(((com.tencent.mm.modelsimple.k0) kVar).Q())) {
            p0Var.f70726a.f377567q = null;
            return 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreWebWX.PushLoginMainDeviceMsgListener", "INetSceneGetA8Key ScanQrcodeExtDeviceLoginEvent");
        if (K == 24) {
            com.tencent.mm.autogen.events.ScanQrcodeExtDeviceLoginEvent scanQrcodeExtDeviceLoginEvent = new com.tencent.mm.autogen.events.ScanQrcodeExtDeviceLoginEvent();
            java.lang.String str2 = this.f302549f;
            am.ys ysVar = scanQrcodeExtDeviceLoginEvent.f54735g;
            ysVar.f8475a = str2;
            ysVar.f8476b = 1;
            scanQrcodeExtDeviceLoginEvent.e();
        }
        p0Var.f70726a.f377567q = null;
        return 0;
    }
}
