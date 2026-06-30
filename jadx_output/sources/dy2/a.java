package dy2;

/* loaded from: classes2.dex */
public final class a extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.djh;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        dy2.b item = (dy2.b) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.u5c);
        r45.a04 a04Var = item.f244573d;
        int integer = a04Var.getInteger(5);
        android.content.Context context = holder.f293121e;
        if (integer == 1) {
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.LinkFinder_100));
        } else {
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.abw));
        }
        i95.m c17 = i95.n0.c(zy2.s6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.s6 s6Var = (zy2.s6) c17;
        java.lang.String string = a04Var.getString(4);
        if (string == null) {
            string = "";
        }
        textView.setText(zy2.s6.l6(s6Var, string, (int) textView.getTextSize(), false, null, 0, false, null, 124, null));
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.itemView, "finder_user_interact_record");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view = holder.itemView;
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("finder_context_id", V6 != null ? V6.getString(1) : null);
        lVarArr[1] = new jz5.l("finder_tab_context_id", V6 != null ? V6.getString(2) : null);
        lVarArr[2] = new jz5.l("interaction_icon_type", java.lang.Integer.valueOf(a04Var.getInteger(0)));
        ((cy1.a) rVar).gk(view, kz5.c1.k(lVarArr));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(holder.itemView, 40, 1, false);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
    }
}
