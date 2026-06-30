package com.tencent.mm.storage;

/* loaded from: classes8.dex */
public class na extends jm0.k {
    @Override // n75.a
    public java.util.Set N6() {
        java.lang.Object[] objArr = {new com.tencent.mm.storage.oa()};
        java.util.HashSet hashSet = new java.util.HashSet(1);
        java.lang.Object obj = objArr[0];
        java.util.Objects.requireNonNull(obj);
        if (hashSet.add(obj)) {
            return java.util.Collections.unmodifiableSet(hashSet);
        }
        throw new java.lang.IllegalArgumentException("duplicate element: " + obj);
    }

    @Override // jm0.k
    public boolean Q6() {
        return false;
    }
}
