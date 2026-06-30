package com.tencent.mm.plugin.finder.report;

/* loaded from: classes11.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f125116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f125117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.mmdata.rpt.FinderChatEnterStruct f125118f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.report.n f125119g;

    public m(java.lang.String str, long j17, com.tencent.mm.autogen.mmdata.rpt.FinderChatEnterStruct finderChatEnterStruct, com.tencent.mm.plugin.finder.report.n nVar) {
        this.f125116d = str;
        this.f125117e = j17;
        this.f125118f = finderChatEnterStruct;
        this.f125119g = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List<com.tencent.mm.storage.f9> list;
        long j17;
        final com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        final java.lang.String str = this.f125116d;
        final long j18 = this.f125117e;
        final java.lang.String X8 = cj6.X8(str);
        if (cj6.Da(X8)) {
            final int i17 = Integer.MAX_VALUE;
            final int i18 = Integer.MAX_VALUE;
            list = ot0.c3.l().e("getAllMessageAfterCreateTime", new yz5.a() { // from class: com.tencent.mm.storage.g9$$j3
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return new java.util.ArrayList(ot0.z2.f348822a.m(com.tencent.mm.storage.g9.this.f193989r, X8, str, j18, i17));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$k3
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    com.tencent.mm.storage.g9 g9Var = com.tencent.mm.storage.g9.this;
                    g9Var.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    android.database.Cursor f17 = g9Var.f193989r.f("Select * From " + X8 + " Where " + g9Var.Z8(str) + " AND createTime > ? and not ( type = 10000 and isSend != 2 )  Order By createTime Desc Limit " + i18 + ";", new java.lang.String[]{"" + j18}, 2);
                    while (f17.moveToNext()) {
                        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                        f9Var.convertFrom(f17);
                        arrayList.add(f9Var);
                    }
                    f17.close();
                    return new java.util.ArrayList(arrayList);
                }
            });
        } else if (cj6.Pb(X8)) {
            list = ot0.z2.f348822a.m(cj6.f193989r, X8, str, j18, Integer.MAX_VALUE);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.database.Cursor f17 = cj6.f193989r.f("Select * From " + X8 + " Where " + cj6.Z8(str) + " AND createTime > ? and not ( type = 10000 and isSend != 2 )  Order By createTime Desc Limit 2147483647;", new java.lang.String[]{"" + j18}, 2);
            while (f17.moveToNext()) {
                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                f9Var.convertFrom(f17);
                arrayList.add(f9Var);
            }
            f17.close();
            list = arrayList;
        }
        long j19 = 0;
        if (list != null) {
            j17 = 0;
            for (com.tencent.mm.storage.f9 f9Var2 : list) {
                if (f9Var2.getType() != 570425393 && f9Var2.getType() != 10000 && f9Var2.getType() != 10001 && f9Var2.getType() != 10002) {
                    int A0 = f9Var2.A0();
                    if (A0 == 0) {
                        j19++;
                    } else if (A0 == 1) {
                        j17++;
                    }
                }
            }
        } else {
            j17 = 0;
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderChatEnterStruct finderChatEnterStruct = this.f125118f;
        finderChatEnterStruct.f56601n = j19;
        finderChatEnterStruct.f56602o = j17;
        finderChatEnterStruct.k();
        com.tencent.mm.plugin.finder.report.p pVar = com.tencent.mm.plugin.finder.report.p.f125222a;
        this.f125119g.getClass();
        com.tencent.mm.plugin.finder.report.p.a(pVar, "RecordFinderChatEnter", finderChatEnterStruct);
    }
}
