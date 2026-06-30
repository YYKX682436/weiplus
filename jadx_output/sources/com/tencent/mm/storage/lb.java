package com.tencent.mm.storage;

/* loaded from: classes4.dex */
public class lb extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f195097e = {l75.n0.getCreateSQLs(com.tencent.mm.storage.kb.f195079r, "VoiceTransText")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f195098d;

    public lb(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.storage.kb.f195079r, "VoiceTransText", null);
        this.f195098d = k0Var;
    }

    @Override // l75.n0, l75.g0
    public boolean insert(l75.f0 f0Var) {
        com.tencent.mm.storage.kb kbVar = (com.tencent.mm.storage.kb) f0Var;
        if (kbVar == null) {
            return false;
        }
        return this.f195098d.m("VoiceTransText", "msgId", kbVar.convertTo()) >= 0;
    }

    public com.tencent.mm.storage.kb y0(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        com.tencent.mm.storage.kb kbVar = new com.tencent.mm.storage.kb();
        android.database.Cursor D = this.f195098d.D("VoiceTransText", null, "cmsgId=?", new java.lang.String[]{"" + str}, null, null, null, 2);
        if (D.moveToFirst()) {
            kbVar.convertFrom(D);
        }
        D.close();
        return kbVar;
    }
}
