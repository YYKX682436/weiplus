package in2;

/* loaded from: classes10.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.t f292906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in2.f0 f292907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f292908f;

    public u(in2.t tVar, in2.f0 f0Var, int i17) {
        this.f292906d = tVar;
        this.f292907e = f0Var;
        this.f292908f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddAdapter$bindSong$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f292906d.f292902h.setText("");
        dk2.yg ygVar = (dk2.yg) this.f292907e.f292826h.get(this.f292908f);
        ygVar.getClass();
        ygVar.f234393a = "";
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddAdapter$bindSong$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
