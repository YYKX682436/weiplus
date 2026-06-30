package df2;

/* loaded from: classes3.dex */
public final class xi extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.yi f231780b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi(df2.yi yiVar, java.lang.Class cls) {
        super(cls);
        this.f231780b = yiVar;
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.uj1 uj1Var;
        kn0.p pVar;
        r45.fc2 result = (r45.fc2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        tn0.w0 w0Var = dk2.ef.f233378d;
        java.lang.Boolean valueOf = (w0Var == null || (pVar = w0Var.D) == null) ? null : java.lang.Boolean.valueOf(pVar.i());
        df2.yi yiVar = this.f231780b;
        com.tencent.mars.xlog.Log.i(yiVar.f231870m, "isNormalMode=" + valueOf + ", recevie msg = " + pm0.b0.g(result));
        yiVar.f231871n = result.getByteString(1);
        dk2.tb tbVar = dk2.ef.f233392k;
        r45.ec2 ec2Var = new r45.ec2();
        ec2Var.set(0, yiVar.f231871n);
        tbVar.h(43, ec2Var);
        if (!kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.TRUE) || (uj1Var = (r45.uj1) result.getCustom(0)) == null) {
            return;
        }
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(1, 20127);
        ch1Var.set(4, new com.tencent.mm.protobuf.g(uj1Var.toByteArray()));
        dk2.x6 x6Var = new dk2.x6(ch1Var);
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = (com.tencent.mm.plugin.finder.live.plugin.mg) yiVar.R6(com.tencent.mm.plugin.finder.live.plugin.mg.class);
        if (mgVar != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(x6Var);
            mgVar.I1(linkedList);
        }
    }
}
