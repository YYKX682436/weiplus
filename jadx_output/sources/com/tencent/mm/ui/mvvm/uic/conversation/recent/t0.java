package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.v0 f209371d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.tencent.mm.ui.mvvm.uic.conversation.recent.v0 v0Var) {
        super(1);
        this.f209371d = v0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            java.util.HashSet hashSet = state.f446320p;
            this.f209371d.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("weixin");
            arrayList.addAll(c01.e2.i());
            arrayList.addAll(c01.e2.h());
            arrayList.remove("conversationboxservice");
            arrayList.remove("opencustomerservicemsg");
            arrayList.remove("filehelper");
            hashSet.addAll(arrayList);
        }
        return jz5.f0.f302826a;
    }
}
