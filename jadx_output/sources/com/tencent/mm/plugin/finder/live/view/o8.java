package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes.dex */
public final class o8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f116562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f116563e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(android.view.View view, java.lang.String str) {
        super(0);
        this.f116562d = view;
        this.f116563e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f116562d.setOnClickListener(new com.tencent.mm.plugin.finder.live.view.n8(this.f116563e));
        android.view.View view = this.f116562d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordPlayWidget$updateWidgetVisibilityAndImage$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordPlayWidget$updateWidgetVisibilityAndImage$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}
