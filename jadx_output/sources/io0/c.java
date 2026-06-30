package io0;

/* loaded from: classes3.dex */
public final class c extends hn5.c {

    /* renamed from: b, reason: collision with root package name */
    public final io0.b f293446b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f293447c;

    public c(io0.b adapter) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        this.f293446b = adapter;
        this.f293447c = new java.util.ArrayList();
        new android.graphics.Rect();
    }

    @Override // hn5.c
    public int a() {
        return this.f293447c.size();
    }

    @Override // hn5.c
    public java.lang.Object b(int i17) {
        java.lang.Object obj = this.f293447c.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return (jo0.a) obj;
    }

    @Override // hn5.c
    public android.view.View c(int i17, java.lang.Object obj) {
        jo0.a data = (jo0.a) obj;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String sdkUserId = ((jo0.a) this.f293447c.get(i17)).f300870a;
        com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout tRTCVideoRatioLayout = (com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout) this.f293446b;
        tRTCVideoRatioLayout.getClass();
        kotlin.jvm.internal.o.g(sdkUserId, "sdkUserId");
        io0.a aVar = tRTCVideoRatioLayout.f68577p;
        android.view.View a17 = (kotlin.jvm.internal.o.b(aVar != null ? aVar.getSelfUserId() : null, sdkUserId) || kotlin.jvm.internal.o.b(sdkUserId, "DEFAULT_ANCHOR_USER_ID")) ? tRTCVideoRatioLayout.f68576o : tRTCVideoRatioLayout.a(sdkUserId, 0);
        if (data.f300872c) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            android.view.View view = a17;
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/live/core/trtc/TRTCRatioVideoAdapter", "getItemView", "(ILcom/tencent/mm/live/core/trtc/ratio/TRTCLayoutData;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
            a17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/live/core/trtc/TRTCRatioVideoAdapter", "getItemView", "(ILcom/tencent/mm/live/core/trtc/ratio/TRTCLayoutData;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList2);
            android.view.View view2 = a17;
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/live/core/trtc/TRTCRatioVideoAdapter", "getItemView", "(ILcom/tencent/mm/live/core/trtc/ratio/TRTCLayoutData;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
            a17.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/live/core/trtc/TRTCRatioVideoAdapter", "getItemView", "(ILcom/tencent/mm/live/core/trtc/ratio/TRTCLayoutData;)Landroid/view/View;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        return a17;
    }

    @Override // hn5.c
    public hn5.b e(int i17) {
        return ((jo0.a) this.f293447c.get(i17)).f300871b;
    }
}
