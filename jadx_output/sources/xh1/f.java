package xh1;

/* loaded from: classes7.dex */
public final class f extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f454504a;

    /* renamed from: b, reason: collision with root package name */
    public final int f454505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xh1.g f454506c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(xh1.g gVar, android.os.Looper looper) {
        super(looper);
        this.f454506c = gVar;
        this.f454504a = 5000L;
        this.f454505b = 1;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if ((message != null ? message.what : 0) == this.f454505b) {
            kotlin.jvm.internal.o.d(message);
            java.lang.Object obj = message.obj;
            java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            if (num != null) {
                int intValue = num.intValue();
                xh1.g gVar = this.f454506c;
                com.tencent.mars.xlog.Log.i(gVar.f454510e, "timeout for requestId:" + intValue);
                gVar.b(intValue);
            }
        }
    }
}
