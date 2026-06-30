package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class u2 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f119929d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.h3 f119930e;

    public u2(com.tencent.mm.plugin.finder.live.widget.h3 h3Var) {
        this.f119930e = h3Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f119929d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.finder.live.widget.v2 holder = (com.tencent.mm.plugin.finder.live.widget.v2) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f119929d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.cw1 cw1Var = (r45.cw1) obj;
        holder.f120026d = cw1Var;
        android.view.View view = holder.itemView;
        com.tencent.mm.plugin.finder.live.widget.h3 h3Var = this.f119930e;
        h3Var.getClass();
        pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.g3(view, h3Var, cw1Var));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("adPartner, index: ");
        sb6.append(i17);
        sb6.append(", nickname: ");
        sb6.append(cw1Var.getString(1));
        sb6.append(", isFollow: ");
        sb6.append(cw1Var.getBoolean(4));
        sb6.append(", type: ");
        sb6.append(cw1Var.getInteger(5));
        sb6.append(", authDesc: ");
        r45.dr2 dr2Var = (r45.dr2) cw1Var.getCustom(2);
        sb6.append(dr2Var != null ? dr2Var.getString(0) : null);
        sb6.append(", authType: ");
        r45.dr2 dr2Var2 = (r45.dr2) cw1Var.getCustom(2);
        sb6.append(dr2Var2 != null ? java.lang.Integer.valueOf(dr2Var2.getInteger(1)) : null);
        sb6.append(", authUrl: ");
        r45.dr2 dr2Var3 = (r45.dr2) cw1Var.getCustom(2);
        sb6.append(dr2Var3 != null ? dr2Var3.getString(2) : null);
        sb6.append(" avatarUrl: ");
        sb6.append(cw1Var.getString(3));
        com.tencent.mars.xlog.Log.i(h3Var.f118514c, sb6.toString());
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.al6, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new com.tencent.mm.plugin.finder.live.widget.v2(this.f119930e, inflate);
    }
}
