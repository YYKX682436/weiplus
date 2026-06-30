package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.c0 f121171d;

    public a0(com.tencent.mm.plugin.finder.member.preview.c0 c0Var) {
        this.f121171d = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewHeaderUIC$updateIntroHeight$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.member.preview.c0 c0Var = this.f121171d;
        android.widget.TextView textView = c0Var.f121182i;
        if (textView == null) {
            kotlin.jvm.internal.o.o("previewIntro");
            throw null;
        }
        textView.setMaxLines(Integer.MAX_VALUE);
        android.widget.TextView textView2 = c0Var.f121184m;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("previewIntroExpend");
            throw null;
        }
        textView2.setVisibility(8);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewHeaderUIC$updateIntroHeight$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
