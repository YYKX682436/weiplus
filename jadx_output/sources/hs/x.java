package hs;

@j95.b
/* loaded from: classes4.dex */
public final class x extends i95.w implements qk.s7 {
    public java.lang.String wi(qk.k9 parseSource, java.lang.String tag) {
        kotlin.jvm.internal.o.g(parseSource, "parseSource");
        kotlin.jvm.internal.o.g(tag, "tag");
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        com.tencent.mm.vfs.r6 h07 = lp0.b.h0("LivePhoto");
        int ordinal = parseSource.ordinal();
        java.lang.String str = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? "" : "sns_mj_template_" : "sns_publish_ui_" : "gallery_";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(h07.o());
        sb6.append('/');
        sb6.append(str);
        byte[] bytes = (tag + java.lang.System.currentTimeMillis()).getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        return sb6.toString();
    }
}
