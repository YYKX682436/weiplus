package wj5;

/* loaded from: classes5.dex */
public final class i extends wj5.c {

    /* renamed from: e, reason: collision with root package name */
    public final yb5.d f446805e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.tipsbar.d f446806f;

    /* renamed from: g, reason: collision with root package name */
    public final yj5.d f446807g;

    public i(yb5.d ui6, com.tencent.mm.ui.tipsbar.d tipsBarContext, yj5.d processor) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(tipsBarContext, "tipsBarContext");
        kotlin.jvm.internal.o.g(processor, "processor");
        this.f446805e = ui6;
        this.f446806f = tipsBarContext;
        this.f446807g = processor;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488577xr;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        long j17;
        xj5.c item = (xj5.c) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        o(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f482697ll);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.m38);
        com.tencent.mm.storage.a3 a3Var = item.f454900u;
        java.lang.String str = a3Var.field_chatroomname;
        java.lang.String str2 = a3Var.field_chatroomnotice;
        kotlin.jvm.internal.o.d(str2);
        java.lang.String input = r26.n0.u0(str2).toString();
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\n");
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        kotlin.jvm.internal.o.g(input, "input");
        java.lang.String replaceAll = compile.matcher(input).replaceAll("");
        kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
        textView.setText(replaceAll);
        com.tencent.mm.ui.tipsbar.d dVar = this.f446806f;
        int i19 = dVar.a() ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/ui/tipsbar/convert/ChatRoomNotifyTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/ChatRoomNotifyTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/ui/tipsbar/convert/ChatRoomNotifyTipsBarConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/tipsbar/data/ChatRoomNotifyTipsBarData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean b17 = com.tencent.mm.sdk.platformtools.t8.K0(a3Var.field_roomowner) ? false : kotlin.jvm.internal.o.b(a3Var.field_roomowner, c01.z1.r());
        boolean G0 = a3Var.G0(c01.z1.r());
        holder.itemView.setOnClickListener(new wj5.g(str, b17, G0, holder, item));
        com.tencent.mm.autogen.mmdata.rpt.ViewRoomDescTipsStruct viewRoomDescTipsStruct = new com.tencent.mm.autogen.mmdata.rpt.ViewRoomDescTipsStruct();
        viewRoomDescTipsStruct.f61634d = viewRoomDescTipsStruct.b("ChatName", str, true);
        viewRoomDescTipsStruct.f61636f = a3Var.field_memberCount;
        if (b17) {
            j17 = 1;
        } else {
            j17 = G0 ? 2 : 0;
        }
        viewRoomDescTipsStruct.f61635e = j17;
        viewRoomDescTipsStruct.f61638h = viewRoomDescTipsStruct.b("NoticeId", "" + a3Var.field_chatroomnoticePublishTime, true);
        viewRoomDescTipsStruct.f61637g = 22L;
        yj5.d dVar2 = this.f446807g;
        dVar2.f462710f = viewRoomDescTipsStruct;
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        n(itemView, i17, dVar, new wj5.h(this));
        dVar2.f462712h = true;
    }

    @Override // wj5.c, in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
