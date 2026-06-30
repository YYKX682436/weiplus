package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class qz extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f135745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.h00 f135746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.lz f135747f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz(com.tencent.mm.plugin.finder.viewmodel.component.h00 h00Var, com.tencent.mm.plugin.finder.viewmodel.component.lz lzVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f135746e = h00Var;
        this.f135747f = lzVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.qz(this.f135746e, this.f135747f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.qz) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.h3 h3Var;
        java.lang.Object value;
        java.util.ArrayList arrayList;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f135745d;
        com.tencent.mm.plugin.finder.viewmodel.component.lz lzVar = this.f135747f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            com.tencent.mm.plugin.finder.viewmodel.component.pz pzVar = new com.tencent.mm.plugin.finder.viewmodel.component.pz(lzVar, null);
            this.f135745d = 1;
            obj = kotlinx.coroutines.l.g(p0Var, pzVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean b17 = fVar.b();
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.finder.viewmodel.component.h00 h00Var = this.f135746e;
        if (!b17) {
            com.tencent.mars.xlog.Log.w("Finder.SelfOftenReadAuthorUIC", "deleteItemAfterResp failed: oldResp=" + fVar);
            db5.t7.g(h00Var.getContext(), h00Var.getContext().getResources().getString(com.tencent.mm.R.string.oyl));
            return f0Var;
        }
        db5.t7.h(h00Var.getContext(), h00Var.getContext().getResources().getString(com.tencent.mm.R.string.oym));
        java.lang.String str = lzVar.f135100d;
        if (str == null) {
            return f0Var;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.bh bhVar = com.tencent.mm.plugin.finder.viewmodel.component.bh.f133877a;
        kotlinx.coroutines.flow.j2 j2Var = com.tencent.mm.plugin.finder.viewmodel.component.bh.f133880d;
        do {
            h3Var = (kotlinx.coroutines.flow.h3) j2Var;
            value = h3Var.getValue();
            java.util.List list = (java.util.List) value;
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (!kotlin.jvm.internal.o.b(((com.tencent.mm.plugin.finder.viewmodel.component.lz) obj2).f135100d, str)) {
                    arrayList.add(obj2);
                }
            }
            com.tencent.mars.xlog.Log.i("Finder.FollowAggregationRepo", "delete username.len=" + str.length() + ": old.size=" + list.size() + " -> new.size=" + arrayList.size());
        } while (!h3Var.j(value, arrayList));
        return f0Var;
    }
}
