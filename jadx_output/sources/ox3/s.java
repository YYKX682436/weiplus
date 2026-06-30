package ox3;

/* loaded from: classes10.dex */
public final class s extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f349774e;

    public s(yz5.p onClickRingtone) {
        kotlin.jvm.internal.o.g(onClickRingtone, "onClickRingtone");
        this.f349774e = onClickRingtone;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489418dd5;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        t45.f fVar;
        vx3.i a17;
        t45.o0 o0Var;
        com.tencent.mm.protobuf.g gVar;
        ox3.g item = (ox3.g) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        item.getItemId();
        java.util.Objects.toString(list != null ? list.get(0) : null);
        t45.n0 n0Var = item.f349749d;
        t45.g gVar2 = n0Var.f415617f;
        if (gVar2 == null || (fVar = gVar2.f415560d) == null || (a17 = qx3.d.a(fVar.f415549d)) == null || (o0Var = n0Var.f415622n) == null || (gVar = o0Var.f415625d) == null) {
            return;
        }
        bw5.lb0 parseFrom = new bw5.lb0().parseFrom(gVar.f192156a);
        long j17 = parseFrom.f29718i / 1000;
        java.lang.String b17 = parseFrom.b();
        java.lang.String b18 = b17 == null || b17.length() == 0 ? a17.f441294k : parseFrom.b();
        ((android.widget.CheckBox) holder.p(com.tencent.mm.R.id.btf)).setChecked(item.f349753h);
        ((android.widget.CheckBox) holder.p(com.tencent.mm.R.id.btf)).setOnCheckedChangeListener(new ox3.q(item, this, holder, i17));
        boolean[] zArr = parseFrom.f29724r;
        holder.s(com.tencent.mm.R.id.odf, zArr[3] ? parseFrom.f29715f : "");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.cl7);
        if (imageView != null) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            ya2.l lVar = ya2.l.f460502a;
            kotlin.jvm.internal.o.d(b18);
            lVar.k(b18, imageView, a17.e());
        }
        holder.s(com.tencent.mm.R.id.ptx, zArr[4] ? parseFrom.f29716g : "");
        long j18 = 60;
        java.lang.String format = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf((j17 % 3600) / j18), java.lang.Long.valueOf(j17 % j18)}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        holder.s(com.tencent.mm.R.id.f484139d55, format);
        holder.itemView.setOnClickListener(new ox3.r(item, holder, this, i17));
        n(holder);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    public final void n(in5.s0 s0Var) {
        boolean isChecked = ((android.widget.CheckBox) s0Var.p(com.tencent.mm.R.id.btf)).isChecked();
        android.view.View view = s0Var.itemView;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.Object) ((android.widget.TextView) s0Var.p(com.tencent.mm.R.id.odf)).getText());
        sb6.append(", ");
        sb6.append((java.lang.Object) ((android.widget.TextView) s0Var.p(com.tencent.mm.R.id.ptx)).getText());
        sb6.append(", ");
        sb6.append((java.lang.Object) ((android.widget.TextView) s0Var.p(com.tencent.mm.R.id.f484139d55)).getText());
        sb6.append(", ");
        sb6.append(s0Var.f293121e.getString(isChecked ? com.tencent.mm.R.string.d_ : com.tencent.mm.R.string.f489843db));
        view.setContentDescription(sb6.toString());
    }
}
