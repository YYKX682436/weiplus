package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f201458a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f201459b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f201460c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ProgressBar f201461d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.gallery.s f201462e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f201463f;

    public u(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f201458a = rootView;
        com.tencent.mm.ui.chatting.gallery.s sVar = com.tencent.mm.ui.chatting.gallery.s.f201346d;
        this.f201462e = sVar;
        this.f201463f = jz5.h.b(com.tencent.mm.ui.chatting.gallery.t.f201377d);
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.u39);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f201459b = findViewById;
        android.view.View findViewById2 = rootView.findViewById(rj.s.field_download_process);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f201460c = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(rj.s.field_download_loading);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f201461d = (android.widget.ProgressBar) findViewById3;
        android.widget.TextView textView = this.f201460c;
        if (textView == null) {
            kotlin.jvm.internal.o.o("progressText");
            throw null;
        }
        com.tencent.mm.ui.fk.b(textView);
        a(sVar);
    }

    public final void a(com.tencent.mm.ui.chatting.gallery.s state) {
        kotlin.jvm.internal.o.g(state, "state");
        if (!((java.lang.Boolean) this.f201463f.getValue()).booleanValue() || this.f201462e == state) {
            return;
        }
        this.f201462e = state;
        int ordinal = state.ordinal();
        if (ordinal == 0) {
            android.view.View view = this.f201459b;
            if (view == null) {
                kotlin.jvm.internal.o.o("iconContainer");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/DownloadProgressWrapperView", "setState", "(Lcom/tencent/mm/ui/chatting/gallery/DownloadProgressWrapperView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/gallery/DownloadProgressWrapperView", "setState", "(Lcom/tencent/mm/ui/chatting/gallery/DownloadProgressWrapperView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ProgressBar progressBar = this.f201461d;
            if (progressBar == null) {
                kotlin.jvm.internal.o.o("loadingProcess");
                throw null;
            }
            progressBar.setVisibility(8);
            android.widget.TextView textView = this.f201460c;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("progressText");
                throw null;
            }
        }
        if (ordinal == 1) {
            android.view.View view2 = this.f201459b;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("iconContainer");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/DownloadProgressWrapperView", "setState", "(Lcom/tencent/mm/ui/chatting/gallery/DownloadProgressWrapperView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/gallery/DownloadProgressWrapperView", "setState", "(Lcom/tencent/mm/ui/chatting/gallery/DownloadProgressWrapperView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ProgressBar progressBar2 = this.f201461d;
            if (progressBar2 == null) {
                kotlin.jvm.internal.o.o("loadingProcess");
                throw null;
            }
            progressBar2.setVisibility(0);
            android.widget.TextView textView2 = this.f201460c;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("progressText");
                throw null;
            }
        }
        if (ordinal != 2) {
            return;
        }
        android.view.View view3 = this.f201459b;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("iconContainer");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/gallery/DownloadProgressWrapperView", "setState", "(Lcom/tencent/mm/ui/chatting/gallery/DownloadProgressWrapperView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/ui/chatting/gallery/DownloadProgressWrapperView", "setState", "(Lcom/tencent/mm/ui/chatting/gallery/DownloadProgressWrapperView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ProgressBar progressBar3 = this.f201461d;
        if (progressBar3 == null) {
            kotlin.jvm.internal.o.o("loadingProcess");
            throw null;
        }
        progressBar3.setVisibility(8);
        android.widget.TextView textView3 = this.f201460c;
        if (textView3 != null) {
            textView3.setVisibility(0);
        } else {
            kotlin.jvm.internal.o.o("progressText");
            throw null;
        }
    }

    public final void b(int i17) {
        android.widget.TextView textView = this.f201460c;
        if (textView == null) {
            kotlin.jvm.internal.o.o("progressText");
            throw null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('%');
        textView.setText(sb6.toString());
    }
}
