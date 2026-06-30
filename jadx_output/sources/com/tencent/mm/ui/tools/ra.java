package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class ra implements oa5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowImageUI f210680b;

    public ra(com.tencent.mm.ui.tools.ShowImageUI showImageUI, android.view.View view) {
        this.f210680b = showImageUI;
        this.f210679a = view;
    }

    @Override // oa5.a
    public void a(float f17) {
        float f18 = 1.0f - f17;
        this.f210680b.f210202r.setAlpha(f18);
        android.view.View view = this.f210679a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tools/ShowImageUI$14", "onUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/tools/ShowImageUI$14", "onUpdate", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
