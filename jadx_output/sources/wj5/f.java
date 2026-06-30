package wj5;

/* loaded from: classes5.dex */
public final class f extends wj5.c {

    /* renamed from: e, reason: collision with root package name */
    public final yb5.d f446797e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.tipsbar.d f446798f;

    public f(yb5.d ui6, com.tencent.mm.ui.tipsbar.d tipsBarContext, yj5.b processor) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(tipsBarContext, "tipsBarContext");
        kotlin.jvm.internal.o.g(processor, "processor");
        this.f446797e = ui6;
        this.f446798f = tipsBarContext;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488577xr;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        xj5.b item = (xj5.b) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        o(holder, item, i17, i18, z17, list);
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.f482697ll)).setText(this.f446797e.g().getString(com.tencent.mm.R.string.ngy, java.lang.Integer.valueOf(item.f454899u)));
        android.view.View p17 = holder.p(com.tencent.mm.R.id.m38);
        com.tencent.mm.ui.tipsbar.d dVar = this.f446798f;
        int i19 = dVar.a() ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/ui/tipsbar/convert/ChatRoomInviteTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/ChatRoomInviteTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/ui/tipsbar/convert/ChatRoomInviteTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/ChatRoomInviteTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        holder.itemView.setOnClickListener(new wj5.d(this, item));
        ((com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.f482699ln)).s(com.tencent.mm.R.raw.icons_filled_invite_group, com.tencent.mm.R.color.aaq);
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        n(itemView, i17, dVar, new wj5.e(this));
    }

    @Override // wj5.c, in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
