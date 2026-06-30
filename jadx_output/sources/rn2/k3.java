package rn2;

/* loaded from: classes3.dex */
public final class k3 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f397787d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f397788e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f397789f;

    public k3(boolean z17, boolean z18, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        z18 = (i17 & 2) != 0 ? false : z18;
        this.f397787d = z17;
        this.f397788e = z18;
        this.f397789f = jz5.h.b(rn2.j3.f397775d);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return x().size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        rn2.i3 holder = (rn2.i3) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.String string = ((rn2.y2) x().get(i17)).f397929d.getString(2);
        int integer = ((rn2.y2) x().get(i17)).f397928c.getInteger(1);
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(string, com.tencent.mm.plugin.finder.storage.y90.f128356f));
        android.widget.ImageView imageView = holder.f397768d;
        kotlin.jvm.internal.o.f(imageView, "<get-giftThumb>(...)");
        ((wo0.b) a17).c(imageView);
        android.content.res.Resources resources = holder.itemView.getContext().getResources();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(integer);
        sb6.append(' ');
        java.lang.String string2 = resources.getString(com.tencent.mm.R.string.f491642lj3, sb6.toString());
        android.widget.TextView textView = holder.f397769e;
        textView.setText(string2);
        if (this.f397787d) {
            textView.setTextColor(android.graphics.Color.parseColor("#e5000000"));
        }
        zl2.r4.f473950a.b3(textView);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        android.view.View inflate;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        kotlin.jvm.internal.o.g(parent, "parent");
        if (this.f397788e) {
            inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.e_0, null);
            android.view.ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginStart(i65.a.a(parent.getContext(), 8.0f));
            }
        } else {
            inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.dej, null);
            android.view.ViewGroup.LayoutParams layoutParams2 = inflate.getLayoutParams();
            marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginStart(i65.a.a(parent.getContext(), 8.0f));
            }
        }
        return new rn2.i3(inflate);
    }

    public final java.util.LinkedList x() {
        return (java.util.LinkedList) ((jz5.n) this.f397789f).getValue();
    }
}
