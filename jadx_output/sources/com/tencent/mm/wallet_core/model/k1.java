package com.tencent.mm.wallet_core.model;

/* loaded from: classes8.dex */
public final class k1 extends com.tencent.mm.sdk.platformtools.r2 {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f213928i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.m1 f213929j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.wallet_core.model.m1 m1Var, java.lang.String str, java.lang.String str2, int i17) {
        super(i17);
        this.f213929j = m1Var;
        this.f213928i = "SELECT * FROM " + str + " WHERE " + str2 + "=?;";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Boolean] */
    @Override // com.tencent.mm.sdk.platformtools.r2
    public java.lang.Object n(java.lang.Object obj) {
        try {
            android.database.Cursor f17 = this.f213929j.f213941d.f(this.f213928i, new java.lang.String[]{obj.toString()}, 2);
            try {
                if (!f17.moveToFirst()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletCacheStorage", "GET: " + obj.toString() + " => (NOT EXIST)");
                    java.lang.Object obj2 = com.tencent.mm.wallet_core.model.m1.f213940l;
                    f17.close();
                    return obj2;
                }
                int i17 = f17.getInt(1);
                java.lang.String string = f17.getString(2);
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletCacheStorage", "GET: " + obj.toString() + " => " + string);
                if (string != com.tencent.mm.wallet_core.model.m1.f213940l) {
                    try {
                    } catch (java.lang.Exception e17) {
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.e("MicroMsg.WalletCacheStorage", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                    }
                    switch (i17) {
                        case 1:
                            string = java.lang.Integer.valueOf(string);
                            break;
                        case 2:
                            string = java.lang.Long.valueOf(string);
                            break;
                        case 3:
                            f17.close();
                            return string;
                        case 4:
                            string = java.lang.Boolean.valueOf(string);
                            break;
                        case 5:
                            string = java.lang.Float.valueOf(string);
                            break;
                        case 6:
                            string = java.lang.Double.valueOf(string);
                            break;
                    }
                    f17.close();
                    return string;
                }
                string = null;
                f17.close();
                return string;
            } finally {
            }
        } catch (java.lang.RuntimeException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletCacheStorage", e18, "Failed to query UserInfo, id: " + obj, new java.lang.Object[0]);
            return null;
        }
    }
}
