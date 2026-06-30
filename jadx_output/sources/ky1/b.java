package ky1;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public long f313487a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f313488b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f313489c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f313490d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f313491e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f313492f;

    public b(ky1.a aVar) {
    }

    public ky1.c a() {
        return new ky1.c(this.f313487a, this.f313488b, this.f313489c, this.f313490d, this.f313491e, this.f313492f, null);
    }

    public ky1.b b(java.util.Map map) {
        if (map != null && map.size() > 0) {
            ((java.util.HashMap) this.f313490d).putAll(map);
        }
        return this;
    }

    public ky1.b c(java.util.List list) {
        if (list != null && list.size() > 0) {
            ((java.util.ArrayList) this.f313491e).addAll(list);
        }
        return this;
    }
}
