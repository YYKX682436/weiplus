package md3;

/* loaded from: classes.dex */
public final class c extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "addContact";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        android.app.Activity B0;
        kotlin.jvm.internal.o.g(data, "data");
        ((mq0.s0) ((mq0.d0) i95.n0.c(mq0.d0.class))).wi(mq0.g0.f330561g);
        int optInt = data.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        java.lang.String optString = data.optString(dm.i4.COL_USERNAME);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MBJsApiAddContact", "username nil");
            s().invoke(i(lc3.x.f317937d));
            return;
        }
        o25.a aVar = new o25.a();
        aVar.f342469g = true;
        o25.o1 o1Var = (o25.o1) i95.n0.c(o25.o1.class);
        lc3.e eVar = this.f317890a;
        r35.o3 wi6 = ((r35.p) o1Var).wi(eVar != null ? eVar.B0() : null, optString, optInt, new md3.b(this), aVar);
        lc3.e eVar2 = this.f317890a;
        if (eVar2 == null || (B0 = eVar2.B0()) == null) {
            return;
        }
        B0.runOnUiThread(new md3.a(wi6));
    }
}
