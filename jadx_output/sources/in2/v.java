package in2;

/* loaded from: classes10.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.t f292910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in2.f0 f292911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f292912f;

    public v(in2.t tVar, in2.f0 f0Var, int i17) {
        this.f292910d = tVar;
        this.f292911e = f0Var;
        this.f292912f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddAdapter$bindSong$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f292910d.f292902h.setText("");
        in2.f0 f0Var = this.f292911e;
        java.util.ArrayList arrayList2 = f0Var.f292826h;
        int i17 = this.f292912f;
        arrayList2.remove(i17);
        int i18 = f0Var.f292832q;
        if (i18 == i17) {
            f0Var.f292832q = -1;
        } else if (i18 > i17) {
            f0Var.f292832q = i18 - 1;
        }
        f0Var.notifyItemRemoved(i17);
        f0Var.notifyItemRangeChanged(i17, f0Var.f292826h.size() - i17, f0Var.f292823e);
        yz5.l lVar = f0Var.f292829n;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(f0Var.f292826h.size() - 1));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddAdapter$bindSong$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
