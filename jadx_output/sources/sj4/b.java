package sj4;

/* loaded from: classes9.dex */
public final class b implements sj4.c {

    /* renamed from: a, reason: collision with root package name */
    public static final sj4.b f408824a = new sj4.b();

    @Override // sj4.c
    public void a(pj4.j0 reqInfo, yz5.a callback) {
        kotlin.jvm.internal.o.g(reqInfo, "reqInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        byte[] decode = android.util.Base64.decode(reqInfo.f355142g, 0);
        pj4.s1 s1Var = new pj4.s1();
        s1Var.parseFrom(decode);
        long j17 = s1Var.f355286d;
        java.lang.String str = s1Var.f355287e;
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ml(j17, str, 106, true, false, "", new sj4.a(j17, str, callback, reqInfo));
    }
}
