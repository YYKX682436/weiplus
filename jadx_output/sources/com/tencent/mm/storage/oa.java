package com.tencent.mm.storage;

/* loaded from: classes9.dex */
public class oa extends dm.da implements com.tencent.mm.storage.o5 {
    public static final l75.e0 D = new l75.e0();
    public com.tencent.mm.storage.a9 C;

    public oa() {
    }

    @Override // com.tencent.mm.storage.a9
    public boolean U(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.storage.oa oaVar = (com.tencent.mm.storage.oa) obj;
        com.tencent.mm.storage.a9 a9Var = this.C;
        if (a9Var != null) {
            return a9Var.U(oaVar != null ? oaVar.C : null);
        }
        return oaVar != null && this.field_msgId == oaVar.field_msgId && this.field_foldCount == oaVar.field_foldCount && this.field_showStatus == oaVar.field_showStatus && (((str = this.field_title) != null && str.equals(oaVar.field_title)) || (this.field_title == null && oaVar.field_title == null));
    }

    @Override // dm.da, l75.f0
    public l75.e0 getDBInfo() {
        return D;
    }

    public oa(long j17) {
        this.field_msgId = j17;
    }
}
