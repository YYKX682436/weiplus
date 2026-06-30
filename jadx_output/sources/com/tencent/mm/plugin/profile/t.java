package com.tencent.mm.plugin.profile;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f153616d = 0;

    public t(com.tencent.mm.plugin.profile.u uVar, com.tencent.mm.plugin.profile.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f153616d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f153616d;
        this.f153616d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.profile.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
