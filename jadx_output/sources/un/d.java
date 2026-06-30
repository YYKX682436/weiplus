package un;

/* loaded from: classes11.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.h f429244d;

    public d(un.h hVar) {
        this.f429244d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
        un.h hVar = this.f429244d;
        java.lang.String U6 = hVar.U6();
        ((py.a) iVar).getClass();
        boolean y17 = c01.v1.y(U6);
        com.tencent.mm.autogen.mmdata.rpt.ChatBoxGroupActionStruct chatBoxGroupActionStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatBoxGroupActionStruct();
        chatBoxGroupActionStruct.f55598d = chatBoxGroupActionStruct.b("roomUsername", hVar.U6(), true);
        chatBoxGroupActionStruct.f55599e = 4;
        chatBoxGroupActionStruct.f55600f = y17 ? 1L : 0L;
        chatBoxGroupActionStruct.k();
    }
}
