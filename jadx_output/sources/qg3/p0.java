package qg3;

/* loaded from: classes2.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f362842e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(yz5.l lVar, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        super(1);
        this.f362841d = lVar;
        this.f362842e = finderObject;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.aa1 aa1Var = (r45.aa1) obj;
        yz5.l lVar = this.f362841d;
        if (aa1Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NativeCgiJavaStatic", "result is null");
            byte[] byteArray = new bw5.kd0().toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            lVar.invoke(byteArray);
        } else {
            jz5.g gVar = com.tencent.mm.plugin.finder.feed.model.ea.f107833d;
            com.tencent.mm.protocal.protobuf.FinderObject c17 = ((com.tencent.mm.plugin.finder.feed.model.ea) ((jz5.n) com.tencent.mm.plugin.finder.feed.model.ea.f107835f).getValue()).c(this.f362842e.getId());
            if (c17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NativeCgiJavaStatic", "nextObject is null");
                byte[] byteArray2 = new bw5.kd0().toByteArray();
                kotlin.jvm.internal.o.f(byteArray2, "toByteArray(...)");
                lVar.invoke(byteArray2);
            } else {
                try {
                    bw5.zc0 zc0Var = new bw5.zc0();
                    zc0Var.d(new bw5.yr().parseFrom(c17.toByteArray()));
                    bw5.qg parseFrom = new bw5.qg().parseFrom(aa1Var.toByteArray());
                    bw5.kd0 kd0Var = new bw5.kd0();
                    kd0Var.f29355g = zc0Var;
                    boolean[] zArr = kd0Var.f29356h;
                    zArr[4] = true;
                    kd0Var.f29354f = parseFrom;
                    zArr[3] = true;
                    byte[] byteArray3 = kd0Var.toByteArray();
                    kotlin.jvm.internal.o.f(byteArray3, "toByteArray(...)");
                    lVar.invoke(byteArray3);
                } catch (java.lang.Exception e17) {
                    byte[] byteArray4 = new bw5.kd0().toByteArray();
                    kotlin.jvm.internal.o.f(byteArray4, "toByteArray(...)");
                    lVar.invoke(byteArray4);
                    com.tencent.mars.xlog.Log.e("MicroMsg.NativeCgiJavaStatic", "fetchContinuePlayNextFeed ex " + e17.getMessage());
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
