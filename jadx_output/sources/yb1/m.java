package yb1;

/* loaded from: classes7.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb1.o f460666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f460667e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(yb1.o oVar, int i17) {
        super(1);
        this.f460666d = oVar;
        this.f460667e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.concurrent.ConcurrentHashMap b17 = this.f460666d.b();
        int i17 = this.f460667e;
        b17.remove(java.lang.Integer.valueOf(i17));
        com.tencent.mars.xlog.Log.i("MicroMsg.GetPageContentService", "getOuterHTML callbackId:" + i17 + " was cancelled due to timeout.");
        return jz5.f0.f302826a;
    }
}
