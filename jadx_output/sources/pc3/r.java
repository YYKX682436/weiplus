package pc3;

/* loaded from: classes7.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pc3.t f353391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353392e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f353393f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353394g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(pc3.t tVar, java.lang.String str, yz5.l lVar, java.lang.String str2) {
        super(1);
        this.f353391d = tVar;
        this.f353392e = str;
        this.f353393f = lVar;
        this.f353394g = str2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.f0 f0Var;
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f353391d.f353402h;
        java.lang.String str = this.f353392e;
        sc3.k1 k1Var = (sc3.k1) concurrentHashMap.get(str);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (k1Var != null) {
            k1Var.g1(new pc3.q(this.f353393f, byteBuffer));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MagicBrushServerMgr", "public service " + str + " read from " + this.f353394g + " but lost");
        }
        return f0Var2;
    }
}
