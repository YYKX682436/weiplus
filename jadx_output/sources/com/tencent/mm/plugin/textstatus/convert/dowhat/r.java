package com.tencent.mm.plugin.textstatus.convert.dowhat;

/* loaded from: classes11.dex */
public final class r extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.textstatus.convert.dowhat.v f173248e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f173249f;

    public r(com.tencent.mm.plugin.textstatus.convert.dowhat.v mOnItemClickListener, yz5.a aVar) {
        kotlin.jvm.internal.o.g(mOnItemClickListener, "mOnItemClickListener");
        this.f173248e = mOnItemClickListener;
        this.f173249f = aVar;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.cz_;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        lj4.f item = (lj4.f) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.textstatus.ui.TextStatusRecentStatusView textStatusRecentStatusView = (com.tencent.mm.plugin.textstatus.ui.TextStatusRecentStatusView) holder.p(com.tencent.mm.R.id.lm7);
        textStatusRecentStatusView.setOnItemClickListener(this.f173248e);
        textStatusRecentStatusView.setOnRemoveListener(this.f173249f);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
