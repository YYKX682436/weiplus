package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class g8 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f117117e;

    public g8(yz5.p switchChangedCallback) {
        kotlin.jvm.internal.o.g(switchChangedCallback, "switchChangedCallback");
        this.f117117e = switchChangedCallback;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.ar9;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.finder.live.viewmodel.h8 item = (com.tencent.mm.plugin.finder.live.viewmodel.h8) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.nu_);
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) holder.p(com.tencent.mm.R.id.ntc);
        java.lang.Object[] objArr = new java.lang.Object[1];
        r45.z63 z63Var = item.f117132d;
        java.lang.String string = z63Var.getString(1);
        if (string == null) {
            string = "";
        }
        objArr[0] = string;
        textView.setText(holder.f293121e.getString(com.tencent.mm.R.string.dgv, objArr));
        mMSwitchBtn.setCheck(z63Var.getInteger(2) == 1);
        mMSwitchBtn.setEnabled(true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("item ");
        sb6.append(z63Var.getString(1));
        sb6.append(": ");
        sb6.append(z63Var.getInteger(2) == 1);
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, sb6.toString());
        mMSwitchBtn.setSwitchListener(new com.tencent.mm.plugin.finder.live.viewmodel.f8(item, holder, this, mMSwitchBtn));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
