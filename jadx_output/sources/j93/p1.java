package j93;

/* loaded from: classes.dex */
public final class p1 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f298474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j93.w1 f298475e;

    public p1(j93.w1 w1Var, wi5.z request, kotlinx.coroutines.flow.i2 searchFlow, int i17, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(searchFlow, "searchFlow");
        this.f298475e = w1Var;
        this.f298474d = searchFlow;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        boolean z17;
        com.tencent.mm.sdk.coroutines.LifecycleScope O6;
        if (vVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactChatRoomMemberSearchUIC", "onFTSSearchEnd " + vVar.f351157b.hashCode());
            j93.w1 w1Var = this.f298475e;
            java.util.Iterator it = w1Var.f298528e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                } else if (kotlin.jvm.internal.o.b((p13.c) it.next(), vVar.f351157b)) {
                    z17 = true;
                    break;
                }
            }
            if ((z17 ? vVar : null) == null || vVar.f351158c != 0 || (O6 = w1Var.O6()) == null) {
                return;
            }
            v65.i.b(O6, null, new j93.o1(this, vVar, null), 1, null);
        }
    }
}
