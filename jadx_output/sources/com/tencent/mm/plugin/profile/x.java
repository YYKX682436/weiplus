package com.tencent.mm.plugin.profile;

/* loaded from: classes6.dex */
public class x implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f154735d = 0;

    public x(com.tencent.mm.plugin.profile.y yVar, com.tencent.mm.plugin.profile.w wVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f154735d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f154735d;
        this.f154735d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.profile.p1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
