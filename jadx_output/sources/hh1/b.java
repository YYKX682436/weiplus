package hh1;

/* loaded from: classes.dex */
public final class b implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hh1.c f281453d;

    public b(hh1.c cVar) {
        this.f281453d = cVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String errMsg = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        hh1.c cVar = this.f281453d;
        if (intValue == 0) {
            cVar.s().invoke(cVar.k());
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiPostMessageToWeApp", "errCode: " + intValue + ", errMsg: " + errMsg);
            cVar.s().invoke(cVar.j(lc3.x.f317936c, errMsg));
        }
        return jz5.f0.f302826a;
    }
}
