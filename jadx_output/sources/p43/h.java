package p43;

/* loaded from: classes4.dex */
public final class h extends l75.n0 implements p43.f {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f351766f;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f351767d;

    /* renamed from: e, reason: collision with root package name */
    public final j43.a f351768e;

    static {
        java.util.ArrayList d17 = kz5.c0.d(l75.n0.getCreateSQLs(p43.e.f351765p, "LocalGameReport"));
        java.lang.String[] INDEX_CREATE = dm.q7.f239425g;
        kotlin.jvm.internal.o.f(INDEX_CREATE, "INDEX_CREATE");
        kz5.h0.w(d17, INDEX_CREATE);
        f351766f = (java.lang.String[]) d17.toArray(new java.lang.String[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l75.k0 storage) {
        super(storage, p43.e.f351765p, "LocalGameReport", dm.q7.f239425g);
        kotlin.jvm.internal.o.g(storage, "storage");
        this.f351767d = storage;
        this.f351768e = new p43.g(storage);
    }
}
