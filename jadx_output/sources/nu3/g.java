package nu3;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final nu3.g f340216a = new nu3.g();

    public final java.lang.String a(dw3.o0 launchType) {
        kotlin.jvm.internal.o.g(launchType, "launchType");
        int ordinal = launchType.ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "" : "go_miaojian_template_previewpage" : "go_miaojian_video_editpage" : "go_miaojian_more_template_page" : "go_miaojian_template_selectpage";
    }

    public final void b(android.content.Context context, dw3.o0 launchType) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(launchType, "launchType");
        if (context instanceof android.app.Activity) {
            dy1.a.b((android.app.Activity) context, "view_clk", kz5.c1.k(new jz5.l("view_id", a(launchType)), new jz5.l("sns_publish_sessionid", ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).wi())), kz5.b0.c(29594), false, true);
        }
    }

    public final void c(android.content.Context context, dw3.o0 launchType) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(launchType, "launchType");
        if (context instanceof android.app.Activity) {
            dy1.a.b((android.app.Activity) context, "view_exp", kz5.c1.k(new jz5.l("view_id", a(launchType)), new jz5.l("sns_publish_sessionid", ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).wi())), kz5.b0.c(29594), false, true);
        }
    }
}
