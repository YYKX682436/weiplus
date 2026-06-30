package l41;

/* loaded from: classes4.dex */
public final class v1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f315947d;

    public v1(yz5.l lVar) {
        this.f315947d = lVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r45.ie ieVar;
        r45.ie baseResponse;
        o01.a aVar = (o01.a) obj;
        if (aVar.f359284a == q01.f.f359276e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setReportLocationAcceptedCgi ");
            sb6.append(aVar.f359287d);
            sb6.append(' ');
            int i17 = aVar.f359286c;
            sb6.append(i17);
            sb6.append(' ');
            r45.k26 k26Var = (r45.k26) aVar.f359289f;
            sb6.append((k26Var == null || (baseResponse = k26Var.getBaseResponse()) == null) ? null : new java.lang.Integer(baseResponse.f376959d));
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuLocationReqHelper", sb6.toString());
            boolean z17 = false;
            if (i17 == 0) {
                if ((k26Var == null || (ieVar = k26Var.BaseResponse) == null || ieVar.f376959d != 0) ? false : true) {
                    z17 = true;
                }
            }
            this.f315947d.invoke(java.lang.Boolean.valueOf(z17));
        }
        return jz5.f0.f302826a;
    }
}
