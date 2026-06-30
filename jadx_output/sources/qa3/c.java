package qa3;

/* loaded from: classes15.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa3.d f361040e;

    public c(java.lang.String str, qa3.d dVar) {
        this.f361039d = str;
        this.f361040e = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.liteapp.storage.WxaLiteAppInfo y17 = com.tencent.mm.plugin.lite.logic.g1.s().y(this.f361039d, null);
        qa3.d dVar = this.f361040e;
        java.lang.String str = dVar.f361036b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("null ");
        sb6.append(y17 != null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (y17 != null) {
            com.tencent.mm.plugin.lite.logic.g1.s().L(y17);
        }
        qa3.o.f361051a.c(dVar.f361035a, true, "");
    }
}
