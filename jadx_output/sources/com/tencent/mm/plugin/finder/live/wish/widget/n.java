package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes10.dex */
public final class n extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public r45.b04 f120742e;

    public n(r45.b04 b04Var) {
        this.f120742e = b04Var;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.e_s;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        ln2.c item = (ln2.c) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.tjn);
        r45.b04 b04Var = item.f319877d;
        if (textView != null) {
            android.content.Context context = holder.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            int i19 = b04Var.f370394d;
            if (i19 == 1) {
                str = context.getString(com.tencent.mm.R.string.oqu);
                kotlin.jvm.internal.o.f(str, "getString(...)");
            } else if (i19 == 2) {
                str = context.getString(com.tencent.mm.R.string.oqt);
                kotlin.jvm.internal.o.f(str, "getString(...)");
            } else if (i19 == 3) {
                str = context.getString(com.tencent.mm.R.string.oqv);
                kotlin.jvm.internal.o.f(str, "getString(...)");
            } else {
                com.tencent.mars.xlog.Log.w("InteractionWishDataHelper", "getInteractionTypeText: unknown interactionType=" + i19 + ", using defaultString=\"\"");
                str = "";
            }
            textView.setText(str);
        }
        ((android.widget.LinearLayout) holder.p(com.tencent.mm.R.id.tjo)).setVisibility(b04Var == this.f120742e ? 0 : 8);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
