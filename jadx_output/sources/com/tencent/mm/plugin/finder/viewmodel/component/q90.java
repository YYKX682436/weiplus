package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes3.dex */
public final class q90 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f135676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135677e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q90(android.content.Context context, java.lang.String str) {
        super(0);
        this.f135676d = context;
        this.f135677e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f135676d;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.view.View decorView = ((android.app.Activity) context).getWindow().getDecorView();
        kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.View findViewWithTag = ((android.view.ViewGroup) decorView).findViewWithTag(java.lang.Integer.valueOf(com.tencent.mm.R.id.rl8));
        android.view.ViewGroup viewGroup = findViewWithTag instanceof android.view.ViewGroup ? (android.view.ViewGroup) findViewWithTag : null;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f);
        }
        c61.s9 s9Var = (c61.s9) ((c50.b1) i95.n0.c(c50.b1.class));
        s9Var.getClass();
        java.lang.String mediaId = this.f135677e;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        ug5.v a17 = ug5.v.f427655g.a(mediaId);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.i("FinderVideoSurfaceViewService", "changeToTimelineSurface findViewPerformer == null, mediaId: " + mediaId + ' ');
        } else {
            com.tencent.mars.xlog.Log.i("FinderVideoSurfaceViewService", "changeToTimelineSurface mediaId: " + mediaId + ' ');
            android.view.View view = a17.f427660c;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/FinderVideoFeatureService", "changeToTimelineSurface", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/FinderVideoFeatureService", "changeToTimelineSurface", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            s9Var.Bi(a17, false);
        }
        return jz5.f0.f302826a;
    }
}
