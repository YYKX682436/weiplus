package lb0;

/* loaded from: classes8.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g3 f317682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f317683e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f317684f;

    public m(db5.g3 g3Var, yz5.a aVar, int i17) {
        this.f317682d = g3Var;
        this.f317683e = aVar;
        this.f317684f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/openway/util/ShareTipsUtil$showTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f317682d.f212055d.dismiss();
        this.f317683e.invoke();
        lb0.q.f317688a.c(this.f317684f);
        yj0.a.h(this, "com/tencent/mm/feature/openway/util/ShareTipsUtil$showTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
