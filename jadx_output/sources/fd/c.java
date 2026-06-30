package fd;

/* loaded from: classes12.dex */
public class c extends com.tencent.kinda.gen.KCgi {

    /* renamed from: a, reason: collision with root package name */
    public final int f261239a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f261240b;

    public c(int i17, java.lang.String str) {
        this.f261239a = i17;
        this.f261240b = str;
    }

    @Override // com.tencent.kinda.gen.KCgi
    public int getCgiId() {
        return this.f261239a;
    }

    @Override // com.tencent.kinda.gen.KCgi
    public java.lang.String getCgiUrl() {
        return this.f261240b;
    }

    @Override // com.tencent.kinda.gen.KCgi
    public int getChannelType() {
        return 0;
    }

    @Override // com.tencent.kinda.gen.KCgi
    public boolean getNeedNotify() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KCgi
    public com.tencent.kinda.gen.KindaNewDNSBusinessType getNewDNSBusinessType() {
        return com.tencent.kinda.gen.KindaNewDNSBusinessType.PAY;
    }

    @Override // com.tencent.kinda.gen.KCgi
    public byte[] getRequestData() {
        return null;
    }

    @Override // com.tencent.kinda.gen.KCgi
    public int getRetryCount() {
        return 1;
    }

    @Override // com.tencent.kinda.gen.KCgi
    public java.lang.String getRouteInfo() {
        return "";
    }

    @Override // com.tencent.kinda.gen.KCgi
    public int getTimeout() {
        return 0;
    }

    @Override // com.tencent.kinda.gen.KCgi
    public void onResp(int i17, byte[] bArr, java.util.HashMap hashMap) {
    }
}
