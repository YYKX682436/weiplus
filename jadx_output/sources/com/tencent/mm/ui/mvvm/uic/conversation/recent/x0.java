package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class x0 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f209383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.h1 f209384e;

    public x0(com.tencent.mm.ui.mvvm.uic.conversation.recent.h1 h1Var, wi5.z request, kotlinx.coroutines.flow.i2 searchFlow, int i17, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(searchFlow, "searchFlow");
        this.f209384e = h1Var;
        this.f209383d = searchFlow;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        boolean z17;
        com.tencent.mm.sdk.coroutines.LifecycleScope O6;
        if (vVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecentConversationSearchUIC", "onFTSSearchEnd " + vVar.f351157b.hashCode());
            com.tencent.mm.ui.mvvm.uic.conversation.recent.h1 h1Var = this.f209384e;
            java.util.Iterator it = h1Var.f209331e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z17 = false;
                    break;
                } else if (kotlin.jvm.internal.o.b((p13.c) it.next(), vVar.f351157b)) {
                    z17 = true;
                    break;
                }
            }
            if ((z17 ? vVar : null) == null || vVar.f351158c != 0 || (O6 = h1Var.O6()) == null) {
                return;
            }
            v65.i.b(O6, null, new com.tencent.mm.ui.mvvm.uic.conversation.recent.w0(this, vVar, null), 1, null);
        }
    }
}
