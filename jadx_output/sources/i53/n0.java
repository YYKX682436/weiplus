package i53;

/* loaded from: classes8.dex */
public class n0 extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: b2, reason: collision with root package name */
    public final int f288668b2;

    /* renamed from: c2, reason: collision with root package name */
    public final int f288669c2;

    /* renamed from: d2, reason: collision with root package name */
    public android.view.View f288670d2;

    /* renamed from: e2, reason: collision with root package name */
    public i53.k0 f288671e2;

    /* renamed from: f2, reason: collision with root package name */
    public boolean f288672f2;

    /* renamed from: g2, reason: collision with root package name */
    public boolean f288673g2;

    /* renamed from: h2, reason: collision with root package name */
    public final java.util.Set f288674h2;

    public n0(android.content.Context context, int i17, int i18) {
        super(context, null);
        this.f288674h2 = new java.util.HashSet();
        this.f288668b2 = i17;
        this.f288669c2 = i18;
        this.f288671e2 = new i53.k0(this, getContext());
        com.tencent.mm.plugin.game.widget.GameGridLayoutManager gameGridLayoutManager = new com.tencent.mm.plugin.game.widget.GameGridLayoutManager(getContext(), 2, 1, false);
        gameGridLayoutManager.B = new i53.h0(this);
        setLayoutManager(gameGridLayoutManager);
        N(new i53.l0());
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bfv, (android.view.ViewGroup) this, false);
        this.f288670d2 = inflate;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/game/media/GameHaowanRecycleView", "addLoadMoreView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/game/media/GameHaowanRecycleView", "addLoadMoreView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        i53.k0 k0Var = this.f288671e2;
        k0Var.f288626h.add(this.f288670d2);
        setAdapter(this.f288671e2);
    }

    public void g1(java.util.LinkedList linkedList, boolean z17, boolean z18) {
        this.f288672f2 = z17;
        this.f288673g2 = z18;
        android.view.View view = this.f288670d2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/GameHaowanRecycleView", "hideLoadMoreView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/media/GameHaowanRecycleView", "hideLoadMoreView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        i53.k0 k0Var = this.f288671e2;
        java.util.LinkedList linkedList2 = k0Var.f288627i;
        linkedList2.clear();
        linkedList2.addAll(linkedList);
        k0Var.notifyDataSetChanged();
    }

    public boolean h1(int i17) {
        int y17 = ((androidx.recyclerview.widget.LinearLayoutManager) getLayoutManager()).y();
        if (i17 != 0 || !this.f288672f2 || y17 < this.f288671e2.getItemCount() - 2) {
            return false;
        }
        android.view.View view = this.f288670d2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/GameHaowanRecycleView", "showLoadMoreView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/media/GameHaowanRecycleView", "showLoadMoreView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }

    public void setOnItemClickListener(vl1.p pVar) {
        this.f288671e2.f288628m = pVar;
    }
}
