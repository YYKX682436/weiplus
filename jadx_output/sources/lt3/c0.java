package lt3;

/* loaded from: classes10.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.r f321204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lt3.f0 f321205e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(yz5.r rVar, lt3.f0 f0Var) {
        super(4);
        this.f321204d = rVar;
        this.f321205e = f0Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String mixVideo = (java.lang.String) obj;
        java.lang.String mixThumb = (java.lang.String) obj2;
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        int intValue = ((java.lang.Number) obj4).intValue();
        kotlin.jvm.internal.o.g(mixVideo, "mixVideo");
        kotlin.jvm.internal.o.g(mixThumb, "mixThumb");
        yz5.r rVar = this.f321204d;
        if (rVar != null) {
            rVar.C(mixVideo, mixThumb, java.lang.Boolean.valueOf(booleanValue), java.lang.Integer.valueOf(intValue));
        }
        lt3.f0 f0Var = this.f321205e;
        android.os.HandlerThread handlerThread = f0Var.f321237z;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Media.VideoMixer", "[onFinish] quit mixThread=" + f0Var.f321237z);
        f0Var.f321213b = null;
        return jz5.f0.f302826a;
    }
}
