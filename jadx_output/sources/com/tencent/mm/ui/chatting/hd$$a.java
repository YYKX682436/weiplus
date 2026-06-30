package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public final /* synthetic */ class hd$$a implements com.tencent.mm.ui.chatting.od {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wework.api.model.WWMediaMiniProgram f201682a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201683b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201684c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f201685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f201686e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wework.api.IWWAPI.WWAppType f201687f;

    public /* synthetic */ hd$$a(com.tencent.wework.api.model.WWMediaMiniProgram wWMediaMiniProgram, java.lang.String str, java.lang.String str2, int i17, android.content.Context context, com.tencent.wework.api.IWWAPI.WWAppType wWAppType) {
        this.f201682a = wWMediaMiniProgram;
        this.f201683b = str;
        this.f201684c = str2;
        this.f201685d = i17;
        this.f201686e = context;
        this.f201687f = wWAppType;
    }

    public final void a(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[1];
        }
        com.tencent.wework.api.model.WWMediaMiniProgram wWMediaMiniProgram = this.f201682a;
        wWMediaMiniProgram.f220170h = bArr;
        if (bArr.length > 1048576) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SendToWeWorkHelper", "miniProgram.hdImageData.length > 1M");
            wWMediaMiniProgram.f220170h = new byte[1];
        }
        wWMediaMiniProgram.f220172j = this.f201683b;
        wWMediaMiniProgram.f220165c = this.f201684c;
        wWMediaMiniProgram.f220173k = this.f201685d;
        int length = wWMediaMiniProgram.f220170h.length;
        com.tencent.wework.api.WWAPIFactory.a(this.f201686e).a(wWMediaMiniProgram, this.f201687f);
    }
}
