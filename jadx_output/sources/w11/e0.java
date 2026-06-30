package w11;

/* loaded from: classes12.dex */
public class e0 implements com.tencent.mm.network.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final o45.xh f442011a;

    /* renamed from: b, reason: collision with root package name */
    public final o45.yh f442012b;

    /* renamed from: c, reason: collision with root package name */
    public int f442013c;

    public e0(boolean z17) {
        this.f442011a = new o45.xh();
        this.f442012b = new o45.yh();
    }

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
        o45.xh xhVar = this.f442011a;
        xhVar.setDeviceID(k17);
        int i17 = o45.wf.f343023a;
        xhVar.setDeviceType(wo.q.f447780a);
        xhVar.setClientVersion(o45.wf.f343029g);
        xhVar.setUin(this.f442013c);
        return xhVar;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f442012b;
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
        return 138;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return "/cgi-bin/micromsg-bin/newsync";
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

    public e0(o45.yh yhVar) {
        this.f442011a = new o45.xh();
        this.f442012b = yhVar;
    }
}
