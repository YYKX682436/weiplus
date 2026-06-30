package com.tencent.mm.vending.base;

/* loaded from: classes16.dex */
public class s extends java.util.HashMap {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.vending.base.k f212661d = null;

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        super.clear();
        com.tencent.mm.vending.base.k kVar = this.f212661d;
        if (kVar != null) {
            com.tencent.mm.vending.base.d dVar = (com.tencent.mm.vending.base.d) kVar;
            dVar.getClass();
            jm5.b.b("Vending", "SafeSparseArray fusing.", new java.lang.Object[0]);
            dVar.f212644a.deadlock();
        }
    }
}
