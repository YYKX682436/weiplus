package hk2;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final hk2.l f281907a = new hk2.l();

    public final jz5.l a(android.content.Context context, dk2.zf msg, boolean z17, android.text.TextPaint paint) {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(paint, "paint");
        zl2.r4 r4Var = zl2.r4.f473950a;
        java.lang.String D0 = zl2.r4.D0(r4Var, msg.a(), msg.k(), false, 4, null);
        if (z17) {
            r45.xn1 r17 = msg.r();
            D0 = com.tencent.mm.plugin.finder.assist.w2.s((r17 == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) r17.getCustom(0)) == null) ? null : finderContact2.getUsername(), D0);
            kotlin.jvm.internal.o.f(D0, "makeAnonymousNameIfIsMySelf(...)");
        }
        java.lang.String str2 = D0;
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.CharSequence nf6 = c61.yb.nf((c61.yb) c17, context, paint, str2, 0, 8, null);
        r45.xn1 r18 = msg.r();
        if (!(r18 != null && r18.getInteger(7) == 3) || z17) {
            str = "";
        } else {
            we2.i iVar = we2.o.f445236i;
            str = "\u2005";
        }
        java.lang.String str3 = ((java.lang.Object) nf6) + str + (we2.o.f445236i.c(context, msg) ? "\u2005" : "");
        i95.m c18 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        c61.yb ybVar = (c61.yb) c18;
        r45.xn1 C = msg.C();
        java.lang.CharSequence nf7 = c61.yb.nf(ybVar, context, paint, zl2.r4.D0(r4Var, (C == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) C.getCustom(0)) == null) ? null : finderContact.getUsername(), r4Var.X(msg), false, 4, null), 0, 8, null);
        java.lang.Object D = msg.D();
        r45.xj1 xj1Var = D instanceof r45.xj1 ? (r45.xj1) D : null;
        java.lang.String string = (xj1Var != null ? xj1Var.getInteger(8) : 0) == 2 ? context.getString(com.tencent.mm.R.string.ouk, str3, nf7) : context.getString(com.tencent.mm.R.string.efj, str3, nf7);
        kotlin.jvm.internal.o.d(string);
        return new jz5.l(nf6, string);
    }
}
