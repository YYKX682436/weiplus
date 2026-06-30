package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class v2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f129938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderConversationFragment f129939e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(com.tencent.mm.plugin.finder.ui.FinderConversationFragment finderConversationFragment, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f129939e = finderConversationFragment;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.ui.v2(this.f129939e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.ui.v2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        android.view.View view;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f129938d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.ui.FinderConversationFragment finderConversationFragment = this.f129939e;
            qb2.h0 h0Var = (qb2.h0) finderConversationFragment.z0();
            l75.n0 c17 = h0Var.c();
            kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.storage.FinderConversationStorage");
            java.util.List P0 = ((com.tencent.mm.plugin.finder.storage.t80) c17).P0(h0Var.f361217a, 0, 1, new int[]{1}, h0Var.f361219c);
            if (!P0.isEmpty()) {
                str = ((qb2.t) P0.get(0)).F1 + ':' + ((qb2.t) P0.get(0)).field_digest;
            } else {
                str = "";
            }
            long j17 = P0.isEmpty() ^ true ? ((qb2.t) P0.get(0)).field_updateTime : 0L;
            com.tencent.mm.plugin.finder.storage.t80 Kj = ((c61.l7) i95.n0.c(c61.l7.class)).Kj();
            int J0 = Kj.J0(2, (java.lang.String) ((jz5.n) finderConversationFragment.f128510w).getValue());
            qb2.t D0 = Kj.D0("findersayhisessionholder");
            if (J0 > 0 && D0.systemRowid > 0 && (!kotlin.jvm.internal.o.b(str, D0.field_digest) || j17 != D0.field_updateTime)) {
                com.tencent.mars.xlog.Log.i("Finder.FinderBaseConversationFragment", "[onResume] update digest=%s", str);
                D0.field_digest = str;
                D0.field_updateTime = j17;
                if (Kj.update(D0.systemRowid, D0, false)) {
                    Kj.doNotify(D0.field_sessionId, 1, D0);
                }
            } else if (D0.systemRowid > 0 && J0 == 0 && (view = finderConversationFragment.f206301h) != null) {
                view.postDelayed(new com.tencent.mm.plugin.finder.ui.t2(Kj, D0), 1000L);
            }
            finderConversationFragment.N0();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            com.tencent.mm.plugin.finder.ui.u2 u2Var = new com.tencent.mm.plugin.finder.ui.u2(finderConversationFragment, null);
            this.f129938d = 1;
            if (kotlinx.coroutines.l.g(g3Var, u2Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
