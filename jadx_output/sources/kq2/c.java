package kq2;

/* loaded from: classes2.dex */
public final class c extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final iq2.d0 f311264d;

    /* renamed from: e, reason: collision with root package name */
    public int f311265e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f311266f;

    public c(r45.dd2 parentTab, iq2.d0 viewCallback) {
        kotlin.jvm.internal.o.g(parentTab, "parentTab");
        kotlin.jvm.internal.o.g(viewCallback, "viewCallback");
        this.f311264d = viewCallback;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f311266f = linkedList;
        if (parentTab.getList(6).isEmpty()) {
            return;
        }
        linkedList.add(0, parentTab);
        java.util.LinkedList list = parentTab.getList(6);
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
        return this.f311266f.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        kq2.a holder = (kq2.a) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f311266f.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.dd2 dd2Var = (r45.dd2) obj;
        android.widget.TextView textView = holder.f311259d;
        if (i17 == 0) {
            textView.setText(textView.getContext().getResources().getString(com.tencent.mm.R.string.dzf));
        } else {
            textView.setText(dd2Var.getString(1));
        }
        int i18 = this.f311265e;
        android.view.View view = holder.f311260e;
        if (i18 == i17) {
            view.setBackground(view.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.asn));
            textView.setTextColor(android.graphics.Color.parseColor("#E6000000"));
        } else {
            view.setBackground(view.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.asm));
            textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f479222ta));
        }
        holder.itemView.setOnClickListener(new kq2.b(this, i17, dd2Var));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.f489549cx5, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new kq2.a(inflate);
    }
}
