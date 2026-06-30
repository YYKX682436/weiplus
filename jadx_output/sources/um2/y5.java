package um2;

/* loaded from: classes3.dex */
public final class y5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.b6 f429101d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(um2.b6 b6Var) {
        super(1);
        this.f429101d = b6Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
        um2.b6 b6Var = this.f429101d;
        com.tencent.mars.xlog.Log.i(b6Var.f428731f, "checkEnterTargetLiveRoom result:" + finderObject);
        if (finderObject == null) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).oj(5, java.lang.String.valueOf(((mm2.e1) b6Var.c(mm2.e1.class)).f328983m), java.lang.String.valueOf(((mm2.e1) b6Var.c(mm2.e1.class)).f328988r.getLong(0)));
        } else {
            pm0.v.X(new um2.z5(b6Var, finderObject));
        }
        return jz5.f0.f302826a;
    }
}
