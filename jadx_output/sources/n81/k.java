package n81;

/* loaded from: classes7.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f335623d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.util.List list) {
        super(0);
        this.f335623d = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long b17 = n81.p.b(n81.p.f335628a, this.f335623d);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandSweeperLogic", "publicCleanBlock, cleaned " + b17 + " bytes");
        return java.lang.Long.valueOf(b17);
    }
}
