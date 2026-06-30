package rq2;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f398848b;

    /* renamed from: c, reason: collision with root package name */
    public static int f398849c;

    /* renamed from: d, reason: collision with root package name */
    public static int f398850d;

    /* renamed from: f, reason: collision with root package name */
    public static int f398852f;

    /* renamed from: g, reason: collision with root package name */
    public static long f398853g;

    /* renamed from: i, reason: collision with root package name */
    public static long f398855i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f398856j;

    /* renamed from: a, reason: collision with root package name */
    public static final rq2.o f398847a = new rq2.o();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f398851e = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final rq2.e f398854h = new rq2.e();

    /* renamed from: k, reason: collision with root package name */
    public static final jz5.g f398857k = jz5.h.b(rq2.m.f398843d);

    public final r45.jp1 a(int i17, int i18, int i19, int i27, int i28, int i29, com.tencent.mm.protobuf.g gVar, r45.kd1 kd1Var) {
        r45.jp1 jp1Var = new r45.jp1();
        jp1Var.set(0, java.lang.Integer.valueOf(i17));
        jp1Var.set(2, java.lang.Integer.valueOf(i18));
        jp1Var.set(1, java.lang.Integer.valueOf(i19));
        jp1Var.set(4, java.lang.Integer.valueOf(i28));
        jp1Var.set(5, java.lang.Integer.valueOf(i27));
        jp1Var.set(6, java.lang.Integer.valueOf(i29));
        jp1Var.set(8, gVar);
        jp1Var.set(9, kd1Var);
        jp1Var.set(7, java.lang.Long.valueOf(f398855i));
        com.tencent.mars.xlog.Log.i("FinderLiveNewSquareStateReporter", "createEnterStateEvent: scene=" + jp1Var.getInteger(0) + ", enterType=" + i18 + ",  enter_reddot_type=" + jp1Var.getInteger(4) + ", enter_scene=" + jp1Var.getInteger(6) + ", loading_time_ms=" + jp1Var.getInteger(1) + ", from_click_loading_time_ms=" + jp1Var.getInteger(5) + ", last_buffer=" + jp1Var.getByteString(8) + " event_time=" + jp1Var.getLong(7));
        return jp1Var;
    }

    public final boolean b(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getGlobalVisibleRect(rect);
        int i17 = iArr[1];
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!z17) {
            if (i19 >= i18) {
                i18 = i19;
            }
            i19 = i18;
        }
        return i17 < i19 && !rect.isEmpty();
    }

    public final void c(rq2.b ilogType, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(ilogType, "ilogType");
        kotlinx.coroutines.l.d((kotlinx.coroutines.y0) ((jz5.n) f398857k).getValue(), kotlinx.coroutines.q1.f310570c, null, new rq2.n(ilogType, i17, z17, null), 2, null);
    }

    public final void d(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderLiveNewSquareStateReporter", "tickLoading loadingType: " + i17 + " loadingShown: " + z17);
        f398851e.put(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        if (z17) {
            f398850d = i17;
            f398849c++;
        }
    }

    public final void e(int i17, long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderLiveNewSquareStateReporter", "tickLoadingCostTime loadingType: " + i17 + " costTime: " + j17 + " loadingShown: " + z17);
        f398851e.remove(java.lang.Integer.valueOf(i17));
        if (z17) {
            f398853g = c01.id.c();
            f398852f = (int) j17;
        }
    }
}
