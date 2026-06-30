package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class lf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f135059d;

    /* renamed from: e, reason: collision with root package name */
    public int f135060e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.qf f135061f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f135062g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderPostRefFeedCommentEvent f135063h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf(com.tencent.mm.plugin.finder.viewmodel.component.qf qfVar, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, com.tencent.mm.autogen.events.FinderPostRefFeedCommentEvent finderPostRefFeedCommentEvent, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f135061f = qfVar;
        this.f135062g = finderItem;
        this.f135063h = finderPostRefFeedCommentEvent;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.lf(this.f135061f, this.f135062g, this.f135063h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.lf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object d17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f135060e;
        com.tencent.mm.plugin.finder.viewmodel.component.qf qfVar = this.f135061f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.qt2 d18 = xy2.c.d(qfVar.getActivity());
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f135062g;
            db2.g4 g4Var = new db2.g4(finderItem.getId(), finderItem.getObjectNonceId(), d18 != null ? d18.getInteger(5) : 0, 2, "", true, null, null, 0L, null, false, false, null, d18, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, finderItem.getDupFlag(), null, 402644928, null);
            this.f135060e = 1;
            d17 = xg2.g.d(g4Var, null, this, 1, null);
            if (d17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            d17 = obj;
        }
        xg2.h hVar = (xg2.h) d17;
        if (hVar instanceof xg2.i) {
            oz5.l lVar = hVar.f454392a;
            if (lVar == null) {
                lVar = getContext();
            }
            com.tencent.mm.plugin.finder.viewmodel.component.kf kfVar = new com.tencent.mm.plugin.finder.viewmodel.component.kf(hVar, null, this.f135063h, qfVar);
            this.f135059d = hVar;
            this.f135060e = 2;
            if (kotlinx.coroutines.l.g(lVar, kfVar, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
