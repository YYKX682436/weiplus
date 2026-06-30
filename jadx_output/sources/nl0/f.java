package nl0;

/* loaded from: classes8.dex */
public final class f extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f338166e = {l75.n0.getCreateSQLs(dm.l9.f238312t, "PredictResultCache"), "ALTER TABLE PredictResultCache ADD COLUMN score float"};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f338167d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l75.k0 db6) {
        super(db6, dm.l9.f238312t, "PredictResultCache", f338166e);
        kotlin.jvm.internal.o.g(db6, "db");
        this.f338167d = db6;
    }
}
