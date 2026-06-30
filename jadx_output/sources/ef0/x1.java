package ef0;

/* loaded from: classes11.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.ar0 f252355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252356e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(bw5.ar0 ar0Var, java.lang.String str) {
        super(1);
        this.f252355d = ar0Var;
        this.f252356e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bw5.zq0 it = (bw5.zq0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        bw5.zq0 zq0Var = new bw5.zq0();
        zq0Var.parseFrom(it.getData());
        zq0Var.f36134d = this.f252355d.f25422d;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        android.util.ArrayMap arrayMap = zq0Var.f36141g2;
        arrayMap.put(1, bool);
        zq0Var.N1 = 1;
        arrayMap.put(808, bool);
        zq0Var.G1 = this.f252356e;
        arrayMap.put(java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.share.r0.CTRL_INDEX), bool);
        return zq0Var;
    }
}
