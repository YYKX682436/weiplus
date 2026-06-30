package qk;

/* loaded from: classes5.dex */
public abstract class w9 {
    public static int a(android.content.Context context) {
        int i17;
        ((com.tencent.mm.feature.emoji.ib) ((com.tencent.mm.feature.emoji.api.d7) i95.n0.c(com.tencent.mm.feature.emoji.api.d7.class))).getClass();
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480376w7);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479727dj);
        boolean z17 = false;
        boolean z18 = context.getResources().getConfiguration().orientation == 1;
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (fp.h.c(24)) {
                z17 = activity.isInMultiWindowMode();
            }
        }
        android.graphics.Point point = new android.graphics.Point();
        ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        if (!z18 || z17) {
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480371w2);
            com.tencent.mars.xlog.Log.i("MicroMsg.SmileyPanelFeatureService", "getRecommendHeight: %s, %s, %s, %s", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(dimensionPixelOffset3), java.lang.Integer.valueOf(point.y));
            int i18 = point.y;
            if (i18 <= 0 || dimensionPixelOffset3 <= (i17 = i18 / 2)) {
                return dimensionPixelOffset3;
            }
        } else {
            i17 = (point.y / 2) - dimensionPixelOffset2;
            com.tencent.mars.xlog.Log.i("MicroMsg.SmileyPanelFeatureService", "getRecommendHeight: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(dimensionPixelOffset));
            if (i17 <= 0 || i17 >= dimensionPixelOffset) {
                return dimensionPixelOffset;
            }
        }
        return i17;
    }

    public static com.tencent.mm.api.SmileyPanel b(android.content.Context context) {
        ((com.tencent.mm.feature.emoji.ib) ((com.tencent.mm.feature.emoji.api.d7) i95.n0.c(com.tencent.mm.feature.emoji.api.d7.class))).getClass();
        return new com.tencent.mm.view.SmileyPanelImpl(context, false);
    }

    public static com.tencent.mm.api.SmileyPanel c(android.content.Context context, boolean z17) {
        ((com.tencent.mm.feature.emoji.ib) ((com.tencent.mm.feature.emoji.api.d7) i95.n0.c(com.tencent.mm.feature.emoji.api.d7.class))).getClass();
        return new com.tencent.mm.view.SmileyPanelImpl(context, z17);
    }

    public static qk.v9 d() {
        ((com.tencent.mm.feature.emoji.ib) ((com.tencent.mm.feature.emoji.api.d7) i95.n0.c(com.tencent.mm.feature.emoji.api.d7.class))).getClass();
        return new com.tencent.mm.pluginsdk.ui.chat.w9();
    }
}
