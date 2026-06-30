package zg5;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static zg5.c f472838a;

    /* renamed from: b, reason: collision with root package name */
    public static zg5.c f472839b;

    public static void a(android.app.Activity activity, android.view.View view) {
        android.view.View decorView = activity.getWindow().getDecorView();
        f472838a = zg5.c.a(activity, null, 1200L, true);
        f472839b = zg5.c.a(activity, null, 1200L, true);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        android.graphics.Rect rect = new android.graphics.Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i17 = rect.top;
        int l17 = ((androidx.appcompat.app.AppCompatActivity) activity).getSupportActionBar().l();
        f472838a.setHeight((iArr[1] - i17) - l17);
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        f472839b.setHeight((displayMetrics.heightPixels - iArr[1]) - view.getHeight());
        f472838a.showAtLocation(decorView, 48, 0, i17 + l17);
        f472839b.showAtLocation(decorView, 80, 0, 0);
    }

    public static void b() {
        zg5.c cVar = f472838a;
        if (cVar != null) {
            cVar.setAnimationStyle(-1);
            f472838a.dismiss();
            f472838a = null;
        }
        zg5.c cVar2 = f472839b;
        if (cVar2 != null) {
            cVar2.setAnimationStyle(-1);
            f472839b.dismiss();
            f472839b = null;
        }
    }
}
