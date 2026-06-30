package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class ec implements oa5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210380a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210381b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowVideoUI f210382c;

    public ec(com.tencent.mm.ui.tools.ShowVideoUI showVideoUI, int i17, android.view.View view) {
        this.f210382c = showVideoUI;
        this.f210380a = i17;
        this.f210381b = view;
    }

    @Override // oa5.a
    public void a(float f17) {
        float f18 = 1.0f - f17;
        this.f210382c.f210218J.setTranslationY(-(this.f210380a * f18));
        android.view.View view = this.f210381b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tools/ShowVideoUI$19", "onUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/tools/ShowVideoUI$19", "onUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
