package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderBlackListUI f129086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.v41 f129087e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.plugin.finder.ui.FinderBlackListUI finderBlackListUI, r45.v41 v41Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f129086d = finderBlackListUI;
        this.f129087e = v41Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.ui.e1(this.f129086d, this.f129087e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.ui.e1 e1Var = (com.tencent.mm.plugin.finder.ui.e1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.v41 v41Var = this.f129087e;
        boolean z17 = v41Var.getInteger(2) != 0;
        com.tencent.mm.plugin.finder.ui.FinderBlackListUI finderBlackListUI = this.f129086d;
        finderBlackListUI.f128518x = z17;
        finderBlackListUI.f128520z = v41Var.getByteString(3);
        java.util.LinkedList list = v41Var.getList(1);
        finderBlackListUI.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("black contact ");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderBlackListUI", sb6.toString());
        if (list != null) {
            java.util.ArrayList arrayList = finderBlackListUI.f128517w;
            arrayList.addAll(list);
            finderBlackListUI.e7();
            com.tencent.mm.plugin.finder.ui.e eVar = finderBlackListUI.f128516v;
            eVar.c(arrayList);
            eVar.notifyDataSetChanged();
        } else {
            finderBlackListUI.e7();
        }
        return jz5.f0.f302826a;
    }
}
