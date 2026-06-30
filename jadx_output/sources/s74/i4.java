package s74;

/* loaded from: classes4.dex */
public final class i4 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f404347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f404348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f404349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f404350g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f404351h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f404352i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f404353m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f404354n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f404355o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f404356p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f404357q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f404358r;

    public i4(android.view.View view, int i17, int i18, java.util.Map map, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47) {
        this.f404347d = view;
        this.f404348e = i17;
        this.f404349f = i18;
        this.f404350g = map;
        this.f404351h = i19;
        this.f404352i = i27;
        this.f404353m = i28;
        this.f404354n = i29;
        this.f404355o = i37;
        this.f404356p = i38;
        this.f404357q = i39;
        this.f404358r = i47;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator value) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processColorAnimation$1");
        kotlin.jvm.internal.o.g(value, "value");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beginSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beginSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.Object animatedValue = value.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        s74.q4 q4Var = s74.q4.f404513a;
        android.view.View view = this.f404347d;
        if (!q4Var.c(view)) {
            android.widget.TextView textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
            if (textView != null) {
                textView.setTextColor(this.f404348e);
            }
            view.setBackground(new android.graphics.drawable.ColorDrawable(this.f404349f));
            com.tencent.mars.xlog.Log.i("DynamicView.Utils", " currentView.getColorEnable  false ~");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processColorAnimation$1");
            return;
        }
        boolean z17 = view instanceof android.widget.TextView;
        java.util.Map map = this.f404350g;
        if (z17 && (map.containsKey("color") || map.containsKey("hover-color"))) {
            float f18 = floatValue / 100.0f;
            ((android.widget.TextView) view).setTextColor(new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{e3.b.c(this.f404353m, this.f404354n, f18), e3.b.c(this.f404351h, this.f404352i, f18)}));
        }
        if (map.containsKey("background-color") || map.containsKey("hover-background-color")) {
            android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
            float f19 = floatValue / 100.0f;
            int c17 = e3.b.c(this.f404355o, this.f404356p, f19);
            android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(e3.b.c(this.f404357q, this.f404358r, f19));
            android.graphics.drawable.ColorDrawable colorDrawable2 = new android.graphics.drawable.ColorDrawable(c17);
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, colorDrawable);
            stateListDrawable.addState(new int[0], colorDrawable2);
            if (view != null) {
                view.setBackground(stateListDrawable);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endSectionNoLog", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewUtils$processColorAnimation$1");
    }
}
