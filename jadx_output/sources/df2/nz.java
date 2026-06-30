package df2;

/* loaded from: classes3.dex */
public final class nz extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.a00 f230898d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz(df2.a00 a00Var) {
        super(1);
        this.f230898d = a00Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        df2.nm nmVar;
        r45.qa5 data = (r45.qa5) obj;
        kotlin.jvm.internal.o.g(data, "data");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.f4 f4Var = ml2.f4.Y;
        cl0.g gVar = new cl0.g();
        gVar.h("extra_report_json", data.getString(5));
        ml2.r0.Dj(r0Var, f4Var, null, null, null, null, null, 0, 0L, gVar, null, null, null, false, null, 16126, null);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) data.getCustom(2);
        if (finderJumpInfo != null && (nmVar = (df2.nm) this.f230898d.controller(df2.nm.class)) != null) {
            nmVar.Z6(finderJumpInfo);
        }
        return jz5.f0.f302826a;
    }
}
