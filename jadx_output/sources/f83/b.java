package f83;

/* loaded from: classes15.dex */
public final class b extends f83.a implements e70.u {
    public static final l75.e0 Q1 = f83.a.initAutoDBInfo(f83.a.class);
    private java.util.List<? extends java.util.Map<java.lang.String, java.lang.String>> field_extInfo;

    @Override // f83.a, l75.f0
    public l75.e0 getDBInfo() {
        l75.e0 info = Q1;
        kotlin.jvm.internal.o.f(info, "info");
        return info;
    }

    public java.lang.String t0() {
        java.lang.String field_resourceName = this.field_resourceName;
        kotlin.jvm.internal.o.f(field_resourceName, "field_resourceName");
        return field_resourceName;
    }

    public java.lang.String u0() {
        java.lang.String field_url = this.field_url;
        kotlin.jvm.internal.o.f(field_url, "field_url");
        return field_url;
    }

    public final void v0(java.util.List list) {
        this.field_extInfo = list;
    }
}
