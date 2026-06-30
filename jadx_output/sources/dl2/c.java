package dl2;

/* loaded from: classes3.dex */
public final class c extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveCustomGiftTagView f235190d;

    public c(com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveCustomGiftTagView finderLiveCustomGiftTagView) {
        this.f235190d = finderLiveCustomGiftTagView;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.List list = this.f235190d.f114749h;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        dl2.a holder = (dl2.a) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.f3e);
        com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveCustomGiftTagView finderLiveCustomGiftTagView = this.f235190d;
        java.util.List list = finderLiveCustomGiftTagView.f114749h;
        textView.setText(list != null ? (java.lang.String) list.get(i17) : null);
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        dy1.a.i(itemView, "live_gift_tab");
        if (i17 == finderLiveCustomGiftTagView.selectedTabIndex) {
            android.view.View view = holder.itemView;
            android.content.Context context = finderLiveCustomGiftTagView.f114746e;
            if (context == null) {
                kotlin.jvm.internal.o.o("mContext");
                throw null;
            }
            view.setBackground(context.getDrawable(com.tencent.mm.R.drawable.f481723a41));
            textView.setTextColor(android.graphics.Color.parseColor("#CCFFFFFF"));
        } else {
            holder.itemView.setBackground(null);
            textView.setTextColor(android.graphics.Color.parseColor("#80FFFFFF"));
        }
        holder.itemView.setOnClickListener(new dl2.b(finderLiveCustomGiftTagView, i17, this));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveCustomGiftTagView finderLiveCustomGiftTagView = this.f235190d;
        android.view.View inflate = android.view.LayoutInflater.from(finderLiveCustomGiftTagView.getContext()).inflate(com.tencent.mm.R.layout.as_, parent, false);
        inflate.setLayoutParams(new androidx.recyclerview.widget.RecyclerView.LayoutParams(-2, -2));
        return new dl2.a(finderLiveCustomGiftTagView, inflate);
    }
}
