package o45;

/* loaded from: classes12.dex */
public abstract class zg {
    private static final java.lang.String TAG = "MicroMsg.MMBase.Req";
    private com.tencent.mm.network.i cgiVerifyKeys;
    private o45.wg mReqPackControl;
    private byte[] passKey;
    private boolean bShortSupport = true;
    private boolean useECDH = false;
    private boolean useAxSession = false;
    private byte[] axRandomKey = null;
    private long bufferSize = 0;
    private int iUin = 0;
    private int iClientVersion = 0;
    private byte[] sessionKey = new byte[0];
    private java.lang.String sDeviceType = "";
    private java.lang.String sDeviceID = "";
    private int iSceneStatus = 0;
    private o45.pi rsaInfo = new o45.pi("", "", 0);
    private int routeInfo = 0;
    private long ecdhEngine = 0;

    public byte[] getAxRandomKey() {
        return this.axRandomKey;
    }

    public long getBufferSize() {
        return this.bufferSize;
    }

    public java.lang.String getCgiVerifyPrivateKey() {
        com.tencent.mm.network.i iVar = this.cgiVerifyKeys;
        return iVar != null ? iVar.f72022a : "";
    }

    public java.lang.String getCgiVerifyPublicKey() {
        com.tencent.mm.network.i iVar = this.cgiVerifyKeys;
        return iVar != null ? iVar.f72023b : "";
    }

    public int getClientVersion() {
        return this.iClientVersion;
    }

    public int getCmdId() {
        return 0;
    }

    public java.lang.String getDeviceID() {
        return this.sDeviceID;
    }

    public java.lang.String getDeviceType() {
        return this.sDeviceType;
    }

    public long getECDHEngine() {
        return this.ecdhEngine;
    }

    public byte[] getPassKey() {
        return this.passKey;
    }

    public o45.wg getReqPackControl() {
        return this.mReqPackControl;
    }

    public int getRouteInfo() {
        return this.routeInfo;
    }

    public o45.pi getRsaInfo() {
        return this.rsaInfo;
    }

    public int getSceneStatus() {
        return this.iSceneStatus;
    }

    public byte[] getSessionKey() {
        return this.sessionKey;
    }

    public boolean getShortSupport() {
        return this.bShortSupport;
    }

    public int getUin() {
        return this.iUin;
    }

    public boolean isAxAuth() {
        return false;
    }

    public boolean isRawData() {
        return false;
    }

    public boolean packToNetMsg(com.tencent.mm.pointers.PByteArray pByteArray) {
        return false;
    }

    public void setAxRandomKey(byte[] bArr) {
        this.axRandomKey = bArr;
    }

    public void setBufferSize(long j17) {
        this.bufferSize = j17;
    }

    public void setCGiVerifyKey(com.tencent.mm.network.i iVar) {
        this.cgiVerifyKeys = iVar;
    }

    public void setClientVersion(int i17) {
        this.iClientVersion = i17;
    }

    public void setDeviceID(java.lang.String str) {
        this.sDeviceID = str;
    }

    public void setDeviceType(java.lang.String str) {
        this.sDeviceType = str;
    }

    public void setEcdhEngine(long j17) {
        this.ecdhEngine = j17;
    }

    public void setPassKey(byte[] bArr) {
        this.passKey = bArr;
    }

    public void setReqPackControl(o45.wg wgVar) {
        this.mReqPackControl = wgVar;
    }

    public void setRouteInfo(int i17) {
        this.routeInfo = i17;
    }

    public void setRsaInfo(o45.pi piVar) {
        this.rsaInfo = piVar;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(getCmdId());
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(o45.ag.f342892a);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(TAG, "summerauths setRsaInfo cgi[%s], USE_ECDH[%b], stack[%s]", valueOf, valueOf2, new com.tencent.mm.sdk.platformtools.z3());
        if (o45.ag.f342892a) {
            setUseECDH(true);
        }
    }

    public void setSceneStatus(int i17) {
        this.iSceneStatus = i17;
    }

    public void setSessionKey(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        this.sessionKey = bArr;
    }

    public void setShortSupport(boolean z17) {
        this.bShortSupport = z17;
    }

    public void setUin(int i17) {
        this.iUin = i17;
    }

    public void setUseAxsession(boolean z17) {
        this.useAxSession = z17;
    }

    public void setUseECDH(boolean z17) {
        this.useECDH = z17;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(getCmdId());
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i(TAG, "summerauths setUseECDH[%s]  cgi[%s], stack[%s]", valueOf, valueOf2, new com.tencent.mm.sdk.platformtools.z3());
    }

    public boolean useAxSession() {
        return this.useAxSession;
    }

    public boolean useECDH() {
        return this.useECDH;
    }
}
