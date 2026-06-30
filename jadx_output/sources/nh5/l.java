package nh5;

/* loaded from: classes.dex */
public final class l extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f337154d;

    public l(java.util.List data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f337154d = data;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f337154d.size() + 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return i17;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (i17 == 0) {
            return;
        }
        oh5.p pVar = (oh5.p) this.f337154d.get(i17 - 1);
        nh5.o oVar = (nh5.o) holder;
        java.lang.Object value = ((jz5.n) oVar.f337157d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.widget.TextView) value).setText("So: " + pVar.f345516a);
        java.lang.Object value2 = ((jz5.n) oVar.f337158e).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((android.widget.TextView) value2).setText("Alloc Size: " + pVar.f345517b + " Byte");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 0) {
            return new nh5.k(android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bx6, parent, false));
        }
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bx7, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new nh5.o(inflate);
    }
}
