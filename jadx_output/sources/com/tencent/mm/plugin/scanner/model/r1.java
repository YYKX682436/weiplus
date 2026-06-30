package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes3.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.model.u f159000a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.view.BaseScanMaskView f159001b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView f159002c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView f159003d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f159004e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.view.r f159005f;

    /* renamed from: g, reason: collision with root package name */
    public int f159006g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f159007h = "";

    public final void a(boolean z17, boolean z18) {
        if (this.f159004e != z17) {
            if (z17) {
                com.tencent.mm.plugin.scanner.view.BaseScanMaskView baseScanMaskView = this.f159001b;
                android.view.View targetSuccessMarkView = baseScanMaskView != null ? baseScanMaskView.getTargetSuccessMarkView() : null;
                com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView scanInfoMaskView = this.f159003d;
                if (scanInfoMaskView != null) {
                    scanInfoMaskView.setAnchorView(targetSuccessMarkView);
                }
            }
            this.f159004e = z17;
            com.tencent.mm.plugin.scanner.ui.widget.ScanSharedMaskView scanSharedMaskView = this.f159002c;
            if (scanSharedMaskView != null) {
                scanSharedMaskView.b(!z17);
            }
            com.tencent.mm.plugin.scanner.ui.widget.ScanInfoMaskView scanInfoMaskView2 = this.f159003d;
            if (scanInfoMaskView2 != null) {
                android.view.View view = scanInfoMaskView2.f159704h;
                if (view == null) {
                    kotlin.jvm.internal.o.o("infoLayout");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showLoadingView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showLoadingView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView textView = scanInfoMaskView2.f159706m;
                if (textView == null) {
                    kotlin.jvm.internal.o.o("opButton");
                    throw null;
                }
                textView.setVisibility(8);
                if (!z17) {
                    scanInfoMaskView2.setVisibility(8);
                    scanInfoMaskView2.f159717x = false;
                    android.view.View view2 = scanInfoMaskView2.f159702f;
                    if (view2 == null) {
                        kotlin.jvm.internal.o.o("loadingLayout");
                        throw null;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showLoadingView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showLoadingView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    android.view.animation.Animation animation = scanInfoMaskView2.f159708o;
                    if (animation != null) {
                        animation.cancel();
                    }
                    android.view.View view3 = scanInfoMaskView2.f159703g;
                    if (view3 == null) {
                        kotlin.jvm.internal.o.o("loadingIcon");
                        throw null;
                    }
                    view3.clearAnimation();
                } else if (z18) {
                    scanInfoMaskView2.f159709p = false;
                    scanInfoMaskView2.f159715v = true;
                    scanInfoMaskView2.f159716w = z18;
                    android.view.View view4 = scanInfoMaskView2.f159702f;
                    if (view4 == null) {
                        kotlin.jvm.internal.o.o("loadingLayout");
                        throw null;
                    }
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showLoadingView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/scanner/ui/widget/ScanInfoMaskView", "showLoadingView", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    scanInfoMaskView2.setVisibility(4);
                    scanInfoMaskView2.post(new d04.a1(scanInfoMaskView2));
                } else {
                    scanInfoMaskView2.b(false);
                }
            }
            com.tencent.mm.plugin.scanner.view.BaseScanMaskView baseScanMaskView2 = this.f159001b;
            if (baseScanMaskView2 != null) {
                baseScanMaskView2.q(z17);
            }
        }
    }
}
