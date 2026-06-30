package dy3;

/* loaded from: classes.dex */
public final class s extends in5.r {
    @Override // in5.r
    public int e() {
        return i65.a.D(com.tencent.mm.sdk.platformtools.x2.f193071a) ? com.tencent.mm.R.layout.ck7 : com.tencent.mm.R.layout.ck6;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        dy3.p item = (dy3.p) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.content.Context context = holder.itemView.getContext();
        android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.a_4);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) holder.itemView.findViewById(com.tencent.mm.R.id.mie);
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.odf);
        android.widget.TextView textView2 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.cut);
        com.tencent.mm.storage.z3 z3Var = item.f244596e;
        java.lang.String d17 = z3Var.d1();
        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
        if (d17.length() > 0) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView, z3Var.d1(), 0.1f);
        } else {
            imageView.setImageResource(com.tencent.mm.R.drawable.bhm);
        }
        checkBox.setVisibility(8);
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String d18 = z3Var.d1();
        ((sg3.a) v0Var).getClass();
        android.text.SpannableString bj6 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, c01.a2.e(d18), i65.a.h(context, com.tencent.mm.R.dimen.f479897ia));
        p13.i iVar = new p13.i();
        iVar.f351093a = bj6;
        iVar.f351094b = item.f244598g;
        iVar.f351095c = false;
        iVar.f351096d = false;
        iVar.f351100h = textView2.getPaint();
        java.lang.CharSequence charSequence = o13.q.e(iVar).f351105a;
        ((s50.r0) ((u50.y) i95.n0.c(u50.y.class))).getClass();
        com.tencent.mm.plugin.fts.ui.n3.a(charSequence, textView);
        ((s50.r0) ((u50.y) i95.n0.c(u50.y.class))).getClass();
        com.tencent.mm.plugin.fts.ui.n3.a(null, textView2);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
