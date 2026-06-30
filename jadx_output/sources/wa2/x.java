package wa2;

/* loaded from: classes3.dex */
public abstract class x {
    public static final android.graphics.Bitmap a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            com.tencent.mars.xlog.Log.w("ActivityToggleAnimator", "try getting bitmap from view with invalid size, width=" + view.getWidth() + ", height=" + view.getHeight());
            return null;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimatorKt", "getBitmapFromView", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimatorKt", "getBitmapFromView", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        view.draw(new android.graphics.Canvas(createBitmap));
        return createBitmap;
    }

    public static final float b(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        return view2 != null ? view.getScaleX() * b(view2) : view.getScaleX();
    }

    public static final float c(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        return view2 != null ? view.getScaleY() * c(view2) : view.getScaleY();
    }

    public static final android.graphics.Rect d(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i17 = iArr[0];
        return new android.graphics.Rect(i17, iArr[1], ((int) (view.getWidth() * b(view))) + i17, iArr[1] + ((int) (view.getHeight() * c(view))));
    }

    public static boolean e(android.content.Intent intent, android.view.View view, long j17, boolean z17, boolean z18, yz5.p exitCallback, int i17, java.lang.Object obj) {
        android.view.Window window;
        if ((i17 & 2) != 0) {
            j17 = 280;
        }
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        if ((i17 & 8) != 0) {
            z18 = false;
        }
        if ((i17 & 16) != 0) {
            exitCallback = wa2.v.f444183d;
        }
        kotlin.jvm.internal.o.g(intent, "<this>");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(exitCallback, "exitCallback");
        if (com.tencent.mm.ui.bk.y()) {
            com.tencent.mars.xlog.Log.i("ActivityToggleAnimator", "[toggleEnterAnimation] RETURN! isInMultiWindowMode");
        } else if (view.getContext().getResources().getConfiguration().orientation == 1) {
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.D1).getValue()).r()).intValue() != 1) {
                com.tencent.mars.xlog.Log.i("ActivityToggleAnimator", "[toggleEnterAnimation] RETURN!");
            } else {
                android.view.View findViewWithTag = view.findViewWithTag("KEY_INTENT_COVER_CONTAINER_TAG");
                if (findViewWithTag == null) {
                    findViewWithTag = view;
                }
                if (findViewWithTag.getHeight() <= 0 || findViewWithTag.getWidth() <= 0) {
                    com.tencent.mars.xlog.Log.i("ActivityToggleAnimator", "[toggleEnterAnimation] RETURN! size of the view that bitmap is generated from is invalid:" + findViewWithTag.getWidth() + 'X' + findViewWithTag.getHeight());
                } else {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    android.graphics.Bitmap a17 = a(findViewWithTag);
                    if (a17 != null) {
                        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(view.getResources(), a17);
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(intent.hashCode());
                        sb6.append('#');
                        sb6.append(view.hashCode());
                        java.lang.String sb7 = sb6.toString();
                        intent.putExtra("key_intent_animating_flag", 1);
                        intent.putExtra("key_anim_intent_id", sb7);
                        intent.putExtra("key_intent_anim_duration", j17);
                        intent.putExtra("key_intent_enable_enter_anim", true);
                        intent.putExtra("key_intent_enable_drag_exit", z17);
                        intent.putExtra("key_intent_source_rect", d(view));
                        intent.putExtra("key_intent_source_scale_type", android.widget.ImageView.ScaleType.CENTER_CROP);
                        if (z18) {
                            android.content.Context context = view.getContext();
                            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                            android.view.View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
                            android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
                            intent.putExtra("key_intent_content_view_height", viewGroup != null ? java.lang.Integer.valueOf(viewGroup.getHeight()) : null);
                        }
                        view.setTag(com.tencent.mm.R.id.ehp, exitCallback);
                        wa2.u.f444181d.getClass();
                        wa2.u.f444182e.put(sb7, new wa2.p0(bitmapDrawable, new java.lang.ref.WeakReference(view)));
                        com.tencent.mars.xlog.Log.i("ActivityToggleAnimator", "[toggleEnterAnimation] found view drawable is " + bitmapDrawable + " view=" + view + " cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms");
                        return true;
                    }
                    com.tencent.mars.xlog.Log.i("ActivityToggleAnimator", "[toggleEnterAnimation] RETURN! cannot create bitmap from bitmap source view");
                }
            }
        }
        return false;
    }

    public static void f(android.app.Activity activity, long j17, yz5.a endCall, int i17, java.lang.Object obj) {
        java.lang.ref.WeakReference weakReference;
        android.view.View view;
        long j18 = (i17 & 1) != 0 ? 280L : j17;
        kotlin.jvm.internal.o.g(activity, "<this>");
        kotlin.jvm.internal.o.g(endCall, "endCall");
        wa2.u uVar = wa2.u.f444181d;
        wa2.w wVar = new wa2.w(endCall);
        uVar.getClass();
        long c17 = a06.d.c(((float) j18) * 1.1f);
        android.content.Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        if (intent.hasExtra("key_intent_animating_flag")) {
            com.tencent.mars.xlog.Log.w("ActivityToggleAnimator", "[exitAnimation] animating...");
            return;
        }
        wa2.n0 n0Var = (wa2.n0) activity.getWindow().getDecorView().findViewWithTag("GestureFrameLayout");
        android.view.View contentView = n0Var.getContentView();
        android.widget.ImageView imageView = (android.widget.ImageView) activity.getWindow().getDecorView().findViewWithTag("key_anim_source_tag");
        if (imageView == null) {
            uVar.Ni(contentView, intent);
            android.view.View wi6 = uVar.wi(activity, intent);
            n0Var.addView(wi6, n0Var.indexOfChild(n0Var.getBgView()) + 1);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(wi6, arrayList.toArray(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator", "exitAnimation", "(Landroid/app/Activity;JLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            wi6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(wi6, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator", "exitAnimation", "(Landroid/app/Activity;JLkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView = (android.widget.ImageView) wi6;
        }
        android.widget.ImageView imageView2 = imageView;
        android.view.View decorView = activity.getWindow().getDecorView();
        kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        long Bi = uVar.Bi((android.view.ViewGroup) decorView);
        activity.getIntent().putExtra("KEY_INTENT_EXIT_ITEM_ID", Bi);
        android.content.Intent intent2 = activity.getIntent();
        kotlin.jvm.internal.o.f(intent2, "getIntent(...)");
        wa2.p0 p0Var = (wa2.p0) wa2.u.f444182e.get(intent2.getStringExtra("key_anim_intent_id"));
        jz5.f0 f0Var = null;
        java.lang.Object tag = (p0Var == null || (weakReference = p0Var.f444168b) == null || (view = (android.view.View) weakReference.get()) == null) ? null : view.getTag(com.tencent.mm.R.id.ehp);
        kotlin.jvm.internal.m0.e(tag, 2);
        yz5.p pVar = (yz5.p) tag;
        if (pVar != null) {
            android.content.Intent intent3 = activity.getIntent();
            kotlin.jvm.internal.o.f(intent3, "getIntent(...)");
            pVar.invoke(intent3, new wa2.m(activity, Bi, wVar, intent, contentView, n0Var, c17, imageView2, pVar));
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            wVar.invoke();
        }
    }
}
