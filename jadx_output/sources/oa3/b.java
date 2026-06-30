package oa3;

/* loaded from: classes9.dex */
public final class b extends bi4.o0 {
    @Override // bi4.o0
    public boolean d(android.content.Context context, android.os.Bundle bundle) {
        pj4.j0 j0Var;
        if (context == null || (j0Var = this.f21074b) == null || !kotlin.jvm.internal.o.b(j0Var.f355139d, "17")) {
            return false;
        }
        byte[] decode = android.util.Base64.decode(j0Var.f355142g, 0);
        ta3.a aVar = new ta3.a();
        aVar.parseFrom(decode);
        q80.d0 d0Var = new q80.d0();
        java.lang.String str = aVar.f416698f;
        if (str == null || str.length() == 0) {
            d0Var.f360664p = com.tencent.mm.R.anim.f477886ea;
            d0Var.f360665q = com.tencent.mm.R.anim.f477889ed;
        } else if (kotlin.jvm.internal.o.b(aVar.f416698f, "modal")) {
            d0Var.f360664p = com.tencent.mm.R.anim.f477876e0;
            d0Var.f360665q = com.tencent.mm.R.anim.f477877e1;
        } else if (kotlin.jvm.internal.o.b(aVar.f416698f, com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH)) {
            d0Var.f360664p = com.tencent.mm.R.anim.f477886ea;
            d0Var.f360665q = com.tencent.mm.R.anim.f477889ed;
        }
        d0Var.f360649a = aVar.f416696d;
        d0Var.f360650b = aVar.f416697e;
        d0Var.f360657i = aVar.f416699g ? 1 : 0;
        d0Var.f360652d = java.lang.Boolean.valueOf(aVar.f416701i);
        d0Var.f360658j = aVar.f416700h;
        d0Var.f360654f = aVar.f416702m;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppStatusProvider", "doJumpSource appId:" + d0Var.f360649a + " page:" + d0Var.f360650b);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(context, d0Var, new oa3.a());
        return true;
    }

    @Override // bi4.o0
    public boolean j() {
        return false;
    }

    @Override // bi4.o0
    public void n() {
    }
}
