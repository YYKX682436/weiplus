package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class e5 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f112370d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f112371e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f112372f;

    public e5(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f112370d = context;
        this.f112371e = "Finder.FinderLiveAnchorCloseBannerAdapter";
        this.f112372f = new java.util.ArrayList();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f112372f.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        r45.y52 y52Var = (r45.y52) kz5.n0.a0(this.f112372f, i17);
        if (y52Var != null) {
            com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = (com.tencent.mm.ui.widget.MMRoundCornerImageView) holder.itemView.findViewById(com.tencent.mm.R.id.f484826fn3);
            kotlin.jvm.internal.o.d(mMRoundCornerImageView);
            ym5.a1.h(mMRoundCornerImageView, new com.tencent.mm.plugin.finder.live.plugin.c5(y52Var));
            mn2.g1 g1Var = mn2.g1.f329975a;
            vo0.d e17 = g1Var.e();
            java.lang.String string = y52Var.getString(1);
            if (string == null) {
                string = "";
            }
            e17.c(new mn2.q3(string, com.tencent.mm.plugin.finder.storage.y90.f128355e), mMRoundCornerImageView, g1Var.h(mn2.f1.f329953d));
            java.lang.String string2 = y52Var.getString(2);
            if (string2 == null) {
                string2 = "";
            }
            mMRoundCornerImageView.setTag(com.tencent.mm.R.id.f484415e72, string2);
            mMRoundCornerImageView.setRadius(i65.a.b(this.f112370d, 10));
            com.tencent.neattextview.textview.view.NeatTextView neatTextView = (com.tencent.neattextview.textview.view.NeatTextView) holder.itemView.findViewById(com.tencent.mm.R.id.f484827fn4);
            java.lang.String string3 = y52Var.getString(2);
            neatTextView.b(string3 != null ? string3 : "");
            holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.d5(this, y52Var));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f112370d).inflate(com.tencent.mm.R.layout.alh, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new com.tencent.mm.plugin.finder.live.plugin.b5(inflate);
    }
}
