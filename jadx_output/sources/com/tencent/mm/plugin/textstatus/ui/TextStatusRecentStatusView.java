package com.tencent.mm.plugin.textstatus.ui;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusRecentStatusView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "d", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "mContext", "Lcom/tencent/mm/plugin/textstatus/convert/dowhat/v;", "h", "Lcom/tencent/mm/plugin/textstatus/convert/dowhat/v;", "getOnItemClickListener", "()Lcom/tencent/mm/plugin/textstatus/convert/dowhat/v;", "setOnItemClickListener", "(Lcom/tencent/mm/plugin/textstatus/convert/dowhat/v;)V", "onItemClickListener", "Lkotlin/Function0;", "Ljz5/f0;", "i", "Lyz5/a;", "getOnRemoveListener", "()Lyz5/a;", "setOnRemoveListener", "(Lyz5/a;)V", "onRemoveListener", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public class TextStatusRecentStatusView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final android.content.Context mContext;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f173687e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f173688f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f173689g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.textstatus.convert.dowhat.v onItemClickListener;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public yz5.a onRemoveListener;

    /* renamed from: m, reason: collision with root package name */
    public rl5.r f173692m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextStatusRecentStatusView(android.content.Context mContext, android.util.AttributeSet attributeSet) {
        this(mContext, attributeSet, 0);
        kotlin.jvm.internal.o.g(mContext, "mContext");
    }

    public final android.content.Context getMContext() {
        return this.mContext;
    }

    public final com.tencent.mm.plugin.textstatus.convert.dowhat.v getOnItemClickListener() {
        return this.onItemClickListener;
    }

    public final yz5.a getOnRemoveListener() {
        return this.onRemoveListener;
    }

    public final void setOnItemClickListener(com.tencent.mm.plugin.textstatus.convert.dowhat.v vVar) {
        this.onItemClickListener = vVar;
    }

    public final void setOnRemoveListener(yz5.a aVar) {
        this.onRemoveListener = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextStatusRecentStatusView(android.content.Context mContext, android.util.AttributeSet attributeSet, int i17) {
        super(mContext, attributeSet, i17);
        kotlin.jvm.internal.o.g(mContext, "mContext");
        this.mContext = mContext;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f173689g = arrayList;
        java.util.List c17 = bk4.r.f21544a.c();
        arrayList.clear();
        arrayList.addAll(c17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusRecentUseView", "initData: size:%s", java.lang.Integer.valueOf(arrayList.size()));
        if (arrayList.isEmpty()) {
            setVisibility(8);
            return;
        }
        android.view.View inflate = android.view.LayoutInflater.from(mContext).inflate(com.tencent.mm.R.layout.f489567d03, this);
        this.f173687e = inflate;
        if (inflate != null) {
            this.f173688f = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.f486722m92);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f173688f;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f173688f;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(mContext, 0, false));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.textstatus.ui.TextStatusRecentStatusView$buildItemConverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.plugin.textstatus.convert.dowhat.x(com.tencent.mm.plugin.textstatus.ui.TextStatusRecentStatusView.this.getOnItemClickListener());
            }
        }, arrayList, false);
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f173688f;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(wxRecyclerAdapter);
        }
        wxRecyclerAdapter.f293104n = new com.tencent.mm.plugin.textstatus.ui.bg(this);
    }
}
