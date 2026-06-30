package fm3;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final fm3.a f264026e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.LinkedHashMap f264027f;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f264028a;

    /* renamed from: b, reason: collision with root package name */
    public final org.json.JSONObject f264029b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f264030c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f264031d;

    static {
        fm3.a aVar = new fm3.a(null);
        f264026e = aVar;
        f264027f = new java.util.LinkedHashMap();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.u().d() + "music/cover/");
        sb6.append("mv_transition/");
        java.lang.String sb7 = sb6.toString();
        if (com.tencent.mm.vfs.w6.j(sb7)) {
            aVar.a(sb7);
        }
    }

    public b(java.lang.String id6, org.json.JSONObject nameObj, java.lang.String wxamPath, java.lang.String pagPath, boolean z17) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(nameObj, "nameObj");
        kotlin.jvm.internal.o.g(wxamPath, "wxamPath");
        kotlin.jvm.internal.o.g(pagPath, "pagPath");
        this.f264028a = id6;
        this.f264029b = nameObj;
        this.f264030c = wxamPath;
        this.f264031d = pagPath;
    }
}
