package dl2;

/* loaded from: classes3.dex */
public final class i0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView f235228d;

    public i0(com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView finderLiveGiftTagView) {
        this.f235228d = finderLiveGiftTagView;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.List list = this.f235228d.f114756g;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.lang.String str;
        dl2.g0 holder = (dl2.g0) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.f3e);
        com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView finderLiveGiftTagView = this.f235228d;
        java.util.List list = finderLiveGiftTagView.f114756g;
        textView.setText(list != null ? (java.lang.String) list.get(i17) : null);
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        dy1.a.i(itemView, "live_gift_tab");
        if (i17 == finderLiveGiftTagView.selectedTabIndex) {
            android.view.View view = holder.itemView;
            android.content.Context context = finderLiveGiftTagView.f114753d;
            if (context == null) {
                kotlin.jvm.internal.o.o("mContext");
                throw null;
            }
            view.setBackground(context.getDrawable(com.tencent.mm.R.drawable.f481723a41));
            textView.setTextColor(android.graphics.Color.parseColor("#CCFFFFFF"));
            com.tencent.mm.ui.fk.a(textView);
            if (i17 != finderLiveGiftTagView.f114758i) {
                dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                android.view.View view2 = holder.itemView;
                jz5.l[] lVarArr = new jz5.l[2];
                lVarArr[0] = new jz5.l("tab_type_page", java.lang.Integer.valueOf(i17 + 1));
                java.util.List list2 = finderLiveGiftTagView.f114756g;
                if (list2 == null || (str = (java.lang.String) list2.get(i17)) == null) {
                    str = "";
                }
                lVarArr[1] = new jz5.l("tab_type_name", str);
                ((cy1.a) rVar).Cj("view_exp", view2, kz5.c1.k(lVarArr), 25561);
                finderLiveGiftTagView.f114758i = i17;
            }
        } else {
            holder.itemView.setBackground(null);
            textView.setTextColor(android.graphics.Color.parseColor("#55FFFFFF"));
            com.tencent.mm.ui.fk.c(textView);
        }
        if (finderLiveGiftTagView.f114761o) {
            holder.itemView.setBackground(null);
            textView.setPadding(textView.getPaddingLeft(), 0, textView.getPaddingRight(), 0);
        }
        holder.itemView.setOnClickListener(new dl2.h0(finderLiveGiftTagView, i17, this));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveGiftTagView finderLiveGiftTagView = this.f235228d;
        android.view.View inflate = android.view.LayoutInflater.from(finderLiveGiftTagView.getContext()).inflate(com.tencent.mm.R.layout.as_, parent, false);
        inflate.setLayoutParams(new androidx.recyclerview.widget.RecyclerView.LayoutParams(-2, -2));
        return new dl2.g0(finderLiveGiftTagView, inflate);
    }
}
