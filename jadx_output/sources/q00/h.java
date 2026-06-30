package q00;

/* loaded from: classes9.dex */
public final class h implements ip0.c {

    /* renamed from: d, reason: collision with root package name */
    public final bw5.c7 f359257d;

    public h(bw5.c7 ecsImg) {
        kotlin.jvm.internal.o.g(ecsImg, "ecsImg");
        this.f359257d = ecsImg;
    }

    public final java.lang.String a() {
        boolean C = com.tencent.mm.ui.bk.C();
        bw5.c7 c7Var = this.f359257d;
        if (C) {
            kotlin.jvm.internal.o.f(c7Var.f25959m[4] ? c7Var.f25956g : "", "getImgUrlDarkmode(...)");
            if (!r26.n0.N(r0)) {
                java.lang.String str = c7Var.f25959m[4] ? c7Var.f25956g : "";
                kotlin.jvm.internal.o.d(str);
                return str;
            }
        }
        java.lang.String b17 = c7Var.b();
        kotlin.jvm.internal.o.d(b17);
        return b17;
    }

    @Override // ip0.c
    public java.lang.String n() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(a());
        sb6.append("::");
        bw5.c7 c7Var = this.f359257d;
        sb6.append(c7Var.f25955f);
        sb6.append("::");
        sb6.append(c7Var.f25954e);
        java.lang.String sb7 = sb6.toString();
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
        byte[] bytes = sb7.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        kotlin.jvm.internal.o.d(digest);
        return kz5.z.a0(digest, "", null, null, 0, null, q00.g.f359256d, 30, null);
    }
}
