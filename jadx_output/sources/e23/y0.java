package e23;

/* loaded from: classes12.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f246998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.b1 f246999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.jo0 f247000f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f247001g;

    public y0(android.view.View view, e23.b1 b1Var, r45.jo0 jo0Var, int i17) {
        this.f246998d = view;
        this.f246999e = b1Var;
        this.f247000f = jo0Var;
        this.f247001g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        j75.f stateCenter;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem$updateRelevantSearchBar$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f246998d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity a17 = tm3.a.a(context);
        if (a17 != null && (stateCenter = a17.getStateCenter()) != null) {
            e23.b1 b1Var = this.f246999e;
            java.lang.String i17 = b1Var.i();
            kotlin.jvm.internal.o.f(i17, "getQuery(...)");
            b1Var.getClass();
            stateCenter.B3(new fi0.f(i17, o13.p.f342251d, b1Var.f423766i, this.f247000f, this.f247001g, 32, b1Var.f423773p, false, 128, null));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem$updateRelevantSearchBar$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
