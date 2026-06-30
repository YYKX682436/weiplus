package eq0;

/* loaded from: classes7.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eq0.b f255781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f255782e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(eq0.b bVar, long j17) {
        super(1);
        this.f255781d = bVar;
        this.f255782e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object value = ((kotlin.Result) obj).getValue();
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(value);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MagicSclRequestImpl", m524exceptionOrNullimpl, "preInit fail", new java.lang.Object[0]);
        } else {
            if (kotlin.Result.m527isFailureimpl(value)) {
                value = null;
            }
            java.lang.Double d17 = (java.lang.Double) value;
            com.tencent.wechat.zidl.MagicSclRequest.Callback callback = this.f255781d.f255784b;
            if (callback != null) {
                callback.onPreInitFrameSetComplete(this.f255782e, d17 != null ? d17.doubleValue() : 0.0d);
            }
        }
        return jz5.f0.f302826a;
    }
}
