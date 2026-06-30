package lo1;

/* loaded from: classes5.dex */
public final class c implements com.tencent.wechat.aff.affroam.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f320095a;

    public c(java.lang.String str) {
        this.f320095a = str;
    }

    @Override // com.tencent.wechat.aff.affroam.j1
    public final void complete(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on connectInfo gotten, deviceId=");
        java.lang.String deviceId = this.f320095a;
        sb6.append(deviceId);
        sb6.append(", ret=");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.AppBrandJsApiRoamApiHandler", sb6.toString());
        lo1.i iVar = lo1.i.f320102a;
        kotlin.jvm.internal.o.f(deviceId, "$deviceId");
        iVar.b(deviceId, i17 == 0);
    }
}
