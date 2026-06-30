package si4;

/* loaded from: classes8.dex */
public final class b implements com.tencent.wechat.aff.status.StatusModuleReadManager.markStatusReadCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f408313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f408314b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f408315c;

    public b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f408313a = str;
        this.f408314b = str2;
        this.f408315c = str3;
    }

    @Override // com.tencent.wechat.aff.status.StatusModuleReadManager.markStatusReadCallback
    public final void complete(com.tencent.wechat.aff.status.MarkStatusReadResponse markStatusReadResponse) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportStatusReadToBackend resp: result=");
        sb6.append(markStatusReadResponse != null ? java.lang.Boolean.valueOf(markStatusReadResponse.getResult()) : null);
        sb6.append(", errCode=");
        sb6.append(markStatusReadResponse != null ? java.lang.Integer.valueOf(markStatusReadResponse.getErrorCode()) : null);
        sb6.append(", errMsg=");
        sb6.append(markStatusReadResponse != null ? markStatusReadResponse.getErrorMsg() : null);
        sb6.append(", ");
        sb6.append(this.f408313a);
        sb6.append(", ");
        sb6.append(this.f408314b);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusInfoAffStorage", sb6.toString());
        boolean z17 = false;
        if (markStatusReadResponse != null && markStatusReadResponse.getResult()) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap.KeySetView) si4.c.f408316c).remove(this.f408315c);
    }
}
