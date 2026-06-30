package l41;

/* loaded from: classes4.dex */
public final class s1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f315920d;

    public s1(yz5.l lVar) {
        this.f315920d = lVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.ie ieVar;
        o01.a aVar = (o01.a) obj;
        if (aVar.f359284a == q01.f.f359276e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportLocationCgi ");
            sb6.append(aVar.f359287d);
            sb6.append(' ');
            int i17 = aVar.f359286c;
            sb6.append(i17);
            sb6.append(' ');
            r45.j05 j05Var = (r45.j05) aVar.f359289f;
            sb6.append(j05Var != null ? j05Var.getBaseResponse() : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuLocationReqHelper", sb6.toString());
            boolean z17 = false;
            if (i17 == 0) {
                if ((j05Var == null || (ieVar = j05Var.BaseResponse) == null || ieVar.f376959d != 0) ? false : true) {
                    z17 = true;
                }
            }
            this.f315920d.invoke(java.lang.Boolean.valueOf(z17));
        }
        return jz5.f0.f302826a;
    }
}
