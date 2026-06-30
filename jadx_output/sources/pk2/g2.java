package pk2;

/* loaded from: classes3.dex */
public final class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f355763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.j32 f355764e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.c32 f355765f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f355766g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f355767h;

    public g2(com.tencent.mm.ui.MMActivity mMActivity, r45.j32 j32Var, r45.c32 c32Var, boolean z17, com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f355763d = mMActivity;
        this.f355764e = j32Var;
        this.f355765f = c32Var;
        this.f355766g = z17;
        this.f355767h = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorMoreLiveNoticeOption$Companion$showNoticeEmptyPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pk2.l2.f355938m.a(this.f355763d, this.f355764e, "onItemClicked", this.f355765f, this.f355766g);
        this.f355767h.h();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorMoreLiveNoticeOption$Companion$showNoticeEmptyPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
