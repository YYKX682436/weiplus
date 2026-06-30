package fp;

/* loaded from: classes5.dex */
public abstract class w extends com.tencent.mm.sdk.platformtools.d2 {
    public static final void l(android.app.Activity activity) {
        if (activity == null) {
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        com.tencent.mm.sdk.platformtools.d2.f192518b = (activity.getResources().getDisplayMetrics().heightPixels - fp.a.a(activity)) - rect.top;
    }

    public static final void m(android.content.Context context, int i17) {
        int d17 = com.tencent.mm.sdk.platformtools.d2.d(context, 0);
        int c17 = com.tencent.mm.sdk.platformtools.d2.c(context);
        if (i17 < d17) {
            i17 = d17;
        }
        if (i17 <= c17) {
            c17 = i17;
        }
        com.tencent.mm.sdk.platformtools.d2.k(context, c17);
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putInt("com.tencent.mm.compatible.util.keybord.height", c17);
    }
}
