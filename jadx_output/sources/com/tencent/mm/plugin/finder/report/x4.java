package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class x4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.x4 f125435a = new com.tencent.mm.plugin.finder.report.x4();

    public final void a(java.lang.String str, com.tencent.mm.plugin.finder.feed.ys cardFeed, int i17, long j17, r45.qt2 qt2Var) {
        kotlin.jvm.internal.o.g(cardFeed, "cardFeed");
        r45.ww2 ww2Var = cardFeed.f111192d;
        java.util.Iterator it = cardFeed.f111194f.iterator();
        java.lang.String str2 = "";
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                r26.n0.Z(str2, "|");
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[11];
                objArr[0] = qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null;
                objArr[1] = pm0.v.u(cardFeed.f111192d.getLong(14));
                objArr[2] = str;
                objArr[3] = str2;
                objArr[4] = ww2Var.getString(13);
                objArr[5] = java.lang.Integer.valueOf(cardFeed.f111194f.size());
                objArr[6] = qt2Var != null ? qt2Var.getString(0) : null;
                objArr[7] = qt2Var != null ? qt2Var.getString(1) : null;
                objArr[8] = qt2Var != null ? qt2Var.getString(2) : null;
                objArr[9] = java.lang.Long.valueOf(j17);
                objArr[10] = java.lang.Integer.valueOf(i17);
                g0Var.d(21086, objArr);
                return;
            }
            java.lang.Object next = it.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) next;
            java.lang.String u17 = pm0.v.u(baseFinderFeed.getItemId());
            if (baseFinderFeed.h() == 4 && i18 == 0) {
                str2 = str2 + u17 + ';' + i18 + ";1|";
            } else {
                str2 = str2 + u17 + ';' + i18 + ";0|";
            }
            i18 = i19;
        }
    }

    public final void b(java.lang.String title, long j17, int i17, long j18, r45.qt2 qt2Var, int i18) {
        kotlin.jvm.internal.o.g(title, "title");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[9];
        objArr[0] = qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null;
        objArr[1] = pm0.v.u(j17);
        objArr[2] = title;
        objArr[3] = java.lang.Integer.valueOf(i17);
        objArr[4] = pm0.v.u(j18);
        objArr[5] = qt2Var != null ? qt2Var.getString(0) : null;
        objArr[6] = qt2Var != null ? qt2Var.getString(1) : null;
        objArr[7] = qt2Var != null ? qt2Var.getString(2) : null;
        objArr[8] = java.lang.Integer.valueOf(i18);
        g0Var.d(21087, objArr);
    }
}
