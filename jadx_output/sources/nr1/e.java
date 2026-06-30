package nr1;

/* loaded from: classes11.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr1.f f339138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f339139e;

    public e(nr1.f fVar, java.lang.String str) {
        this.f339138d = fVar;
        this.f339139e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nr1.f fVar = this.f339138d;
        l75.k0 k0Var = fVar.f339148d;
        java.lang.String str = this.f339139e;
        android.database.Cursor B = k0Var.B("SELECT *, rowid \nFROM BizPhotoFansConversation \nWHERE selfBiz = ?", new java.lang.String[]{str});
        while (B.moveToNext()) {
            try {
                hr1.e eVar = new hr1.e();
                eVar.convertFrom(B);
                int i17 = eVar.field_unReadCount;
                eVar.field_unReadCount = 0;
                eVar.field_readStatus = 1;
                if (i17 != 0) {
                    fVar.update(eVar.systemRowid, eVar, false);
                }
                fVar.L0(eVar);
            } finally {
            }
        }
        vz5.b.a(B, null);
        hr1.e eVar2 = new hr1.e();
        eVar2.field_selfBiz = str;
        fVar.doNotify("", 8, eVar2);
    }
}
