package hx;

/* loaded from: classes11.dex */
public final class g extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "setAdRequestInfo";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        com.tencent.wechat.mm.biz.b1 b17;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String adFetchControl = data.optString("adFetchControl");
        java.lang.String adFetchInfo = data.optString("adFetchInfo");
        ((vw.b) ((rv.p2) i95.n0.c(rv.p2.class))).getClass();
        kotlin.jvm.internal.o.g(adFetchControl, "adFetchControl");
        kotlin.jvm.internal.o.g(adFetchInfo, "adFetchInfo");
        boolean z17 = false;
        if (yw.h1.f466332a.n() && (b17 = yw.q3.f466437a.b()) != null) {
            z17 = b17.e(adFetchControl, adFetchInfo);
        }
        com.tencent.mars.xlog.Log.i("MBJsApiSetAdRequestInfo", "setAdRequestInfo ret:" + z17);
        if (z17) {
            s().invoke(k());
        } else {
            s().invoke(i(new lc3.z(1, "fail")));
        }
    }
}
