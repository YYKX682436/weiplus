package nh5;

/* loaded from: classes3.dex */
public final class s extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f337161d;

    public s(java.util.List glInfoList) {
        kotlin.jvm.internal.o.g(glInfoList, "glInfoList");
        this.f337161d = glInfoList;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f337161d.size() + 1;
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
        oi.e eVar = (oi.e) this.f337161d.get(i17 - 1);
        nh5.c0 c0Var = (nh5.c0) holder;
        java.lang.Object value = ((jz5.n) c0Var.f337130d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.widget.TextView) value).setText("UI: " + eVar.f345565k.f354493b + '@' + eVar.f345565k.f354492a);
        java.lang.Object value2 = ((jz5.n) c0Var.f337131e).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((android.widget.TextView) value2).setText("Type: " + eVar.f345559e.name());
        java.lang.Object value3 = ((jz5.n) c0Var.f337132f).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        ((android.widget.TextView) value3).setText("res ID: " + eVar.f345556b);
        android.widget.TextView i18 = c0Var.i();
        r26.a.a(16);
        java.lang.String l17 = java.lang.Long.toString(eVar.f345561g, 16);
        kotlin.jvm.internal.o.f(l17, "toString(...)");
        i18.setText("EGLContext: 0x".concat(l17));
        c0Var.l().setText("ThreadId: " + eVar.f345555a);
        c0Var.j().setText("Java: " + eVar.a());
        c0Var.k().setText("Native: " + eVar.b());
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 0) {
            return new nh5.r(android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bx9, parent, false));
        }
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bx_, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new nh5.c0(inflate);
    }
}
