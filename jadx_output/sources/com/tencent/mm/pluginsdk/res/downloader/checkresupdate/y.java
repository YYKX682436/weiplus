package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes12.dex */
public abstract class y {
    public static java.util.List a(int i17) {
        java.util.List list;
        com.tencent.mm.pluginsdk.res.downloader.model.l0 l0Var = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a;
        d95.b0 b0Var = !l0Var.f189686e ? null : l0Var.f189682a.f189699d;
        if (b0Var == null) {
            return java.util.Collections.emptyList();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("urlKey");
        java.util.Locale locale = java.util.Locale.US;
        sb6.append(java.lang.String.format(locale, " like '%d.%%.data'", java.lang.Integer.valueOf(i17)));
        sb6.append(" and groupId1=");
        sb6.append(java.lang.String.format(locale, "'%s'", "CheckResUpdate"));
        try {
            android.database.Cursor D = b0Var.D("ResDownloaderRecordTable", null, sb6.toString(), null, null, null, null, 2);
            if (D != null) {
                try {
                    if (!D.isClosed()) {
                        if (D.moveToFirst()) {
                            java.util.LinkedList linkedList = new java.util.LinkedList();
                            do {
                                com.tencent.mm.pluginsdk.res.downloader.model.n0 n0Var = new com.tencent.mm.pluginsdk.res.downloader.model.n0();
                                n0Var.convertFrom(D);
                                linkedList.add(n0Var);
                            } while (D.moveToNext());
                            list = linkedList;
                        } else {
                            list = java.util.Collections.emptyList();
                        }
                        D.close();
                        return list;
                    }
                } finally {
                }
            }
            java.util.List emptyList = java.util.Collections.emptyList();
            if (D != null) {
                D.close();
            }
            return emptyList;
        } catch (com.tencent.wcdb.CursorWindowAllocationException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CheckResUpdateRecordLogic", "queryAllWithType(%d) get exception:%s", java.lang.Integer.valueOf(i17), e17);
            return java.util.Collections.emptyList();
        }
    }
}
