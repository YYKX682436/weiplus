package w11;

/* loaded from: classes12.dex */
public class m0 implements com.tencent.mm.network.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final o45.zh f442085a = new o45.zh();

    /* renamed from: b, reason: collision with root package name */
    public final o45.ai f442086b = new o45.ai();

    /* renamed from: c, reason: collision with root package name */
    public int f442087c;

    @Override // com.tencent.mm.network.v0
    public com.tencent.mars.stn.StnManager.Task.EBindCellularStrategy bindCellularStrategy() {
        return com.tencent.mars.stn.StnManager.Task.EBindCellularStrategy.kDefault;
    }

    @Override // com.tencent.mm.network.v0
    public int getEncryptAlgo() {
        return 0;
    }

    @Override // com.tencent.mm.network.v0
    public boolean getIsLongPolling() {
        return false;
    }

    @Override // com.tencent.mm.network.v0
    public boolean getIsUserCmd() {
        return false;
    }

    @Override // com.tencent.mm.network.v0
    public int getLongPollingTimeout() {
        return 0;
    }

    @Override // com.tencent.mm.network.v0
    public int getNewDNSBusinessType() {
        return 0;
    }

    @Override // com.tencent.mm.network.v0
    public int getNewExtFlags() {
        return 0;
    }

    @Override // com.tencent.mm.network.v0
    public int getOptions() {
        return 0;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getReqHost() {
        return "";
    }

    @Override // com.tencent.mm.network.v0
    public o45.zg getReqObj() {
        java.lang.String k17 = wo.w0.k();
        o45.zh zhVar = this.f442085a;
        zhVar.setDeviceID(k17);
        int i17 = o45.wf.f343023a;
        zhVar.setDeviceType(wo.q.f447780a);
        zhVar.setClientVersion(o45.wf.f343029g);
        zhVar.setUin(this.f442087c);
        return zhVar;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f442086b;
    }

    @Override // com.tencent.mm.network.v0
    public int getTimeOut() {
        return 0;
    }

    @Override // com.tencent.mm.network.v0
    public byte[] getTransHeader() {
        return null;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return 268369922;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return null;
    }

    @Override // com.tencent.mm.network.v0
    public boolean isSingleSession() {
        return true;
    }

    @Override // com.tencent.mm.network.v0
    public boolean keepAlive() {
        return false;
    }

    @Override // com.tencent.mm.network.v0
    public void setBindCellularStrategy(com.tencent.mars.stn.StnManager.Task.EBindCellularStrategy eBindCellularStrategy) {
    }

    @Override // com.tencent.mm.network.v0
    public void setConnectionInfo(java.lang.String str) {
    }

    @Override // com.tencent.mm.network.v0
    public void setEncryptAlgo(int i17) {
    }

    @Override // com.tencent.mm.network.v0
    public void setNewDNSBusinessType(int i17) {
    }

    @Override // com.tencent.mm.network.v0
    public void setReqHost(java.lang.String str) {
    }

    @Override // com.tencent.mm.network.v0
    public void setSingleSession(boolean z17) {
    }
}
