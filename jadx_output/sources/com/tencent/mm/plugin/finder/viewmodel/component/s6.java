package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes4.dex */
public final class s6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.util.SparseArray f135864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.u6 f135865e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(android.util.SparseArray sparseArray, com.tencent.mm.plugin.finder.viewmodel.component.u6 u6Var) {
        super(0);
        this.f135864d = sparseArray;
        this.f135865e = u6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.util.SparseArray sparseArray = this.f135864d;
        int size = sparseArray.size();
        for (int i17 = 0; i17 < size; i17++) {
            sparseArray.keyAt(i17);
            so2.w0 w0Var = (so2.w0) sparseArray.valueAt(i17);
            com.tencent.mm.plugin.finder.viewmodel.component.u6 u6Var = this.f135865e;
            ((android.util.LruCache) ((jz5.n) u6Var.f136099g).getValue()).put(w0Var.f410681c, w0Var);
            u6Var.Q6(w0Var);
        }
        return jz5.f0.f302826a;
    }
}
