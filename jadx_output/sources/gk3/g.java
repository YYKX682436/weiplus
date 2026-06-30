package gk3;

/* loaded from: classes8.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk3.m f272501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f272502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f272503f;

    public g(gk3.m mVar, int i17, boolean z17) {
        this.f272501d = mVar;
        this.f272502e = i17;
        this.f272503f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ek3.d dVar;
        android.graphics.Rect rect;
        gk3.m mVar = this.f272501d;
        ek3.d dVar2 = mVar.f272527c;
        android.graphics.Rect rect2 = dVar2 != null ? dVar2.f253607v : null;
        int i17 = this.f272502e;
        if (rect2 == null) {
            kk3.d dVar3 = mVar.f272529e;
            if (dVar3 != null) {
                dVar3.e(i17);
                return;
            }
            return;
        }
        kk3.d dVar4 = mVar.f272529e;
        boolean z17 = this.f272503f;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "initMaskView, exitAnim:%b, enterAnim:%b, way:%d", java.lang.Boolean.valueOf(z17), java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i17));
        if (mVar.c().getMaskView() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "doMaskAnimation, page mask view is null");
            if (dVar4 != null) {
                dVar4.e(i17);
                return;
            }
            return;
        }
        if (mVar.c().getContentView() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "doMaskAnimation, page content view is null");
            if (dVar4 != null) {
                dVar4.e(i17);
                return;
            }
            return;
        }
        if (mVar.c().a() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "doMaskAnimation, page root view is null");
            if (dVar4 != null) {
                dVar4.e(i17);
                return;
            }
            return;
        }
        if (mVar.f272530f) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "isExitAnimating now!");
            return;
        }
        android.graphics.Bitmap bitmap = mVar.c().getBitmap();
        if (bitmap == null || bitmap.isRecycled() || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "doMaskAnimation, page get bitmap is null");
            if (dVar4 != null) {
                dVar4.e(i17);
                return;
            }
            return;
        }
        ek3.e eVar = mVar.f272528d;
        if (eVar == null || eVar.getParent() == null) {
            ek3.e eVar2 = new ek3.e(mVar.c().getActivity(), bitmap);
            mVar.f272528d = eVar2;
            eVar2.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            android.view.ViewGroup a17 = mVar.c().a();
            if (a17 != null) {
                a17.addView(mVar.f272528d, a17.getChildCount());
            }
        }
        jk3.e eVar3 = mVar.f272526b;
        java.lang.String q17 = eVar3 != null ? ((jk3.b) eVar3).q(i17) : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(q17)) {
            if (i17 == 4) {
                jk3.e eVar4 = mVar.f272526b;
                if (eVar4 != null) {
                    q17 = eVar4.e();
                }
                q17 = null;
            } else {
                jk3.e eVar5 = mVar.f272526b;
                if (eVar5 != null) {
                    q17 = eVar5.getPosition();
                }
                q17 = null;
            }
        }
        if (q17 != null) {
            try {
                java.lang.String[] strArr = (java.lang.String[]) new r26.t(",").g(q17, 0).toArray(new java.lang.String[0]);
                if (strArr != null && strArr.length == 4 && (dVar = mVar.f272527c) != null) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(strArr[0]);
                    kotlin.jvm.internal.o.f(valueOf, "valueOf(...)");
                    int intValue = valueOf.intValue();
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(strArr[1]);
                    kotlin.jvm.internal.o.f(valueOf2, "valueOf(...)");
                    int intValue2 = valueOf2.intValue();
                    java.lang.Integer valueOf3 = java.lang.Integer.valueOf(strArr[2]);
                    kotlin.jvm.internal.o.f(valueOf3, "valueOf(...)");
                    int intValue3 = valueOf3.intValue();
                    java.lang.Integer valueOf4 = java.lang.Integer.valueOf(strArr[3]);
                    kotlin.jvm.internal.o.f(valueOf4, "valueOf(...)");
                    dVar.f253607v = new android.graphics.Rect(new android.graphics.Rect(intValue, intValue2, intValue3, valueOf4.intValue()));
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "refreshPosition, get pos failed, %s", e17.getMessage());
            }
        }
        android.view.View contentView = mVar.c().getContentView();
        if (contentView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/multitask/animation/swipeback/singlescene/MultiTaskSwipeBackAnimWrapperSS", "initMaskView", "(IZZLcom/tencent/mm/plugin/multitask/listener/OnMultiTaskFBTransformationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(contentView, "com/tencent/mm/plugin/multitask/animation/swipeback/singlescene/MultiTaskSwipeBackAnimWrapperSS", "initMaskView", "(IZZLcom/tencent/mm/plugin/multitask/listener/OnMultiTaskFBTransformationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!z17) {
            if (dVar4 != null) {
                ek3.e eVar6 = mVar.f272528d;
                dVar4.d(eVar6 != null ? eVar6.getContentBitmap() : null, true, i17);
            }
            mVar.e();
            return;
        }
        mVar.f272530f = true;
        int width = (int) (bitmap.getWidth() * 1.0f);
        int height = (int) (bitmap.getHeight() * 1.0f);
        android.graphics.Rect rect3 = new android.graphics.Rect(0, 0, width, height);
        ek3.d dVar5 = mVar.f272527c;
        if (dVar5 == null || (rect = dVar5.f253607v) == null) {
            rect = new android.graphics.Rect();
        }
        android.graphics.Rect rect4 = rect;
        float width2 = rect4.width() / width;
        oa5.b.b(mVar.f272528d).m((r8 - (rect3.left + (rect3.width() / 2))) * width2).n((r9 - (rect3.top + (rect3.height() / 2))) * width2).e(width2).f(width2).k(new gk3.h(width, height, width2, rect4, mVar, rect4.left + (rect4.width() / 2), rect4.top + (rect4.height() / 2))).h(new android.view.animation.AccelerateInterpolator()).p(new gk3.i(mVar, dVar4, bitmap, i17)).o(new gk3.k(mVar, dVar4, bitmap, i17)).g(250L).l();
    }
}
