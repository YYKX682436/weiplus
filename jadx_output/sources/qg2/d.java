package qg2;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final qg2.d f362793a = new qg2.d();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f362794b = jz5.h.b(qg2.b.f362791d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f362795c = jz5.h.b(qg2.c.f362792d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f362796d = jz5.h.b(qg2.a.f362790d);

    /* renamed from: e, reason: collision with root package name */
    public static final int f362797e = com.tencent.thumbplayer.core.common.TPPixelFormat.TP_PIX_FMT_MEDIACODEC;

    /* renamed from: f, reason: collision with root package name */
    public static final int f362798f = 212;

    public static android.graphics.Rect c(qg2.d dVar, ig2.n params, android.graphics.Point point, int i17, java.lang.Object obj) {
        int d17;
        int i18;
        int i19;
        if ((i17 & 2) != 0) {
            point = null;
        }
        dVar.getClass();
        kotlin.jvm.internal.o.g(params, "params");
        int g17 = point != null ? point.x : dVar.g();
        int f17 = point != null ? point.y : dVar.f();
        float f18 = params.f291408g;
        if (dVar.i(params)) {
            d17 = dVar.d(params.f291406e, params.f291407f);
            i18 = 0;
            i19 = (int) (g17 / f18);
        } else {
            float h17 = dVar.h(params, point);
            int i27 = (int) (params.f291406e * h17);
            i19 = (int) (h17 * params.f291407f);
            d17 = (f17 - i19) / 2;
            i18 = (g17 - i27) / 2;
            g17 = i27;
        }
        return new android.graphics.Rect(i18, d17, g17 + i18, i19 + d17);
    }

    public android.view.WindowManager.LayoutParams a() {
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        if (fp.h.c(26)) {
            layoutParams.type = 2038;
        } else {
            layoutParams.type = 2002;
        }
        layoutParams.format = 1;
        layoutParams.packageName = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageName();
        layoutParams.flags = 197416;
        layoutParams.gravity = 8388659;
        layoutParams.width = -1;
        layoutParams.height = -1;
        return layoutParams;
    }

    public final android.graphics.Rect b(int i17, int i18, boolean z17) {
        int g17;
        int i19;
        int i27;
        float f17 = i17;
        float f18 = i18;
        float f19 = (f17 * 1.0f) / f18;
        int i28 = 0;
        boolean z18 = f19 >= 1.0f;
        if (z17) {
            int f27 = f();
            int g18 = g();
            float f28 = f27;
            float f29 = g18;
            if (f28 / f29 >= f19) {
                g17 = (int) (f29 * f19);
                i19 = g18;
            } else {
                i19 = (int) (f28 / f19);
                g17 = f27;
            }
            i28 = (f27 - g17) / 2;
            i27 = (g18 - i19) / 2;
        } else {
            g17 = g();
            int f37 = f();
            if (z18) {
                i19 = (int) (g17 / f19);
                i27 = d(i17, i18);
            } else {
                float f38 = f() / f18;
                float g19 = g() / f17;
                if (g19 >= f38) {
                    f38 = g19;
                }
                int i29 = (int) (f17 * f38);
                i19 = (int) (f38 * f18);
                i28 = (g17 - i29) / 2;
                i27 = (f37 - i19) / 2;
                g17 = i29;
            }
        }
        return new android.graphics.Rect(i28, i27, g17 + i28, i19 + i27);
    }

    public final int d(int i17, int i18) {
        return ((float) i17) / ((float) i18) >= 1.7777778f ? com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, f362798f) : com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, f362797e);
    }

    public void e(android.view.View targetView, int[] pos) {
        kotlin.jvm.internal.o.g(targetView, "targetView");
        kotlin.jvm.internal.o.g(pos, "pos");
        int[] iArr = new int[2];
        targetView.getLocationOnScreen(iArr);
        pos[1] = iArr[1];
        pos[0] = iArr[0];
    }

    public final int f() {
        return ((java.lang.Number) ((jz5.n) f362796d).getValue()).intValue();
    }

    public final int g() {
        return ((java.lang.Number) ((jz5.n) f362795c).getValue()).intValue();
    }

    public final float h(ig2.n params, android.graphics.Point point) {
        kotlin.jvm.internal.o.g(params, "params");
        int g17 = point != null ? point.x : g();
        float f17 = (point != null ? point.y : f()) / params.f291407f;
        float f18 = g17 / params.f291406e;
        return f18 < f17 ? f17 : f18;
    }

    public final boolean i(ig2.n params) {
        kotlin.jvm.internal.o.g(params, "params");
        return params.f291408g >= 1.0f;
    }
}
