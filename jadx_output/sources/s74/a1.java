package s74;

/* loaded from: classes4.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f404197a;

    /* renamed from: b, reason: collision with root package name */
    public final org.json.JSONObject f404198b;

    /* renamed from: c, reason: collision with root package name */
    public final org.json.JSONObject f404199c;

    /* renamed from: d, reason: collision with root package name */
    public final s74.f3 f404200d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f404201e;

    public a1(android.view.View view, org.json.JSONObject animObj, org.json.JSONObject viewInfoObj, s74.f3 dynamicViewContext) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(animObj, "animObj");
        kotlin.jvm.internal.o.g(viewInfoObj, "viewInfoObj");
        kotlin.jvm.internal.o.g(dynamicViewContext, "dynamicViewContext");
        this.f404197a = view;
        this.f404198b = animObj;
        this.f404199c = viewInfoObj;
        this.f404200d = dynamicViewContext;
        this.f404201e = new java.util.ArrayList();
    }

    public final org.json.JSONObject a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAnimObj", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AnimationInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAnimObj", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AnimationInfo");
        return this.f404198b;
    }

    public final java.util.List b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentAttachedAnims", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AnimationInfo");
        java.util.List list = this.f404201e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentAttachedAnims", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AnimationInfo");
        return list;
    }

    public final android.view.View c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AnimationInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AnimationInfo");
        return this.f404197a;
    }

    public final org.json.JSONObject d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewInfoObj", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AnimationInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewInfoObj", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AnimationInfo");
        return this.f404199c;
    }

    public final void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AnimationInfo");
        com.tencent.mars.xlog.Log.i("DynamicView.AnimationInfo", "reset");
        android.view.View view = this.f404197a;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        org.json.JSONObject jSONObject = this.f404199c;
        boolean has = jSONObject.has("translate-x");
        s74.f3 f3Var = this.f404200d;
        if (has) {
            view.setTranslationX(s74.u3.f404562a.q(jSONObject, "translate-x", 0.0f, f3Var));
        } else {
            view.setTranslationX(0.0f);
        }
        if (jSONObject.has("translate-y")) {
            view.setTranslationY(s74.u3.f404562a.q(jSONObject, "translate-y", 0.0f, f3Var));
        } else {
            view.setTranslationY(0.0f);
        }
        if (jSONObject.has("alpha")) {
            android.view.View view2 = this.f404197a;
            float optDouble = (float) jSONObject.optDouble("alpha");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(optDouble));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AnimationInfo", "reset", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AnimationInfo", "reset", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            android.view.View view3 = this.f404197a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AnimationInfo", "reset", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ad/timeline/item/dynamicview/AnimationInfo", "reset", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (view instanceof android.widget.TextView) {
            android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
            if (jSONObject.has("background-color")) {
                s74.q4.f404513a.m(jSONObject, stateListDrawable);
            }
            int y17 = s74.u3.f404562a.y(jSONObject, -1);
            android.content.res.ColorStateList colorStateList = new android.content.res.ColorStateList(new int[][]{new int[0]}, new int[]{y17});
            if (jSONObject.has("color")) {
                colorStateList = s74.q4.f404513a.r(jSONObject, y17);
            }
            ((android.widget.TextView) view).setTextColor(colorStateList);
            ((android.widget.TextView) view).setBackground(stateListDrawable);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AnimationInfo");
    }
}
