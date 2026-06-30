package ij5;

/* loaded from: classes.dex */
public final class v implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f291811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ij5.d0 f291812e;

    public v(ij5.d0 d0Var, wi5.z request, kotlinx.coroutines.flow.i2 searchFlow, int i17, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(searchFlow, "searchFlow");
        this.f291812e = d0Var;
        this.f291811d = searchFlow;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        boolean z17;
        com.tencent.mm.sdk.coroutines.LifecycleScope O6;
        if (vVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectChatroomConversationSearchUIC", "onFTSSearchEnd " + vVar.f351157b.hashCode());
            ij5.d0 d0Var = this.f291812e;
            java.util.Iterator it = d0Var.f291762e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                } else if (kotlin.jvm.internal.o.b((p13.c) it.next(), vVar.f351157b)) {
                    z17 = true;
                    break;
                }
            }
            if ((z17 ? vVar : null) == null || vVar.f351158c != 0 || (O6 = d0Var.O6()) == null) {
                return;
            }
            v65.i.b(O6, null, new ij5.u(this, vVar, null), 1, null);
        }
    }
}
