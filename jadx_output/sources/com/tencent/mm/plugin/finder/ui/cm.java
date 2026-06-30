package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class cm extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.ui.SettingFragment f129002e;

    public cm(com.tencent.mm.plugin.finder.ui.SettingFragment fragment) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f129002e = fragment;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.afz;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        lb2.j item = (lb2.j) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        java.util.List k17 = item.k();
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.hq9);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        textView.setText(item.f317749d);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.owk);
        if (item instanceof nb2.a) {
            int i19 = item.f317750e;
            str = i19 == 1 ? "TRUE" : i19 == 0 ? "FALSE" : item.p();
        } else {
            if (!(item instanceof lb2.k)) {
                int i27 = item.f317750e;
                if (i27 < 0) {
                    str = item.p();
                } else if (i27 >= 0) {
                    java.util.LinkedList linkedList = (java.util.LinkedList) k17;
                    if (i27 < linkedList.size()) {
                        str = (java.lang.String) linkedList.get(item.f317750e);
                    }
                }
            }
            str = "";
        }
        textView2.setText(str);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.ui.wl(holder, this));
        holder.itemView.setOnLongClickListener(new com.tencent.mm.plugin.finder.ui.yl(holder, this));
    }
}
