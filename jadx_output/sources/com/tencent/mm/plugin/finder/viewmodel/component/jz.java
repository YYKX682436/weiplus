package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class jz implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.h00 f134905d;

    public jz(com.tencent.mm.plugin.finder.viewmodel.component.h00 h00Var) {
        this.f134905d = h00Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        xw2.t tVar = (xw2.t) obj;
        int i17 = tVar.f457724a;
        if (i17 > 0) {
            if (tVar.f457725b >= i17 - 2) {
                com.tencent.mm.plugin.finder.viewmodel.component.h00 h00Var = this.f134905d;
                h00Var.getClass();
                com.tencent.mm.plugin.finder.viewmodel.component.bh.f133877a.e(h00Var.getActivity(), true);
            }
        }
        return jz5.f0.f302826a;
    }
}
