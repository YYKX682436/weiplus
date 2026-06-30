package com.tencent.mm.plugin.finder.ui.at;

/* loaded from: classes.dex */
public final class r extends in5.r {
    public r(java.lang.Boolean bool) {
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.anw;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.finder.ui.at.t item = (com.tencent.mm.plugin.finder.ui.at.t) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.content.Context context = holder.itemView.getContext();
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.eno);
        textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_2));
        p13.i iVar = new p13.i();
        android.content.res.Resources resources = context.getResources();
        java.lang.Object[] objArr = new java.lang.Object[1];
        p13.r rVar = item.f128905h;
        java.lang.String str = rVar != null ? rVar.f351129a : null;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        iVar.f351093a = resources.getString(com.tencent.mm.R.string.cll, objArr);
        iVar.f351094b = item.f128905h;
        iVar.f351095c = false;
        iVar.f351096d = false;
        iVar.f351100h = textView.getPaint();
        textView.setText(o13.q.e(iVar).f351105a);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
