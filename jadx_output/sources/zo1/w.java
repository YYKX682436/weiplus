package zo1;

/* loaded from: classes5.dex */
public final class w extends androidx.recyclerview.widget.f2 {

    /* renamed from: f, reason: collision with root package name */
    public int f474806f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f474807g;

    /* renamed from: d, reason: collision with root package name */
    public final fo1.h f474804d = new fo1.h();

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f474805e = kz5.p0.f313996d;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f474808h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f474809i = new java.util.HashMap();

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f474805e.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.lang.CharSequence a17;
        wo1.b1 holder = (wo1.b1) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        zo1.s sVar = (zo1.s) this.f474805e.get(i17);
        android.widget.CheckBox checkBox = holder.f447905d;
        checkBox.setVisibility(0);
        checkBox.setChecked(sVar.f474762c);
        com.tencent.mm.feature.avatar.w wVar = (com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class));
        android.widget.ImageView imageView = holder.f447906e;
        java.lang.String str = sVar.f474760a;
        wVar.Ai(imageView, str, null);
        android.widget.TextView textView = holder.f447907f;
        android.content.Context context = textView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        fo1.h hVar = this.f474804d;
        boolean c17 = hVar.c(str);
        oo1.g gVar = oo1.g.f347143a;
        if (c17) {
            java.util.HashMap hashMap = this.f474809i;
            a17 = (java.lang.CharSequence) hashMap.get(str);
            if (a17 == null) {
                a17 = gVar.a(context, str);
                hashMap.put(str, a17);
            }
            kotlin.jvm.internal.o.d(a17);
        } else {
            hVar.b(str, new zo1.t(this, str, context));
            a17 = gVar.a(context, str);
        }
        textView.setText(a17);
        holder.f447908g.setText(com.tencent.mm.sdk.platformtools.t8.S1(sVar.f474761b));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.en9, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        wo1.b1 b1Var = new wo1.b1(inflate);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = b1Var.f447909h;
        weImageView.setVisibility(8);
        b1Var.f447908g.setVisibility(0);
        b1Var.itemView.setOnClickListener(new zo1.u(b1Var, this));
        weImageView.setOnClickListener(zo1.v.f474788d);
        return b1Var;
    }

    public final boolean x() {
        return this.f474806f == this.f474805e.size();
    }
}
