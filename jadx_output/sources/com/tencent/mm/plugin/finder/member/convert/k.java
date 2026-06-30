package com.tencent.mm.plugin.finder.member.convert;

/* loaded from: classes2.dex */
public final class k extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f121147e;

    public k(java.lang.String finderAuthorUsername) {
        kotlin.jvm.internal.o.g(finderAuthorUsername, "finderAuthorUsername");
        this.f121147e = finderAuthorUsername;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.dc_;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        jo2.d item = (jo2.d) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        ng5.a.a((android.widget.ImageView) holder.p(com.tencent.mm.R.id.mkt), c01.z1.r());
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f486838q15);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = holder.f293121e;
        java.lang.String b17 = hc2.t.b(context, 2);
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, b17));
        holder.p(com.tencent.mm.R.id.q0c).setOnClickListener(new com.tencent.mm.plugin.finder.member.convert.j(holder, this));
    }
}
