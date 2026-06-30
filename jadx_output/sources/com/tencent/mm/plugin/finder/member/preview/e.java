package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.k f121208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f121209e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f121210f;

    public e(com.tencent.mm.plugin.finder.member.preview.k kVar, android.view.View view, int i17) {
        this.f121208d = kVar;
        this.f121209e = view;
        this.f121210f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewFeedItemUIC$createView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.member.preview.k kVar = this.f121208d;
        android.app.Activity context = kVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        go2.a1 a1Var = (go2.a1) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(go2.a1.class);
        if (a1Var != null) {
            a1Var.R6(java.lang.Integer.valueOf(kVar.f121244i), java.lang.Integer.valueOf(kVar.f121245m), java.lang.Integer.valueOf(kVar.f121246n), kVar.f121243h, this.f121209e, this.f121210f, kVar.f121251s, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewFeedItemUIC$createView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
