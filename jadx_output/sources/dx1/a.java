package dx1;

/* loaded from: classes.dex */
public final class a extends java.util.LinkedHashMap {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f244475d;

    public a(java.lang.String delimiter) {
        kotlin.jvm.internal.o.g(delimiter, "delimiter");
        this.f244475d = delimiter;
    }

    @Override // java.util.AbstractMap
    public java.lang.String toString() {
        if (super.size() == 0) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (sb6.length() == 0) {
                sb6.append("\"" + entry.getKey() + "\":\"" + entry.getValue() + '\"');
            } else {
                sb6.append(this.f244475d + '\"' + entry.getKey() + "\":\"" + entry.getValue() + '\"');
            }
        }
        return "{" + ((java.lang.Object) sb6) + '}';
    }
}
