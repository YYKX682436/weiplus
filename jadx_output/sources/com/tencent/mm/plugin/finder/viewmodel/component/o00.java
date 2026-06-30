package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class o00 extends com.tencent.mm.ui.component.UIComponent implements zy2.va {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f135406d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Long f135407e;

    /* renamed from: f, reason: collision with root package name */
    public in5.s0 f135408f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135406d = "Finder.FinderSelfReadClickGuideUIC";
        this.f135407e = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O6(in5.s0 r27, com.tencent.mm.plugin.finder.model.BaseFinderFeed r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.o00.O6(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed, boolean):void");
    }

    public final void P6() {
        android.view.View p17;
        com.tencent.mars.xlog.Log.i(this.f135406d, "unFocus");
        in5.s0 s0Var = this.f135408f;
        if (s0Var != null && (p17 = s0Var.p(com.tencent.mm.R.id.f484963rp5)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfReadClickGuideUIC", "dismissReadClickGuideTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfReadClickGuideUIC", "dismissReadClickGuideTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f135408f = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f135406d = "Finder.FinderSelfReadClickGuideUIC";
        this.f135407e = -1L;
    }
}
