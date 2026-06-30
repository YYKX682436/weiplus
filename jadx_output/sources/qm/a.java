package qm;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.Bitmap f364616a;

    public static android.graphics.Bitmap a(android.content.Context context, android.graphics.Bitmap bitmap) {
        if (context == null || bitmap == null) {
            return null;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(android.R.dimen.notification_large_icon_height) - context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a5x);
        return com.tencent.mm.sdk.platformtools.x.s0(com.tencent.mm.sdk.platformtools.x.S(bitmap, dimensionPixelSize, dimensionPixelSize, false, false), false, context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a5w));
    }

    public final android.graphics.Bitmap b(java.lang.String str, com.tencent.mm.vfs.r6 r6Var) {
        try {
            if (r6Var == null) {
                return ((com.tencent.mm.feature.performance.r4) ((uq3.h) i95.n0.c(uq3.h.class))).Vi(str, 9);
            }
            if (r6Var.m()) {
                return com.tencent.mm.sdk.platformtools.x.L(r6Var.toString(), 96, 96);
            }
            return null;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NotificationAvatar", "loadAvatar err: " + th6);
            return null;
        }
    }
}
