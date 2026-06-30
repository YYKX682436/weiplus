package oq3;

/* loaded from: classes12.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f347375d;

    public b(com.tencent.mm.storage.f9 f9Var) {
        this.f347375d = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.storage.f9 f9Var = this.f347375d;
        if (f9Var.J2()) {
            fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
            nVar.requireAccountInitialized();
            sq3.b bVar = nVar.A;
            java.lang.String msgItemId = f9Var.I0() + "_1";
            bVar.getClass();
            kotlin.jvm.internal.o.g(msgItemId, "msgItemId");
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("MsgItemId", msgItemId);
            sq3.a aVar = (sq3.a) bVar.T6(contentValues, kotlin.jvm.internal.i0.a(sq3.a.class));
            if (aVar != null) {
                aVar.a1(50);
                com.tencent.mm.sdk.storage.mvvm.MvvmStorage.W6(bVar, aVar, false, false, 6, null);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.C2CPreDownloadPLC", "c2c pre download: msg exposure, update priority, msgId:" + f9Var.getMsgId() + ", msgSvrId:" + f9Var.I0());
        }
    }
}
