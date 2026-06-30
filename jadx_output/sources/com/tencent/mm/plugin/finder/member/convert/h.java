package com.tencent.mm.plugin.finder.member.convert;

/* loaded from: classes2.dex */
public final class h implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.convert.i f121142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f121144f;

    public h(com.tencent.mm.plugin.finder.member.convert.i iVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f121142d = iVar;
        this.f121143e = s0Var;
        this.f121144f = baseFinderFeed;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/convert/MemberImageConvert$refreshPosterMedia$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        in5.s0 s0Var = this.f121143e;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f121142d.u(context, this.f121144f, s0Var);
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/member/convert/MemberImageConvert$refreshPosterMedia$longClickListener$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
