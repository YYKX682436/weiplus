package g61;

/* loaded from: classes4.dex */
public class c extends com.tencent.mm.sdk.event.n {
    public c() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CloseAAEvent closeAAEvent = (com.tencent.mm.autogen.events.CloseAAEvent) iEvent;
        am.b3 b3Var = closeAAEvent.f54063g;
        com.tencent.mars.xlog.Log.i("CloseAAEventIListener", "closeAAEvent callback, billNo: %s, chatroom: %s", b3Var.f6211a, b3Var.f6212b);
        am.b3 b3Var2 = closeAAEvent.f54063g;
        if (com.tencent.mm.sdk.platformtools.t8.K0(b3Var2.f6211a) || com.tencent.mm.sdk.platformtools.t8.K0(b3Var2.f6212b)) {
            return false;
        }
        h61.s sVar = new h61.s();
        h61.p pVar = sVar.f279167a;
        pVar.getClass();
        gm0.j1.i();
        gm0.j1.n().f273288b.a(1530, pVar);
        java.lang.String str = b3Var2.f6211a;
        java.lang.String str2 = b3Var2.f6212b;
        long j17 = b3Var2.f6213c;
        h61.q qVar = sVar.f279169c;
        qVar.getClass();
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        km5.q qVar2 = new km5.q();
        qVar2.y(str, 3, str2, valueOf);
        qVar2.n(qVar);
        ((km5.q) qVar2.q(new g61.b(this, sVar))).s(new g61.a(this, sVar));
        return false;
    }
}
