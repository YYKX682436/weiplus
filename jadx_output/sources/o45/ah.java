package o45;

/* loaded from: classes12.dex */
public abstract class ah {
    private java.util.Map<java.lang.String, java.lang.String> MMNativeNetTaskAdapterProfile;
    private r45.xw profile;
    private long profileClock;
    private int serverSequenceId;
    private long bufferSize = 0;
    private int iRetCode = -99;
    private int iHeadExtFlags = 255;
    private java.lang.String sErrMsg = "";

    public byte[] getAuthResponse() {
        return null;
    }

    public long getBufferSize() {
        return this.bufferSize;
    }

    public int getCmdId() {
        return 0;
    }

    public java.lang.String getErrMsg() {
        return this.sErrMsg;
    }

    public int getHeadExtFlags() {
        return this.iHeadExtFlags;
    }

    public java.util.Map<java.lang.String, java.lang.String> getMMNativeNetTaskAdapterProfile() {
        return this.MMNativeNetTaskAdapterProfile;
    }

    public byte[] getNewRegResponse() {
        return null;
    }

    public r45.xw getProfile() {
        return this.profile;
    }

    public long getProfileClock() {
        return this.profileClock;
    }

    public int getRetCode() {
        return this.iRetCode;
    }

    public byte[] getServerIndexBuffer() {
        return null;
    }

    public int getServerSequenceId() {
        return this.serverSequenceId;
    }

    public boolean isRawData() {
        return false;
    }

    public void setBufferSize(long j17) {
        this.bufferSize = j17;
    }

    public void setErrMsg(java.lang.String str) {
        this.sErrMsg = str;
    }

    public void setHeadExtFlags(int i17) {
        this.iHeadExtFlags = i17;
    }

    public void setMMNativeNetTaskAdapterProfile(java.util.Map<java.lang.String, java.lang.String> map) {
        this.MMNativeNetTaskAdapterProfile = map;
    }

    public void setProfile(byte[] bArr) {
        this.profileClock = android.os.SystemClock.elapsedRealtime();
        r45.xw xwVar = new r45.xw();
        this.profile = xwVar;
        try {
            xwVar.parseFrom(bArr);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("setProfile", e17.getLocalizedMessage());
        }
    }

    public void setRetCode(int i17) {
        this.iRetCode = i17;
    }

    public void setServerSequenceId(int i17) {
        this.serverSequenceId = i17;
    }
}
