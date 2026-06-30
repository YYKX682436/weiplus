package fp;

/* loaded from: classes5.dex */
public abstract class a {
    public static int a(android.app.Activity activity) {
        if (activity instanceof androidx.appcompat.app.AppCompatActivity) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) activity;
            if (appCompatActivity.getSupportActionBar() != null) {
                return appCompatActivity.getSupportActionBar().l();
            }
        } else if (activity.getActionBar() != null) {
            return activity.getActionBar().getHeight();
        }
        return c(activity);
    }

    public static int b(android.app.Activity activity, int i17) {
        int height;
        if (activity == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ActionBarCompatHelper", "[getActionBarHeight] activity is null!");
            return i17;
        }
        if (activity instanceof androidx.appcompat.app.AppCompatActivity) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) activity;
            if (appCompatActivity.getSupportActionBar() != null) {
                height = appCompatActivity.getSupportActionBar().l();
            }
            height = 0;
        } else {
            if (activity.getActionBar() != null) {
                height = activity.getActionBar().getHeight();
            }
            height = 0;
        }
        if (height <= 0) {
            height = i17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ActionBarCompatHelper", "[getActionBarHeight] real:%s defaultVal:%s", java.lang.Integer.valueOf(height), java.lang.Integer.valueOf(i17));
        return height;
    }

    public static int c(android.content.Context context) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (context.getTheme().resolveAttribute(com.tencent.mm.R.attr.f478062m, typedValue, true) || context.getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true)) {
            return android.util.TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }
}
