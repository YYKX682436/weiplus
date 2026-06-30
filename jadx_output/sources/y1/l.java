package y1;

/* loaded from: classes14.dex */
public final class l implements y1.p0, java.lang.Iterable, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f458766d = new java.util.LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f458767e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f458768f;

    public final boolean d(y1.o0 key) {
        kotlin.jvm.internal.o.g(key, "key");
        return this.f458766d.containsKey(key);
    }

    public final java.lang.Object e(y1.o0 key) {
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.Object obj = ((java.util.LinkedHashMap) this.f458766d).get(key);
        if (obj != null) {
            return obj;
        }
        throw new java.lang.IllegalStateException("Key not present: " + key + " - consider getOrElse or getOrNull");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1.l)) {
            return false;
        }
        y1.l lVar = (y1.l) obj;
        return kotlin.jvm.internal.o.b(this.f458766d, lVar.f458766d) && this.f458767e == lVar.f458767e && this.f458768f == lVar.f458768f;
    }

    public void g(y1.o0 key, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(key, "key");
        this.f458766d.put(key, obj);
    }

    public int hashCode() {
        return (((this.f458766d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f458767e)) * 31) + java.lang.Boolean.hashCode(this.f458768f);
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return ((java.util.LinkedHashMap) this.f458766d).entrySet().iterator();
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (this.f458767e) {
            sb6.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f458768f) {
            sb6.append(str);
            sb6.append("isClearingSemantics=true");
            str = ", ";
        }
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) this.f458766d).entrySet()) {
            y1.o0 o0Var = (y1.o0) entry.getKey();
            java.lang.Object value = entry.getValue();
            sb6.append(str);
            sb6.append(o0Var.f458783a);
            sb6.append(" : ");
            sb6.append(value);
            str = ", ";
        }
        return androidx.compose.ui.platform.k3.a(this, null) + "{ " + ((java.lang.Object) sb6) + " }";
    }
}
