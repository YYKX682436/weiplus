package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f143931d = 0;

    public f(com.tencent.mm.plugin.lite.logic.g gVar, com.tencent.mm.plugin.lite.logic.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f143931d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f143931d;
        this.f143931d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.lite.logic.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
