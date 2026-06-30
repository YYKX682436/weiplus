package o25;

/* loaded from: classes5.dex */
public abstract class n1 {
    public static int a(android.content.Context context) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        int complexToDimensionPixelSize = context.getTheme().resolveAttribute(com.tencent.mm.R.attr.f478062m, typedValue, true) ? android.util.TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()) : 0;
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return complexToDimensionPixelSize <= 0 ? displayMetrics.widthPixels > displayMetrics.heightPixels ? context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479622ax) : context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479623ay) : complexToDimensionPixelSize;
    }

    public static void b(androidx.appcompat.app.AppCompatActivity appCompatActivity, android.view.View view, int i17) {
        if (appCompatActivity == null || appCompatActivity.getWindow() == null || appCompatActivity.getWindow().getDecorView() == null) {
            return;
        }
        appCompatActivity.getWindow().getDecorView().post(new o25.m1(appCompatActivity, i17, view));
    }

    public static void c(com.tencent.mm.ui.MMActivity mMActivity) {
        mMActivity.getWindow().getDecorView().post(new o25.k1(new java.lang.ref.WeakReference(mMActivity)));
    }

    public static void d(com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, android.view.View view) {
        if (mMFragmentActivity == null || mMFragmentActivity.getWindow() == null || mMFragmentActivity.getWindow().getDecorView() == null) {
            return;
        }
        mMFragmentActivity.getWindow().getDecorView().post(new o25.l1(mMFragmentActivity, view));
    }

    public static void e(android.app.Activity activity) {
        try {
            if (activity instanceof androidx.appcompat.app.AppCompatActivity) {
                ((androidx.appcompat.app.AppCompatActivity) activity).supportRequestWindowFeature(109);
            } else {
                activity.requestWindowFeature(9);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FullScreenHelper", e17, null, new java.lang.Object[0]);
        }
    }

    public static void f(com.tencent.mm.ui.MMActivity mMActivity) {
        try {
            mMActivity.supportRequestWindowFeature(109);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FullScreenHelper", e17, null, new java.lang.Object[0]);
        }
    }
}
