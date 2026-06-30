package n10;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n10.m f334042a;

    public k(n10.m mVar) {
        this.f334042a = mVar;
    }

    public void a(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.e("MBJsApiHandleTextInput", "errorCode:" + str + " errorMessage:" + str2 + " detailObject:" + obj);
        n10.m mVar = this.f334042a;
        mVar.s().invoke(mVar.i(lc3.x.f317936c));
    }

    public void b(lc3.a0 a0Var) {
        n10.m mVar = this.f334042a;
        yz5.l s17 = mVar.s();
        if (a0Var == null) {
            a0Var = new lc3.a0();
        }
        mVar.m(a0Var);
        s17.invoke(a0Var);
    }
}
