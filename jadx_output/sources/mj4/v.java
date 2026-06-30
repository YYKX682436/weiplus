package mj4;

/* loaded from: classes11.dex */
public final class v extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f327081f;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f327082d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f327083e;

    static {
        mj4.h.f327064a.getClass();
        f327081f = new java.lang.String[]{l75.n0.getCreateSQLs(mj4.g.f327062b, "TextStatus")};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(l75.k0 db6) {
        super(db6, mj4.g.f327062b, "TextStatus", rj4.a.f396196p0);
        kotlin.jvm.internal.o.g(db6, "db");
        mj4.h.f327064a.getClass();
        this.f327082d = db6;
        this.f327083e = jz5.h.b(new mj4.q(this));
    }

    @Override // l75.n0, l75.g0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean insert(mj4.a item) {
        kotlin.jvm.internal.o.g(item, "item");
        boolean insertNotify = super.insertNotify(item, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusStorage", "insert:" + insertNotify + ", username=" + item.field_UserName + ", statusId=" + item.field_StatusID + ", iconId=" + item.field_IconID + ", " + item.field_CreateTime + ", pKey=" + item.getPrimaryKeyValue());
        if (insertNotify) {
            y0().put(item.field_UserName, item);
            doNotify(item.field_UserName);
        }
        return insertNotify;
    }

    @Override // l75.n0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean replace(mj4.a item) {
        kotlin.jvm.internal.o.g(item, "item");
        boolean replace = super.replace(item, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusStorage", "replace:" + replace + ", username=" + item.field_UserName + ", statusId=" + item.field_StatusID + ", iconId" + item.field_IconID + ", " + item.field_CreateTime);
        if (replace) {
            y0().put(item.field_UserName, item);
            doNotify(item.field_UserName);
        }
        return replace;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public boolean update(mj4.a item, java.lang.String... keys) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(keys, "keys");
        boolean updateNotify = super.updateNotify(item, false, (java.lang.String[]) java.util.Arrays.copyOf(keys, keys.length));
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusStorage", "update:" + updateNotify + ", " + item.field_UserName + ", statusId=" + item.field_StatusID + ", iconId=" + item.field_IconID + ", clusterId=" + new mj4.k(item).c() + ", pKey=" + item.getPrimaryKeyValue());
        if (updateNotify) {
            y0().put(item.field_UserName, item);
            doNotify(item.field_UserName);
        }
        return updateNotify;
    }

    @Override // l75.n0
    public boolean delete(l75.f0 f0Var, java.lang.String[] keys) {
        mj4.a item = (mj4.a) f0Var;
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(keys, "keys");
        boolean delete = super.delete(item, (java.lang.String[]) java.util.Arrays.copyOf(keys, keys.length));
        if (delete) {
            y0().remove(item.field_UserName);
            doNotify(item.field_UserName);
        }
        return delete;
    }

    @Override // l75.s0, l75.l0
    public void doNotify(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.TextStatus.TextStatusStorage", "db doNotify: " + str, new java.lang.Object[0]);
        super.doNotify(str);
    }

    @Override // l75.n0
    public boolean update(long j17, l75.f0 f0Var) {
        mj4.a item = (mj4.a) f0Var;
        kotlin.jvm.internal.o.g(item, "item");
        boolean update = super.update(j17, item);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusStorage", "update: " + update + ", " + item.field_UserName + ", statusId=" + item.field_StatusID + ", iconId=" + item.field_IconID + ", clusterId=" + new mj4.k(item).c());
        if (update) {
            y0().put(item.field_UserName, item);
            doNotify(item.field_UserName);
        }
        return update;
    }

    public final java.util.concurrent.ConcurrentHashMap y0() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f327083e).getValue();
    }

    public final mj4.h z0(java.lang.String str) {
        if (str == null) {
            return null;
        }
        mj4.a aVar = (mj4.a) y0().get(str);
        if (aVar != null && !aVar.t0()) {
            return new mj4.k(aVar);
        }
        y0().remove(str);
        return null;
    }
}
