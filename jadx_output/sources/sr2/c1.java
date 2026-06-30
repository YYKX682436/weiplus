package sr2;

/* loaded from: classes5.dex */
public final class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f411526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f411527e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sr2.o1 f411528f;

    public c1(yz5.a aVar, boolean z17, sr2.o1 o1Var) {
        this.f411526d = aVar;
        this.f411527e = z17;
        this.f411528f = o1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        yz5.a aVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/PostExtendLinkUIC$checkExtendItemVisible$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f411526d.invoke();
        if (this.f411527e && (aVar = this.f411528f.f411658i) != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC$checkExtendItemVisible$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
