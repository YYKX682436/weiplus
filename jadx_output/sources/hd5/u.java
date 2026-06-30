package hd5;

/* loaded from: classes9.dex */
public class u implements hd5.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hd5.q f280648a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hd5.t f280649b;

    public u(hd5.t tVar, hd5.q qVar) {
        this.f280649b = tVar;
        this.f280648a = qVar;
    }

    @Override // hd5.o
    public void next() {
        hd5.p pVar = this.f280649b.f280644f;
        hd5.q qVar = this.f280648a;
        ke5.b bVar = (ke5.b) pVar;
        bVar.getClass();
        int i17 = qVar.f280634f;
        ke5.a aVar = bVar.f307060c;
        aVar.getClass();
        aVar.f307043d = qVar.f280632d;
        java.util.LinkedList linkedList = (java.util.LinkedList) qVar.f280631c;
        if (linkedList.size() > 0) {
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) linkedList.get(0);
            if (f9Var != null) {
                f9Var.getCreateTime();
                aVar.getClass();
            }
            com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) linkedList.get(linkedList.size() - 1);
            if (f9Var2 != null) {
                f9Var2.getCreateTime();
                aVar.getClass();
                f9Var2.F0();
                aVar.getClass();
            }
        }
        hd5.t tVar = this.f280649b;
        hd5.n nVar = tVar.f280642d;
        ((tb5.d0) ((tb5.n0) tVar.f280646h.f280655f.f460708c.a(tb5.n0.class))).m0("sendFinishMessage", this.f280649b.f280642d);
        hd5.t tVar2 = this.f280649b;
        hd5.q qVar2 = this.f280648a;
        synchronized (tVar2.f280646h) {
            if (tVar2.f280645g.get()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ChattingLoader.ListDataLoader", "has cancel!");
                return;
            }
            android.os.Message message = new android.os.Message();
            message.what = 1;
            message.obj = qVar2;
            if (tVar2.f280643e && android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                tVar2.f280646h.f280652c.handleMessage(message);
            } else {
                tVar2.f280646h.f280652c.sendMessage(message);
            }
        }
    }
}
