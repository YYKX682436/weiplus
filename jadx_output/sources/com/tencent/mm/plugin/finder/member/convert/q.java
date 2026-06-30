package com.tencent.mm.plugin.finder.member.convert;

/* loaded from: classes2.dex */
public final class q implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.convert.r f121154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121155e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f121156f;

    public q(com.tencent.mm.plugin.finder.member.convert.r rVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f121154d = rVar;
        this.f121155e = s0Var;
        this.f121156f = baseFinderFeed;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/convert/MemberVideoConvert$refreshPosterMedia$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        in5.s0 s0Var = this.f121155e;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f121154d.u(context, this.f121156f, s0Var);
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/member/convert/MemberVideoConvert$refreshPosterMedia$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
