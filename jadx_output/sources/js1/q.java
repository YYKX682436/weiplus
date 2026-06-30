package js1;

/* loaded from: classes4.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final js1.q f301497d = new js1.q();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.e("MicroMsg.TransferRequestTokenManager", "[transferRequest] h5Auth onGetTokenFailed");
        js1.s.f301502d = false;
        js1.s sVar = js1.s.f301499a;
        com.tencent.mars.xlog.Log.i("MicroMsg.TransferRequestTokenManager", "clearToken");
        ((ku5.t0) ku5.t0.f312615d).h(js1.n.f301493d, "TransferRequestTokenManager");
        java.util.Iterator it = js1.s.f301501c.iterator();
        while (it.hasNext()) {
            ((js1.a) it.next()).a(null, false);
        }
        js1.s.f301501c.clear();
    }
}
