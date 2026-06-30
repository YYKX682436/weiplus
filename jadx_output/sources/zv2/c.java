package zv2;

/* loaded from: classes4.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.app.Activity activity, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        java.lang.String stringExtra = activity.getIntent().getStringExtra("key_context_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21875, Ri, stringExtra, 74, java.lang.Integer.valueOf(z17 ? 1 : 0), java.lang.String.valueOf(java.lang.System.currentTimeMillis()), "post_good_icon", z18 ? "{\"if_have_good\":1}" : "{\"if_have_good\":2}");
    }
}
