package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class a1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f209260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.h1 f209261e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f209262f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f209263g;

    public a1(java.util.List list, com.tencent.mm.ui.mvvm.uic.conversation.recent.h1 h1Var, java.util.HashMap hashMap, kotlinx.coroutines.flow.i2 i2Var) {
        this.f209260d = list;
        this.f209261e = h1Var;
        this.f209262f = hashMap;
        this.f209263g = i2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        p13.v vVar = (p13.v) obj;
        com.tencent.mm.ui.mvvm.uic.conversation.recent.h1 h1Var = this.f209261e;
        java.lang.String string = h1Var.getActivity().getString(com.tencent.mm.R.string.ffq);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.util.List U6 = h1Var.U6(0, true, vVar, string, false, null);
        java.util.List list = this.f209260d;
        list.addAll(U6);
        this.f209262f.put(new java.lang.Integer(0), vVar);
        java.lang.Object emit = this.f209263g.emit(list, continuation);
        return emit == pz5.a.f359186d ? emit : jz5.f0.f302826a;
    }
}
