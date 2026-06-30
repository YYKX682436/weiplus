package lq5;

/* loaded from: classes3.dex */
public final class h extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f320474d;

    /* renamed from: e, reason: collision with root package name */
    public final int f320475e;

    /* renamed from: f, reason: collision with root package name */
    public final int f320476f;

    /* renamed from: g, reason: collision with root package name */
    public final int f320477g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f320478h;

    /* renamed from: i, reason: collision with root package name */
    public final float f320479i;

    /* renamed from: m, reason: collision with root package name */
    public int f320480m;

    /* renamed from: n, reason: collision with root package name */
    public final yz5.l f320481n;

    public h(java.util.List array, int i17, int i18, int i19, boolean z17, float f17, int i27, yz5.l lVar) {
        kotlin.jvm.internal.o.g(array, "array");
        this.f320474d = array;
        this.f320475e = i17;
        this.f320476f = i18;
        this.f320477g = i19;
        this.f320478h = z17;
        this.f320479i = f17;
        this.f320480m = i27;
        this.f320481n = lVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return (this.f320474d.size() + this.f320475e) - 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View view = holder.itemView;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) view;
        int i18 = this.f320475e;
        java.lang.CharSequence charSequence = "";
        if (!(i17 >= 0 && i17 < i18 / 2)) {
            if (!(i17 < getItemCount() && getItemCount() - (i18 / 2) <= i17)) {
                charSequence = (java.lang.CharSequence) this.f320474d.get(i17 - (i18 / 2));
            }
        }
        textView.setText(charSequence);
        holder.itemView.setOnClickListener(new lq5.f(this, i17));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.content.Context context = parent.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.wepicker.view.PickerTextView pickerTextView = new com.tencent.mm.wepicker.view.PickerTextView(context, null, 0, 6, null);
        pickerTextView.setLayoutParams(new androidx.recyclerview.widget.RecyclerView.LayoutParams(-1, this.f320480m));
        pickerTextView.setGravity(17);
        int i18 = this.f320477g;
        pickerTextView.setTextColor(i18);
        pickerTextView.setTextSize(0, this.f320479i);
        pickerTextView.setPTextSelectColor(this.f320476f);
        pickerTextView.setPTextColor(i18);
        pickerTextView.setPTextSelectMedium(this.f320478h);
        return new lq5.g(pickerTextView);
    }
}
