package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class j8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.core.widget.NestedScrollView f210516d;

    public j8(androidx.core.widget.NestedScrollView nestedScrollView) {
        this.f210516d = nestedScrollView;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.core.widget.NestedScrollView nestedScrollView = this.f210516d;
        if (nestedScrollView != null) {
            nestedScrollView.s(0 - nestedScrollView.getScrollX(), nestedScrollView.getBottom() - nestedScrollView.getScrollY(), 250, false);
        }
    }
}
