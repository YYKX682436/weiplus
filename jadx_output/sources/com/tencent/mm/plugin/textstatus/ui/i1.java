package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes10.dex */
public final class i1 extends com.tencent.mm.plugin.textstatus.ui.a {
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(in5.s itemConvertFactory, java.util.ArrayList data) {
        super(itemConvertFactory, data);
        kotlin.jvm.internal.o.g(itemConvertFactory, "itemConvertFactory");
        kotlin.jvm.internal.o.g(data, "data");
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, androidx.recyclerview.widget.f2
    /* renamed from: B0 */
    public void onViewAttachedToWindow(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewAttachedToWindow(holder);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onViewAttachedToWindow count:");
        int i17 = this.K + 1;
        this.K = i17;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("RecyclerViewAdapterEx", sb6.toString());
        java.lang.Object obj = holder.f293124h;
        if (obj instanceof com.tencent.mm.plugin.textstatus.ui.q3) {
            com.tencent.mm.plugin.textstatus.ui.q3 q3Var = (com.tencent.mm.plugin.textstatus.ui.q3) obj;
            q3Var.getClass();
            try {
                q3Var.u(q3Var.A);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace(q3Var.f174190e, th6, "update handleThirdBack failed", new java.lang.Object[0]);
            }
        }
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0, androidx.recyclerview.widget.f2
    /* renamed from: C0 */
    public void onViewDetachedFromWindow(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onViewDetachedFromWindow count:");
        int i17 = this.K - 1;
        this.K = i17;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("RecyclerViewAdapterEx", sb6.toString());
        java.lang.Object obj = holder.f293124h;
        if (obj instanceof com.tencent.mm.plugin.textstatus.ui.q3) {
            ((com.tencent.mm.plugin.textstatus.ui.q3) obj).z();
        }
    }
}
