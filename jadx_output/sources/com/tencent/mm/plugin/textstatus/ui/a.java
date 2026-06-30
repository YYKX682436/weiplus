package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes10.dex */
public abstract class a extends com.tencent.mm.view.recyclerview.WxRecyclerAdapter {
    public final java.util.ArrayList I;

    /* renamed from: J, reason: collision with root package name */
    public final int f173705J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(in5.s itemConvertFactory, java.util.ArrayList data) {
        super(itemConvertFactory, data, false);
        kotlin.jvm.internal.o.g(itemConvertFactory, "itemConvertFactory");
        kotlin.jvm.internal.o.g(data, "data");
        this.I = data;
        this.f173705J = 1;
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, androidx.recyclerview.widget.f2
    /* renamed from: D0 */
    public void onViewRecycled(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewRecycled(holder);
        java.lang.Object obj = holder.f293124h;
        if (obj instanceof com.tencent.mm.plugin.textstatus.ui.q3) {
            ((com.tencent.mm.plugin.textstatus.ui.q3) obj).c();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AbsMultipleStatusCardItemAdapter", "onViewRecycled pos:" + holder.getAdapterPosition());
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    /* renamed from: p0 */
    public void I(in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.ArrayList arrayList = this.I;
        if (arrayList.size() > this.f173705J) {
            i17 %= arrayList.size();
        }
        super.I(holder, i17);
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    /* renamed from: q0 */
    public void J(in5.s0 holder, int i17, java.util.List payloads) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        java.util.ArrayList arrayList = this.I;
        super.J(holder, arrayList.size() > this.f173705J ? i17 % arrayList.size() : i17, payloads);
        com.tencent.mars.xlog.Log.i("MicroMsg.AbsMultipleStatusCardItemAdapter", "_onBindViewHolder pos:" + i17);
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    /* renamed from: r0 */
    public in5.s0 M(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        in5.s0 M = super.M(parent, i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AbsMultipleStatusCardItemAdapter", "_onCreateViewHolder pos:" + M.getAdapterPosition());
        return M;
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    public int x() {
        if (this.I.size() > this.f173705J) {
            return Integer.MAX_VALUE;
        }
        return super.x();
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    public long y(int i17) {
        return 0L;
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    public int z(int i17) {
        return 0;
    }
}
