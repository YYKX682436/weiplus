package xy2;

/* loaded from: classes2.dex */
public abstract class c {
    public static final int a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "<this>");
        return context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
    }

    public static android.content.Intent b(android.content.Context context, java.lang.Class activityCls, android.content.Intent intent, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            intent = null;
        }
        if ((i17 & 8) != 0) {
            z17 = true;
        }
        if ((i17 & 16) != 0) {
            z18 = false;
        }
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(activityCls, "activityCls");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        c(context, intent);
        android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        android.content.Intent intent3 = z17 ? intent : null;
        if (intent3 != null) {
            intent3.addFlags(67108864);
        }
        android.content.Intent intent4 = z18 ? intent : null;
        if (intent4 != null) {
            intent4.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        }
        intent.setClass(context, activityCls);
        return intent;
    }

    public static final void c(android.content.Context context, android.content.Intent newIntent) {
        kotlin.jvm.internal.o.g(context, "<this>");
        kotlin.jvm.internal.o.g(newIntent, "newIntent");
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            java.lang.String stringExtra = activity.getIntent().getStringExtra("KEY_FINDER_USERNAME_SELF");
            if (stringExtra == null) {
                stringExtra = "";
            }
            com.tencent.mars.xlog.Log.i("FinderContext", "fillMultiUserToIntent: activity=" + context + ", intentUsername=" + stringExtra);
            if (stringExtra.length() > 0) {
                newIntent.putExtra("KEY_FINDER_USERNAME_SELF", stringExtra);
            }
        }
    }

    public static final r45.qt2 d(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "<this>");
        return ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).wi(context);
    }

    public static final java.lang.String e(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "<this>");
        return ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(context);
    }

    public static final java.lang.String f(r45.qt2 qt2Var) {
        java.lang.String string = qt2Var != null ? qt2Var.getString(18) : null;
        if (!(string == null || string.length() == 0)) {
            return string;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return e(context);
    }
}
