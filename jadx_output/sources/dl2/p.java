package dl2;

/* loaded from: classes3.dex */
public final class p extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl2.f0 f235250d;

    public p(dl2.f0 f0Var) {
        this.f235250d = f0Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f235250d.f235207k.f235222c.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.lang.String str;
        dl2.q holder = (dl2.q) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        dl2.f0 f0Var = this.f235250d;
        java.util.LinkedHashMap linkedHashMap = f0Var.f235216t;
        com.tencent.mm.ui.widget.MMEditText mMEditText = holder.f235252e;
        android.text.TextWatcher textWatcher = (android.text.TextWatcher) linkedHashMap.get(mMEditText);
        if (textWatcher != null) {
            mMEditText.removeTextChangedListener(textWatcher);
        }
        java.lang.Object obj = f0Var.f235207k.f235222c.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        dl2.f fVar = (dl2.f) obj;
        boolean z17 = fVar.f235195a;
        java.util.LinkedHashMap linkedHashMap2 = f0Var.f235210n;
        r45.n30 n30Var = fVar.f235196b;
        r45.kv1 kv1Var = (r45.kv1) linkedHashMap2.get(n30Var.getString(0));
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(kv1Var != null ? kv1Var.getString(2) : null, com.tencent.mm.plugin.finder.storage.y90.f128356f));
        android.widget.ImageView imageView = holder.f235251d;
        kotlin.jvm.internal.o.f(imageView, "<get-giftThumb>(...)");
        ((wo0.b) a17).c(imageView);
        holder.f235254g.setText(java.lang.String.valueOf(kv1Var != null ? java.lang.Integer.valueOf((int) kv1Var.getFloat(9)) : null));
        mMEditText.setText(java.lang.String.valueOf(n30Var.getInteger(1)), android.widget.TextView.BufferType.EDITABLE);
        android.widget.TextView textView = holder.f235253f;
        kotlin.jvm.internal.o.f(textView, "<get-giftNameTv>(...)");
        com.tencent.mm.ui.fk.a(textView);
        if (kv1Var == null || (str = kv1Var.getString(8)) == null) {
            str = "";
        }
        textView.setText(str);
        android.widget.CheckBox checkBox = holder.f235255h;
        checkBox.setChecked(z17);
        checkBox.setOnClickListener(new dl2.k(holder, n30Var, f0Var, fVar));
        mMEditText.setFilters((android.text.InputFilter[]) ((jz5.n) f0Var.f235217u).getValue());
        dl2.o oVar = new dl2.o(fVar, f0Var);
        f0Var.f235216t.put(mMEditText, oVar);
        mMEditText.addTextChangedListener(oVar);
        mMEditText.setTag(java.lang.Integer.valueOf(i17));
        mMEditText.setOnFocusChangeListener(new dl2.l(f0Var));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = holder.f235258n;
        weImageView.clearColorFilter();
        if (n30Var.getInteger(1) == 0) {
            weImageView.setAlpha(0.3f);
        } else {
            weImageView.setAlpha(1.0f);
        }
        holder.f235256i.setOnClickListener(new dl2.m(n30Var, f0Var, holder, fVar));
        holder.f235257m.setOnClickListener(new dl2.n(n30Var, f0Var, holder, fVar));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.f488899as0, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new dl2.q(inflate);
    }
}
