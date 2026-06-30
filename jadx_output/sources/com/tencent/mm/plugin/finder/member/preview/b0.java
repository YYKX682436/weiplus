package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.c0 f121173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.gk4 f121174e;

    public b0(com.tencent.mm.plugin.finder.member.preview.c0 c0Var, r45.gk4 gk4Var) {
        this.f121173d = c0Var;
        this.f121174e = gk4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewHeaderUIC$updatePreviewCollection$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.member.preview.c0 c0Var = this.f121173d;
        android.app.Activity context = c0Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.member.preview.o0 o0Var = (com.tencent.mm.plugin.finder.member.preview.o0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.member.preview.o0.class);
        r45.gk4 gk4Var = this.f121174e;
        int i17 = gk4Var != null ? gk4Var.f375316e : 0;
        java.lang.String authorFinderUsername = c0Var.U;
        o0Var.getClass();
        kotlin.jvm.internal.o.g(authorFinderUsername, "authorFinderUsername");
        com.tencent.mm.plugin.finder.member.preview.n0 n0Var = o0Var.f121268f;
        if (n0Var != null) {
            n0Var.b(i17, authorFinderUsername, "", null, 0L, "");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewHeaderUIC$updatePreviewCollection$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
