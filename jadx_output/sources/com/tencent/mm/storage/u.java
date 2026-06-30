package com.tencent.mm.storage;

/* loaded from: classes4.dex */
public final class u extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f195342e = {l75.n0.getCreateSQLs(com.tencent.mm.storage.r.f195252r, "BizAdInfo")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f195343f = {"CREATE  INDEX IF NOT EXISTS biz_exposeTime_index ON BizAdInfo ( exposeTime ) "};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f195344d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(l75.k0 db6) {
        super(db6, com.tencent.mm.storage.r.f195252r, "BizAdInfo", f195343f);
        kotlin.jvm.internal.o.g(db6, "db");
        this.f195344d = db6;
    }

    public final void y0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizAdInfoStorage", "deleteTable start");
        this.f195344d.A("BizAdInfo", "delete from BizAdInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizAdInfoStorage", "deleteTable end");
    }

    public final boolean z0(com.tencent.mm.storage.r info) {
        kotlin.jvm.internal.o.g(info, "info");
        if (get(info, new java.lang.String[0])) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAdInfoStorage", "insertOrUpdate exist");
            return false;
        }
        boolean insertNotify = super.insertNotify(info, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizAdInfoStorage", "insertOrUpdate ret=" + insertNotify);
        pm0.v.K(null, new com.tencent.mm.storage.s(this));
        return insertNotify;
    }
}
