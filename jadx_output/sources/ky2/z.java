package ky2;

/* loaded from: classes.dex */
public final class z extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f313603d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f313604e;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f313603d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        ky2.x holder = (ky2.x) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.String string = holder.itemView.getContext().getString(com.tencent.mm.R.string.ejq);
        java.util.ArrayList arrayList = this.f313603d;
        holder.f313599d.setText(k35.m1.g(string, ((r45.me2) arrayList.get(i17)).getInteger(6) * 1000));
        boolean z17 = true;
        java.lang.String string2 = ((r45.me2) arrayList.get(i17)).getString(1);
        android.widget.TextView textView = holder.f313600e;
        textView.setText(string2);
        java.lang.CharSequence text = textView.getText();
        if (text != null && text.length() != 0) {
            z17 = false;
        }
        if (z17) {
            textView.setText(holder.itemView.getContext().getResources().getString(com.tencent.mm.R.string.ejo, ((r45.me2) arrayList.get(i17)).getString(12)));
        }
        holder.itemView.setOnClickListener(new ky2.y(this, i17));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.b1q, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new ky2.x(this, inflate);
    }
}
