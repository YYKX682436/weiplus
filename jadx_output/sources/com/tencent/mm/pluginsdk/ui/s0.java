package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes2.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f191100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f191101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f191102f;

    public s0(android.view.View view, android.view.View view2, int i17) {
        this.f191100d = view;
        this.f191101e = view2;
        this.f191102f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f191100d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.View view2 = this.f191101e;
        layoutParams.height = view2.getHeight();
        layoutParams.width = view2.getWidth();
        view.setLayoutParams(layoutParams);
        android.view.View view3 = this.f191100d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/FilePreviewItemConvert$onBindViewHolder$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/pluginsdk/ui/FilePreviewItemConvert$onBindViewHolder$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f191100d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/FilePreviewItemConvert$onBindViewHolder$1$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view4.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view4, "com/tencent/mm/pluginsdk/ui/FilePreviewItemConvert$onBindViewHolder$1$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.animate().alpha(0.0f).setDuration(1000L).setListener(new com.tencent.mm.pluginsdk.ui.r0(view, this.f191102f)).start();
    }
}
