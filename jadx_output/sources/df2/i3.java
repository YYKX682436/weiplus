package df2;

/* loaded from: classes3.dex */
public final class i3 extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.j3 f230379b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(df2.j3 j3Var, java.lang.Class cls) {
        super(cls);
        this.f230379b = j3Var;
    }

    @Override // dk2.cb
    public void a(int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.i(this.f230379b.f230448m, "[polling] failed. retCode = " + i17 + ", errMsg = " + errMsg);
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.tc2 result = (r45.tc2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        df2.j3 j3Var = this.f230379b;
        com.tencent.mars.xlog.Log.i(j3Var.f230448m, "onPollingSuccess info: " + pm0.b0.g(result));
        dk2.tb tbVar = dk2.ef.f233392k;
        r45.sc2 sc2Var = new r45.sc2();
        sc2Var.set(0, result.getByteString(1));
        tbVar.h(41, sc2Var);
        r45.pj1 pj1Var = (r45.pj1) result.getCustom(0);
        if (pj1Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i(j3Var.f230448m, "insert notification");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(1, 20111);
        ch1Var.set(4, hc2.b.a(pj1Var));
        dk2.y7 y7Var = new dk2.y7(ch1Var);
        y7Var.f234375b = result.getInteger(2);
        linkedList.add(y7Var);
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = (com.tencent.mm.plugin.finder.live.plugin.mg) j3Var.R6(com.tencent.mm.plugin.finder.live.plugin.mg.class);
        if (mgVar != null) {
            mgVar.I1(linkedList);
        }
    }
}
