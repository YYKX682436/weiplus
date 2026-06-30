package mo2;

/* loaded from: classes2.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mo2.q f330374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f330375e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f330376f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f330377g;

    public j(mo2.q qVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17) {
        this.f330374d = qVar;
        this.f330375e = s0Var;
        this.f330376f = baseFinderFeed;
        this.f330377g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/view/MemberCommonConvert$refreshPosterContact$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f330375e.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f330374d.o(context, this.f330376f, 5, this.f330377g);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/view/MemberCommonConvert$refreshPosterContact$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
