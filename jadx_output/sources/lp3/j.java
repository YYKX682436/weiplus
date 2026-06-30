package lp3;

/* loaded from: classes5.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f320289d;

    public j(lp3.l lVar, java.lang.String str) {
        this.f320289d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.d1(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492975ii5));
        f9Var.setType(10000);
        f9Var.j1(0);
        f9Var.u1(this.f320289d);
        f9Var.e1(java.lang.System.currentTimeMillis());
        com.tencent.mars.xlog.Log.i("MicroMsg.PatMsgExtension", "insert pat failed msg %d", java.lang.Long.valueOf(c01.w9.x(f9Var)));
    }
}
