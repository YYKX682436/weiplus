package iv2;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f295125a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f295126b;

    /* renamed from: c, reason: collision with root package name */
    public int f295127c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f295128d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f295129e;

    /* renamed from: f, reason: collision with root package name */
    public final int f295130f;
    private long field_id;
    private java.lang.String field_username;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f295131g;

    public b(java.lang.String app_name, java.lang.String entity_id) {
        kotlin.jvm.internal.o.g(app_name, "app_name");
        kotlin.jvm.internal.o.g(entity_id, "entity_id");
        this.f295125a = app_name;
        this.f295126b = entity_id;
        this.f295128d = "";
        this.f295129e = "";
        this.f295130f = (app_name + entity_id).hashCode();
        this.field_id = (app_name + entity_id).hashCode();
        this.f295131g = "";
        this.field_username = "";
        new java.util.LinkedList();
        new java.util.LinkedList();
    }

    public final long a() {
        return this.field_id;
    }
}
