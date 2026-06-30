package hx;

/* loaded from: classes7.dex */
public final class c implements com.tencent.wechat.mm.biz.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hx.e f285599a;

    public c(hx.e eVar) {
        this.f285599a = eVar;
    }

    @Override // com.tencent.wechat.mm.biz.y
    public final void complete(boolean z17) {
        com.tencent.mars.xlog.Log.i("MBJsApiManulResort", " onWechatIntoActive requestAdFetchingWithResortAsync =" + z17);
        hx.e eVar = this.f285599a;
        yz5.l s17 = eVar.s();
        lc3.a0 a0Var = new lc3.a0();
        a0Var.put("result", z17);
        eVar.m(a0Var);
        s17.invoke(a0Var);
    }
}
