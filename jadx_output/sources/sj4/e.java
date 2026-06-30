package sj4;

/* loaded from: classes9.dex */
public final class e implements sj4.c {

    /* renamed from: a, reason: collision with root package name */
    public static final sj4.e f408834a = new sj4.e();

    @Override // sj4.c
    public void a(pj4.j0 reqInfo, yz5.a callback) {
        kotlin.jvm.internal.o.g(reqInfo, "reqInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        byte[] decode = android.util.Base64.decode(reqInfo.f355142g, 0);
        pj4.x1 x1Var = new pj4.x1();
        x1Var.parseFrom(decode);
        java.lang.String str = x1Var.f355332f;
        ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Ri(str, new sj4.d(str, x1Var, reqInfo, callback));
    }
}
