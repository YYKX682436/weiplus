package un;

/* loaded from: classes5.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.j1 f429282d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(un.j1 j1Var) {
        super(0);
        this.f429282d = j1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        un.j1 j1Var = this.f429282d;
        boolean p47 = com.tencent.mm.storage.z3.p4(j1Var.c7());
        boolean z17 = (p47 || com.tencent.mm.storage.z3.R3(j1Var.c7())) ? false : true;
        com.tencent.mars.xlog.Log.i("MicroMsg.SingleRoomOperationUIC", "isSingleChatConvBoxOpen switch:true isKefu:" + p47 + " isEntryOpen:" + z17);
        return java.lang.Boolean.valueOf(z17);
    }
}
