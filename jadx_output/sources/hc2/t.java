package hc2;

/* loaded from: classes10.dex */
public abstract class t {
    public static final int a(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "<this>");
        return i65.a.b(context, (i17 * 15) + 1);
    }

    public static final java.lang.String b(android.content.Context context, int i17) {
        if (i17 == 2) {
            return c01.z1.l();
        }
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        ya2.g gVar = ya2.h.f460484a;
        kotlin.jvm.internal.o.d(context);
        ya2.b2 b17 = gVar.b(xy2.c.e(context));
        return b17 != null ? b17.w0() : "";
    }

    public static final java.lang.String c(android.content.Context context, int i17) {
        if (i17 == 2) {
            java.lang.String r17 = c01.z1.r();
            kotlin.jvm.internal.o.d(r17);
            return r17;
        }
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        return xy2.c.e(context);
    }

    public static final boolean d(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "<this>");
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity == null) {
            return false;
        }
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("finder_username");
        boolean booleanExtra = mMActivity.getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false);
        androidx.appcompat.app.AppCompatActivity context2 = mMActivity.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        return kotlin.jvm.internal.o.b(stringExtra, xy2.c.e(context2)) && booleanExtra;
    }
}
