package mj4;

/* loaded from: classes8.dex */
public final class p extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f327078e = {l75.n0.getCreateSQLs(mj4.o.D, "TextStatusReference")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f327079d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(l75.k0 db6) {
        super(db6, mj4.o.D, "TextStatusReference", null);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = mj4.o.D;
        this.f327079d = db6;
    }

    @Override // l75.n0
    public boolean delete(l75.f0 f0Var, java.lang.String[] keys) {
        mj4.o item = (mj4.o) f0Var;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(keys, "keys");
        boolean delete = super.delete(item, (java.lang.String[]) java.util.Arrays.copyOf(keys, keys.length));
        doNotify(item.field_UserName);
        return delete;
    }

    @Override // l75.s0, l75.l0
    public void doNotify(java.lang.String str) {
        super.doNotify(str, -1, null);
    }

    @Override // l75.n0
    public boolean replace(l75.f0 f0Var) {
        mj4.o item = (mj4.o) f0Var;
        kotlin.jvm.internal.o.g(item, "item");
        boolean replace = super.replace(item, false);
        doNotify(item.field_UserName);
        return replace;
    }

    @Override // l75.n0
    public boolean update(long j17, l75.f0 f0Var) {
        mj4.o item = (mj4.o) f0Var;
        kotlin.jvm.internal.o.g(item, "item");
        boolean update = super.update(j17, item);
        doNotify(item.field_UserName);
        return update;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public boolean insert(mj4.o item) {
        kotlin.jvm.internal.o.g(item, "item");
        boolean insertNotify = super.insertNotify(item, false);
        doNotify(item.field_UserName);
        return insertNotify;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean update(mj4.o item, java.lang.String... keys) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(keys, "keys");
        boolean updateNotify = super.updateNotify(item, false, (java.lang.String[]) java.util.Arrays.copyOf(keys, keys.length));
        doNotify(item.field_UserName);
        return updateNotify;
    }
}
