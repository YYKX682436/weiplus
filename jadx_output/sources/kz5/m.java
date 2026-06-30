package kz5;

/* loaded from: classes14.dex */
public abstract class m extends java.util.AbstractMap implements java.util.Map, zz5.f {
    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        return new r0.h((r0.f) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
        return new r0.j((r0.f) this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return ((r0.f) this).f367973i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
        return new r0.l((r0.f) this);
    }
}
