package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.c0 f121272d;

    public r(com.tencent.mm.plugin.finder.member.preview.c0 c0Var) {
        this.f121272d = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewHeaderUIC$onError$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.member.preview.c0 c0Var = this.f121272d;
        c0Var.S6();
        android.view.ViewGroup viewGroup = c0Var.H;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("emptyView");
            throw null;
        }
        viewGroup.setVisibility(0);
        android.widget.TextView textView = c0Var.I;
        if (textView == null) {
            kotlin.jvm.internal.o.o("retryView");
            throw null;
        }
        textView.setVisibility(8);
        android.widget.ProgressBar progressBar = c0Var.f121177J;
        if (progressBar == null) {
            kotlin.jvm.internal.o.o("progressView");
            throw null;
        }
        progressBar.setVisibility(0);
        android.view.ViewGroup viewGroup2 = c0Var.H;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.o.o("emptyView");
            throw null;
        }
        viewGroup2.setOnClickListener(null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewHeaderUIC$onError$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
