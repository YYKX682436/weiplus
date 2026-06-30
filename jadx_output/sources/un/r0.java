package un;

/* loaded from: classes.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.s0 f429324d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(un.s0 s0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f429324d = s0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new un.r0(this.f429324d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        un.r0 r0Var = (un.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.sdk.coroutines.LifecycleScope O6;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        un.s0 s0Var = this.f429324d;
        java.lang.String stringExtra = s0Var.getIntent().getStringExtra("chatroomName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        long m07 = ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(stringExtra);
        p75.n0 n0Var = dm.c8.f236162y0;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList.add(dm.c8.f236159l1);
        p75.m c17 = dm.c8.A1.j(stringExtra).c(dm.c8.f236164z1.o(java.lang.Long.valueOf(m07)));
        p75.i0 g17 = dm.c8.f236162y0.g(linkedList);
        g17.f352657d = c17;
        g17.d(linkedList2);
        g17.b(linkedList3);
        if (g17.a().h(gm0.j1.u().f273153f) && (O6 = s0Var.O6()) != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(O6, kotlinx.coroutines.internal.b0.f310484a, null, new un.q0(s0Var, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
