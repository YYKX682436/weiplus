package nw4;

/* loaded from: classes.dex */
public class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f340884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340885e;

    public m2(nw4.n nVar, nw4.y2 y2Var) {
        this.f340885e = nVar;
        this.f340884d = y2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f340885e;
        nVar.getClass();
        nw4.y2 y2Var = this.f340884d;
        if (y2Var == null) {
            return;
        }
        boolean D0 = com.tencent.mm.sdk.platformtools.t8.D0("log", y2Var.f341019i);
        java.util.LinkedList linkedList = nVar.f340891e;
        if (D0) {
            linkedList.add(y2Var);
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            nw4.y2 y2Var2 = (nw4.y2) it.next();
            if (y2Var2 != null && com.tencent.mm.sdk.platformtools.t8.D0(y2Var2.f341019i, y2Var.f341019i)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "addToMsgQueue fail, already has this function %s", y2Var.f341019i);
                return;
            }
        }
        linkedList.add(y2Var);
    }
}
