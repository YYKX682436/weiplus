package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class l0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.otherway.a f190974e;

    /* renamed from: f, reason: collision with root package name */
    public final kb0.g f190975f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.otherway.k0 f190976g = new com.tencent.mm.pluginsdk.ui.otherway.k0(this);

    public l0(com.tencent.mm.pluginsdk.ui.otherway.a aVar, kb0.g gVar) {
        this.f190974e = aVar;
        this.f190975f = gVar;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.e5b;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String string;
        jz5.f0 f0Var;
        java.lang.String str;
        jz5.f0 f0Var2;
        java.lang.String str2;
        com.tencent.mm.pluginsdk.ui.otherway.w data = (com.tencent.mm.pluginsdk.ui.otherway.w) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(data, "data");
        xj.m mVar = data.f191022o;
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ta_);
        textView.setVisibility(0);
        if (mVar == null || (string = mVar.f454755c) == null) {
            string = holder.f293121e.getString(com.tencent.mm.R.string.ocs);
        }
        textView.setText(string);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.tencent.mm.R.id.f482630m73);
        if (linearLayout != null) {
            ((vh0.x1) ((vh0.z0) i95.n0.c(vh0.z0.class))).wi(linearLayout, mVar, new com.tencent.mm.pluginsdk.ui.otherway.j0(this, data, holder));
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.e1t);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.e1s);
        xj.m mVar2 = data.f191022o;
        jz5.f0 f0Var3 = jz5.f0.f302826a;
        if (mVar2 != null) {
            textView2.setText(mVar2.f454754b);
            com.tencent.mm.pluginsdk.ui.otherway.x xVar = data.f191014d;
            if (xVar == null || (str2 = xVar.f191031g) == null) {
                f0Var2 = null;
            } else {
                com.tencent.mm.pluginsdk.ui.otherway.n0 n0Var = com.tencent.mm.pluginsdk.ui.otherway.o0.f190982e;
                kotlin.jvm.internal.o.d(imageView);
                com.tencent.mm.pluginsdk.ui.otherway.n0.d(n0Var, str2, imageView, 0.0f, false, 12, null);
                f0Var2 = f0Var3;
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenWayAdLineItemConvert", "onBindViewHolder iconUrl is null");
            }
            f0Var = f0Var3;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenWayAdLineItemConvert", "onBindViewHolder adInfo is null");
        }
        if (mVar == null || (str = mVar.f454753a) == null) {
            f0Var3 = null;
        } else {
            i95.m c17 = i95.n0.c(xj.i.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            xj.i.gg((xj.i) c17, str, wj.w0.f446541d, null, 4, null);
        }
        if (f0Var3 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenWayAdLineItemConvert", "ad expose report adInfo is null");
        }
    }
}
