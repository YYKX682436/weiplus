package e33;

/* loaded from: classes10.dex */
public class y5 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f247555d;

    /* renamed from: e, reason: collision with root package name */
    public t23.h2 f247556e;

    /* renamed from: f, reason: collision with root package name */
    public e33.z5 f247557f;

    public y5(android.content.Context context) {
        this.f247555d = context;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        t23.h2 h2Var = this.f247556e;
        if (h2Var == null) {
            return 0;
        }
        return h2Var.f415172b.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        e33.x5 x5Var = (e33.x5) k3Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.SmartGalleryUI", "CategoryAlbumAdapter onBindViewHolder: %d.", java.lang.Integer.valueOf(i17));
        t23.h2 h2Var = this.f247556e;
        if (h2Var != null) {
            t23.i2 i2Var = (t23.i2) h2Var.f415171a.get(i17);
            x5Var.f247547d.setText(i2Var.f415185c);
            com.tencent.mars.xlog.Log.i("MicroMsg.SmartGalleryUI", "category id: %s, category name: %s.", i2Var.f415184b, i2Var.f415185c);
            java.util.List list = (java.util.List) this.f247556e.f415172b.get(i2Var);
            if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SmartGalleryUI", "album info list invalid.");
                return;
            }
            int size = list.size();
            android.content.Context context = this.f247555d;
            androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = size > 4 ? new androidx.recyclerview.widget.GridLayoutManager(context, 2, 0, false) : new androidx.recyclerview.widget.GridLayoutManager(context, 1, 0, false);
            androidx.recyclerview.widget.RecyclerView recyclerView = x5Var.f247548e;
            recyclerView.setLayoutManager(gridLayoutManager);
            e33.w5 w5Var = new e33.w5(context);
            e33.z5 z5Var = this.f247557f;
            if (z5Var != null) {
                w5Var.f247529f = z5Var;
            }
            recyclerView.setAdapter(w5Var);
            java.util.ArrayList arrayList = (java.util.ArrayList) w5Var.f247528e;
            arrayList.clear();
            arrayList.addAll(list);
            w5Var.notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new e33.x5(android.view.LayoutInflater.from(this.f247555d).inflate(com.tencent.mm.R.layout.f489476co3, viewGroup, false));
    }
}
