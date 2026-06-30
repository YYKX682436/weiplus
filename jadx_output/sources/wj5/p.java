package wj5;

/* loaded from: classes8.dex */
public final class p extends wj5.c {

    /* renamed from: e, reason: collision with root package name */
    public final yb5.d f446830e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.tipsbar.d f446831f;

    /* renamed from: g, reason: collision with root package name */
    public final yj5.p f446832g;

    public p(yb5.d ui6, com.tencent.mm.ui.tipsbar.d tipsBarContext, yj5.p processor) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(tipsBarContext, "tipsBarContext");
        kotlin.jvm.internal.o.g(processor, "processor");
        this.f446830e = ui6;
        this.f446831f = tipsBarContext;
        this.f446832g = processor;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.brr;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        xj5.f item = (xj5.f) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        o(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ifm);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ife);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.ifh);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) p17;
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        java.lang.String x17 = this.f446830e.x();
        relativeLayout.setVisibility(8);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        oo0.a aVar = item.f454902u;
        oo0.d dVar = (oo0.d) aVar;
        java.lang.String str2 = dVar.field_liveName;
        ((ke0.e) xVar).getClass();
        android.content.Context context = holder.f293121e;
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str2));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("主播：");
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str3 = dVar.field_anchorUsername;
        java.util.HashSet hashSet = com.tencent.mm.ui.u9.f211073d;
        if (str3 == null) {
            str = "";
        } else {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String a17 = c01.a2.a(str3);
            if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(x17);
                if (z07 == null) {
                    ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                    str = c01.a2.e(str3);
                } else {
                    a17 = z07.z0(str3);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                        str = c01.a2.e(str3);
                    }
                }
            }
            str = a17;
        }
        float textSize = textView2.getTextSize();
        ((ke0.e) xVar2).getClass();
        sb6.append((java.lang.Object) com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        textView2.setText(sb6.toString());
        itemView.setOnClickListener(new wj5.m(x17, this, aVar, holder));
        relativeLayout.setOnClickListener(new wj5.n(item, x17, this, aVar));
        n(itemView, i17, this.f446831f, new wj5.o(relativeLayout));
    }

    @Override // wj5.c, in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
