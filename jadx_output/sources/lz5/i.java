package lz5;

/* loaded from: classes14.dex */
public final class i implements java.util.Map.Entry, zz5.e {

    /* renamed from: d, reason: collision with root package name */
    public final lz5.m f322398d;

    /* renamed from: e, reason: collision with root package name */
    public final int f322399e;

    public i(lz5.m map, int i17) {
        kotlin.jvm.internal.o.g(map, "map");
        this.f322398d = map;
        this.f322399e = i17;
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (kotlin.jvm.internal.o.b(entry.getKey(), getKey()) && kotlin.jvm.internal.o.b(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        return this.f322398d.f322405d[this.f322399e];
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        java.lang.Object[] objArr = this.f322398d.f322406e;
        kotlin.jvm.internal.o.d(objArr);
        return objArr[this.f322399e];
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        java.lang.Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        java.lang.Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        lz5.m mVar = this.f322398d;
        mVar.c();
        java.lang.Object[] objArr = mVar.f322406e;
        if (objArr == null) {
            objArr = lz5.f.c(mVar.f322405d.length);
            mVar.f322406e = objArr;
        }
        int i17 = this.f322399e;
        java.lang.Object obj2 = objArr[i17];
        objArr[i17] = obj;
        return obj2;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(getKey());
        sb6.append('=');
        sb6.append(getValue());
        return sb6.toString();
    }
}
