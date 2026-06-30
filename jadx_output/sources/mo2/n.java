package mo2;

/* loaded from: classes2.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mo2.q f330383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f330384e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f330385f;

    public n(mo2.q qVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var) {
        this.f330383d = qVar;
        this.f330384e = baseFinderFeed;
        this.f330385f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/view/MemberCommonConvert$updateCommentTotalText$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mo2.q.n(this.f330383d, this.f330384e, this.f330385f, 0L);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert$updateCommentTotalText$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
