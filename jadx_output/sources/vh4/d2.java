package vh4;

/* loaded from: classes.dex */
public class d2 implements com.tencent.kinda.gen.UseCaseCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uh4.e f437067a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vh4.t1 f437068b;

    public d2(vh4.t1 t1Var, uh4.e eVar) {
        this.f437068b = t1Var;
        this.f437067a = eVar;
    }

    @Override // com.tencent.kinda.gen.UseCaseCallback
    public void call(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData) {
        int i17 = iTransmitKvData.getInt("operationType");
        boolean bool = iTransmitKvData.getBool("operationSuccess");
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = bool ? ya.b.SUCCESS : "fail";
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeService", "callback from TeenagerModeOperationUseCase, operationType: %s, operationSuccess: %s", objArr);
        if (i17 != uh4.b0.TeenagerModeOperationType_OPEN.f427978d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeService", "callback from TeenagerModeOperationUseCase, close or unknown, do nothing");
            return;
        }
        uh4.e eVar = this.f437067a;
        if (!bool) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TeenModeService", "callback from TeenagerModeOperationUseCase, open fail, callback onChangeLimitedModeFail");
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f493845pb5, 0).show();
            if (eVar != null) {
                ((com.tencent.mm.plugin.teenmode.ui.v4) eVar).a(false);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeService", "callback from TeenagerModeOperationUseCase, open success, continue oplog");
        vh4.t1 t1Var = this.f437068b;
        t1Var.getClass();
        r45.p53 p53Var = new r45.p53();
        p53Var.f382761d = 59;
        p53Var.f382762e = 1;
        if (((vh4.t1) i95.n0.c(vh4.t1.class)).f437138h != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeService", "enableTeenMode: set ticket");
            r45.cu5 cu5Var = new r45.cu5();
            p53Var.f382763f = cu5Var;
            cu5Var.d(((vh4.t1) i95.n0.c(vh4.t1.class)).f437138h.getBytes());
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.TeenModeService", "enableTeenMode: ticket null");
        }
        p53Var.f382764g = ((vh4.t1) i95.n0.c(vh4.t1.class)).f437139i;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(new xg3.p0(23, p53Var));
        e21.j jVar = new e21.j(linkedList);
        gm0.j1.i();
        jVar.doScene(gm0.j1.n().f273288b.f70764d, new vh4.e2(t1Var, eVar));
    }
}
