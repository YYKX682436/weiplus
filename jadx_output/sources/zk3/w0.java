package zk3;

/* loaded from: classes8.dex */
public final class w0 extends pk3.h {

    /* renamed from: d, reason: collision with root package name */
    public bk3.a f473517d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.multitask.model.MultiTaskInfo f473518e;

    /* renamed from: f, reason: collision with root package name */
    public final int f473519f;

    /* renamed from: g, reason: collision with root package name */
    public final int f473520g;

    /* renamed from: h, reason: collision with root package name */
    public final zk3.o0 f473521h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f473519f = 10000;
        this.f473520g = 1000;
        this.f473521h = new zk3.o0(this, android.os.Looper.getMainLooper());
    }

    @Override // pk3.b
    public boolean M9(int i17) {
        return i17 == 1048576;
    }

    @Override // pk3.h
    public void O6(java.lang.Object obj) {
    }

    @Override // pk3.h
    public void P6(android.view.View view, com.tencent.mm.plugin.multitask.model.MultiTaskInfo info, r45.fr4 animateData, java.lang.Object obj) {
        android.view.View decorView;
        android.graphics.Bitmap V6;
        java.lang.String[] strArr;
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(animateData, "animateData");
        this.f473518e = info;
        zk3.p0 p0Var = new zk3.p0(obj, this);
        if (view == null) {
            kk3.d.f(p0Var, 0, 1, null);
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity == null || (decorView = mMActivity.getBodyView()) == null) {
            decorView = getActivity().getWindow().getDecorView();
        }
        int width = decorView.getWidth();
        int height = getActivity().getWindow().getDecorView().getHeight();
        int i17 = info.field_type;
        boolean z17 = i17 == 22 || i17 == 25;
        if (info.v0().getBoolean(7)) {
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.jvo);
            if (findViewById != null && z17 && findViewById.getVisibility() == 0) {
                info.v0().set(7, java.lang.Boolean.FALSE);
                V6 = V6(findViewById, width, height);
            } else {
                android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.jvd);
                if (findViewById2 != null) {
                    try {
                        int width2 = findViewById2.getWidth();
                        int height2 = findViewById2.getHeight();
                        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.RGB_565;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(config);
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(java.lang.Integer.valueOf(height2));
                        arrayList.add(java.lang.Integer.valueOf(width2));
                        java.lang.Object obj2 = new java.lang.Object();
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "getDefaultBitmap", "(Landroid/view/View;Z)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                        yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "getDefaultBitmap", "(Landroid/view/View;Z)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
                        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
                        android.graphics.drawable.Drawable background = findViewById2.getBackground();
                        if (background != null) {
                            background.draw(canvas);
                        }
                        V6 = createBitmap;
                    } catch (java.lang.Exception e17) {
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.e("MicroMsg.SnapShotMultiTaskUIC", "%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                    }
                }
                V6 = null;
            }
        } else {
            android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.jvo);
            V6 = (findViewById3 != null && z17 && findViewById3.getVisibility() == 0) ? V6(findViewById3, width, height) : al3.b.f5849a.a(com.tencent.mm.plugin.multitask.u0.f150506a.c(info), null);
        }
        if (V6 == null || V6.isRecycled() || V6.getWidth() == 0 || V6.getHeight() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SnapShotMultiTaskUIC", "startEnterAnim, page get bitmap is null");
            kk3.d.f(p0Var, 0, 1, null);
            return;
        }
        ((android.widget.ImageView) getRootView().findViewById(com.tencent.mm.R.id.ui9)).setImageBitmap(null);
        bk3.a aVar = this.f473517d;
        if (aVar != null && kotlin.jvm.internal.o.b(aVar.getParent(), getRootView())) {
            android.view.View rootView = getRootView();
            kotlin.jvm.internal.o.e(rootView, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((android.widget.FrameLayout) rootView).removeView(this.f473517d);
        }
        if (info.v0().getBoolean(7)) {
            android.graphics.Bitmap c17 = uj5.g.c(view.findViewById(com.tencent.mm.R.id.jvh));
            this.f473517d = new bk3.b(view.getContext(), V6, c17);
            if (c17 != null) {
                int width3 = (width - c17.getWidth()) / 2;
                int height3 = (height - c17.getHeight()) / 2;
                bk3.a aVar2 = this.f473517d;
                if (aVar2 != null) {
                    aVar2.setDefaultDstRect(new android.graphics.Rect(width3, height3, width3 + c17.getWidth(), c17.getHeight() + height3));
                }
            }
        } else {
            this.f473517d = new bk3.c(view.getContext(), V6);
        }
        bk3.a aVar3 = this.f473517d;
        if (aVar3 != null) {
            aVar3.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        android.view.View rootView2 = getRootView();
        kotlin.jvm.internal.o.e(rootView2, "null cannot be cast to non-null type android.widget.FrameLayout");
        ((android.widget.FrameLayout) rootView2).addView(this.f473517d, 0);
        try {
            java.lang.String string = animateData.getString(1);
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                kk3.d.f(p0Var, 0, 1, null);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnapShotMultiTaskUIC", "startEnterAnim, snapPos is null or empty");
                return;
            }
            if (string == null || (strArr = (java.lang.String[]) new r26.t(",").g(string, 0).toArray(new java.lang.String[0])) == null) {
                strArr = null;
            }
            if (strArr == null || strArr.length != 4) {
                kk3.d.f(p0Var, 0, 1, null);
                return;
            }
            android.view.View rootView3 = getRootView();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(rootView3, arrayList2.toArray(), "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "startEnterAnim", "(Landroid/view/View;Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;Lcom/tencent/mm/protocal/protobuf/MultiTaskAnimData;Lcom/tencent/mm/plugin/multitask/listener/OnMultiTaskFBTransformationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            rootView3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(rootView3, "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "startEnterAnim", "(Landroid/view/View;Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;Lcom/tencent/mm/protocal/protobuf/MultiTaskAnimData;Lcom/tencent/mm/plugin/multitask/listener/OnMultiTaskFBTransformationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.graphics.Rect rect = new android.graphics.Rect(0, 0, width, height);
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
            android.graphics.Rect rect2 = new android.graphics.Rect(intValue, intValue2, intValue3, valueOf4.intValue());
            int width4 = rect2.left + (rect2.width() / 2);
            int height4 = rect2.top + (rect2.height() / 2);
            float width5 = (rect.left + (rect.width() / 2)) - width4;
            float height5 = (rect.top + (rect.height() / 2)) - height4;
            float f17 = width;
            float width6 = rect2.width() / f17;
            bk3.a aVar4 = this.f473517d;
            if (aVar4 != null) {
                aVar4.setTranslationX(-width5);
            }
            bk3.a aVar5 = this.f473517d;
            if (aVar5 != null) {
                aVar5.setTranslationY(-height5);
            }
            bk3.a aVar6 = this.f473517d;
            if (aVar6 != null) {
                aVar6.setScaleX(width6);
            }
            bk3.a aVar7 = this.f473517d;
            if (aVar7 != null) {
                aVar7.setScaleY(width6);
            }
            if (!com.tencent.mm.ui.bk.U()) {
                bk3.a aVar8 = this.f473517d;
                if (aVar8 != null) {
                    aVar8.setDstRect(new android.graphics.Rect(0, 0, width, height));
                }
                bk3.a aVar9 = this.f473517d;
                if (aVar9 != null) {
                    aVar9.c(width, height);
                }
            }
            float f18 = height;
            float height6 = (((f18 * width6) - rect2.height()) / 2) * (1 / width6);
            bk3.a aVar10 = this.f473517d;
            if (aVar10 != null) {
                aVar10.a(0.0f, height6, f17, f18 - height6);
            }
            bk3.a aVar11 = this.f473517d;
            if (aVar11 != null) {
                float f19 = ek3.e.f253609u / width6;
                aVar11.b(0.0f, 0.0f, 0.0f, 0.0f, f19, f19, f19, f19);
            }
            oa5.b.b(this.f473517d).m(0.0f).n(0.0f).e(1.0f).f(1.0f).k(new zk3.t0(width, height, width6, rect2, this)).h(new android.view.animation.DecelerateInterpolator()).p(new zk3.u0(p0Var, V6)).o(new zk3.v0(p0Var)).g(250L).l();
        } catch (java.lang.Exception e18) {
            kk3.d.f(p0Var, 0, 1, null);
            com.tencent.mars.xlog.Log.e("MicroMsg.SnapShotMultiTaskUIC", "get pos value failed, %s", e18.getMessage());
        }
    }

    @Override // pk3.h
    public void R6() {
    }

    @Override // pk3.h
    public void S6() {
        W6();
        X6();
        android.content.Context context = getRootView().getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC.class)).T6(true);
    }

    @Override // pk3.h
    public void T6() {
    }

    public final android.graphics.Bitmap V6(android.view.View view, int i17, int i18) {
        float f17 = i17;
        float f18 = i18;
        float f19 = f17 / f18;
        float width = view.getWidth() / view.getHeight();
        float height = f19 > width ? (view.getHeight() / f18) * f17 : view.getWidth();
        float height2 = f19 > width ? view.getHeight() : (view.getWidth() / f17) * f18;
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.RGB_565;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf((int) height2));
        arrayList.add(java.lang.Integer.valueOf((int) height));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "getVideoCoverBitmap", "(Landroid/view/View;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "getVideoCoverBitmap", "(Landroid/view/View;II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.drawColor(-16777216);
        canvas.translate(f19 > width ? (height - view.getWidth()) / 2.0f : 0.0f, f19 <= width ? (height2 - view.getHeight()) / 2.0f : 0.0f);
        view.draw(canvas);
        return createBitmap;
    }

    public void W6() {
        boolean z17 = getRootView().getVisibility() == 8;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnapShotMultiTaskUIC", "hideSnapshotUIC, isInVisible:%b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        android.view.View rootView = getRootView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(rootView, arrayList.toArray(), "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "hideSnapshotUIC", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rootView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(rootView, "com/tencent/mm/plugin/multitask/ui/uic/SnapShotMultiTaskUIC", "hideSnapshotUIC", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View rootView2 = getRootView();
        al3.b bVar = al3.b.f5849a;
        rootView2.setTranslationX(0.0f - al3.b.f5850b);
        ((android.widget.ImageView) getRootView().findViewById(com.tencent.mm.R.id.ui9)).setImageBitmap(null);
        bk3.a aVar = this.f473517d;
        if (aVar != null) {
            if (kotlin.jvm.internal.o.b(aVar != null ? aVar.getParent() : null, getRootView())) {
                bk3.a aVar2 = this.f473517d;
                android.view.ViewParent parent = aVar2 != null ? aVar2.getParent() : null;
                kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) parent).removeView(this.f473517d);
                this.f473517d = null;
            }
        }
    }

    public void X6() {
        ((android.widget.ProgressBar) getRootView().findViewById(com.tencent.mm.R.id.ui_)).setVisibility(8);
        int i17 = this.f473520g;
        zk3.o0 o0Var = this.f473521h;
        o0Var.removeMessages(i17);
        o0Var.removeMessages(0);
    }

    public boolean Y6() {
        return getRootView().getVisibility() == 0;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bxl;
    }

    @Override // pk3.b
    public pk3.a i0() {
        return pk3.a.f356436f;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onKeyUp(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRestoreInstanceState(android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onSaveInstanceState(android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onStartActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleUnFocused() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f473519f = 10000;
        this.f473520g = 1000;
        this.f473521h = new zk3.o0(this, android.os.Looper.getMainLooper());
    }
}
