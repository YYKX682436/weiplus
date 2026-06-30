package ok4;

/* loaded from: classes4.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f345998f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f345999g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f346000h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f346001i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346002m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f346003n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f346004o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f346005p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f346006q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f346007r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f346008s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str, java.lang.String str2, int i17, boolean z17, boolean z18, int i18, java.lang.String str3, long j17, int i19, int i27, boolean z19, int i28, boolean z27) {
        super(0);
        this.f345996d = str;
        this.f345997e = str2;
        this.f345998f = i17;
        this.f345999g = z17;
        this.f346000h = z18;
        this.f346001i = i18;
        this.f346002m = str3;
        this.f346003n = j17;
        this.f346004o = i19;
        this.f346005p = i27;
        this.f346006q = z19;
        this.f346007r = i28;
        this.f346008s = z27;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initStruct >> mediaId: ");
        java.lang.String str = this.f345996d;
        sb6.append(str);
        sb6.append("， feedId: ");
        java.lang.String str2 = this.f345997e;
        sb6.append(str2);
        sb6.append(", wsType: ");
        int i17 = this.f345998f;
        sb6.append(i17);
        sb6.append(", isMine: ");
        boolean z17 = this.f345999g;
        sb6.append(z17);
        sb6.append(", canSwitchSource: ");
        boolean z18 = this.f346000h;
        sb6.append(z18);
        sb6.append(", previewSourceModeResult: ");
        int i18 = this.f346001i;
        sb6.append(i18);
        sb6.append(", previewReqFlag: ");
        sb6.append(this.f346002m);
        sb6.append(", predictStartTimeMS: ");
        long j17 = this.f346003n;
        sb6.append(j17);
        sb6.append(", predictCost: ");
        int i19 = this.f346004o;
        sb6.append(i19);
        sb6.append(", reqFlagReason: ");
        int i27 = this.f346005p;
        sb6.append(i27);
        sb6.append(", ");
        sb6.append(java.lang.Thread.currentThread().getName());
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", sb6.toString());
        java.util.HashMap hashMap = ok4.u.f346042b;
        if (hashMap.containsKey(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsVideoDownloadReporter", "mediaId is no report " + str);
        } else {
            com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct momentsVideoDownloadSourceStruct = new com.tencent.mm.autogen.mmdata.rpt.MomentsVideoDownloadSourceStruct();
            momentsVideoDownloadSourceStruct.f59247h = 1;
            momentsVideoDownloadSourceStruct.f59246g = z17 ? 1 : 0;
            momentsVideoDownloadSourceStruct.f59243d = momentsVideoDownloadSourceStruct.b("Feed_ItemID", str2, true);
            momentsVideoDownloadSourceStruct.f59244e = momentsVideoDownloadSourceStruct.b("Feed_MediaID", str, true);
            momentsVideoDownloadSourceStruct.f59245f = i17;
            momentsVideoDownloadSourceStruct.f59248i = this.f346006q ? 1 : 0;
            momentsVideoDownloadSourceStruct.f59249j = this.f346007r;
            momentsVideoDownloadSourceStruct.f59250k = this.f346008s ? 1 : 0;
            momentsVideoDownloadSourceStruct.f59251l = z18 ? 1 : 0;
            momentsVideoDownloadSourceStruct.f59252m = i18;
            momentsVideoDownloadSourceStruct.L = j17;
            momentsVideoDownloadSourceStruct.M = i19;
            momentsVideoDownloadSourceStruct.f59262w = i27;
            hashMap.put(str, momentsVideoDownloadSourceStruct);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoDownloadReporter", "initStruct >> add finish " + str);
        }
        return jz5.f0.f302826a;
    }
}
