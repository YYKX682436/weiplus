package ui2;

/* loaded from: classes8.dex */
public final class o extends ti2.i {
    @Override // ti2.i, in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488845am5;
    }

    @Override // ti2.i, in5.r
    /* renamed from: n */
    public void h(in5.s0 holder, vi2.e item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        vi2.b bVar = item instanceof vi2.b ? (vi2.b) item : null;
        boolean z18 = true;
        if (bVar == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams layoutParams2 = layoutParams instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams ? (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.f11941i = true;
        }
        android.view.View view = holder.itemView;
        view.setBackgroundColor(b3.l.getColor(view.getContext(), com.tencent.mm.R.color.f478491c));
        int dimensionPixelSize = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        holder.itemView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.f6n);
        if (findViewById != null) {
            if (bVar.f437537g) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicAnchorUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicAnchorUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicAnchorUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/mic/pk/convert/FinderLiveMicAnchorItemConvert/FinderLiveMicAnchorWidgetMicItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/mic/pk/data/MicAnchorUserConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.f6u);
        if (textView != null) {
            r45.bh1 bh1Var = bVar.f437539i;
            if (bh1Var == null) {
                r45.xn1 xn1Var = bVar.f437544d;
                bh1Var = xn1Var != null ? (r45.bh1) xn1Var.getCustom(17) : null;
            }
            if (bh1Var == null) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                java.lang.String string = bh1Var.getString(1);
                if (string != null && string.length() != 0) {
                    z18 = false;
                }
                if (z18) {
                    string = zl2.r4.S(zl2.r4.f473950a, bh1Var.getLong(0), 0, 2, null);
                }
                java.lang.String string2 = textView.getContext().getResources().getString(com.tencent.mm.R.string.f491598nr1, zl2.r4.S(zl2.r4.f473950a, bh1Var.getLong(2), 0, 2, null));
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                if (!kotlin.jvm.internal.o.b(string, "0")) {
                    string2 = string2 + ' ' + textView.getContext().getResources().getString(com.tencent.mm.R.string.f491597nr0, string);
                }
                textView.setText(string2);
            }
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.itemView.findViewById(com.tencent.mm.R.id.f482343bx);
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) holder.itemView.findViewById(com.tencent.mm.R.id.a3k);
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.setVisibility(8);
    }
}
