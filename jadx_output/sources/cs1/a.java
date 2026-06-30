package cs1;

/* loaded from: classes3.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(android.content.Context context, int i17, java.lang.String userName, java.lang.String title) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(title, "title");
        com.tencent.mars.xlog.Log.i("BizTimeLineMultiTaskCoverCreator", "createPageTitle, type = " + i17);
        if (i17 != 8) {
            if (i17 != 10) {
                return title;
            }
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            java.lang.String e17 = com.tencent.mm.pluginsdk.ui.span.c0.e(title);
            kotlin.jvm.internal.o.d(e17);
            return e17;
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e18 = c01.a2.e(userName);
        java.lang.String string = context.getString(com.tencent.mm.R.string.amn);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{e18}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }
}
