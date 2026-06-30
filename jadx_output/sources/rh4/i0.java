package rh4;

/* loaded from: classes8.dex */
public class i0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView f395741d;

    public i0(com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView taskBarSectionWeAppRecyclerView) {
        this.f395741d = taskBarSectionWeAppRecyclerView;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f395741d.f172711f2).size() + 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        this.f395741d.getClass();
        return 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        android.view.View inflate = com.tencent.mm.ui.id.b(this.f395741d.getContext()).inflate(com.tencent.mm.R.layout.f488146ig, viewGroup, false);
        ((et.e) ((ft.u3) i95.n0.c(ft.u3.class))).getClass();
        return new cl1.z(inflate);
    }

    @Override // androidx.recyclerview.widget.f2
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(cl1.a aVar, int i17) {
        if (aVar == null) {
            return;
        }
        com.tencent.mm.plugin.taskbar.ui.section.weapp.TaskBarSectionWeAppRecyclerView taskBarSectionWeAppRecyclerView = this.f395741d;
        int i18 = taskBarSectionWeAppRecyclerView.f172721p2;
        cl1.z zVar = (cl1.z) aVar;
        android.widget.TextView textView = zVar.f42907i;
        textView.setTextColor(i18);
        java.util.ArrayList arrayList = (java.util.ArrayList) taskBarSectionWeAppRecyclerView.f172711f2;
        cl1.n0 n0Var = i17 >= arrayList.size() ? null : (cl1.n0) arrayList.get(i17);
        if (n0Var == null) {
            return;
        }
        aVar.f42849d = n0Var;
        if (aVar.getItemViewType() != 2) {
            aVar.i(new rh4.h0(this, aVar, n0Var), null);
            taskBarSectionWeAppRecyclerView.r1(aVar);
            cl1.m0 m0Var = taskBarSectionWeAppRecyclerView.f172718m2;
            if (m0Var == null || m0Var.getRecyclerView() != taskBarSectionWeAppRecyclerView) {
                return;
            }
            ((com.tencent.mm.plugin.appbrand.widget.desktop.DragFeatureView) taskBarSectionWeAppRecyclerView.f172718m2).i(aVar, i17);
            return;
        }
        rh4.g0 g0Var = new rh4.g0(this);
        zVar.j();
        textView.setVisibility(4);
        android.widget.ImageView imageView = zVar.f42905g;
        imageView.setImageResource(com.tencent.mm.R.drawable.f481352r5);
        imageView.setAlpha(0.1f);
        android.widget.ImageView imageView2 = zVar.f42904f;
        imageView2.getLayoutParams().width = (int) (i65.a.f(zVar.k(), com.tencent.mm.R.dimen.f479927j7) * i65.a.q(zVar.k()));
        imageView2.getLayoutParams().height = (int) (i65.a.f(zVar.k(), com.tencent.mm.R.dimen.f479927j7) * i65.a.q(zVar.k()));
        imageView2.setImageResource(com.tencent.mm.R.raw.icons_filled_more);
        imageView2.setColorFilter(new android.graphics.PorterDuffColorFilter(i65.a.d(zVar.k(), com.tencent.mm.R.color.BW_100_Alpha_0_5), android.graphics.PorterDuff.Mode.SRC_ATOP));
        zVar.f42908m.setVisibility(8);
        zVar.itemView.setOnClickListener(g0Var);
        zVar.itemView.setOnLongClickListener(null);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List list) {
        cl1.a aVar = (cl1.a) k3Var;
        if (list.size() == 0) {
            onBindViewHolder(aVar, i17);
        }
    }
}
