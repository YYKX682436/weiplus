package in2;

/* loaded from: classes10.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.f0 f292809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in2.t f292810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f292811f;

    public b0(in2.f0 f0Var, in2.t tVar, int i17) {
        this.f292809d = f0Var;
        this.f292810e = tVar;
        this.f292811f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddAdapter$bindSong$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in2.t tVar = this.f292810e;
        android.content.Context context = tVar.f292898d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        in2.f0 f0Var = this.f292809d;
        if (f0Var.x(context)) {
            java.util.ArrayList arrayList2 = f0Var.f292826h;
            int i17 = this.f292811f;
            ((dk2.yg) arrayList2.get(i17)).f234395c = 3;
            f0Var.notifyItemChanged(i17);
            f0Var.f292833r = true;
            if (i17 < f0Var.f292827i) {
                f0Var.f292826h.add(new dk2.yg("", 0L, 1, false, false, false, false, null, 0, 504, null));
                yz5.l lVar = f0Var.f292829n;
                if (lVar != null) {
                    lVar.invoke(java.lang.Integer.valueOf(f0Var.f292826h.size() - 1));
                }
                f0Var.notifyItemInserted(f0Var.getItemCount());
                f0Var.notifyItemChanged(f0Var.getItemCount());
                tVar.f292903i.setVisibility(8);
            } else {
                tVar.f292903i.setVisibility(0);
                f0Var.getClass();
            }
            yz5.l lVar2 = f0Var.f292831p;
            if (lVar2 != null) {
                lVar2.invoke(java.lang.Integer.valueOf(f0Var.f292826h.size() - 1));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongAddAdapter$bindSong$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
