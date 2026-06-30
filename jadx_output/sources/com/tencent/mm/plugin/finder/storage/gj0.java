package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes8.dex */
public final class gj0 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f126843e = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.finder.storage.fj0.f126781z, "FinderSnsKeyWordsJumpConfig")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f126844d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj0(l75.k0 db6) {
        super(db6, com.tencent.mm.plugin.finder.storage.fj0.f126781z, "FinderSnsKeyWordsJumpConfig", dm.d5.f236360o);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = com.tencent.mm.plugin.finder.storage.fj0.f126781z;
        this.f126844d = db6;
    }

    public final void y0(com.tencent.mm.plugin.finder.storage.fj0 info) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i("Finder.FinderSnsKeyWordsStorage", "insert, localId:" + info.field_localId);
        java.lang.String str = "select *, rowid from FinderSnsKeyWordsJumpConfig where localId = '" + info.field_localId + "' ";
        l75.k0 k0Var = this.f126844d;
        android.database.Cursor B = k0Var.B(str, null);
        try {
            boolean z17 = B.getCount() > 0;
            vz5.b.a(B, null);
            if (!z17) {
                com.tencent.mars.xlog.Log.i("Finder.FinderSnsKeyWordsStorage", "insert, result:" + super.insertNotify(info, false));
                return;
            }
            android.content.ContentValues convertTo = info.convertTo();
            convertTo.remove("rowid");
            com.tencent.mars.xlog.Log.i("Finder.FinderSnsKeyWordsStorage", "update, result:" + k0Var.p("FinderSnsKeyWordsJumpConfig", convertTo, "localId=?", new java.lang.String[]{"" + info.field_localId}));
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(B, th6);
                throw th7;
            }
        }
    }

    public final int z0(boolean z17) {
        int delete = this.f126844d.delete("FinderSnsKeyWordsJumpConfig", null, null);
        if (z17) {
            doNotify("SnsHotWord remove data");
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderSnsKeyWordsStorage", "removeAllInfo , result:" + delete);
        return delete;
    }
}
