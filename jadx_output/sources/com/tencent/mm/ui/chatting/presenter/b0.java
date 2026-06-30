package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.h0 f202120d;

    public b0(com.tencent.mm.ui.chatting.presenter.h0 h0Var) {
        this.f202120d = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        com.tencent.mm.api.IEmojiInfo Di;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        int i17 = 0;
        android.database.Cursor k17 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).k1(this.f202120d.f202236e, 0, -1);
        long currentTimeMillis3 = java.lang.System.currentTimeMillis() - currentTimeMillis2;
        if (k17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EmojiHistoryListPresenter", "loadData cursor is null!! dbQueryCost:%dms", java.lang.Long.valueOf(currentTimeMillis3));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiHistoryListPresenter", "[firstLoad][perf] dbQuery cost:%dms", java.lang.Long.valueOf(currentTimeMillis3));
        com.tencent.mm.ui.chatting.presenter.h0 h0Var = this.f202120d;
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i18 = 0;
            while (k17.moveToNext() && i18 < h0Var.f202239h * 50) {
                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                f9Var.convertFrom(k17);
                java.lang.String j18 = f9Var.j();
                kotlin.jvm.internal.o.d(j18);
                java.lang.String[] strArr = new java.lang.String[1];
                strArr[i17] = ":";
                java.util.List f07 = r26.n0.f0(j18, strArr, false, 0, 6, null);
                if (f07.size() > 3 && (Di = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Di((java.lang.String) f07.get(3))) != null && (kotlin.jvm.internal.o.b(h0Var.f202240i, "") || h0Var.d(Di, h0Var.f202240i))) {
                    zb5.c cVar = new zb5.c();
                    cVar.f471308a = (com.tencent.mm.storage.emotion.EmojiInfo) Di;
                    cVar.f471309b = f9Var;
                    cVar.f471310c = i17;
                    j17 = currentTimeMillis3;
                    java.lang.String c17 = com.tencent.mm.ui.gridviewheaders.a.e().c(new java.util.Date(f9Var.getCreateTime()), h0Var.f202235d);
                    if (!kotlin.jvm.internal.o.b(c17, h0Var.f202241m)) {
                        zb5.c cVar2 = new zb5.c();
                        cVar2.f471310c = 1;
                        kotlin.jvm.internal.o.d(c17);
                        cVar2.f471311d = c17;
                        arrayList.add(cVar2);
                        h0Var.f202241m = c17;
                    }
                    arrayList.add(cVar);
                    i18++;
                    currentTimeMillis3 = j17;
                    i17 = 0;
                }
                j17 = currentTimeMillis3;
                currentTimeMillis3 = j17;
                i17 = 0;
            }
            long j19 = currentTimeMillis3;
            if (i18 != 0 && i18 < h0Var.f202239h * 50) {
                zb5.c cVar3 = new zb5.c();
                cVar3.f471310c = 2;
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiHistoryListPresenter", "[firstLoad] :: no more data found in DB");
                arrayList.add(cVar3);
            }
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.chatting.presenter.a0(h0Var, arrayList));
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiHistoryListPresenter", "[firstLoad][perf][final] total cost:%dms, dbQuery:%dms, process+notifyUI:%dms, items:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Long.valueOf(j19), java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - currentTimeMillis) - j19), java.lang.Integer.valueOf(i18));
            try {
                h0Var.f202242n = k17.getLong(k17.getColumnIndex("msgId"));
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.EmojiHistoryListPresenter", "loadData cursor is null!!");
            }
            vz5.b.a(k17, null);
        } finally {
        }
    }
}
