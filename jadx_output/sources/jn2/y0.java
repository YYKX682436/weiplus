package jn2;

/* loaded from: classes10.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.b1 f300754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.c1 f300755e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ay1 f300756f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jn2.w0 f300757g;

    public y0(jn2.b1 b1Var, jn2.c1 c1Var, r45.ay1 ay1Var, jn2.w0 w0Var) {
        this.f300754d = b1Var;
        this.f300755e = c1Var;
        this.f300756f = ay1Var;
        this.f300757g = w0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListAdapter$SongViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jn2.b1 b1Var = this.f300754d;
        if (b1Var.f300562h != jn2.u0.f300711d) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListAdapter$SongViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        jn2.c1 c1Var = this.f300755e;
        kotlinx.coroutines.y0 y0Var = c1Var.f300570g;
        r45.ay1 ay1Var = this.f300756f;
        if (y0Var == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveAnchorSingSongListAdapter", "Add song failed: panelScope is null, song=" + ay1Var.f370351e);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListAdapter$SongViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int ordinal = c1Var.f300571h.ordinal();
        if (ordinal == 0) {
            str = "Add song from board";
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            str = "Add song from search";
        }
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorSingSongListAdapter", str + ": " + ay1Var.f370351e + ", mid: " + ay1Var.f370350d);
        b1Var.j(jn2.u0.f300712e);
        kotlinx.coroutines.l.d(y0Var, null, null, new jn2.x0(this.f300755e, this.f300756f, this.f300757g, this.f300754d, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListAdapter$SongViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
