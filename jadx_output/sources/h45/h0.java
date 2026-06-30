package h45;

/* loaded from: classes9.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f278948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f278949e;

    public h0(java.lang.String str, yz5.a aVar) {
        this.f278948d = str;
        this.f278949e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addOutTimeCheck task:");
        java.lang.String str = this.f278948d;
        sb6.append(str);
        sb6.append(" size:");
        java.util.Map map = h45.i0.f278950a;
        java.util.Map map2 = h45.i0.f278950a;
        sb6.append(map2.size());
        sb6.append(", out time happen");
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPayUtil", sb6.toString());
        map2.remove(str);
        this.f278949e.invoke();
    }
}
