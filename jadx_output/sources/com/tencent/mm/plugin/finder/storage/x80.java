package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public class x80 extends dm.d4 {
    public static final com.tencent.mm.plugin.finder.storage.w80 N = new com.tencent.mm.plugin.finder.storage.w80(null);
    public static final l75.e0 P = dm.d4.initAutoDBInfo(com.tencent.mm.plugin.finder.storage.x80.class);
    public com.tencent.mm.plugin.finder.storage.FinderItem L;
    public ni0.h M;

    @Override // dm.d4, l75.f0
    public l75.e0 getDBInfo() {
        return P;
    }

    public final r45.qb4 getPostInfo() {
        return t0().getPostInfo();
    }

    public final com.tencent.mm.plugin.finder.storage.FinderItem t0() {
        if (u0()) {
            return new com.tencent.mm.plugin.finder.storage.FinderItem();
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.L;
        if (finderItem != null) {
            return finderItem;
        }
        com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
        r45.ec1 field_finderItem = this.field_finderItem;
        kotlin.jvm.internal.o.f(field_finderItem, "field_finderItem");
        com.tencent.mm.plugin.finder.storage.FinderItem g17 = h90Var.g(field_finderItem, this.field_localId);
        g17.field_watermarkFlag = this.field_watermarkFlag;
        this.L = g17;
        return g17;
    }

    public final boolean u0() {
        return this.field_objectType == 7 && this.M != null;
    }

    public final java.lang.String v0() {
        return "localId:" + this.field_localId + ", objectId:" + pm0.v.u(this.field_objectId) + ", version:" + this.field_version + ", markDeleted:" + this.field_markDeleted;
    }

    public final void w0() {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.L;
        if (finderItem != null) {
            this.field_finderItem = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.h(finderItem);
        }
        java.lang.String[] strArr = cu2.n.f222421n;
        this.field_dbversion = cu2.n.f222422o;
    }
}
