package jx2;

/* loaded from: classes3.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jx2.k f302417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jx2.h f302418e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f302419f;

    public g(jx2.k kVar, jx2.h hVar, android.content.Context context) {
        this.f302417d = kVar;
        this.f302418e = hVar;
        this.f302419f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController$showSecondPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jx2.h hVar = this.f302418e;
        java.util.List S0 = kz5.n0.S0(hVar.f302429j);
        jx2.k kVar = this.f302417d;
        jx2.l lVar = (jx2.l) kVar;
        lVar.getClass();
        jx2.a aVar = (jx2.a) kz5.n0.Z(S0);
        if (aVar != null) {
            lVar.f302438c.b(aVar.f302399a);
        }
        hVar.f302429j.isEmpty();
        java.lang.String string = ((jx2.l) kVar).f302436a.getString(com.tencent.mm.R.string.ck6);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        db5.t7.h(this.f302419f, string);
        yz5.a aVar2 = hVar.f302430k;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/feedback/FinderAdFeedbackController$showSecondPage$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
