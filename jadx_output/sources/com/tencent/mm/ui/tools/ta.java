package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class ta implements oa5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowImageUI f210778b;

    public ta(com.tencent.mm.ui.tools.ShowImageUI showImageUI, android.view.View view) {
        this.f210778b = showImageUI;
        this.f210777a = view;
    }

    @Override // oa5.a
    public void a(float f17) {
        this.f210778b.f210202r.setAlpha(f17);
        android.view.View view = this.f210777a;
        float f18 = 1.0f - f17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tools/ShowImageUI$16", "onUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/tools/ShowImageUI$16", "onUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
