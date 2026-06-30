package hr1;

/* loaded from: classes11.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr1.i f283347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283348e;

    public h(hr1.i iVar, java.lang.String str) {
        this.f283347d = iVar;
        this.f283348e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hr1.i iVar = this.f283347d;
        l75.k0 k0Var = iVar.f283352d;
        java.lang.String str = this.f283348e;
        android.database.Cursor B = k0Var.B("SELECT *, rowid \nFROM BizFansConversation \nWHERE selfBiz = ?", new java.lang.String[]{str});
        while (B.moveToNext()) {
            try {
                hr1.e eVar = new hr1.e();
                eVar.convertFrom(B);
                int i17 = eVar.field_unReadCount;
                eVar.field_unReadCount = 0;
                eVar.field_readStatus = 1;
                if (i17 != 0) {
                    iVar.update(eVar.systemRowid, eVar, false);
                }
                iVar.L0(eVar);
            } finally {
            }
        }
        vz5.b.a(B, null);
        hr1.e eVar2 = new hr1.e();
        eVar2.field_selfBiz = str;
        iVar.doNotify("", 8, eVar2);
    }
}
