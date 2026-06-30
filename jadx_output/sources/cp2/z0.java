package cp2;

/* loaded from: classes2.dex */
public final class z0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.dd2 f220957d;

    /* renamed from: e, reason: collision with root package name */
    public int f220958e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f220959f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cp2.q1 f220960g;

    public z0(cp2.q1 q1Var, r45.dd2 parentTab) {
        kotlin.jvm.internal.o.g(parentTab, "parentTab");
        this.f220960g = q1Var;
        this.f220957d = parentTab;
        this.f220959f = new java.util.LinkedList();
        if (parentTab.getList(6).isEmpty()) {
            return;
        }
        r45.dd2 dd2Var = new r45.dd2();
        byte[] byteArray = parentTab.toByteArray();
        if (byteArray != null) {
            try {
                dd2Var.parseFrom(byteArray);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        dd2Var.getList(6).clear();
        this.f220959f.add(0, dd2Var);
        java.util.LinkedList linkedList = this.f220959f;
        java.util.LinkedList list = this.f220957d.getList(6);
        kotlin.jvm.internal.o.f(list, "getSub_tab_list(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            java.lang.String string = ((r45.dd2) obj).getString(1);
            if (!(string == null || string.length() == 0)) {
                arrayList.add(obj);
            }
        }
        linkedList.addAll(arrayList);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f220959f.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        cp2.a1 holder = (cp2.a1) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f220959f.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.dd2 dd2Var = (r45.dd2) obj;
        android.widget.TextView textView = holder.f220772d;
        if (i17 == 0) {
            textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.dzf));
        } else {
            textView.setText(dd2Var.getString(1));
        }
        int i18 = this.f220958e;
        android.view.View view = holder.f220773e;
        if (i18 == i17) {
            view.setBackground(view.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.asn));
            textView.setTextColor(android.graphics.Color.parseColor("#E6000000"));
        } else {
            view.setBackground(view.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.asm));
            textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f479222ta));
        }
        android.view.View view2 = holder.itemView;
        cp2.q1 q1Var = this.f220960g;
        view2.setOnClickListener(new cp2.x0(this, i17, q1Var, dd2Var));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.itemView, "live_tab_page_label");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(holder.itemView, 40, 25388);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(holder.itemView, kz5.c1.k(new jz5.l("comment_scene", java.lang.Integer.valueOf(q1Var.a().getInteger(5))), new jz5.l("live_tab_id", java.lang.Integer.valueOf(dd2Var.getInteger(0)))));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(holder.itemView, new cp2.y0(q1Var));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.f489549cx5, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new cp2.a1(inflate);
    }
}
