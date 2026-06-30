package vr;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439430d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f439431e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439432f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vr.u f439433g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ byte[] f439434h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.lang.String str, boolean z17, java.lang.String str2, vr.u uVar, byte[] bArr) {
        super(1);
        this.f439430d = str;
        this.f439431e = z17;
        this.f439432f = str2;
        this.f439433g = uVar;
        this.f439434h = bArr;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String originPath = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(originPath, "originPath");
        boolean z17 = originPath.length() == 0;
        java.lang.String str = this.f439430d;
        if (z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EmoticonBoardNativeViewCallbackHandler", "resolveOriginEmoticonPath failed, skip callback. md5=" + str);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmoticonBoardNativeViewCallbackHandler", "onEmoticonSelected md5=" + str + " fromSearch=" + this.f439431e + " thumb=" + this.f439432f + " cover=" + originPath);
            ym5.a1.f(new vr.r(this.f439433g, this.f439431e, this.f439434h, this.f439432f, originPath));
        }
        return jz5.f0.f302826a;
    }
}
