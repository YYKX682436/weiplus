package pf5;

/* loaded from: classes5.dex */
public final class t0 extends java.util.HashMap {

    /* renamed from: d, reason: collision with root package name */
    public final pf5.v0 f353934d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f353935e;

    public t0(pf5.v0 store) {
        kotlin.jvm.internal.o.g(store, "store");
        this.f353934d = store;
        this.f353935e = new java.util.HashMap(0);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        synchronized (this.f353934d.f353941c) {
            if (this.f353934d.f353940b) {
                super.clear();
                this.f353934d.f353942d = true;
            }
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return super.containsKey((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object obj) {
        if (obj instanceof androidx.lifecycle.c1) {
            return super.containsValue((androidx.lifecycle.c1) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        androidx.lifecycle.c1 c1Var;
        if (!(obj instanceof java.lang.String)) {
            return null;
        }
        java.lang.String key = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(key, "key");
        synchronized (this.f353934d.f353941c) {
            c1Var = (androidx.lifecycle.c1) super.get(key);
        }
        return c1Var;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        return !(obj instanceof java.lang.String) ? obj2 : (androidx.lifecycle.c1) super.getOrDefault((java.lang.String) obj, (androidx.lifecycle.c1) obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        androidx.lifecycle.c1 c1Var;
        java.lang.String key = (java.lang.String) obj;
        androidx.lifecycle.c1 value = (androidx.lifecycle.c1) obj2;
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        synchronized (this.f353934d.f353941c) {
            c1Var = (androidx.lifecycle.c1) super.put(key, value);
        }
        return c1Var;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return (androidx.lifecycle.c1) super.remove((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
        java.util.Collection values;
        synchronized (this.f353934d.f353941c) {
            if (this.f353934d.f353940b) {
                values = new java.util.ArrayList(super.values());
            } else {
                values = this.f353935e.values();
                kotlin.jvm.internal.o.f(values, "<get-values>(...)");
            }
        }
        return values;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        if ((obj instanceof java.lang.String) && (obj2 instanceof androidx.lifecycle.c1)) {
            return super.remove((java.lang.String) obj, (androidx.lifecycle.c1) obj2);
        }
        return false;
    }
}
