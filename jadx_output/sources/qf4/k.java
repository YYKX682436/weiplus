package qf4;

/* loaded from: classes4.dex */
public final class k extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f362708d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f362709e;

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f362708d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        qf4.i holder = (qf4.i) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        qf4.k kVar = holder.f362706g;
        java.lang.Object obj = kVar.f362708d.get(i17);
        android.widget.ImageView imageView = holder.f362703d;
        imageView.setTag(obj);
        java.util.ArrayList arrayList = kVar.f362708d;
        r45.lf6 y07 = ((nf4.h) arrayList.get(i17)).f336854p.y0();
        java.util.LinkedList linkedList = y07.f379432h.f382205e;
        if (!linkedList.isEmpty()) {
            ef4.v vVar = ef4.w.f252468t;
            vo0.d m17 = vVar.m();
            java.lang.Object obj2 = linkedList.get(0);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            hf4.e eVar = new hf4.e((r45.xe6) obj2, y07.f379429e, com.tencent.mm.storage.s7.f195311o);
            hf4.a[] aVarArr = hf4.a.f281220d;
            gm0.j1.b().c();
            if (vVar.c().f252479o == null) {
                vVar.c().f252479o = new hf4.f();
            }
            hf4.f fVar = vVar.c().f252479o;
            kotlin.jvm.internal.o.d(fVar);
            m17.c(eVar, imageView, fVar.f281228b);
        }
        int i18 = ((nf4.h) arrayList.get(i17)).field_count;
        android.widget.TextView textView = holder.f362705f;
        android.widget.ImageView imageView2 = holder.f362704e;
        if (i18 <= 1) {
            imageView2.setVisibility(8);
            textView.setVisibility(8);
        } else {
            imageView2.setImageDrawable(com.tencent.mm.ui.uk.e(imageView2.getContext(), com.tencent.mm.R.raw.icons_filled_photo_wall, android.graphics.Color.parseColor("#FFFFFF")));
            imageView2.setVisibility(8);
            textView.setText(java.lang.String.valueOf(((nf4.h) arrayList.get(i17)).field_count));
            textView.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.f489542cw4, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        qf4.i iVar = new qf4.i(this, inflate);
        iVar.f362703d.setOnClickListener(new qf4.j(this));
        return iVar;
    }
}
