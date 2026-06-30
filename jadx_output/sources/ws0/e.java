package ws0;

/* loaded from: classes10.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws0.g f448961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f448962e;

    public e(ws0.g gVar, yz5.a aVar) {
        this.f448961d = gVar;
        this.f448962e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.hardcoder.HardCoderJNI.stopPerformance(0);
        java.lang.String readServerAddr = com.tencent.mm.hardcoder.HardCoderJNI.readServerAddr();
        com.tencent.mm.hardcoder.HardCoderJNI.setCheckEnv((readServerAddr == null || kotlin.jvm.internal.o.b(readServerAddr, "")) ? false : true);
        int initHardCoder = com.tencent.mm.hardcoder.HardCoderJNI.initHardCoder(readServerAddr, 0, com.tencent.mm.hardcoder.HardCoderJNI.CLIENT_SOCK, ws0.d.f448960a, null);
        com.tencent.mars.xlog.Log.i(this.f448961d.f448965a, "Read remote persist.sys.hardcoder.name:" + readServerAddr + " initHardCoder:" + initHardCoder);
        this.f448961d.f448966b = initHardCoder == 0;
        if (this.f448961d.f448966b) {
            com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getParameters(2, new ws0.c(this.f448961d, this.f448962e), new java.lang.String[0]);
        }
    }
}
