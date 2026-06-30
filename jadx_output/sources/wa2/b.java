package wa2;

/* loaded from: classes3.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final wa2.b f444104d = new wa2.b();

    public b() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.app.Activity activity = (android.app.Activity) obj;
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        kotlin.jvm.internal.o.g(activity, "activity");
        wa2.u uVar = wa2.u.f444181d;
        if (booleanValue) {
            uVar.getClass();
            android.content.Intent intent = activity.getIntent();
            if (intent != null) {
                if (intent.getBooleanExtra("key_intent_enable_drag_exit", false) && !intent.getBooleanExtra("key_intent_enable_enter_anim", true)) {
                    com.tencent.mars.xlog.Log.i("ActivityToggleAnimator", "onlySupportDragCloseAnim insert GestureFrameLayout to root ");
                    android.view.View decorView = activity.getWindow().getDecorView();
                    kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                    uVar.cj(activity, intent, (android.view.ViewGroup) decorView).setId(com.tencent.mm.R.id.tct);
                    activity.overridePendingTransition(0, 0);
                } else if (intent.hasExtra("key_anim_intent_id")) {
                    activity.overridePendingTransition(0, 0);
                    android.view.View decorView2 = activity.getWindow().getDecorView();
                    kotlin.jvm.internal.o.e(decorView2, "null cannot be cast to non-null type android.view.ViewGroup");
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) decorView2;
                    long longExtra = intent.getLongExtra("key_intent_anim_duration", 280L);
                    android.view.View aj6 = uVar.aj(intent);
                    wa2.n0 cj6 = uVar.cj(activity, intent, viewGroup);
                    android.view.View contentView = cj6.getContentView();
                    android.content.Context context = aj6 != null ? aj6.getContext() : null;
                    android.app.Activity activity2 = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                    if (!(activity2 != null && activity2.isDestroyed())) {
                        if ((aj6 != null ? aj6.getContext() : null) != null) {
                            if (intent.getBooleanExtra("KEY_INTENT_FLUENT_VIDEO_ENTER", false)) {
                                intent.removeExtra("key_intent_animating_flag");
                                intent.removeExtra("KEY_INTENT_FLUENT_VIDEO_ENTER");
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                                arrayList.add(java.lang.Float.valueOf(0.0f));
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator", "enterAnimation", "(Landroid/app/Activity;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                contentView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                                yj0.a.f(contentView, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator", "enterAnimation", "(Landroid/app/Activity;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                com.tencent.mars.xlog.Log.w("ActivityToggleAnimator", "check remove KEY_INTENT_ANIMATING_FLAG for fluent enter video.");
                            } else {
                                android.graphics.Rect rect = new android.graphics.Rect(0, 0, contentView.getContext().getResources().getDisplayMetrics().widthPixels, contentView.getContext().getResources().getDisplayMetrics().heightPixels);
                                android.graphics.Rect Vi = uVar.Vi(intent);
                                float Zi = uVar.Zi(rect, Vi, true);
                                float[] bj6 = uVar.bj(rect, Vi);
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                                arrayList2.add(java.lang.Float.valueOf(0.0f));
                                java.util.Collections.reverse(arrayList2);
                                yj0.a.d(contentView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator", "initContentViewLocation", "(Landroid/content/Intent;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                contentView.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                                yj0.a.f(contentView, "com/tencent/mm/plugin/finder/animation/ActivityToggleAnimator", "initContentViewLocation", "(Landroid/content/Intent;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                                contentView.setTranslationX(bj6[0]);
                                contentView.setTranslationY(bj6[1]);
                                contentView.setScaleX(Zi);
                                contentView.setScaleY(Zi);
                                viewGroup.post(new wa2.g(contentView, intent, activity, aj6, longExtra, cj6, viewGroup));
                            }
                        }
                    }
                    intent.removeExtra("key_intent_animating_flag");
                    com.tencent.mars.xlog.Log.w("ActivityToggleAnimator", "check remove KEY_INTENT_ANIMATING_FLAG");
                }
            }
        } else {
            uVar.getClass();
            android.content.Intent intent2 = activity.getIntent();
            if (intent2 != null && intent2.hasExtra("key_anim_intent_id")) {
                kotlin.jvm.internal.m0.c(wa2.u.f444182e).remove(activity.getIntent().getStringExtra("key_anim_intent_id"));
            }
        }
        return jz5.f0.f302826a;
    }
}
