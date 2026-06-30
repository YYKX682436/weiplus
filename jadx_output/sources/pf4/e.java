package pf4;

/* loaded from: classes4.dex */
public final class e extends pf4.h {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f353860e;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f353869d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        pf4.c holder = (pf4.c) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f353869d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        java.lang.String str = (java.lang.String) obj;
        if (kotlin.jvm.internal.o.b(str, "")) {
            return;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = holder.itemView.getContext();
        java.lang.String g27 = n17.g2();
        android.widget.TextView textView = holder.f353850e;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, g27, textSize));
        com.tencent.mm.feature.avatar.w wVar = (com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class));
        android.widget.ImageView imageView = holder.f353849d;
        wVar.Ri(imageView, str, 0.5f);
        imageView.setOnClickListener(new pf4.d(str, this, holder));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.cwk, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new pf4.c(this, inflate);
    }
}
