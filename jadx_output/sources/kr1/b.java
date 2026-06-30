package kr1;

/* loaded from: classes4.dex */
public final class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f311302e;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f311303d;

    static {
        l75.e0 e0Var = kr1.a.f311301s;
        f311302e = new java.lang.String[]{l75.n0.getCreateSQLs(kr1.a.f311301s, "BizFollowedContactDigest")};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l75.k0 db6) {
        super(db6, kr1.a.f311301s, "BizFollowedContactDigest", dm.g1.f237017i);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = kr1.a.f311301s;
        this.f311303d = db6;
    }
}
