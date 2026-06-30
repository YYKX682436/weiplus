package te2;

/* loaded from: classes3.dex */
public final class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.s52 f418034e;

    public g4(te2.p8 p8Var, r45.s52 s52Var) {
        this.f418033d = p8Var;
        this.f418034e = s52Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$RecyclerAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f418033d.v7(this.f418034e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$RecyclerAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
