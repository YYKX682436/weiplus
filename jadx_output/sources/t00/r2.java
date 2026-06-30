package t00;

/* loaded from: classes9.dex */
public final class r2 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.f414326g;
    }

    @Override // t00.r0
    public boolean b() {
        return true;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        c00.m3 m3Var = (c00.m3) i95.n0.c(c00.m3.class);
        t00.q2 q2Var = new t00.q2(callback);
        ((j00.d2) m3Var).getClass();
        if (!(context instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "handleJsApiGiveGift context is not activity");
            q2Var.a();
            return;
        }
        java.lang.String optString = data.optString("payPackage");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "handleJsApiGiveGift payPackage is empty");
            q2Var.a();
        } else {
            ((com.tencent.mm.feature.wxpay.m) ((mh0.p) i95.n0.c(mh0.p.class))).wi((android.app.Activity) context, optString, new j00.c2(q2Var));
        }
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }
}
