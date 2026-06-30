package ir1;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.d f293934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f293935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f293936f;

    public b(ir1.d dVar, android.view.View view, int i17) {
        this.f293934d = dVar;
        this.f293935e = view;
        this.f293936f = i17;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListAdapter$getView$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        yz5.p pVar = this.f293934d.f293951f;
        if (pVar != null) {
            android.view.View clickArea = this.f293935e;
            kotlin.jvm.internal.o.f(clickArea, "$clickArea");
            pVar.invoke(clickArea, java.lang.Integer.valueOf(this.f293936f));
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListAdapter$getView$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
