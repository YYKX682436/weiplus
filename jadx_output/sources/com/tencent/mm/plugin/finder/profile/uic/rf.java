package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class rf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.cp3 f124188d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f124189e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(r45.cp3 cp3Var, com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f124188d = cp3Var;
        this.f124189e = finderProfileTabUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.profile.uic.rf(this.f124188d, this.f124189e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.profile.uic.rf rfVar = (com.tencent.mm.plugin.finder.profile.uic.rf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        rfVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r45.cp3 cp3Var = this.f124188d;
        java.util.LinkedList<r45.r03> list = cp3Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getTopic_list(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (r45.r03 r03Var : list) {
            kotlin.jvm.internal.o.d(r03Var);
            arrayList2.add(new so2.d5(r03Var));
        }
        arrayList.addAll(arrayList2);
        com.tencent.mm.plugin.finder.feed.model.r9 r9Var = new com.tencent.mm.plugin.finder.feed.model.r9(arrayList, cp3Var.getByteString(2), 0, null, null, 16, null);
        com.tencent.mm.plugin.finder.feed.model.y9 y9Var = new com.tencent.mm.plugin.finder.feed.model.y9();
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f124189e;
        android.content.Intent intent = finderProfileTabUIC.getActivity().getIntent();
        kotlin.jvm.internal.o.f(intent, "getIntent(...)");
        y9Var.b(r9Var, intent);
        pm0.v.X(new com.tencent.mm.plugin.finder.profile.uic.ze(finderProfileTabUIC));
        return jz5.f0.f302826a;
    }
}
