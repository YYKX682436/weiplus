package nc5;

/* loaded from: classes10.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nc5.o f336201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336202e;

    public h(nc5.o oVar, java.lang.String str) {
        this.f336201d = oVar;
        this.f336202e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xg3.m0 u17 = c01.d9.b().u();
        nc5.o oVar = this.f336201d;
        int N3 = ((com.tencent.mm.storage.g9) u17).N3(oVar.f336214b);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportExpose >> ");
        sb6.append(N3);
        sb6.append(", ");
        java.lang.String sugTextList = this.f336202e;
        sb6.append(sugTextList);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryQueryHeaderUI", sb6.toString());
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).getClass();
        java.lang.String userName = oVar.f336214b;
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(sugTextList, "sugTextList");
        f65.o.f259913b = userName;
        f65.o.f259915d = oVar.f336215c;
        f65.o.f259916e = sugTextList;
        f65.o.f259919h = N3;
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Bi(1);
    }
}
