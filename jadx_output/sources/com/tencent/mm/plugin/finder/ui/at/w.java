package com.tencent.mm.plugin.finder.ui.at;

/* loaded from: classes.dex */
public final class w extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Boolean f128915e;

    public w(java.lang.Boolean bool) {
        this.f128915e = bool;
    }

    @Override // in5.r
    public int e() {
        return i65.a.D(com.tencent.mm.sdk.platformtools.x2.f193071a) ? com.tencent.mm.R.layout.ck7 : com.tencent.mm.R.layout.ck6;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.finder.ui.at.t item = (com.tencent.mm.plugin.finder.ui.at.t) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.content.Context context = holder.itemView.getContext();
        android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.a_4);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) holder.itemView.findViewById(com.tencent.mm.R.id.mie);
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.odf);
        android.widget.TextView textView2 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.cut);
        android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.d1g);
        if (kotlin.jvm.internal.o.b(this.f128915e, java.lang.Boolean.TRUE)) {
            textView.setTextColor(android.graphics.Color.parseColor("#CCFFFFFF"));
            textView2.setTextColor(android.graphics.Color.parseColor("#80FFFFFF"));
            findViewById.setBackgroundDrawable(context.getResources().getDrawable(com.tencent.mm.R.drawable.f481537vy));
        }
        com.tencent.mm.storage.z3 z3Var = item.f128902e;
        java.lang.String d17 = z3Var.d1();
        kotlin.jvm.internal.o.f(d17, "getUsername(...)");
        if (d17.length() > 0) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView, z3Var.d1(), 0.1f);
        } else {
            imageView.setImageResource(com.tencent.mm.R.drawable.bhm);
        }
        checkBox.setVisibility(8);
        p13.y yVar = item.f128904g;
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String d18 = z3Var.d1();
        ((sg3.a) v0Var).getClass();
        java.lang.CharSequence bj6 = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).bj(context, c01.a2.f(d18, ""), i65.a.h(context, com.tencent.mm.R.dimen.f479897ia));
        java.lang.CharSequence charSequence = null;
        if (yVar != null) {
            int i19 = yVar.f351185c;
            if (i19 == 1) {
                p13.i iVar = new p13.i();
                iVar.f351093a = bj6;
                iVar.f351094b = item.f128905h;
                iVar.f351095c = false;
                iVar.f351096d = false;
                iVar.f351100h = textView2.getPaint();
                bj6 = o13.q.e(iVar).f351105a;
            } else if (i19 == 15) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str = yVar.f351190h;
                float textSize = textView2.getPaint().getTextSize();
                ((ke0.e) xVar).getClass();
                android.text.SpannableString j17 = com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize);
                p13.i iVar2 = new p13.i();
                iVar2.f351093a = j17;
                iVar2.f351094b = item.f128905h;
                iVar2.f351095c = false;
                iVar2.f351096d = false;
                iVar2.f351100h = textView2.getPaint();
                charSequence = o13.q.e(iVar2).f351105a;
            }
        }
        ((s50.r0) ((u50.y) i95.n0.c(u50.y.class))).getClass();
        com.tencent.mm.plugin.fts.ui.n3.a(bj6, textView);
        ((s50.r0) ((u50.y) i95.n0.c(u50.y.class))).getClass();
        com.tencent.mm.plugin.fts.ui.n3.a(charSequence, textView2);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
