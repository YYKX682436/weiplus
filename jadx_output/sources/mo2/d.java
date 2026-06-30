package mo2;

/* loaded from: classes2.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mo2.q f330357d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f330358e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f330359f;

    public d(mo2.q qVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var) {
        this.f330357d = qVar;
        this.f330358e = baseFinderFeed;
        this.f330359f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/view/MemberCommonConvert$refreshCommentCount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mo2.q.n(this.f330357d, this.f330358e, this.f330359f, 0L);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert$refreshCommentCount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
