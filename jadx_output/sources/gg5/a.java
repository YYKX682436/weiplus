package gg5;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final gg5.a f271787a = new gg5.a();

    public final java.lang.String a(android.content.Context context, com.tencent.mm.storage.l4 conv) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(conv, "conv");
        if (conv.t0() % 4096 > 0) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.f492462gq2);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
        java.lang.String h17 = conv.h1();
        ((qv.o) u2Var).getClass();
        if (r01.z.g(h17) || conv.t0() >= 16777216) {
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.f492461gq1);
            kotlin.jvm.internal.o.d(string2);
            return string2;
        }
        java.lang.String string3 = context.getString(com.tencent.mm.R.string.f492464gq4);
        kotlin.jvm.internal.o.d(string3);
        return string3;
    }
}
