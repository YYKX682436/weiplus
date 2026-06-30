package rn2;

/* loaded from: classes15.dex */
public final class h3 extends androidx.recyclerview.widget.f2 {

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f397759e;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f397758d = jz5.h.b(rn2.a3.f397643d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f397760f = jz5.h.b(rn2.c3.f397685d);

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return x().size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        rn2.z2 holder = (rn2.z2) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = x().get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        rn2.y2 y2Var = (rn2.y2) obj;
        boolean z17 = y2Var.f397926a;
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
        r45.kv1 kv1Var = y2Var.f397929d;
        wo0.c a17 = d1Var.a(new mn2.q3(kv1Var.getString(2), com.tencent.mm.plugin.finder.storage.y90.f128356f));
        android.widget.ImageView imageView = holder.f397935d;
        kotlin.jvm.internal.o.f(imageView, "<get-giftThumb>(...)");
        ((wo0.b) a17).c(imageView);
        holder.f397938g.setText(java.lang.String.valueOf((int) kv1Var.getFloat(9)));
        r45.n30 n30Var = y2Var.f397928c;
        java.lang.String valueOf = java.lang.String.valueOf(n30Var.getInteger(1));
        android.widget.TextView.BufferType bufferType = android.widget.TextView.BufferType.EDITABLE;
        com.tencent.mm.ui.widget.MMEditText mMEditText = holder.f397936e;
        mMEditText.setText(valueOf, bufferType);
        android.widget.TextView textView = holder.f397937f;
        kotlin.jvm.internal.o.f(textView, "<get-giftNameTv>(...)");
        com.tencent.mm.ui.fk.a(textView);
        java.lang.String string = kv1Var.getString(8);
        if (string == null) {
            string = "";
        }
        textView.setText(string);
        android.widget.CheckBox checkBox = holder.f397939h;
        checkBox.setChecked(z17);
        checkBox.setOnClickListener(new rn2.d3(holder, n30Var, this, y2Var));
        mMEditText.setFilters((android.text.InputFilter[]) ((jz5.n) this.f397760f).getValue());
        mMEditText.setTag(java.lang.Integer.valueOf(i17));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = holder.f397942n;
        weImageView.clearColorFilter();
        if (n30Var.getInteger(1) == 0) {
            weImageView.setAlpha(0.3f);
        } else {
            weImageView.setAlpha(1.0f);
        }
        holder.f397940i.setOnClickListener(new rn2.e3(n30Var, holder, y2Var, this));
        holder.f397941m.setOnClickListener(new rn2.f3(n30Var, holder, y2Var, this));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.f488899as0, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        rn2.z2 z2Var = new rn2.z2(inflate);
        z2Var.f397936e.addTextChangedListener(new rn2.g3(this, z2Var));
        return z2Var;
    }

    public final java.util.LinkedList x() {
        return (java.util.LinkedList) ((jz5.n) this.f397758d).getValue();
    }
}
