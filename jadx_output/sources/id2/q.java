package id2;

/* loaded from: classes3.dex */
public final class q extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f290749d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f290750e;

    public q(id2.v1 v1Var) {
        this.f290750e = v1Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f290749d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.lang.String str;
        id2.p holder = (id2.p) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f290749d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.n30 n30Var = (r45.n30) obj;
        r45.kv1 kv1Var = (r45.kv1) this.f290750e.E.get(n30Var.getString(0));
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(kv1Var != null ? kv1Var.getString(2) : null, com.tencent.mm.plugin.finder.storage.y90.f128356f));
        android.widget.ImageView imageView = holder.f290720d;
        kotlin.jvm.internal.o.f(imageView, "<get-giftThumb>(...)");
        ((wo0.b) a17).c(imageView);
        holder.f290723g.setText(java.lang.String.valueOf(kv1Var != null ? java.lang.Integer.valueOf((int) kv1Var.getFloat(9)) : null));
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.widget.TextView textView = holder.f290721e;
        r4Var.b3(textView);
        textView.setText("x" + n30Var.getInteger(1));
        if (kv1Var == null || (str = kv1Var.getString(8)) == null) {
            str = "";
        }
        holder.f290722f.setText(str);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.arx, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new id2.p(inflate);
    }

    public final void x() {
        id2.v1 v1Var = this.f290750e;
        java.util.LinkedList linkedList = v1Var.D;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : linkedList) {
            if (((r45.n30) obj).getInteger(1) > 0) {
                arrayList.add(obj);
            }
        }
        this.f290749d = new java.util.LinkedList(arrayList);
        notifyDataSetChanged();
        v1Var.T6().post(new id2.s(v1Var));
    }
}
