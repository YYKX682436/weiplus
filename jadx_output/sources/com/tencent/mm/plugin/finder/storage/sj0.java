package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes10.dex */
public final class sj0 extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f127555d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f127556e;

    static {
        int i17 = dm.x4.f241026a3;
        f127555d = new java.lang.String[]{"CREATE INDEX IF NOT EXISTS " + dm.pd.f239303c3 + " ON WxIdentityMsg ( id, flag, type, userVersion)", "CREATE INDEX IF NOT EXISTS Finder_Mention_Id_Create_Time ON FinderIdentityMsg(createTime, id)", "CREATE INDEX IF NOT EXISTS Finder_Mention_Type ON WxIdentityMsg(type)", "CREATE INDEX IF NOT EXISTS Finder_Object_Id ON WxIdentityMsg(objectId)", "CREATE INDEX IF NOT EXISTS Finder_Comment_Id ON WxIdentityMsg(commentId)"};
        f127556e = new java.lang.String[]{l75.n0.getCreateSQLs(dm.pd.f239302b3, "WxIdentityMsg")};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sj0(l75.k0 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "db"
            kotlin.jvm.internal.o.g(r4, r0)
            l75.e0 r0 = dm.pd.f239302b3
            l75.e0 r0 = dm.pd.f239302b3
            int r1 = dm.x4.f241026a3
            java.lang.String r1 = "WxIdentityMsg"
            java.lang.String[] r2 = com.tencent.mm.plugin.finder.storage.sj0.f127555d
            r3.<init>(r4, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.storage.sj0.<init>(l75.k0):void");
    }
}
