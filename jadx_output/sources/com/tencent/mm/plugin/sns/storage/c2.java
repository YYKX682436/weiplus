package com.tencent.mm.plugin.sns.storage;

/* loaded from: classes4.dex */
public class c2 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f165951e = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.sns.storage.b2.f165940t, "snsDraft")};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f165952f = " (snsDraft.extFlag & 2 != 0 ) ";

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f165953g = " order by snsDraft.timestamp desc";

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f165954d;

    public c2(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.sns.storage.b2.f165940t, "snsDraft", null);
        this.f165954d = k0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsDraftStorage", "createDraftStorage " + k0Var + "  " + java.lang.Thread.currentThread().getId());
    }

    public com.tencent.mm.plugin.sns.storage.b2 D0(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("readDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
        com.tencent.mm.plugin.sns.storage.b2 b2Var = new com.tencent.mm.plugin.sns.storage.b2();
        android.database.Cursor f17 = this.f165954d.f("select *,rowid from snsDraft  where snsDraft.key='" + str + "' limit 1", null, 2);
        if (!f17.moveToFirst()) {
            f17.close();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
            return null;
        }
        b2Var.convertFrom(f17);
        f17.close();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        byte[] bArr = b2Var.field_draft;
        objArr[1] = bArr != null ? java.lang.Integer.valueOf(bArr.length) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsDraftStorage", "readDraft: %s, %s", objArr);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
        return b2Var;
    }

    public void J0(java.lang.String str, byte[] bArr, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("writeDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        objArr[1] = bArr == null ? null : java.lang.Integer.valueOf(bArr.length);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsDraftStorage", "writeDraft: %s, %s", objArr);
        com.tencent.mm.plugin.sns.storage.b2 b2Var = new com.tencent.mm.plugin.sns.storage.b2();
        b2Var.field_key = str;
        b2Var.field_timestamp = java.lang.System.currentTimeMillis();
        b2Var.field_draft = bArr;
        b2Var.field_extFlag = i17;
        super.replace(b2Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
    }

    public void y0(boolean z17) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkOldDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
        if (z17) {
            gm0.j1.i();
            str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_SNS_OPEN_UPLOAD_NEWTEXT_DRAFT_STRING_SYNC, null);
        } else {
            gm0.j1.i();
            str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_SNS_OPEN_UPLOAD_DRAFT_MEDIA_STRING_SYNC, null);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            byte[] c17 = ot5.e.c(str);
            if (!com.tencent.mm.sdk.platformtools.t8.M0(c17)) {
                if (z17) {
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SNS_OPEN_UPLOAD_NEWTEXT_DRAFT_STRING_SYNC, "");
                    J0("draft_text", c17, 0);
                } else {
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SNS_OPEN_UPLOAD_DRAFT_MEDIA_STRING_SYNC, "");
                    J0("draft_normal", c17, 0);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkOldDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
    }

    public void z0(int i17) {
        com.tencent.mm.plugin.sns.storage.b2 b2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genSentDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
        android.database.Cursor f17 = this.f165954d.f("select *,rowid from snsDraft  where " + f165952f + f165953g + " limit 1", null, 2);
        try {
            if (f17.moveToFirst()) {
                b2Var = new com.tencent.mm.plugin.sns.storage.b2();
                b2Var.convertFrom(f17);
            } else {
                b2Var = null;
            }
            f17.close();
            if (b2Var != null) {
                J0("draft_sent_" + i17, b2Var.field_draft, 0);
                J0(b2Var.field_key, null, 0);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genSentDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
        } catch (java.lang.Throwable th6) {
            f17.close();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genSentDraft", "com.tencent.mm.plugin.sns.storage.SnsDraftStorage");
            throw th6;
        }
    }
}
