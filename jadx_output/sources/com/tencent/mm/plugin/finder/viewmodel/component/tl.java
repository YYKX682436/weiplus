package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class tl extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f136039d;

    /* renamed from: e, reason: collision with root package name */
    public int f136040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.zl f136041f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.q6 f136042g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl(com.tencent.mm.plugin.finder.viewmodel.component.zl zlVar, so2.q6 q6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f136041f = zlVar;
        this.f136042g = q6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.tl(this.f136041f, this.f136042g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.tl) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object O6;
        java.lang.Object obj2;
        java.lang.Throwable m524exceptionOrNullimpl;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f136040e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("FinderHorizontalCollectionUIC", "loadCollection request CgiFinderGetTopicFeed");
            com.tencent.mm.plugin.finder.viewmodel.component.zl zlVar = this.f136041f;
            so2.q6 q6Var = this.f136042g;
            this.f136040e = 1;
            O6 = com.tencent.mm.plugin.finder.viewmodel.component.zl.O6(zlVar, q6Var, this);
            if (O6 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f136039d;
                kotlin.ResultKt.throwOnFailure(obj);
                O6 = obj2;
                m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(O6);
                if (m524exceptionOrNullimpl != null && (m524exceptionOrNullimpl instanceof rm0.j)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadCollection request CgiFinderGetTopicFeed fail, errType=");
                    rm0.j jVar = (rm0.j) m524exceptionOrNullimpl;
                    sb6.append(jVar.f397424e);
                    sb6.append(" errCode=");
                    sb6.append(jVar.f397425f);
                    sb6.append(" fail:");
                    sb6.append(jVar.f397426g);
                    com.tencent.mars.xlog.Log.e("FinderHorizontalCollectionUIC", sb6.toString());
                }
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            O6 = ((kotlin.Result) obj).getValue();
        }
        com.tencent.mm.plugin.finder.viewmodel.component.zl zlVar2 = this.f136041f;
        so2.q6 q6Var2 = this.f136042g;
        if (kotlin.Result.m528isSuccessimpl(O6)) {
            r45.oa1 oa1Var = (r45.oa1) O6;
            zlVar2.f136693h = oa1Var.getByteString(2);
            int i18 = 0;
            zlVar2.U6(oa1Var.getInteger(11) == 1);
            zlVar2.V6(oa1Var.getInteger(10) == 1);
            com.tencent.mars.xlog.Log.i("FinderHorizontalCollectionUIC", "loadCollection request CgiFinderGetTopicFeed success, data: " + oa1Var.getList(1).size() + "lastBuffer: " + zlVar2.f136693h + ", downContinue: " + zlVar2.f136695m + ", upContinue: " + zlVar2.f136694i);
            java.util.LinkedList list = oa1Var.getList(1);
            kotlin.jvm.internal.o.f(list, "getObject(...)");
            for (java.lang.Object obj3 : list) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj3;
                com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
                kotlin.jvm.internal.o.d(finderObject);
                com.tencent.mm.plugin.finder.storage.FinderItem a17 = h90Var.a(finderObject, 64);
                java.util.ArrayList arrayList = zlVar2.f136691f.f122296a;
                com.tencent.mm.plugin.finder.playlist.z1 z1Var = new com.tencent.mm.plugin.finder.playlist.z1(a17);
                z1Var.f122510f = q6Var2.f410559e;
                z1Var.f122509e = zlVar2.R6().getItemId();
                if (z1Var.getItemId() == zlVar2.R6().getItemId()) {
                    zlVar2.f136698p = z1Var;
                    z1Var.f122508d = true;
                }
                arrayList.add(z1Var);
                i18 = i19;
            }
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            com.tencent.mm.plugin.finder.viewmodel.component.sl slVar = new com.tencent.mm.plugin.finder.viewmodel.component.sl(zlVar2, null);
            this.f136039d = O6;
            this.f136040e = 2;
            if (kotlinx.coroutines.l.g(g3Var, slVar, this) == aVar) {
                return aVar;
            }
            obj2 = O6;
            O6 = obj2;
        }
        m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(O6);
        if (m524exceptionOrNullimpl != null) {
            java.lang.StringBuilder sb62 = new java.lang.StringBuilder("loadCollection request CgiFinderGetTopicFeed fail, errType=");
            rm0.j jVar2 = (rm0.j) m524exceptionOrNullimpl;
            sb62.append(jVar2.f397424e);
            sb62.append(" errCode=");
            sb62.append(jVar2.f397425f);
            sb62.append(" fail:");
            sb62.append(jVar2.f397426g);
            com.tencent.mars.xlog.Log.e("FinderHorizontalCollectionUIC", sb62.toString());
        }
        return jz5.f0.f302826a;
    }
}
