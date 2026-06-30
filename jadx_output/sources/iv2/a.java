package iv2;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f295118a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f295119b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f295120c;

    /* renamed from: d, reason: collision with root package name */
    public int f295121d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f295122e;

    /* renamed from: f, reason: collision with root package name */
    public final int f295123f;
    private long field_id;
    private java.lang.String field_username;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f295124g;

    public a(java.lang.String app_name, java.lang.String entity_id, java.lang.String userName, boolean z17) {
        kotlin.jvm.internal.o.g(app_name, "app_name");
        kotlin.jvm.internal.o.g(entity_id, "entity_id");
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f295118a = entity_id;
        this.f295119b = userName;
        this.f295120c = z17;
        this.f295122e = "";
        this.f295123f = app_name.concat(entity_id).hashCode();
        this.field_id = app_name.concat(entity_id).hashCode();
        this.f295124g = "";
        this.field_username = "";
        new java.util.LinkedList();
    }

    public final long a() {
        return this.field_id;
    }
}
