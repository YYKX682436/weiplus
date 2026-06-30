package hx;

/* loaded from: classes11.dex */
public final class h extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "setFeedsAdRequestInfo";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        com.tencent.wechat.mm.biz.b1 b17;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("adFetchControl");
        java.lang.String optString2 = data.optString("adFetchInfo");
        ((vw.b) ((rv.p2) i95.n0.c(rv.p2.class))).getClass();
        boolean z17 = false;
        if (yw.h1.f466332a.n() && (b17 = yw.q3.f466437a.b()) != null) {
            z17 = b17.f(optString, optString2);
        }
        com.tencent.mars.xlog.Log.i("MBJsApiSetFeedsAdRequestInfo", "setAdRequestInfo ret:" + z17);
        if (z17) {
            s().invoke(k());
        } else {
            s().invoke(i(new lc3.z(1, "fail")));
        }
    }
}
